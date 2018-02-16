package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import fr.Maxime3399.MaxQuake.menus.ConfirmMenu;

public class EventsManager {
	
	public static void registerEvents(Plugin p){
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerJoin(), p);
		pm.registerEvents(new PlayerQuit(), p);
		pm.registerEvents(new CancelEvents(), p);
		pm.registerEvents(new InteractEvent(), p);
		pm.registerEvents(new ShopMainMenuEvents(), p);
		pm.registerEvents(new ShopCaseMenuEvents(), p);
		pm.registerEvents(new ShopTriggerMenuEvents(), p);
		pm.registerEvents(new ConfirmMenu(), p);
		pm.registerEvents(new PickupBooster(), p);
		
	}

}
