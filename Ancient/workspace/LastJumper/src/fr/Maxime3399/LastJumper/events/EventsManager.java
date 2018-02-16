package fr.Maxime3399.LastJumper.events;

import java.awt.Event;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static HashMap<String, Event> hm = new HashMap<>();
	
	public static void registerEvents(Plugin pl){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new ArenasMenuEvents(), pl);
		pm.registerEvents(new PlayerQuit(), pl);
		pm.registerEvents(new CancelEvents(), pl);
		pm.registerEvents(new InteractEvents(), pl);
		pm.registerEvents(new PlayerFall(), pl);
		pm.registerEvents(new InvBedLeaver(), pl);
		
	}

}
