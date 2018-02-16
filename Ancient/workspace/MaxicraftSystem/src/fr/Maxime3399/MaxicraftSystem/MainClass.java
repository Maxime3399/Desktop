package fr.Maxime3399.MaxicraftSystem;

import fr.Maxime3399.MaxicraftSystem.events.EventsManager;
import fr.Maxime3399.MaxicraftSystem.utils.MySQLUtils;
import net.md_5.bungee.api.plugin.Plugin;

public class MainClass extends Plugin{
	
	private static Plugin pl;
	
	public void onEnable(){
		
		pl = this;
		
		MySQLUtils.connect();
		EventsManager.registerEvents(this);
		
	}
	
	public static Plugin getInstance(){
		
		return pl;
		
	}

}
