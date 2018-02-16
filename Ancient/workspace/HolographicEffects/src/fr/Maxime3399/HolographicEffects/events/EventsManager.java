package fr.Maxime3399.HolographicEffects.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin plugin){
		
		PluginManager pluginmanager = Bukkit.getPluginManager();
		
		pluginmanager.registerEvents(new CustomEvents(), plugin);
		pluginmanager.registerEvents(new HologramEvents(), plugin);
		pluginmanager.registerEvents(new ActionsEvents(), plugin);
		
	}

}
