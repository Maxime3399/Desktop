package fr.Maxime3399.MCube.events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.DataUtils;

public class ExpBankEvents implements Listener {
	
	@EventHandler
	public void onCreate(SignChangeEvent e){
		
		if(e.getLine(0).equalsIgnoreCase("[xpbank]") || e.getLine(0).equalsIgnoreCase("[expbank]")){
			
			Player p = e.getPlayer();
			CustomPlayer cp = new CustomPlayer(p);
			
			if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip")){
				
				e.setLine(0, "");
				e.setLine(1, "");
				e.setLine(2, "");
				e.setLine(3, "");
				
				e.getBlock().getLocation().getWorld().spawnParticle(Particle.EXPLOSION_LARGE, e.getBlock().getLocation().add(0.5, 0.8, 0.5), 1);
				p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100, 2);
				p.sendMessage("§cIl faut au moins être §e§lVIP§r §c pour créer des banques d'XP !");
				
			}else{
				
				if(cp.getCoins() >= 50){
					
					e.setLine(0, "§6§l[§r§aXP Banque§6§l]");
					e.setLine(1, p.getName());
					e.setLine(2, "§9§l---------");
					e.setLine(3, "§10");
					DataUtils.addExpBank(e.getBlock().getLocation(), p);
					cp.removeCoins(50);
					cp.update();
					MainScoreboard.loadScoreboard(p);
					p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
					p.sendMessage("§aBanque d'XP créée !");
					
				}else{
					
					e.setLine(0, "");
					e.setLine(1, "");
					e.setLine(2, "");
					e.setLine(3, "");
					e.getBlock().getLocation().getWorld().spawnParticle(Particle.EXPLOSION_LARGE, e.getBlock().getLocation().add(0.5, 0.8, 0.5), 1);
					p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100, 2);
					int r = 50-cp.getCoins();
					p.sendMessage("§cIl te manques §l"+r+"§r §ccoins pour créer une banque d'XP ( coût : 50 coins ) !");
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onDestroy(BlockBreakEvent e){
		
		if(e.getBlock().getType() == Material.SIGN_POST || e.getBlock().getType() == Material.WALL_SIGN){
			
			Sign s = (Sign) e.getBlock().getState();
			Bukkit.broadcastMessage(s.getLine(0));
			if(s.getLine(0).contains("§aXP Banque")){
				
				Player p = e.getPlayer();

				if(p.getUniqueId().toString().equalsIgnoreCase(DataUtils.getExpBankID(e.getBlock().getLocation()))){
					
					int level = DataUtils.getExpBankLevels(e.getBlock().getLocation());
					p.setLevel(p.getLevel()+level);
					p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 100, 1);
					p.sendMessage("§eBanque d'XP détruite.");
					DataUtils.removeExpBank(e.getBlock().getLocation());
					
				}else{
					
					p.sendMessage("§cCette banque d'XP ne t'appartient pas !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					e.setCancelled(true);
					
				}
				
			}
			
		}else{
			
			Location loc = e.getBlock().getLocation();
			Block b1 = loc.getWorld().getBlockAt(loc.add(0, 1, 0));
			Block b2 = loc.getWorld().getBlockAt(loc.add(0, -1, 0));
			Block b3 = loc.getWorld().getBlockAt(loc.add(1, 0, 0));
			Block b4 = loc.getWorld().getBlockAt(loc.add(-1, 0, 0));
			Block b5 = loc.getWorld().getBlockAt(loc.add(0, 0, 1));
			Block b6 = loc.getWorld().getBlockAt(loc.add(0, 0, -1));
			ArrayList<Block> list = new ArrayList<>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			list.add(b6);
			
			boolean shief = false;
			
			if(shief){
				
				e.setCancelled(true);
				Player p = e.getPlayer();
				p.sendMessage("§cUne banque d'XP est collée a ce bloc, vous ne pouvez donc pas le détruire.");
				p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		
		if(e.getClickedBlock() == null || e.getClickedBlock().getType() == Material.AIR){
			
			return;
			
		}else if(e.getClickedBlock().getType() == Material.SIGN_POST || e.getClickedBlock().getType() == Material.WALL_SIGN){
			
			Sign s = (Sign) e.getClickedBlock().getState();
			
			if(s.getLine(0).contains("§aXP Banque")){
				
				Player p = e.getPlayer();
				Location loc = s.getLocation();
				
				if(p.getUniqueId().toString().equalsIgnoreCase(DataUtils.getExpBankID(loc))){
					
					if(e.getAction() == Action.LEFT_CLICK_BLOCK){
						
						if(p.getLevel() >= 5){
							
							p.setLevel(p.getLevel()-5);
							p.playSound(p.getLocation(), Sound.BLOCK_LAVA_POP, 100, 2);
							DataUtils.setExpBankLevel(loc, DataUtils.getExpBankLevels(loc)+5);
							s.setLine(3, "§1"+DataUtils.getExpBankLevels(loc));
							s.update();
							
						}else{
							
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							p.sendMessage("§cIl faut avoir un minimum de 5 niveaux !");
							
						}
						
					}else if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
						
						if(DataUtils.getExpBankLevels(loc) >= 5){
							
							p.setLevel(p.getLevel()+5);
							p.playSound(p.getLocation(), Sound.BLOCK_LAVA_POP, 100, 1);
							DataUtils.setExpBankLevel(loc, DataUtils.getExpBankLevels(loc)-5);
							s.setLine(3, "§1"+DataUtils.getExpBankLevels(loc));
							s.update();
							
						}else{
							
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							p.sendMessage("§cTa banque d'XP doit contenir au moins 5 niveaux !");
							
						}
						
					}
					
				}else{
					
					p.sendMessage("§cCette banque d'XP ne t'appartient pas !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}
				
			}
			
		}
		
	}

}
