package fr.Maxime3399.MaxQuake.actions;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.scoreboards.GameScoreboard;

public class Timer {
	
	public static int time = 481;
	static int task;
	
	public static void startTimer(){
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				time--;
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					GameScoreboard.loadScoreboard(pls);
					
				}
				
				if(time == 0){
					
					stopTimer();
					Bukkit.broadcastMessage("§6Fin du temps imparti !");
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.playSound(pls.getLocation(), Sound.ANVIL_BREAK, 100, 1);
					}
					Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
						@Override
						public void run() {
							Stopper.end();
						}
					}, 40, 40);
					
				}else if(time == 120){
					
					Bukkit.broadcastMessage("§eFin de la partie dans 2 minutes !");
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.playSound(pls.getLocation(), Sound.CLICK, 100, 2);
					}
					
				}else if(time == 60){
					
					Bukkit.broadcastMessage("§eFin de la partie dans une minute !");
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.playSound(pls.getLocation(), Sound.CLICK, 100, 2);
					}
					
				}else if(time <= 5){
					
					Bukkit.broadcastMessage("§eFin de la partie dans "+time+" secondes");
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.playSound(pls.getLocation(), Sound.CLICK, 100, 2);
					}
					
				}
				
			}
			
		}, 20, 20);
		
	}
	
	public static void stopTimer(){
		
		Bukkit.getScheduler().cancelTask(task);
		
	}

}
