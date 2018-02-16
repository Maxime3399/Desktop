package fr.Maxime3399.MCube.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		Player p = e.getPlayer();
		e.setQuitMessage("§c§l-§r "+p.getDisplayName());
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					MainScoreboard.loadScoreboard(pls);
					
				}
				
			}
			
		}, 10);
		
	}

}
