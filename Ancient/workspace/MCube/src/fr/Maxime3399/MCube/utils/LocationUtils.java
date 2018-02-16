package fr.Maxime3399.MCube.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationUtils {
	
	public static String locationToString(Location loc){
		
		String result = null;
		
		result = loc.getWorld().getName()+", "+loc.getBlockX()+", "+loc.getBlockY()+", "+loc.getBlockZ()+", "+loc.getYaw()+", "+loc.getPitch();
		
		return result;
		
	}
	
	public static Location StringToLocation(String loc){
		
		String str2lo[] = loc.split(",");
		String world = str2lo[0];
		double x = StringToInt(str2lo[1])+0.5;
		double y = StringToInt(str2lo[2])+0.1;
		double z = StringToInt(str2lo[3])+0.5;
		float yaw = StringToInt(str2lo[5]);
		float pitch = StringToInt(str2lo[6]);
		
		Location location = new Location(Bukkit.getWorld(world), x, y, z);
		location.setYaw(yaw);
		location.setPitch(pitch);
		
		return location;
		
	}
	
	public static int StringToInt(String string){
		
		int result = 0;
		
        try{
        	
            result = Integer.parseInt(string);
            
          }catch (NumberFormatException e){
          	
            e.printStackTrace();
            
          }
		
		return result;
		
	}

}
