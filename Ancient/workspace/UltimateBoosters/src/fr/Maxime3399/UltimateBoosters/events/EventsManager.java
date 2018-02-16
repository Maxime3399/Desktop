package fr.Maxime3399.UltimateBoosters.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin pl){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerJoin(), pl);
		pm.registerEvents(new PlayerQuit(), pl);
		pm.registerEvents(new MenuEvents(), pl);
		
	}

}
