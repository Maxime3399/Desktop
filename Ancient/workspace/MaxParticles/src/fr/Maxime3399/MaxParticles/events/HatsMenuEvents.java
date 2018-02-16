package fr.Maxime3399.MaxParticles.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.menus.MainMenu;

public class HatsMenuEvents implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§8Particles>Hats")){
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eFire Hat")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lFire Hat§r§a effect activated !");
				EffectManager.lister.put(p, "firehat");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMagic Hat")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lMagic Hat§r§a effect activated !");
				EffectManager.lister.put(p, "magichat");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eSnow Hat")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lSnow Hat§r§a effect activated !");
				EffectManager.lister.put(p, "snowhat");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7§oBack")){
				
				MainMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}
			
			e.setCancelled(true);
			
		}
		
	}
	
}
