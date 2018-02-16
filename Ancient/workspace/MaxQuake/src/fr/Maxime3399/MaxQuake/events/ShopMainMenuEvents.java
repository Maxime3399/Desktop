package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxQuake.menus.ShopCaseMenu;
import fr.Maxime3399.MaxQuake.menus.ShopTriggerMenu;

public class ShopMainMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}else if(e.getInventory().getName().equalsIgnoreCase("§8Boutique")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.equalsIgnoreCase("§eApparence")){
					
					ShopCaseMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§eRechargement")){
					
					ShopTriggerMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
