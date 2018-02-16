package fr.Maxime3399.LastJumper.utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.MainClass;

public class ArenasConfig {
	
	public static boolean exist(String name){
		
		if(MainClass.cfgm.getArenas().getConfigurationSection(name) == null){
			
			return false;
			
		}else{
			
			return true;
			
		}
		
	}
	
	public static void addArena(String name){
		
		if(!exist(name)){
			
			if(MainClass.cfgm.getArenas().getString("ArenasList3399") == null){
				
				MainClass.cfgm.getArenas().set("ArenasList3399", name+",");
				
			}else{
				
				MainClass.cfgm.getArenas().set("ArenasList3399", MainClass.cfgm.getArenas().get("ArenasList3399")+name+",");
				
			}
			
			MainClass.cfgm.getArenas().set(name+".Jump", "none");
			MainClass.cfgm.getArenas().set(name+".Wait", "none");
			MainClass.cfgm.saveArenasConfiguration();
			
		}
		
	}
	
	public static boolean jumpDefined(String name){
		
		if(exist(name)){
			
			if(MainClass.cfgm.getArenas().getConfigurationSection(name).getString("Jump").equalsIgnoreCase("none")){
				
				return false;
				
			}else{
				
				return true;
				
			}
			
		}else{
			
			return false;
			
		}
		
	}
	
	public static void defineJump(String name, Player p){
		
		if(exist(name)){
			
			Location loc = p.getLocation();
			String world = loc.getWorld().getName();
			double x = loc.getBlockX()+0.5;
			double y = loc.getBlockY()+0.1;
			double z = loc.getBlockZ()+0.5;
			String xs = ""+x;
			String ys = ""+y;
			String zs = ""+z;
			String yaw = ""+Math.round(loc.getYaw());
			String pitch = ""+Math.round(loc.getPitch());
			String value = world+","+xs+","+ys+","+zs+","+yaw+","+pitch;
			
			MainClass.cfgm.getArenas().set(name+".Jump", value);
			MainClass.cfgm.saveArenasConfiguration();
			
		}
		
	}
	
	public static boolean waitDefined(String name){
		
		if(exist(name)){
			
			if(MainClass.cfgm.getArenas().getConfigurationSection(name).getString("Wait").equalsIgnoreCase("none")){
				
				return false;
				
			}else{
				
				return true;
				
			}
			
		}else{
			
			return false;
			
		}
		
	}
	
	public static void defineWait(String name, Player p){
		
		if(exist(name)){
			
			Location loc = p.getLocation();
			String world = loc.getWorld().getName();
			String x = loc.getBlockX()+".5";
			String y = loc.getBlockY()+".1";
			String z = loc.getBlockZ()+".5";
			String yaw = ""+Math.round(loc.getYaw());
			String pitch = ""+Math.round(loc.getPitch());
			String value = world+","+x+","+y+","+z+","+yaw+","+pitch;
			
			MainClass.cfgm.getArenas().set(name+".Wait", value);
			MainClass.cfgm.saveArenasConfiguration();
			
		}
		
	}
	
	public static void removeArena(String name){
		
		if(exist(name)){
			
			MainClass.cfgm.getArenas().set(name, null);
			MainClass.cfgm.getArenas().set("ArenasList3399", MainClass.cfgm.getArenas().getString("ArenasList3399").replaceAll(name+",", ""));
			MainClass.cfgm.saveArenasConfiguration();
			
			if(MainClass.cfgm.getArenas().getString("ArenasList3399").equalsIgnoreCase("")){
				MainClass.cfgm.getArenas().set("ArenasList3399", null);
				MainClass.cfgm.saveArenasConfiguration();
			}
			
		}
		
	}
	
	public static ArrayList<String> arenasList(){
		
		ArrayList<String> AL = new ArrayList<>();
		
		if(MainClass.cfgm.getArenas().getString("ArenasList3399") == null){
			
		}else{
			
			String str2loc[] = MainClass.cfgm.getArenas().getString("ArenasList3399").split(",");
			
			for(int i = 0; i < str2loc.length; i++){
				
				AL.add(str2loc[i]);
				
			}
			
		}
		
		return AL;
		
	}
	
	public static Location getLocation(String name, String type){
		
		String str2loc[] = MainClass.cfgm.getArenas().getConfigurationSection(name).getString(type).split(",");
		
		Location loc = new Location(Bukkit.getWorld(str2loc[0]), Double.parseDouble(str2loc[1]), Double.parseDouble(str2loc[2]), Double.parseDouble(str2loc[3]));
		loc.setYaw(Float.parseFloat(str2loc[4]));
		loc.setPitch(Float.parseFloat(str2loc[5]));
		
		return loc;
		
	}

}
