package fr.Maxime3399.LastJumper.schedulers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class EjectionTime {
	
	public static HashMap<String, Integer> sch = new HashMap<>();
	public static HashMap<Player, Integer> time = new HashMap<>();
	
	public static void start(String name){
		
		int task;
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(ArenasManager.playerArena.containsKey(pls)){
						
						if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
							
							if(ArenasManager.jumper.get(name) == pls){
								
								if(time.containsKey(pls)){
									
									if(time.get(pls) != 0){
										
										time.put(pls, time.get(pls)-1);
										
									}else{
										
										time.remove(pls);
										Vector jump = pls.getEyeLocation().getDirection().multiply(3).add(new Vector(0, 1.5, 0.5));
										pls.setVelocity(pls.getVelocity().add(jump));
										pls.playSound(pls.getLocation(), Sound.BLOCK_ANVIL_BREAK, 100, 1);
										
									}
									
								}else{
									
									time.put(pls, Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("EjectionTime"));
									
								}
								
							}else{
								
								if(time.containsKey(pls)){
									
									time.remove(pls);
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 20, 20);
		
		sch.put(name, task);
		
	}
	
	public static void stop(String name){
		
		Bukkit.getScheduler().cancelTask(sch.get(name));
		
	}

}
