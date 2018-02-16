package fr.Maxime3399.MaxParticles.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.menus.MainMenu;

public class WingsMenuEvents implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§8Particles>Wings")){
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eFire Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lFire Wings§r§a effect activated !");
				EffectManager.lister.put(p, "firewings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMagic Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lMagic Wings§r§a effect activated !");
				EffectManager.lister.put(p, "magicwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eSnow Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lSnow Wings§r§a effect activated !");
				EffectManager.lister.put(p, "snowwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eDeath Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lDeath Wings§r§a effect activated !");
				EffectManager.lister.put(p, "deathwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMulticolor Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lMulticolor Wings§r§a effect activated !");
				EffectManager.lister.put(p, "multicolorwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eNether Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lNether Wings§r§a effect activated !");
				EffectManager.lister.put(p, "netherwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eEnder Wings")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lEnder Wings§r§a effect activated !");
				EffectManager.lister.put(p, "enderwings");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7§oBack")){
				
				MainMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}
			
			e.setCancelled(true);
			
		}
		
	}
	
}
