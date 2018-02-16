package fr.Maxime3399.HolographicEffects.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import fr.Maxime3399.HolographicEffects.custom.HologramDamageEvent;
import fr.Maxime3399.HolographicEffects.custom.HologramDeathEvent;
import fr.Maxime3399.HolographicEffects.manager.HologramsManager;

public class CustomEvents implements Listener {
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent event){
		
		if(event.getEntity().getType() == EntityType.ARMOR_STAND){
			
			ArmorStand armorstand = (ArmorStand) event.getEntity();
			
			if(HologramsManager.isHologram(armorstand)){
				
				HologramDamageEvent customevent = new HologramDamageEvent(HologramsManager.getCorrespondingHologram(armorstand));
				Bukkit.getServer().getPluginManager().callEvent(customevent);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event){
		
		if(event.getEntity().getType() == EntityType.ARMOR_STAND){
			
			ArmorStand armorstand = (ArmorStand) event.getEntity();
			
			if(HologramsManager.isHologram(armorstand)){
				
				HologramDeathEvent customevent = new HologramDeathEvent(HologramsManager.getCorrespondingHologram(armorstand));
				Bukkit.getServer().getPluginManager().callEvent(customevent);
				
			}
			
		}
		
	}

}
