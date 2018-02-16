package fr.Maxime3399.MaxParticles.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.menus.AurasMenu;
import fr.Maxime3399.MaxParticles.menus.HatsMenu;
import fr.Maxime3399.MaxParticles.menus.WingsMenu;

public class MainMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§8Particles")){
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Wings")){
				
				WingsMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Auras")){
				
				AurasMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Hats")){
				
				HatsMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§oRemove effect")){
				
				if(EffectManager.lister.containsKey(p)){
					
					p.playSound(p.getLocation(), Sound.FUSE, 100, 2);
					p.closeInventory();
					p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §eYour effect has been disabled !");
					p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
					EffectManager.lister.remove(p);
					
				}else{
					
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §eYou have no active effect !");
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
