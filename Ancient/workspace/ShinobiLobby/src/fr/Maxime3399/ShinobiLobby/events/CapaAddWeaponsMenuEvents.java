package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.ShinobiLobby.menus.CapaAddWeaponsMenu;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaAddWeaponsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Armes")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				
				if(name.contains("§c")){
					
					p.sendMessage("§cTu ne possèdes pas cette arme !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§e")){
					
					p.sendMessage("§cTu as déjà équipé cette arme !");
					p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§a")){
					
					String enable = DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable");
					String id = e.getCurrentItem().getItemMeta().getLore().get(0).replaceAll("§7ID : ", "");
					enable = enable+id+",";
					DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "capa-enable", enable);
					
					p.sendMessage("§eArme équipée !");
					p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE, 100, 1);
					CapaAddWeaponsMenu.openMenu(p);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
