package fr.Maxime3399.ShinobiBungee.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataUtils {
	
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

}
