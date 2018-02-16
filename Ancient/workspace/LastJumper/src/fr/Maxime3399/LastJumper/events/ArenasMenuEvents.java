package fr.Maxime3399.LastJumper.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.managers.ReturnerManager;
import fr.Maxime3399.LastJumper.scoreboards.WaitScoreboard;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class ArenasMenuEvents implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§6§lLast Jumper")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§a")){
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName().replaceAll("§a§l", "");
				
				ArenasManager.playerArena.put(p, name);
				ArenasManager.arenaCount.put(ArenasManager.playerArena.get(p), ArenasManager.arenaCount.get(ArenasManager.playerArena.get(p))+1);
				ReturnerManager.stockLocation(p);
				ReturnerManager.stockInventory(p);
				ReturnerManager.stockGM(p);
				ReturnerManager.stockFood(p);
				ReturnerManager.stockHealth(p);
				p.teleport(ArenasConfig.getLocation(name, "Wait"));

				p.setGameMode(GameMode.ADVENTURE);
				p.setFoodLevel(21);
				Jumper.createPlayer(p, name);
				if(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes") >= 1){
					
					p.setMaxHealth(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes")*2);
					p.setHealth(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes")*2);
					
				}
				
				ItemStack ISleave = new ItemStack(Material.BED);
				ItemMeta IMleave = ISleave.getItemMeta();
				IMleave.setDisplayName("§eLeave");
				ISleave.setItemMeta(IMleave);
				p.getInventory().setItem(8, ISleave);
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
						MessagesUtils.sendMessages(pls, "PlayerJoin", true, p.getName());
						WaitScoreboard.loadScoreboard(pls);
					}
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
