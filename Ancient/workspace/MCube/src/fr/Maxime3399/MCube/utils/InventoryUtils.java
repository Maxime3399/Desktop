package fr.Maxime3399.MCube.utils;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.menus.ChestsMenu;
import fr.Maxime3399.MCube.menus.MainMenu;
import fr.Maxime3399.MCube.menus.ProfileMenu;
import fr.Maxime3399.MCube.menus.QuestsMenu;

public class InventoryUtils {
	
	public static void refreshInventory(Player p, String name){
		
		if(p.getOpenInventory() == null){
			
			return;
			
		}else{
			
			if(p.getOpenInventory().getTopInventory() == null){
				
				return;
				
			}else{
				
				String inv = p.getOpenInventory().getBottomInventory().getName().toString();
				if(inv.equalsIgnoreCase("§8Profile")){
					ProfileMenu.openMenu(p);
				}else if(inv.equalsIgnoreCase("§8Menu Principal")){
					MainMenu.openMenu(p);
				}else if(inv.equalsIgnoreCase("§8Quêtes")){
					QuestsMenu.openMenu(p);
				}else if(inv.equalsIgnoreCase("§8Coffres")){
					ChestsMenu.openMenu(p);
				}
				
			}
			
		}
		
	}
    
}