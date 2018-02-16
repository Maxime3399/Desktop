package fr.Maxime3399.MaxQuake;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.MaxQuake.actions.Teleporter;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.events.EventsManager;
import fr.Maxime3399.MaxQuake.utils.DataUtils;
import fr.Maxime3399.MaxQuake.utils.MySQLUtils;

public class MainClass extends JavaPlugin{
	
	private static Plugin plugin;
	
	public void onEnable(){
		
		plugin = this;
		
		File f = new File(getDataFolder(), "config.yml");
		if(!f.exists()){
			getConfig().options().copyDefaults(true);
			saveDefaultConfig();
			Bukkit.getConsoleSender().sendMessage("§eMaxQuake §d: §aThe configuration file has been created ! You have to configure the plugin with the file \"config.yml\".");
		}
		MySQLUtils.connect();
		GameState.setState(GameState.WAITING);
		
		if(MySQLUtils.state == null){
			
			Bukkit.getConsoleSender().sendMessage("§eMaxQuake §d: §cAn error occurred while connecting to the database ! Please check the \"config.yml\" file.");
			Bukkit.getPluginManager().disablePlugin(this);
			
		}else{
			
			DataUtils.registerPlugin();
			EventsManager.registerEvents(this);
			for(Location ls : Teleporter.getLocations()){
				ls.getWorld().getBlockAt(ls).setType(Material.REDSTONE_BLOCK);
			}
			
		}
		
	}
	
	public void onDisable(){
		
		for(Player pls : Bukkit.getOnlinePlayers()){
			
			pls.kickPlayer("§e§lQUAKECRAFT§r\n§7par Maxime3399§r\n \n§aMerci d'avoir joué !");
			
		}
		
		for(Entity e : Bukkit.getWorld("world").getEntities()){
			
			e.remove();
			
		}
		
	}
	
	public static Plugin getInstance(){
		return plugin;
	}

}
