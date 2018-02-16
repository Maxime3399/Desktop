package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.ShinobiLobby.menus.CapaAddKatonMenu;
import fr.Maxime3399.ShinobiLobby.menus.CapaAddWeaponsMenu;

public class CapaAddMainMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Ajouter")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.equalsIgnoreCase("§aArmes")){
					
					CapaAddWeaponsMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§aKaton | Feu")){
					
					CapaAddKatonMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.contains("§c")){
					
					p.sendMessage("§cTu ne possèdes pas ce pouvoir !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
