package fr.Maxime3399.LastJumper.managers;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.schedulers.EjectionTime;
import fr.Maxime3399.LastJumper.schedulers.PlayerDeathScheduler;
import fr.Maxime3399.LastJumper.schedulers.PlayerJumps;
import fr.Maxime3399.LastJumper.schedulers.WaitingScheduler;

public class ArenasManager {
	
	public static ArrayList<String> list = new ArrayList<>();
	
	public static HashMap<String, String> arenasState = new HashMap<>();
	public static HashMap<String, Integer> arenaCount = new HashMap<>();
	public static HashMap<String, Integer> livePlayers = new HashMap<>();
	public static HashMap<String, Player> winner = new HashMap<>();
	public static HashMap<String, Integer> startingTime = new HashMap<>();
	public static HashMap<String, Player> jumper = new HashMap<>();
	
	public static HashMap<Player, String> playerArena = new HashMap<>();
	public static HashMap<String, ArrayList<Player>> livingPerson = new HashMap<>();
	
	public static HashMap<Player, Integer> lifes = new HashMap<>();
	
	public static void restartGame(String name){
		
		if(list.contains(name)){
			WaitingScheduler.stop(name);
			PlayerJumps.stop(name);
			PlayerDeathScheduler.stop(name);
			EjectionTime.stop(name);
		}
		
		arenasState.put(name, "restart");
		arenaCount.put(name, 0);
		livePlayers.put(name, 0);
		winner.put(name, null);
		startingTime.put(name, 3399);
		jumper.put(name, null);
		ArrayList<Block> al = new ArrayList<>();
		PlayerJumps.bl.put(name, al);
		ArrayList<Player> als = new ArrayList<>();
		HashMap<Player, Player> hms = new HashMap<>();
		Jumper.lister.put(name, als);
		Jumper.suiver.put(name, hms);
		ArrayList<Player> ale = new ArrayList<>();
		livingPerson.put(name, ale);
		
		list.add(name);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
			
			@Override
			public void run() {
				
				WaitingScheduler.start(name);
				PlayerJumps.start(name);
				PlayerDeathScheduler.start(name);
				EjectionTime.start(name);
				arenasState.put(name, "wait");
				
			}
			
		}, 60);
		
	}

}
