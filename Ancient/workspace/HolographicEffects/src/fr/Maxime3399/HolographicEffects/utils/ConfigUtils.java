package fr.Maxime3399.HolographicEffects.utils;

import java.io.File;

import fr.Maxime3399.HolographicEffects.MainClass;

public class ConfigUtils {
	
	public static void loadConfiguration(){
		
		File file = new File(MainClass.getInstance().getDataFolder(), "config.yml");
		
		if(!file.exists()){
			
			MainClass.getInstance().getConfig().options().copyDefaults();
			MainClass.getInstance().saveDefaultConfig();
			
		}
		
	}
	
	public static boolean isEnable(String effect){
		
		return MainClass.getInstance().getConfig().getConfigurationSection(effect).getBoolean("Enable");
		
	}
	
	public static String getDisplay(String effect){
		
		return MainClass.getInstance().getConfig().getConfigurationSection(effect).getString("Display").replaceAll("&", "§");
		
	}
	
	public static boolean animationTextEnable(String effect){
		
		return MainClass.getInstance().getConfig().getConfigurationSection(effect).getBoolean("TextAnimation");
		
	}
	
	public static boolean animationMooveEnable(String effect){
		
		return MainClass.getInstance().getConfig().getConfigurationSection(effect).getBoolean("MooveAnimation");
		
	}
	
	public static int getTime(String effect){
		
		return MainClass.getInstance().getConfig().getConfigurationSection(effect).getInt("Time");
		
	}

}
