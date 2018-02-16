package fr.Maxime3399.ShinobiBungee;

import fr.Maxime3399.ShinobiBungee.events.EventsManager;
import fr.Maxime3399.ShinobiBungee.utils.MySQLUtils;
import net.md_5.bungee.api.plugin.Plugin;

public class MainClass extends Plugin{
	
	public void onEnable(){
		
		MySQLUtils.connect();
		EventsManager.registerEvents(this);
		
	}

}
