package fr.Maxime3399.ShinobiTutorial.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import fr.Maxime3399.ShinobiTutorial.MainClass;
import fr.Maxime3399.ShinobiTutorial.actions.StartTutorial;
import fr.Maxime3399.ShinobiTutorial.menus.TypeMenu;
import fr.Maxime3399.ShinobiTutorial.utils.DataUtils;

public class TypeMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Type")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.equalsIgnoreCase("§cKaton | Feu")){
					
					p.sendMessage("§aTu as sélectionné le §cKaton ( feu )§r §a!");
					p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 2);
					DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "chakratype", "katon");
					DataUtils.setIntPlayerInfo(p.getUniqueId().toString(), "lvl", 0);
					StartTutorial.part2(p);
					p.closeInventory();
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}
	
	@EventHandler
	public void onClose(InventoryCloseEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}else if(e.getInventory().getName().equalsIgnoreCase("§8Type")){
			
			Player p = (Player) e.getPlayer();
			
			if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "chakratype").equalsIgnoreCase("none")){
				
				p.sendMessage("§e§lIl te faut choisir ton type de chakra !");
				p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 100, 1);
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						
						TypeMenu.openMenu(p);
						p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 100, 1);
						
					}
					
				}, 30);
				
			}
			
		}
		
	}

}
