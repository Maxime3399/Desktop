package fr.Maxime3399.ShinobiTutorial.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin p){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerJoin(), p);
		pm.registerEvents(new PlayerQuit(), p);
		pm.registerEvents(new TypeMenuEvents(), p);
		pm.registerEvents(new SuperEvents(), p);
		
	}

}
