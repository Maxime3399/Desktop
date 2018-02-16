package fr.Maxime3399.ShinobiLobby.actions;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class JoinAction {
	
	private static ArrayList<Player> action = new ArrayList<>();
	public static ArrayList<Player> waittutorial = new ArrayList<>();
	public static ArrayList<Player> waitvs = new ArrayList<>();
	public static ArrayList<Player> waitranked = new ArrayList<>();
	
	public static void joinTutorial(Player p){
		
		if(!action.contains(p)){
			
			action.add(p);
			
			if(waittutorial.contains(p)){
				
				waittutorial.remove(p);
				p.sendMessage("§eTu as quitté la file d'attente.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}else{
				
				int players = DataUtils.getIntServerInfo("tutorialPlayers");
				
				if(players >= 3){
					
					removeWait(p);
					waittutorial.add(p);
					int place = waittutorial.indexOf(p)+1;
					p.sendMessage("§eFile d'attente rejointe : §6tutoriel§r §e( place : "+place+" ).");
					p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
					
				}else{
					
					DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "teleport", "tutorial");
					MainClass.teleportToServer(p, "Battle1");
					
				}
				
			}
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					action.remove(p);
					
				}
				
			}, 3);
			
		}
		
	}
	
	public static void joinVs(Player p){
		
		if(!action.contains(p)){
			
			action.add(p);
			
			if(waitvs.contains(p)){
				
				waitvs.remove(p);
				p.sendMessage("§eTu as quitté la file d'attente.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}else{
				
				int players = DataUtils.getIntServerInfo("vsPlayers");
				
				if(players >= 10){
					
					removeWait(p);
					waitvs.add(p);
					int place = waitvs.indexOf(p)+1;
					p.sendMessage("§eFile d'attente rejointe : §6combat§r §e( place : "+place+" ).");
					p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
					
				}else{
					
					DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "teleport", "vs");
					MainClass.teleportToServer(p, "Battle1");
					
				}
				
			}
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					action.remove(p);
					
				}
				
			}, 3);
			
		}
		
	}
	
	public static void joinRanked(Player p){
		
		if(!action.contains(p)){
			
			action.add(p);
			
			if(waitranked.contains(p)){
				
				waitranked.remove(p);
				p.sendMessage("§eTu as quitté la file d'attente.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}else{
				
				int players = DataUtils.getIntServerInfo("rankedPlayers");
				
				if(players >= 8){
					
					removeWait(p);
					waitranked.add(p);
					int place = waitranked.indexOf(p)+1;
					p.sendMessage("§eFile d'attente rejointe : §6classé§r §e( place : "+place+" ).");
					p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
					
				}else{
					
					DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "teleport", "ranked");
					MainClass.teleportToServer(p, "Battle1");
					
				}
				
			}
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					action.remove(p);
					
				}
				
			}, 3);
			
		}
		
	}
	
	private static void removeWait(Player p){
		
		if(waittutorial.contains(p)){
			waittutorial.remove(p);
		}
		if(waitvs.contains(p)){
			waitvs.remove(p);
		}
		if(waitranked.contains(p)){
			waitranked.remove(p);
		}
		
	}

}
