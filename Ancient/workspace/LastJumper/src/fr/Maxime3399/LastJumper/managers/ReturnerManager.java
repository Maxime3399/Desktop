package fr.Maxime3399.LastJumper.managers;

import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ReturnerManager {
	
	static HashMap<Player, ItemStack[]> invent = new HashMap<>();
	static HashMap<Player, Location> locat = new HashMap<>();
	static HashMap<Player, GameMode> gm = new HashMap<>();
	static HashMap<Player, Integer> food = new HashMap<>();
	static HashMap<Player, Integer> health = new HashMap<>();
	
	public static void stockInventory(Player p){
		
		Inventory inv = p.getInventory();
		invent.put(p, inv.getContents());
		p.getInventory().clear();
		
	}
	
	public static void returnInventory(Player p){
		
		p.getInventory().clear();
		p.getInventory().setContents(invent.get(p));
		p.updateInventory();
		invent.remove(p);
		
	}
	
	public static void stockLocation(Player p){
		
		Location loc = p.getLocation();
		locat.put(p, loc);
		
	}
	
	public static void returnLocation(Player p){
		
		Location loc = locat.get(p);
		p.teleport(loc);
		locat.remove(p);
		
	}
	
	public static void stockGM(Player p){
		
		gm.put(p, p.getGameMode());
		
	}
	
	public static void returnGM(Player p){
		
		p.setGameMode(gm.get(p));
		gm.remove(p);
		
	}
	
	public static void stockFood(Player p){
		
		food.put(p, p.getFoodLevel());
		
	}
	
	public static void returnFood(Player p){
		
		p.setFoodLevel(food.get(p));
		food.remove(p);
		
	}
	
	public static void stockHealth(Player p){
		
		health.put(p, (int) p.getHealth());
		
	}
	
	public static void returnHealth(Player p){
		
		p.setHealth(health.get(p));
		health.remove(p);
		
	}

}
