package fr.Maxime3399.MaxicraftSystem.events;

import fr.Maxime3399.MaxicraftSystem.utils.DatabaseAPI;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerDisconnectEvent e){
		
		DatabaseAPI.setIntServerInfo("playersGlobalCount", DatabaseAPI.getIntServerInfo("playersGlobalCount")-1);
		
	}

}
