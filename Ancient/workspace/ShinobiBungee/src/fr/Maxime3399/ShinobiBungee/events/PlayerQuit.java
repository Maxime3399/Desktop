package fr.Maxime3399.ShinobiBungee.events;

import fr.Maxime3399.ShinobiBungee.utils.DataUtils;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerDisconnectEvent e){
		
		DataUtils.setIntServerInfo("onlinePlayers", DataUtils.getIntServerInfo("onlinePlayers")-1);
		
	}

}
