package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.Maxime3399.MaxQuake.actions.Shooter;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.menus.ShopMainMenu;
import fr.Maxime3399.MaxQuake.menus.StatsMenu;

public class InteractEvent implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		
		Player p = e.getPlayer();
		
		if(e.getAction() == null || e.getItem() == null){
			
			return;
			
		}else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lRailgun")){
			
			if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
				
				if(GameState.isState(GameState.PLAYING)){
					
					Shooter.shoot(p, false);
					
				}
				
			}
			
		}else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBoutique ( clique droit )")){
			
			if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
				
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
				ShopMainMenu.openMenu(p);
				
			}
			
		}else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bStatistiques ( clique droit )")){
			
			if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
				
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
				StatsMenu.openMenu(p);
				
			}
			
		}else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cParamètres ( clique droit )")){
			
			if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
				
				//SUITE
				
			}
			
		}
		
	}

}
