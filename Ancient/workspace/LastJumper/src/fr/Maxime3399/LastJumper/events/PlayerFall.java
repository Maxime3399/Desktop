package fr.Maxime3399.LastJumper.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.schedulers.PlayerDeathScheduler;

public class PlayerFall implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		
		if(e.getEntity().getType() == EntityType.PLAYER){
			
			Player p = (Player) e.getEntity();
			
			if(ArenasManager.playerArena.containsKey(p)){
				
				int dmg = (int) e.getDamage();
				e.setDamage(0);
				
				if(e.getCause() == DamageCause.FALL){
					
					if(dmg != 0){
						
						if(e.getEntity().getLocation().getBlock().getType() != Material.WATER && e.getEntity().getLocation().getBlock().getType() != Material.STATIONARY_WATER){
							
							PlayerDeathScheduler.list.add(p);
							
						}
						
					}
					
				}
				
				e.setCancelled(true);
				
				
			}
			
		}
		
	}

}
