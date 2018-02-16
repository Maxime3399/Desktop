package fr.Maxime3399.MCube.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.menus.ConfirmMenu;
import fr.Maxime3399.MCube.menus.MainMenu;

public class ChestsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Coffres")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§8§oRetour")){
					
					MainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.contains("§a§lCoffre")){
					
					String changer = name.replaceAll("§a§lCoffre ", "");
					changer = changer.replaceAll(" étoiles", "");
					changer = changer.replaceAll(" étoile", "");
					int type = 1;
		            try{
		                type = Integer.parseInt(changer);
		              }catch (NumberFormatException ex){
		                ex.printStackTrace();
		              }
		            
		            if(type == 6){
		            	if(cp.getChests6() > 0){
			    		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			    		    String date = df.format(new Date());
			            	if(cp.getBuyChestDate().equalsIgnoreCase(date)){
			            		ConfirmMenu.openMenu(p, "usec6");
								p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
			            	}else{
				            	if(!cp.getRank().equalsIgnoreCase("default")){
						            ConfirmMenu.openMenu(p, "usec6");
									p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
				            	}else{
				            		p.sendMessage("§cTu dois au moins être §f§lMiniVIP§r §cpour ouvrir ce coffre !");
				            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				            	}
			            	}
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 7 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 7){
		            	if(cp.getChests7() > 0){
			    		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			    		    String date = df.format(new Date());
			            	if(cp.getBuyChestDate().equalsIgnoreCase(date)){
			            		ConfirmMenu.openMenu(p, "usec7");
								p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
			            	}else{
				            	if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip")){
						            ConfirmMenu.openMenu(p, "usec7");
									p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
				            	}else{
				            		p.sendMessage("§cTu dois au moins être §e§lVIP§r §cpour ouvrir ce coffre !");
				            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				            	}
			            	}
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 7 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 8){
		            	if(cp.getChests8() > 0){
			    		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			    		    String date = df.format(new Date());
			            	if(cp.getBuyChestDate().equalsIgnoreCase(date)){
			            		ConfirmMenu.openMenu(p, "usec8");
								p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
			            	}else{
				            	if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip") && !cp.getRank().equalsIgnoreCase("vip")){
						            ConfirmMenu.openMenu(p, "usec8");
									p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
				            	}else{
				            		p.sendMessage("§cTu dois au moins être §b§lVIP+§r §cpour ouvrir ce coffre !");
				            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				            	}
			            	}
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 8 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 9){
		            	if(cp.getChests9() > 0){
			    		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			    		    String date = df.format(new Date());
			            	if(cp.getBuyChestDate().equalsIgnoreCase(date)){
			            		ConfirmMenu.openMenu(p, "usec9");
								p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
			            	}else{
				            	if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip") && !cp.getRank().equalsIgnoreCase("vip") && !cp.getRank().equalsIgnoreCase("vip+")){
						            ConfirmMenu.openMenu(p, "usec9");
									p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
				            	}else{
				            		p.sendMessage("§cTu dois au moins être §a§lUltraVIP§r §cpour ouvrir ce coffre !");
				            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				            	}
			            	}
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 9 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 10){
		            	if(cp.getChests10() > 0){
			    		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			    		    String date = df.format(new Date());
			            	if(cp.getBuyChestDate().equalsIgnoreCase(date)){
			            		ConfirmMenu.openMenu(p, "usec10");
								p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
			            	}else{
				            	if(cp.getRank().equalsIgnoreCase("ultravip+")){
						            ConfirmMenu.openMenu(p, "usec10");
									p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
				            	}else{
				            		p.sendMessage("§cTu dois au moins être §2§lUltraVIP+§r §cpour ouvrir ce coffre !");
				            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
				            	}
			            	}
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 10 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 4){
		            	if(cp.getChests4() > 0){
		            		ConfirmMenu.openMenu(p, "usec4");
							p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 4 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 3){
		            	if(cp.getChests3() > 0){
		            		ConfirmMenu.openMenu(p, "usec3");
							p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 3 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else if(type == 2){
		            	if(cp.getChests2() > 0){
		            		ConfirmMenu.openMenu(p, "usec2");
							p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 2 étoiles, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }else{
		            	if(cp.getChests1() > 0){
		            		ConfirmMenu.openMenu(p, "usec1");
							p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
		            	}else{
		            		p.sendMessage("§cTu n'as pas de coffres 1 étoile, tu peux en obtenir en visitant la boutique en ligne !");
		            		p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
		            	}
		            }
		            
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
