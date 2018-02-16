package fr.Maxime3399.MaxQuake.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class CancelEvents implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e){
		
		e.setCancelled(false);
		
	}
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onMenu(InventoryClickEvent e){
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onWeather(WeatherChangeEvent e){
		
		e.setCancelled(true);
		
	}

}
