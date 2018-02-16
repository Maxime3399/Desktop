package fr.Maxime3399.LastJumper.schedulers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.scoreboards.GameScoreboard;
import fr.Maxime3399.LastJumper.scoreboards.WaitScoreboard;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class WaitingScheduler {
	
	public static HashMap<String, Integer> sch = new HashMap<>();
	
	public static void start(String name){
		
		int task;
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				if(ArenasManager.arenasState.containsKey(name)){
					
					if(ArenasManager.arenasState.get(name).equalsIgnoreCase("wait")){
						
						if(ArenasManager.startingTime.get(name) == 3399){
							
							if(ArenasManager.arenaCount.get(name) >= Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MinPlayers")){
								
								ArenasManager.startingTime.put(name, Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("StartTime"));
								
								for(Player pls : Bukkit.getOnlinePlayers()){
									if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
										MessagesUtils.sendMessages(pls, "GameStart", true, ""+Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("StartTime"));
										pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
									}
								}
								
							}else{
								return;
							}
							
						}else if(ArenasManager.startingTime.get(name) == 0){
							
							ArenasManager.startingTime.put(name, 3399);
							ArenasManager.arenasState.put(name, "playing");
							ArenasManager.livePlayers.put(name, ArenasManager.arenaCount.get(name));
							for(Player pls : Bukkit.getOnlinePlayers()){
								if(ArenasManager.playerArena.containsKey(pls)){
									if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
										ArenasManager.livingPerson.get(name).add(pls);
										MessagesUtils.sendMessages(pls, "Starting", true, "");
										pls.teleport(ArenasConfig.getLocation(name, "Jump"));
										pls.getInventory().clear();
										pls.setGameMode(GameMode.SPECTATOR);
										Player po = Jumper.lister.get(name).get(0);
										Jumper.selectJumper(po, name);
										pls.playSound(pls.getLocation(), Sound.BLOCK_ANVIL_USE, 100, 2);
										if(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes") >= 1){
											ArenasManager.lifes.put(pls, Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes"));
											pls.setMaxHealth(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes")*2);
											pls.setHealth(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes")*2);
										}
										GameScoreboard.loadScoreboard(pls);
									}
								}
							}
							
						}else{
							
							if(ArenasManager.arenaCount.get(name) >= Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MinPlayers")){
								
								ArenasManager.startingTime.put(name, ArenasManager.startingTime.get(name)-1);
								
							}else{
								
								ArenasManager.startingTime.put(name, 3399);
								for(Player pls : Bukkit.getOnlinePlayers()){
									if(ArenasManager.playerArena.containsKey(pls)){
										if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
											MessagesUtils.sendMessages(pls, "StartingCancelled", true, "");
											WaitScoreboard.loadScoreboard(pls);
											pls.playSound(pls.getLocation(), Sound.BLOCK_WOODEN_DOOR_CLOSE, 100, 1);
										}
									}
								}
								
							}
							
						}
						
					}
					
				}
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(ArenasManager.playerArena.containsKey(pls)){
						
						String name = ArenasManager.playerArena.get(pls);
						
						if(ArenasManager.arenasState.get(name).equalsIgnoreCase("wait")){
							
							WaitScoreboard.loadScoreboard(pls);
							
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
