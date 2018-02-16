package fr.Maxime3399.LastJumper.schedulers;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.actions.coloredWool;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.scoreboards.GameScoreboard;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;

public class PlayerJumps {
	
	public static HashMap<String, Integer> sch = new HashMap<>();
	public static HashMap<String, ArrayList<Block>> bl = new HashMap<>();
	
	public static void start(String name){
		
		int task;
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(ArenasManager.playerArena.containsKey(pls)){
						
						if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
							
							if(ArenasManager.arenasState.get(name).equalsIgnoreCase("playing")){
								
								if(pls.getGameMode() == GameMode.ADVENTURE){
									
									if(pls.getLocation().getBlock().getType() == Material.WATER || pls.getLocation().getBlock().getType() == Material.STATIONARY_WATER){
										
										Location loc = pls.getLocation();
										if(loc.getBlock() == null){
											return;
										}else{
											loc.getBlock().setType(Material.WOOL);
											loc.getBlock().setData((byte) coloredWool.getColor());
											bl.get(name).add(loc.getBlock());
										}
										
										pls.setGameMode(GameMode.SPECTATOR);
										pls.teleport(ArenasConfig.getLocation(name, "Jump"));
										
										Jumper.selectJumper(pls, name);
										for(Player pls2 : Bukkit.getOnlinePlayers()){
											
											if(ArenasManager.playerArena.get(pls2).equalsIgnoreCase(name)){
												
												GameScoreboard.loadScoreboard(pls2);
												pls2.playSound(pls2.getLocation(), Sound.BLOCK_WATERLILY_PLACE, 100, 2);
												pls2.playSound(pls2.getLocation(), Sound.BLOCK_WATER_AMBIENT, 100, 1);
												
											}
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
		sch.put(name, task);
		
	}
	
	public static void stop(String name){
		
		Bukkit.getScheduler().cancelTask(sch.get(name));
		
	}

}
