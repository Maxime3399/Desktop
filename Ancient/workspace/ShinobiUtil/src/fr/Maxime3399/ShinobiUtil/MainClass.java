package fr.Maxime3399.ShinobiUtil;

import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.events.EventsManager;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;
import fr.Maxime3399.ShinobiUtil.utils.MySQLUtils;

public class MainClass extends JavaPlugin{
	
	private static Plugin plugin;
	
	public void onEnable(){
		
		plugin = this;
		MySQLUtils.connect();
		EventsManager.registerEvents(this);
		ArenasManager.setup();
		
	}
	
	public static Plugin getInstance(){
		return plugin;
	}
	
	public void onDisable(){
		
		for(Arena a : ArenasManager.list){
			
			for(Block bs : a.getBlocks().keySet()){
				
				bs.setType(a.getBlocks().get(bs));
				a.removeBlock(bs);
				
			}
			
		}
		
	}

}
