package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.ShinobiLobby.menus.CapaAddMainMenu;
import fr.Maxime3399.ShinobiLobby.menus.CapaRemoveMenu;

public class CapaMainMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Equipement")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.equalsIgnoreCase("§cRetirer")){
					
					p.sendMessage("§cIl te faut au moins une capacitée !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}else if(name.equalsIgnoreCase("§cAjouter")){
					
					p.sendMessage("§cTu ne peux pas avoir plus de 9 capacitées actives !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}else if(name.equalsIgnoreCase("§6Retirer")){
					
					CapaRemoveMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§aAjouter")){
					
					CapaAddMainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
