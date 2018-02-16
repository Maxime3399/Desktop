package fr.Maxime3399.ShinobiUtil.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

@SuppressWarnings("deprecation")
public class CancelEvents implements Listener {
	
	@EventHandler
	public void onInv(InventoryClickEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onPickupA(PlayerPickupArrowEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e){
		
		e.setCancelled(true);
		
	}

}
