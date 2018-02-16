package fr.Maxime3399.ShinobiBungee.events;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin p){
		
		PluginManager pm = ProxyServer.getInstance().getPluginManager();
		
		pm.registerListener(p, new PingEvent());
		pm.registerListener(p, new PlayerJoin());
		pm.registerListener(p, new PlayerQuit());
		
	}

}
