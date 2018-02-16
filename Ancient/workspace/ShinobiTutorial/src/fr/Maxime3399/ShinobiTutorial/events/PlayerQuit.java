package fr.Maxime3399.ShinobiTutorial.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.Maxime3399.ShinobiTutorial.utils.DataUtils;
import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		Player p = e.getPlayer();
		e.setQuitMessage(null);
		
		for(Arena a : ArenasManager.list){
			if(a.isIn(p)){
				a.removePlayer(p);
			}
		}
		
		if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "teleport").equalsIgnoreCase("tutorial")){
			
			DataUtils.setIntServerInfo("tutorialPlayers", DataUtils.getIntServerInfo("tutorialPlayers")-1);
			
		}
		
	}

}
