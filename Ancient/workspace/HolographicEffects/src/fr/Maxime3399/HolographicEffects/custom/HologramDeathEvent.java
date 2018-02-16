package fr.Maxime3399.HolographicEffects.custom;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class HologramDeathEvent extends Event implements Cancellable{

	public static final HandlerList handlers = new HandlerList();
	
	private Hologram hologram;
	private boolean cancelled = false;
	
	public HologramDeathEvent(Hologram hologram){
		
		this.hologram = hologram;
		
	}
	
	public Hologram getHologram(){
		
		return hologram;
		
	}
	
	@Override
	public boolean isCancelled() {
		
		return cancelled;
		
	}

	@Override
	public void setCancelled(boolean cancelled) {
		
		this.cancelled = cancelled;
		
	}

	@Override
	public HandlerList getHandlers() {

		return handlers;
	}
	
	public static HandlerList getHandlerList(){
		
		return handlers;
		
	}

}
