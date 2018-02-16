package fr.Maxime3399.LastJumper.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import fr.Maxime3399.LastJumper.MainClass;

public class ConfigManager {

	private MainClass plugin = MainClass.getPlugin(MainClass.class);
	
	public FileConfiguration arenasConf;
	public File arenasFile;
	
	public void setup(){
		
		if(!plugin.getDataFolder().exists()){
			
			plugin.getDataFolder().mkdir();
			
		}
		
		arenasFile = new File(plugin.getDataFolder(), "arenas.yml");
		
		if(!arenasFile.exists()){
			
			try{
				arenasFile.createNewFile();
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§bLastJumper§r§6§l] §r§aThe arenas.yml file has been created");
			}catch(IOException e){
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§bLastJumper§r§6§l] §r§cCould not create the arenas.yml file");
			}
			
		}
		
		arenasConf = YamlConfiguration.loadConfiguration(arenasFile);
		
	}
	
	public FileConfiguration getArenas(){
		
		return arenasConf;
		
	}
	
	public void saveArenasConfiguration(){
		
		try{
			arenasConf.save(arenasFile);
		}catch(IOException e){
			Bukkit.getConsoleSender().sendMessage("§6§l[§r§bLastJumper§r§6§l] §r§4Error");
		}
		
	}
	
	public void reloadArenasConfiguration(){
		
		arenasConf = YamlConfiguration.loadConfiguration(arenasFile);
		
	}
	
}
