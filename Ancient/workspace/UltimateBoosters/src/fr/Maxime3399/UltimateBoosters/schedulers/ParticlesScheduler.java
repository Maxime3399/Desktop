package fr.Maxime3399.UltimateBoosters.schedulers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.Player;

import fr.Maxime3399.UltimateBoosters.API;

public class ParticlesScheduler {
	
	public static ArrayList<Player> global = new ArrayList<>();
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
			
			/*double t = 0;
			double r = 0.7;*/
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				//t = t+Math.PI/8;
				
				if(API.isGlobalBooster()){
					
					String booster = API.getGlobalBoosters().get(0);
					
					for(Player pls : Bukkit.getOnlinePlayers()){
						
						if(global.contains(pls) && !pls.getName().equalsIgnoreCase(API.getGlobalBoosterInfo(booster, "name"))){
							
							global.remove(pls);
							
						}else if(!global.contains(pls) && pls.getName().equals(API.getGlobalBoosterInfo(booster, "name"))){
							
							global.add(pls);
							
						}
						
					}
					
				}else{
					
					global.clear();
					
				}
				
				if(global.size() != 0){
					
					for(Player pls : global){
						
			              /*Location loc = pls.getLocation().add(0, 2.15, 0);
			              double x = r * Math.cos(t);
			              double z = r * Math.sin(t);
			              loc.add(x, 0, z);*/
			              
			              for(Player pls2 : Bukkit.getOnlinePlayers()){
			            	  
			            	  pls2.playEffect(pls.getLocation().add(0, 1, 0), Effect.CRIT, 1);
			            	  
			              }
						
					}
					
				}
				
				/*if (t > 2){
		        	  
		            t = 0;
		            
		          }*/
				
				if(API.getPersonalBoosters().size() != 0){
					
					for(String booster : API.getPersonalBoosters()){
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							if(pls.getUniqueId().toString().equalsIgnoreCase(booster)){
								
					              /*Location loc = pls.getLocation().add(0, 2.15, 0);
					              double x = r * Math.cos(t);
					              double z = r * Math.sin(t);
					              loc.add(x, 0, z);*/
								
				            	  pls.playEffect(pls.getLocation().add(0, 1, 0), Effect.CRIT, 1);
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
	}

}
