package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager {
	
	public static void registerEvents(Plugin p){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerJoin(), p);
		pm.registerEvents(new PlayerQuit(), p);
		pm.registerEvents(new CancelEvents(), p);
		pm.registerEvents(new NPCEvents(), p);
		pm.registerEvents(new CapaMainMenuEvents(), p);
		pm.registerEvents(new CapaRemoveMenuEvents(), p);
		pm.registerEvents(new CapaAddMainMenuEvents(), p);
		pm.registerEvents(new CapaAddWeaponsMenuEvents(), p);
		pm.registerEvents(new CapaAddKatonMenuEvents(), p);
		
	}

}
