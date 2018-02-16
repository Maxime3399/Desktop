package fr.Maxime3399.HolographicEffects.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import fr.Maxime3399.HolographicEffects.custom.HologramDamageEvent;
import fr.Maxime3399.HolographicEffects.custom.HologramDeathEvent;

public class HologramEvents implements Listener {
	
	@EventHandler
	public void onHologramDamage(HologramDamageEvent event){
		
		event.setCancelled(true);
		
	}
	
	@EventHandler
	public void onHologramDeath(HologramDeathEvent event){
		
		event.setCancelled(true);
		
	}

}
