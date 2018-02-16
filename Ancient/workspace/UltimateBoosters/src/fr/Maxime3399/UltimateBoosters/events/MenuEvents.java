package fr.Maxime3399.UltimateBoosters.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.UltimateBoosters.menus.ListMenu;
import fr.Maxime3399.UltimateBoosters.menus.MainMenu;

public class MenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§6§lBoosters")){
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Active Boosters")){
				
				ListMenu.openMenu(p);
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("MenuSounds")){
					p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 1);
				}
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Close")){
				
				p.closeInventory();
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("MenuSounds")){
					p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 1);
				}
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§8§oBack")){
				
				MainMenu.openMenu(p);
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("MenuSounds")){
					p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 1);
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
