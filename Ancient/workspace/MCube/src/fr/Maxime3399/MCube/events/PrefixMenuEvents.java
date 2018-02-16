package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.menus.MainMenu;
import fr.Maxime3399.MCube.menus.PrefixMenu;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class PrefixMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Préfixe")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§8§oRetour")){
					
					MainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else{
					
					String color = name.replaceAll("§", "");
					color = color.substring(0,1);
					
					if(color.equalsIgnoreCase("color")){
						
						p.sendMessage("§cTu as déjà sélectionné cette couleur !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						
					}else{
						
						cp.setPrefix(color);
						cp.update();
						
						p.sendMessage("§eTu as sélectionné la couleur §r"+name+"§r §e!");
						p.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 100, 1);
						p.setDisplayName(DisplayerUtils.getCalculedPlayerDisplayName(p));
						p.setPlayerListName(p.getDisplayName());
						PrefixMenu.openMenu(p);
						
					}
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
