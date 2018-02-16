package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.actions.InventorySetter;
import fr.Maxime3399.MaxQuake.actions.Shooter;
import fr.Maxime3399.MaxQuake.actions.Teleporter;
import fr.Maxime3399.MaxQuake.actions.Timer;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.BoostersManager;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.scoreboards.GameScoreboard;
import fr.Maxime3399.MaxQuake.scoreboards.WaitScoreboard;

public class PlayerJoin implements Listener {
	
	public static int time = 31;
	public static int task;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		PlayersManagers.addPlayer(p);
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		p.setMaxHealth(20);
		p.setHealth(20);
		p.setFoodLevel(21);
		p.getInventory().clear();
		p.setWalkSpeed((float) 0.288);
		p.setLevel(0);
		p.setExp(0);
		
		if(GameState.isState(GameState.WAITING)){
			
			qp.setRole("player");
			p.setGameMode(GameMode.ADVENTURE);
			InventorySetter.setWaitInventory(p);
			p.teleport(new Location(Bukkit.getWorld("world"), -2207.5, 27, 878.5));
			int onlinePlayers = Bukkit.getOnlinePlayers().size();
			if(onlinePlayers > 12){
				e.setJoinMessage(null);
				p.kickPlayer("§cLa partie est plaine !");
			}else{
				e.setJoinMessage(p.getDisplayName()+" §r§ea rejoint la partie [§l§r§e"+onlinePlayers+"§e§l/§r§e12]");
			}
			for(Player pls : Bukkit.getOnlinePlayers()){
				
				WaitScoreboard.loadScoreboard(pls);
				
			}
			
			if(onlinePlayers == 2){
				
				task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						
						time--;
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							WaitScoreboard.loadScoreboard(pls);
							
						}
						
						if(time == 0){
							
							Bukkit.getScheduler().cancelTask(task);
							GameState.setState(GameState.PLAYING);
							for(Location ls : Teleporter.getLocations()){
								ls.getWorld().getBlockAt(ls).setType(Material.AIR);
							}
							Teleporter.reset();
							for(Player pls : Bukkit.getOnlinePlayers()){
								pls.playSound(pls.getLocation(), Sound.LEVEL_UP, 100, 1);
								InventorySetter.setGameInventory(pls);
								Teleporter.teleport(pls);
								GameScoreboard.loadScoreboard(pls);
							}
							Bukkit.broadcastMessage("§aDébut de la partie, §lbonne chance§r §a!");
							Timer.startTimer();
							Shooter.startShootSystem();
							BoostersManager.start();
							
						}else if(time == 60){
							
							Bukkit.broadcastMessage("§eDébut de la partie dans une minute");
							for(Player pls : Bukkit.getOnlinePlayers()){
								pls.playSound(pls.getLocation(), Sound.CLICK, 100, 2);
							}
							
						}else if(time == 30 || time == 10 || time <= 5){
							
							Bukkit.broadcastMessage("§eDébut de la partie dans "+time+" secondes");
							for(Player pls : Bukkit.getOnlinePlayers()){
								pls.playSound(pls.getLocation(), Sound.CLICK, 100, 2);
							}
							
						}
						
					}
					
				}, 20, 20);
				
			}
			
		}else{
			
			qp.setRole("spectator");
			p.setGameMode(GameMode.SPECTATOR);
			p.teleport(new Location(Bukkit.getWorld("world"), -2207.5, 60, 878.5));
			e.setJoinMessage(null);
			p.sendMessage("§eTu as rejoint la partie en tant que spectateur.");
			InventorySetter.setSpectatorInventory(p);
			
		}
		
	}

}
