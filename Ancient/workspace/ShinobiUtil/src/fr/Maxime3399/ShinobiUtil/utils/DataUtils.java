package fr.Maxime3399.ShinobiUtil.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class DataUtils {
	
	public static void registerPlayer(Player p){
		
		try{
			
			MySQLUtils.state.executeUpdate("INSERT INTO `players` (`uuid`, `name`, `teleport`, `rank`, `staff`, `coins`, `lvl`, `xp`) VALUES ('"+p.getUniqueId().toString()+"', '"+p.getName()+"', 'none', 'default', 'default', '0', '-1', '0');");
			
		}catch(SQLException e){
			
		}
		
		if(!getStringPlayerInfo(p.getUniqueId().toString(), "name").equalsIgnoreCase(p.getName())){
			
			setStringPlayerInfo(p.getUniqueId().toString(), "name", p.getName());
			
			p.sendMessage("§eTon changement de pseudo a été pris en compte.");
			p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
			
		}
		
	}
	
	public static void setStringServerInfo(String type, String info){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `shinobicraft`.`server` SET `string_info` = '"+info+"' WHERE `server`.`type` = '"+type+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setIntServerInfo(String type, int info){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `shinobicraft`.`server` SET `int_info` = '"+info+"' WHERE `server`.`type` = '"+type+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String getStringServerInfo(String type){
		
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `shinobicraft`.`server` WHERE type = '"+type+"'");
			r.next();
			result = r.getString("string_info");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static int getIntServerInfo(String type){
		
		int result = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `shinobicraft`.`server` WHERE type = '"+type+"'");
			r.next();
			result = r.getInt("int_info");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
		
		//===========================================================================================
		
		public static void setStringPlayerInfo(String uuid, String info, String value){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `shinobicraft`.`players` SET `"+info+"` = '"+value+"' WHERE `players`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
		public static void setIntPlayerInfo(String uuid, String info, int value){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `shinobicraft`.`players` SET `"+info+"` = '"+value+"' WHERE `players`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
		public static String getStringPlayerInfo(String uuid, String info){
			
			String result = "";
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `shinobicraft`.`players` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getString(info);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			return result;
			
		}
		
		public static int getIntPlayerInfo(String uuid, String info){
			
			int result = 0;
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `shinobicraft`.`players` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getInt(info);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
		
		return result;
		
	}

}
