package fr.Maxime3399.MaxParticles.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import fr.Maxime3399.MaxParticles.MainClass;

public class EventsManager {
	
	public static void registerEvents(){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new MainMenuEvents(), MainClass.getInstance());
		pm.registerEvents(new WingsMenuEvents(), MainClass.getInstance());
		pm.registerEvents(new AurasMenuEvents(), MainClass.getInstance());
		pm.registerEvents(new HatsMenuEvents(), MainClass.getInstance());
		
	}

}
