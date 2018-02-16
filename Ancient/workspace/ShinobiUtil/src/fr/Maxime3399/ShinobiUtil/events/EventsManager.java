package fr.Maxime3399.ShinobiUtil.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin p){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new CancelEvents(), p);
		pm.registerEvents(new InteractEvent(), p);
		pm.registerEvents(new DeathEvents(), p);
		
	}

}
