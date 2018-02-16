package fr.Maxime3399.MaxQuake.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

public class DataUtils {
	
	public static void registerPlayer(Player p){
		
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `quakecraft` (`uuid`, `info-name`, `info-coins`, `info-items`, `info-enable`, `info-params`, `info-kills`, `info-death`, `info-booster_speed`, `info-booster_shoot`, `info-win`, `info-play`, `info-totalCoins`) VALUES ('"+p.getUniqueId().toString()+"', '"+p.getName()+"', '0', 'case01,trigger01', 'case01,trigger01', '', '0', '0', '0', '0', '0', '0', '0');");
		}catch(SQLException e){

		}
		
	}
	
	public static String getPlayerStringInfo(String uuid, String info){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxminigames`.`quakecraft` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getString("info-"+info);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static int getPlayerIntInfo(String uuid, String info){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxminigames`.`quakecraft` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getInt("info-"+info);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerStringInfo(String uuid, String info, String value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `maxminigames`.`quakecraft` SET `info-"+info+"` = '"+value+"' WHERE `quakecraft`.`uuid` = '"+uuid+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void setPlayerIntInfo(String uuid, String info, int value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `maxminigames`.`quakecraft` SET `info-"+info+"` = '"+value+"' WHERE `quakecraft`.`uuid` = '"+uuid+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
