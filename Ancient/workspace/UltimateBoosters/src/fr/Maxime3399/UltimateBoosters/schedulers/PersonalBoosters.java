package fr.Maxime3399.UltimateBoosters.schedulers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.UltimateBoosters.API;
import fr.Maxime3399.UltimateBoosters.menus.MainMenu;

public class PersonalBoosters {
	
	public static ArrayList<String> runBoosters = new ArrayList<>();
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
			
			@Override
			public void run() {
				
				if(API.getPersonalBoosters().size() != 0){
					
					for(String booster : API.getPersonalBoosters()){
						
						if(runBoosters.contains(booster)){
							
							int time = 0;
				            try{
				                time = Integer.parseInt(API.getPersonalBoosterInfo(booster, "time"));
				              }catch (NumberFormatException e){
				                e.printStackTrace();
				              }
							
				            if(time == 0){
				            	
				            	for(Player pls : Bukkit.getOnlinePlayers()){
				            		
				            		if(pls.getUniqueId().toString().equalsIgnoreCase(booster)){
				            			
				            			runBoosters.remove(booster);
				            			API.removePersonalBooster(booster);
				            			pls.sendMessage("§6§l[§r§cBooster§r§6§l] §r§cYour personal booster expired !");
				            			
					            		if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("EndSound")){
					            			
						            		pls.playSound(pls.getLocation(), Sound.ZOMBIE_WOODBREAK, 100, 2);
					            			
					            		}
					            		
				            			if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("EndParticles")){
				            				
					            			for(Integer i = 0; i <= 3; i++){
												
												Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
													
													@SuppressWarnings("deprecation")
													@Override
													public void run() {
														
								            			pls.playEffect(pls.getLocation().add(0, 1, 0), Effect.MOBSPAWNER_FLAMES, 8);
														
													}
													
												}, 2*i);
												
											}
				            				
				            			}
				            			
				            		}
				            		
				            	}
				            	
				            }else{
				            	
				            	if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getBoolean("Bungeecord") && Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getBoolean("MainServer")){
				            		
					            	time = time-1;
					            	API.setPersonalBoosterInfo(booster, "time", ""+time);
				            		
				            	}else{
				            		
					            	time = time-1;
					            	API.setPersonalBoosterInfo(booster, "time", ""+time);
				            		
				            	}
				            	
				            }
				            
						}else{
			            	
			            	for(Player pls : Bukkit.getOnlinePlayers()){
			            		
			            		if(pls.getUniqueId().toString().equalsIgnoreCase(booster)){
			            			
			            			pls.sendMessage("§6§l[§r§cBooster§r§6§l] §r§aYour personal booster is active !");
			            			
									if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("ActivationSound")){
										
										pls.playSound(pls.getLocation(), Sound.LEVEL_UP, 100, 1);
										
									}
			            			
			            			if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("Fireworks")){
			            				
				            			for(Integer i = 0; i <= 3; i++){
											
											Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
												
												@SuppressWarnings("deprecation")
												@Override
												public void run() {
													
							            			for(Integer iz = 0; iz <= 5; iz++){
							            				
								            			pls.playEffect(pls.getLocation().add(0, 1, 0), Effect.FIREWORKS_SPARK, 30);		
								            			
							            			}					            			
													
												}
												
											}, 3*i);
											
										}
			            				
			            			}
			            			
									Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
										@Override
										public void run() {
											if(pls.getOpenInventory() == null){
												return;
											}else if(pls.getOpenInventory().getTopInventory().getName().equalsIgnoreCase("§6§lBoosters")){
												MainMenu.openMenu(pls);
											}
										}
									}, 10);
			            			
			            		}
			            		
			            	}
							
			            	runBoosters.add(booster);
			            	
						}
						
					}
					
				}
				
			}
			
		}, 20, 20);
		
	}

}
