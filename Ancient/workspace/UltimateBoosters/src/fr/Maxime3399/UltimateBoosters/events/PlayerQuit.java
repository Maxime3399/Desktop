package fr.Maxime3399.UltimateBoosters.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.Maxime3399.UltimateBoosters.schedulers.MultScheduler;
import fr.Maxime3399.UltimateBoosters.schedulers.ParticlesScheduler;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		Player p = e.getPlayer();
		
		if(ParticlesScheduler.global.contains(p)){
			
			ParticlesScheduler.global.remove(p);
			
		}
		
		MultScheduler.list.remove(p);
		
	}

}
