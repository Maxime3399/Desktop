package fr.Maxime3399.MCube.events;

import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.custom.GameEvent;

public class SuperEvents implements Listener {
	
	@EventHandler
	public void onDamages(EntityDamageEvent e){
		
		if(GameEvent.isEvent(GameEvent.HALFDAMAGES)){
			e.setDamage(e.getDamage()/2);
		}else if(GameEvent.isEvent(GameEvent.DOUBLEDAMAGES)){
			e.setDamage(e.getDamage()*2);
		}
		
		if(e.getEntity().getType() == EntityType.PLAYER){
			
			Player p = (Player) e.getEntity();
			if(p.getOpenInventory() == null | p.getOpenInventory().getTopInventory() == null){
				
				return;
				
			}else{
				
				if(p.getOpenInventory().getTopInventory().getName().contains("§8")){
					
					e.setCancelled(true);
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onDeath(PlayerDeathEvent e){
		
		if(GameEvent.isEvent(GameEvent.DEATHCOINS)){
			
			Player p = e.getEntity();
			p.sendMessage("§cTu as perdu §l20§r §ccoins !");
			p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FIREBALL_EXPLODE, 100, 2);
			CustomPlayer cp = new CustomPlayer(p);
			cp.removeCoins(20);
			cp.update();
			
		}else if(GameEvent.isEvent(GameEvent.DEATHSTUFF)){
			
			e.getDrops().clear();
			
		}
		
	}

}
