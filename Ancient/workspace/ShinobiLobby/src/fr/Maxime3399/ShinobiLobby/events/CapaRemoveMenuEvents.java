package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.ShinobiLobby.menus.CapaMainMenu;
import fr.Maxime3399.ShinobiLobby.menus.CapaRemoveMenu;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaRemoveMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Retirer")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				String rem[] = CapaRemoveMenu.remover.get(p).split(",");
				String secrem = CapaRemoveMenu.remover.get(p);
				int remi = 0;
				
				if(!secrem.equalsIgnoreCase("")){
					
					for(@SuppressWarnings("unused") String ss : rem){
						remi++;
					}
					
				}
				
				if(name.contains("§e")){
					
					String id = e.getCurrentItem().getItemMeta().getLore().get(0).replaceAll("§7ID : ", "");
					
					if(CapaRemoveMenu.remover.get(p).contains(id)){
						
						CapaRemoveMenu.remover.put(p, CapaRemoveMenu.remover.get(p).replaceAll(id+",", ""));
						p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
						CapaRemoveMenu.openMenu(p);
						
					}else{
						
						CapaRemoveMenu.remover.put(p, CapaRemoveMenu.remover.get(p)+id+",");
						p.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 100, 1);
						CapaRemoveMenu.openMenu(p);
						
					}
					
				}else if(name.equalsIgnoreCase("§a§lValider")){
					
					if(remi < 1){
						
						p.sendMessage("§cTu dois sélectionner au moins une capacitée !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						
					}else{
						
						String ena[] = DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable").split(",");
						int rest = 0;
						for(String cap : ena){
							
							if(!secrem.contains(cap)){
								
								rest++;
								
							}
							
						}
						
						if(rest < 1){
							
							p.sendMessage("§cIl te faut au moins une capacitée !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							
						}else{
							
							String enable = DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable");
							
							for(String capa : rem){
								
								enable = enable.replaceAll(capa+",", "");
								
							}
							
							
							DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "capa-enable", enable);
							CapaRemoveMenu.remover.remove(p);
							p.sendMessage("§eLes capacitées ont étées retirées !");
							p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 100, 1);
							CapaMainMenu.openMenu(p);
							
						}
						
					}
					
				}else if(name.equalsIgnoreCase("§6§lAnnuler")){
					
					CapaRemoveMenu.remover.remove(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					CapaMainMenu.openMenu(p);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
