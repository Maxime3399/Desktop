package fr.Maxime3399.MCube.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import fr.Maxime3399.MCube.custom.GameEvent;

public class CancelEvents implements Listener {
	
	@EventHandler
	public void onLostFood(FoodLevelChangeEvent e){
		if(GameEvent.isEvent(GameEvent.NOFOOD)){
			if(e.getEntity().getType() == EntityType.PLAYER){
				
				e.setCancelled(true);
				
			}
		}
	}

}
