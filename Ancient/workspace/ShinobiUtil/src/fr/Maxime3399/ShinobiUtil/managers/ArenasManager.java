package fr.Maxime3399.ShinobiUtil.managers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import fr.Maxime3399.ShinobiUtil.custom.Arena;

public class ArenasManager {
	
	public static ArrayList<Arena> list = new ArrayList<>();
	
	public static void setup(){
		
		Location l1 = new Location(Bukkit.getWorld("world"), -13.5, 80, 22.5);
		l1.setYaw(-180);
		Arena a1 = new Arena(l1, new Location(Bukkit.getWorld("world"), -13.5, 80, -6.5));
		list.add(a1);
		
	}

}
