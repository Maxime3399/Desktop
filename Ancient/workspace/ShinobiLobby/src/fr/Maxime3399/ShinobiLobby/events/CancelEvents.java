package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

@SuppressWarnings("deprecation")
public class CancelEvents implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void foodChange(FoodLevelChangeEvent e){
		
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

}
