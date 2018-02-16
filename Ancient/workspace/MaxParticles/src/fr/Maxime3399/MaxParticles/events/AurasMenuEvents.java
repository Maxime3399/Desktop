package fr.Maxime3399.MaxParticles.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.menus.MainMenu;

public class AurasMenuEvents implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§8Particles>Auras")){
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eFire Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lFire Aura§r§a effect activated !");
				EffectManager.lister.put(p, "fireaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMagic Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lMagic Aura§r§a effect activated !");
				EffectManager.lister.put(p, "magicaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eSnow Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lSnow Aura§r§a effect activated !");
				EffectManager.lister.put(p, "snowaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eEnder Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lEnder Aura§r§a effect activated !");
				EffectManager.lister.put(p, "enderaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eEnchantment Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lEnchantment Aura§r§a effect activated !");
				EffectManager.lister.put(p, "enchantaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eDeath Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lDeath Aura§r§a effect activated !");
				EffectManager.lister.put(p, "deathaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMusic Aura")){
				
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §e§lMusic Aura§r§a effect activated !");
				EffectManager.lister.put(p, "musicaura");
				
			}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7§oBack")){
				
				MainMenu.openMenu(p);
				p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
				
			}
			
			e.setCancelled(true);
			
		}
		
	}
	
}
