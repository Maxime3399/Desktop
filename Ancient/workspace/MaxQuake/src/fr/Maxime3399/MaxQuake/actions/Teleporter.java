package fr.Maxime3399.MaxQuake.actions;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Teleporter {
	
	public static ArrayList<Location> locs = new ArrayList<>();
	
	public static void reset(){
		locs = getLocations();
	}
	
	public static void teleport(Player p){
		
		Random r = new Random();
		int ran = r.nextInt(locs.size()+1);
		if(ran >= locs.size()){
			ran = 0;
		}
		Location loc = locs.get(ran);
		p.teleport(loc);
		locs.remove(loc);
		
		if(locs.size() == 0){
			reset();
		}
		
	}
	
	public static ArrayList<Location> getLocations(){
		
		ArrayList<Location> list = new ArrayList<>();
			
		Location l1 = new Location(Bukkit.getWorld("world"), -2198.5, 27, 892.5);
		l1.setYaw(90);
		list.add(l1);
		
		Location l2 = new Location(Bukkit.getWorld("world"), -2226.5, 27, 892.5);
		l2.setYaw(180);
		list.add(l2);
		
		Location l3 = new Location(Bukkit.getWorld("world"), -2202.5, 27, 871.5);
		l3.setYaw(0);
		list.add(l3);
		
		Location l4 = new Location(Bukkit.getWorld("world"), -2203.5, 27, 898.5);
		list.add(l4);
		
		Location l5 = new Location(Bukkit.getWorld("world"), -2191.5, 27, 907.5);
		l5.setYaw(90);
		list.add(l5);
		
		Location l6 = new Location(Bukkit.getWorld("world"), -2233.5, 27, 842.5);
		l6.setYaw(-90);
		list.add(l6);
		
		Location l7 = new Location(Bukkit.getWorld("world"), -2256.5, 32, 861.5);
		list.add(l7);
		
		Location l8 = new Location(Bukkit.getWorld("world"), -2252.5, 32, 883.5);
		l8.setYaw(-90);
		list.add(l8);
		
		Location l9 = new Location(Bukkit.getWorld("world"), -2234.5, 36, 888.5);
		l9.setYaw(90);
		list.add(l9);
		
		Location l10 = new Location(Bukkit.getWorld("world"), -2198.5, 32, 917.5);
		l10.setYaw(90);
		list.add(l10);
		
		Location l11 = new Location(Bukkit.getWorld("world"), -2187.5, 34, 906.5);
		l11.setYaw(90);
		list.add(l11);
		
		Location l12 = new Location(Bukkit.getWorld("world"), -2198.5, 34, 891.5);
		l12.setYaw(90);
		list.add(l12);
		
		Location l13 = new Location(Bukkit.getWorld("world"), -2226.5, 34, 864.5);
		l13.setYaw(-90);
		list.add(l13);
		
		Location l14 = new Location(Bukkit.getWorld("world"), -2201.5, 44, 891.5);
		l14.setYaw(90);
		list.add(l14);
		
		return list;
		
	}

}
