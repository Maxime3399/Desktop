package fr.Maxime3399.ShinobiLobby.managers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.custom.EntityHider;
import fr.Maxime3399.ShinobiLobby.custom.EntityHider.Policy;
import fr.Maxime3399.ShinobiLobby.custom.Hologram;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class HologramsManager {
	
	public static ArrayList<Hologram> tutorial = new ArrayList<>();
	public static ArrayList<Hologram> vs = new ArrayList<>();
	public static ArrayList<Hologram> ranked = new ArrayList<>();
	
	public static ArrayList<Hologram> vsblocked = new ArrayList<>();
	public static ArrayList<Hologram> rankedblocked = new ArrayList<>();
	
	public static ArrayList<Hologram> first = new ArrayList<>();
	
	public static void setVisibility(Player p){
		
		int lvl = DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "lvl");
		
		if(lvl != -1){
			
			for(Hologram holo : first){
				
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(p, holo.getArmorStand());
				
			}
			
		}
		
		if(lvl < 1){
			
			for(Hologram holo : vs){
				
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(p, holo.getArmorStand());
				
			}
			
		}else{
			
			for(Hologram holo : vsblocked){
				
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(p, holo.getArmorStand());
				
			}
			
		}
		
		if(lvl < 10){
			
			for(Hologram holo : ranked){
				
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(p, holo.getArmorStand());
				
			}
			
		}else{
			
			for(Hologram holo : rankedblocked){
				
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(p, holo.getArmorStand());
				
			}
			
		}
		
	}
	
	public static void spawnClassicHolograms(){
		
		Hologram h1 = new Hologram("§6§lTutoriel", new Location(Bukkit.getWorld("world"), -15.5, 79, 5.5));
		Hologram h2 = new Hologram("§b"+DataUtils.getIntServerInfo("tutorialPlayers")+" §ajoueurs", new Location(Bukkit.getWorld("world"), -15.5, 78.7, 5.5));
		Hologram h3 = new Hologram("§e§oClique pour rejoindre !", new Location(Bukkit.getWorld("world"), -15.5, 78.4, 5.5));
		tutorial.add(h1);
		tutorial.add(h2);
		tutorial.add(h3);
		
		Hologram h4 = new Hologram("§6§lCombat", new Location(Bukkit.getWorld("world"), -16.5, 79, 0.5));
		Hologram h5 = new Hologram("§b"+DataUtils.getIntServerInfo("vsPlayers")+" §ajoueurs", new Location(Bukkit.getWorld("world"), -16.5, 78.7, 0.5));
		Hologram h6 = new Hologram("§e§oClique pour rejoindre !", new Location(Bukkit.getWorld("world"), -16.5, 78.4, 0.5));
		vs.add(h4);
		vs.add(h5);
		vs.add(h6);
		
		Hologram h7 = new Hologram("§6§lClassé", new Location(Bukkit.getWorld("world"), -15.5, 79, -4.5));
		Hologram h8 = new Hologram("§b"+DataUtils.getIntServerInfo("rankedPlayers")+" §ajoueurs", new Location(Bukkit.getWorld("world"), -15.5, 78.7, -4.5));
		Hologram h9 = new Hologram("§e§oClique pour rejoindre !", new Location(Bukkit.getWorld("world"), -15.5, 78.4, -4.5));
		ranked.add(h7);
		ranked.add(h8);
		ranked.add(h9);
		
		Hologram h10 = new Hologram("§7§l§mCombat", new Location(Bukkit.getWorld("world"), -16.5, 78, 0.5));
		Hologram h11 = new Hologram("§b"+DataUtils.getIntServerInfo("vsPlayers")+" §ajoueurs", new Location(Bukkit.getWorld("world"), -16.5, 77.7, 0.5));
		Hologram h12 = new Hologram("§c§oNiveau 1 requis", new Location(Bukkit.getWorld("world"), -16.5, 77.4, 0.5));
		vsblocked.add(h10);
		vsblocked.add(h11);
		vsblocked.add(h12);
		
		Hologram h13 = new Hologram("§7§l§mClassé", new Location(Bukkit.getWorld("world"), -15.5, 78, -4.5));
		Hologram h14 = new Hologram("§b"+DataUtils.getIntServerInfo("rankedPlayers")+" §ajoueurs", new Location(Bukkit.getWorld("world"), -15.5, 77.7, -4.5));
		Hologram h15 = new Hologram("§c§oNiveau 10 requis", new Location(Bukkit.getWorld("world"), -15.5, 77.4, -4.5));
		rankedblocked.add(h13);
		rankedblocked.add(h14);
		rankedblocked.add(h15);
		
		Hologram h16 = new Hologram("§e§lClique sur le personnage pour", new Location(Bukkit.getWorld("world"), -6.5, 80, 0.5));
		Hologram h17 = new Hologram("§e§lrejoindre le §r§l§6tutoriel§r§l§e !", new Location(Bukkit.getWorld("world"), -6.5, 79.7, 0.5));
		first.add(h16);
		first.add(h17);
		
	}
	
	public static void dispawnClassicHolograms(){
		
		for(Hologram h : tutorial){
			
			h.remove();
			
		}
		
		for(Hologram h : vs){
			
			h.remove();
			
		}
		
		for(Hologram h : ranked){
			
			h.remove();
			
		}
		
		for(Hologram h : vsblocked){
			
			h.remove();
			
		}
		
		for(Hologram h : rankedblocked){
			
			h.remove();
			
		}
		
		for(Hologram h : first){
			
			h.remove();
			
		}
		
	}

}
