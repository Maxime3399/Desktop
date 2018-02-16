package fr.Maxime3399.LastJumper.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class CancelEvents implements Listener {
	
	@EventHandler
	public void onBreakBlock(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(ArenasManager.playerArena.containsKey(p)){
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPlaceBlock(BlockPlaceEvent e){
		Player p = e.getPlayer();
		if(ArenasManager.playerArena.containsKey(p)){
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onFoodLost(FoodLevelChangeEvent e){
		
		Player p = (Player) e.getEntity();
		if(ArenasManager.playerArena.containsKey(p)){
			e.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void onPickupItem(PlayerPickupItemEvent e){
		
		Player p = e.getPlayer();
		if(ArenasManager.playerArena.containsKey(p)){
			e.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e){
		
		Player p = e.getPlayer();
		if(ArenasManager.playerArena.containsKey(p)){
			e.setCancelled(true);
		}
		
	}

}
