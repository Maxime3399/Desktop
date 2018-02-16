package fr.Maxime3399.LastJumper.schedulers;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.actions.TestWinner;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class PlayerDeathScheduler {

	public static HashMap<String, Integer> sch = new HashMap<>();
	public static ArrayList<Player> list = new ArrayList<>();
	
	public static void start(String name){
		
		int task;
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				for(Player pls : list){
					
					if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
						
						list.remove(pls);
						
						pls.setGameMode(GameMode.SPECTATOR);
						pls.teleport(ArenasConfig.getLocation(name, "Jump"));
						
						if(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes") >= 1){
							
							if(ArenasManager.lifes.get(pls) >= 2){
								
								ArenasManager.lifes.put(pls, ArenasManager.lifes.get(pls)-1);
								if(ArenasManager.lifes.get(pls) == 0){
									pls.setMaxHealth(1);
									pls.setHealth(1);
								}else{
									pls.setMaxHealth(ArenasManager.lifes.get(pls)*2);
									pls.setHealth(ArenasManager.lifes.get(pls)*2);
								}
								MessagesUtils.sendMessages(pls, "LostLife", true, "");
								EjectionTime.time.remove(pls);
								
								for(Player pls2 : Bukkit.getOnlinePlayers()){
									if(ArenasManager.playerArena.get(pls2).equalsIgnoreCase(name)){
										pls2.playSound(pls2.getLocation(), Sound.ENTITY_PLAYER_SMALL_FALL, 100, 1);
									}
								}
								
								TestWinner.test(name);
								
							}else{
								
								ArenasManager.livePlayers.put(name, ArenasManager.livePlayers.get(name)-1);
								ArenasManager.livingPerson.remove(pls);
								
								ItemStack ISleave = new ItemStack(Material.BED);
								ItemMeta IMleave = ISleave.getItemMeta();
								IMleave.setDisplayName("§eLeave");
								ISleave.setItemMeta(IMleave);
								pls.getInventory().setItem(4, ISleave);
								pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 100, 1);
								
								MessagesUtils.sendMessages(pls, "Leave", true, "");
								
								TestWinner.test(name);
								
								Jumper.removePlayer(pls, name);
								
								for(Player pls2 : Bukkit.getOnlinePlayers()){
									if(ArenasManager.playerArena.get(pls2).equalsIgnoreCase(name)){
										if(pls2 != pls){
											MessagesUtils.sendMessages(pls2, "PlayerDeath", true, pls.getName());
										}
										pls2.playSound(pls2.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 100, 1);
									}
								}
								
							}
							
						}else{
							
							ArenasManager.livePlayers.put(name, ArenasManager.livePlayers.get(name)-1);
							ArenasManager.livingPerson.remove(pls);
							
							ItemStack ISleave = new ItemStack(Material.BED);
							ItemMeta IMleave = ISleave.getItemMeta();
							IMleave.setDisplayName("§eLeave");
							ISleave.setItemMeta(IMleave);
							pls.getInventory().setItem(4, ISleave);
							
							MessagesUtils.sendMessages(pls, "Leave", true, "");
							
							TestWinner.test(name);
							
							Jumper.removePlayer(pls, name);
							
							for(Player pls2 : Bukkit.getOnlinePlayers()){
								if(ArenasManager.playerArena.get(pls2).equalsIgnoreCase(name)){
									if(pls2 != pls){
										MessagesUtils.sendMessages(pls2, "PlayerDeath", true, pls.getName());
									}
									pls2.playSound(pls2.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 100, 1);
								}
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
		sch.put(name, task);
		
	}
	
	public static void stop(String name){
		
		Bukkit.getScheduler().cancelTask(sch.get(name));
		
	}
	
}
