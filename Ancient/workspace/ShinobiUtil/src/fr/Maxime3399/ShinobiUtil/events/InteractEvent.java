package fr.Maxime3399.ShinobiUtil.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class InteractEvent implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			
			if(e.getItem() == null){
				
				return;
				
			}else{
				
				Player p = e.getPlayer();
				ItemStack item = e.getItem();
				String name = item.getItemMeta().getDisplayName();
				int lvl = p.getLevel();
				
				if(name.equalsIgnoreCase("§cBoule de feu suprême §b§l4")){
					if(lvl >= 4){
						//TECH
					}else{
						p.sendMessage("§cTu n'as plus asser de chakra !");
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_BOTTLE_THROW, 100, 2);
					}
				}else if(name.equalsIgnoreCase("§cLa balasmine §b§l5")){
					if(lvl >= 5){
						//TECH
					}else{
						p.sendMessage("§cTu n'as plus asser de chakra !");
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_BOTTLE_THROW, 100, 2);
					}
				}
				
			}
			
		}
		
	}

}
