package fr.Maxime3399.HolographicEffects;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.HolographicEffects.custom.Hologram;
import fr.Maxime3399.HolographicEffects.events.EventsManager;
import fr.Maxime3399.HolographicEffects.manager.HologramsManager;
import fr.Maxime3399.HolographicEffects.utils.ConfigUtils;

public class MainClass extends JavaPlugin{
	
	static Plugin plugin;
	
	public void onEnable(){
		
		plugin = this;
		ConfigUtils.loadConfiguration();
		EventsManager.registerEvents(this);
		HologramsManager.debug = 1;
		
	}
	
	public void onDisable(){
		
		for(Hologram holograms : HologramsManager.getHolograms()){
			
			holograms.remove();
			
		}
		
	}
	
	public static Plugin getInstance(){
		
		return plugin;
		
	}

}
