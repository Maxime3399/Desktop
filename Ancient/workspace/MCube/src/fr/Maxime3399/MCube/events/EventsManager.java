package fr.Maxime3399.MCube.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import fr.Maxime3399.MCube.MainClass;

public class EventsManager {
	
	public static void registerEvents(){
		
		PluginManager pm = Bukkit.getPluginManager();
		Plugin pl = MainClass.getInstance();
		
		pm.registerEvents(new PlayerJoin(), pl);
		pm.registerEvents(new PlayerQuit(), pl);
		pm.registerEvents(new CancelEvents(), pl);
		pm.registerEvents(new RewardsEvents(), pl);
		pm.registerEvents(new SuperEvents(), pl);
		pm.registerEvents(new MainMenuEvents(), pl);
		pm.registerEvents(new ProfileMenuEvents(), pl);
		pm.registerEvents(new QuestsMenuEvents(), pl);
		pm.registerEvents(new ConfirmMenuEvents(), pl);
		pm.registerEvents(new EventsEvents(), pl);
		pm.registerEvents(new ChestsMenuEvents(), pl);
		pm.registerEvents(new CosMainMenuEvents(), pl);
		pm.registerEvents(new CosParticlesWingsMenuEvents(), pl);
		pm.registerEvents(new CosParticlesHatsMenuEvents(), pl);
		pm.registerEvents(new CosParticlesMenuEvents(), pl);
		pm.registerEvents(new PrefixMenuEvents(), pl);
		pm.registerEvents(new ExpBankEvents(), pl);
		pm.registerEvents(new PingEvents(), pl);
		
	}

}
