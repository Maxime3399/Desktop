package fr.Maxime3399.UltimateBoosters.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.UltimateBoosters.API;
import fr.Maxime3399.UltimateBoosters.menus.MainMenu;
import fr.Maxime3399.UltimateBoosters.utils.FireworksUtils;

public class GlobalScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
			
			String booster = "";
			int multiplier = 0;
			
			@Override
			public void run() {
				
				if(booster.equalsIgnoreCase("")){
					
					if(API.isGlobalBooster()){
						
						booster = API.getGlobalBoosters().get(0);
						multiplier = API.getGlobalBoosterMultiplier(booster);
						
						Bukkit.broadcastMessage("§6§l[§r§cBooster§r§6§l] §r§3§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§3's §b§lx"+multiplier+"§r§3 network booster is now active, use §e§l/tip§r§3 to thank him !");
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
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
							
							if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("ActivateSound")){
							
								pls.playSound(pls.getLocation(), Sound.LEVEL_UP, 100, 1);
								
							}
							
							if(pls.getName().equalsIgnoreCase(API.getGlobalBoosterInfo(booster, "name"))){
								
								if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("Fireworks")){
									
									for(Integer i = 0; i <= 8; i++){
										
										Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
											
											@Override
											public void run() {
												
												FireworksUtils.spawnRandomFirework(pls.getLocation());
												
											}
											
										}, 6*i);
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}else{
					
					int time = 0;
		            try{
		                time = Integer.parseInt(API.getGlobalBoosterInfo(booster, "time"));
		              }catch (NumberFormatException e){
		                e.printStackTrace();
		              }
		            
		            if(time == 0){
		            	
		            	Bukkit.broadcastMessage("§6§l[§r§cBooster§r§6§l] §r§c§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§c's network booster expired !");
		            	API.setPlayerGlobalTips(booster);
		            	for(Player pls : Bukkit.getOnlinePlayers()){
		            		
		            		if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("EndSound")){
		            			
			            		pls.playSound(pls.getLocation(), Sound.ZOMBIE_WOODBREAK, 100, 1);
		            			
		            		}
		            		
		            		if(pls.getName().equalsIgnoreCase(API.getGlobalBoosterInfo(booster, "name"))){
		            			
		            			if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("EndParticles")){
		            				
			            			for(Integer i = 0; i <= 5; i++){
										
										Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
											
											@Override
											public void run() {
												
						            			pls.getLocation().getWorld().playEffect(pls.getLocation().add(0, 1, 0), Effect.MOBSPAWNER_FLAMES, 20);
												
											}
											
										}, 4*i);
										
									}
		            				
		            			}
		            			
		            		}
		            		
		            	}
		            	
		            	API.removeGlobalBooster(booster);
		            	booster = "";
		            	multiplier = 0;
		            	
		            }else{
		            	
		            	if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getBoolean("Bungeecord") && Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getBoolean("MainServer")){
		            		
			            	time = time-1;
			            	API.setGlobalBoosterInfo(booster, "time", ""+time);
		            		
		            	}else{
		            		
			            	time = time-1;
			            	API.setGlobalBoosterInfo(booster, "time", ""+time);
		            		
		            	}
		            	
		            }
					
				}
				
			}
			
		}, 20, 20);
		
	}

}
