package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MCube.menus.CosParticlesMenu;
import fr.Maxime3399.MCube.menus.MainMenu;

public class CosMainMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("�8Cosm�tiques")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.equalsIgnoreCase("�8�oRetour")){
					
					MainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("�6Particules")){
					
					CosParticlesMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
