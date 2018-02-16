package fr.Maxime3399.UltimateBoosters;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.UltimateBoosters.utils.MySQLUtils;

public class API {

	public static void registerServer(){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		int error = 0;
	    try{
	        MySQLUtils.state.executeUpdate("CREATE TABLE `"+databaseName+"`.`UltimateBoosters_players` ( `uuid` VARCHAR(255) NOT NULL , `global_boosters` VARCHAR(255) NOT NULL , `personal_boosters` VARCHAR(255) NOT NULL , `lastGlobalBooster` INT(255) NOT NULL , PRIMARY KEY (`uuid`)) ENGINE = MyISAM;");
	      }catch (SQLException e){
	        error = 1;
	      }
	    if(error == 0){
	    	Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§b§lTable \"UltimateBoosters_players\" created !");
	    }
	    
		int error2 = 0;
	    try{
	        MySQLUtils.state.executeUpdate("CREATE TABLE `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` ( `uuid` VARCHAR(255) NOT NULL , `name` VARCHAR(255) NOT NULL , `multiplier` INT(255) NOT NULL , `time` VARCHAR(255) NOT NULL , `tips` VARCHAR(255) NOT NULL , PRIMARY KEY (`uuid`)) ENGINE = MyISAM;");
	      }catch (SQLException e){
	        error2 = 1;
	      }
	    if(error2 == 0){
	    	Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§b§lTable \"UltimateBoosters_GlobalBoosters\" created !");
	    }
	    
		int error3 = 0;
	    try{
	        MySQLUtils.state.executeUpdate("CREATE TABLE `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` ( `uuid` VARCHAR(255) NOT NULL , `multiplier` INT(255) NOT NULL , `time` VARCHAR(255) NOT NULL , PRIMARY KEY (`uuid`)) ENGINE = MyISAM;");
	      }catch (SQLException e){
	        error3 = 1;
	      }
	    if(error3 == 0){
	    	Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§b§lTable \"UltimateBoosters_PersonalBoosters\" created !");
	    }
		
	}
	
	public static void registerPlayer(Player p){
		
		String uuid = p.getUniqueId().toString();
		
		int error = 0;
	    try{
	        MySQLUtils.state.executeUpdate("INSERT INTO `ultimateboosters_players` (`uuid`, `global_boosters`, `personal_boosters`, `lastGlobalBooster`) VALUES ('"+uuid+"', '', '', 0);");
	      }catch (SQLException e){
	    	  error = 1;
	      }
		if(error == 0){
			Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§a"+p.getName()+" §r§a§owas registered in the database !");
		}
	    
	}
	
	public static boolean isGlobalBooster(){
		
		ArrayList<String> list = new ArrayList<>();
		
		Boolean result = false;
		
		try {
			ResultSet rs = MySQLUtils.state.executeQuery("SELECT * from UltimateBoosters_GlobalBoosters");
			while(rs.next()){
				list.add(rs.getString("uuid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(list.size() != 0){
			result = true;
		}
		
		return result;
		
	}
	
	public static ArrayList<String> getGlobalBoosters(){
		
		ArrayList<String> list = new ArrayList<>();
		
		try {
			ResultSet rs = MySQLUtils.state.executeQuery("SELECT * from UltimateBoosters_GlobalBoosters");
			while(rs.next()){
				list.add(rs.getString("uuid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static HashMap<Integer, Integer> getPlayerGlobalBoosters(Player p){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		HashMap<Integer, Integer> h = new HashMap<>();
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("global_boosters");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		String str2list[] = result.split(",");
		for(String s : str2list){
			
			int c = 0;
			
            try{
                c = Integer.parseInt(s);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
            if(h.containsKey(c)){
            	
            	int t = h.get(c);
            	h.put(c, t+1);
            	
            }else{
            	
            	h.put(c, 1);
            	
            }
            
		}
		
		return h;
		
	}
	
	public static ArrayList<Integer> getPlayerGlobalBoostersARRAY(Player p){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		ArrayList<Integer> h = new ArrayList<>();
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("global_boosters");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		String str2list[] = result.split(",");
		for(String s : str2list){
			
			int c = 0;
			
            try{
                c = Integer.parseInt(s);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
            h.add(c);
            
		}
		
		return h;
		
	}
	
	public static ArrayList<String> getPersonalBoosters(){
		
		ArrayList<String> list = new ArrayList<>();
		
		try {
			ResultSet rs = MySQLUtils.state.executeQuery("SELECT * from UltimateBoosters_PersonalBoosters");
			while(rs.next()){
				list.add(rs.getString("uuid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static String getGlobalBoosterInfo(String uuid, String info){
		
		String result = "";
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		if(info.equalsIgnoreCase("name")){
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getString("name");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}else if(info.equalsIgnoreCase("time")){
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getString("time");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		
		return result;
		
	}
	
	public static String getPersonalBoosterInfo(String uuid, String info){
		
		String result = "";
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		if(info.equalsIgnoreCase("name")){
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getString("name");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}else if(info.equalsIgnoreCase("time")){
			
			try {
				
				ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` WHERE uuid = '"+uuid+"'");
				r.next();
				result = r.getString("time");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		
		return result;
		
	}
	
	public static void setGlobalBoosterInfo(String uuid, String info, String value){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		if(info.equalsIgnoreCase("name")){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` SET `name` = '"+value+"' WHERE `UltimateBoosters_GlobalBoosters`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}else if(info.equalsIgnoreCase("time")){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` SET `time` = '"+value+"' WHERE `UltimateBoosters_GlobalBoosters`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	public static void setPersonalBoosterInfo(String uuid, String info, String value){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		if(info.equalsIgnoreCase("name")){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` SET `name` = '"+value+"' WHERE `UltimateBoosters_PersonalBoosters`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}else if(info.equalsIgnoreCase("time")){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` SET `time` = '"+value+"' WHERE `UltimateBoosters_PersonalBoosters`.`uuid` = '"+uuid+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	public static void removeGlobalBooster(String uuid){
		
		try{
			
			MySQLUtils.state.executeUpdate("DELETE FROM `ultimateboosters_globalboosters` WHERE `ultimateboosters_globalboosters`.`uuid` = '"+uuid+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void removePersonalBooster(String uuid){
		
		try{
			
			MySQLUtils.state.executeUpdate("DELETE FROM `ultimateboosters_personalboosters` WHERE `ultimateboosters_personalboosters`.`uuid` = '"+uuid+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static int getGlobalBoosterMultiplier(String uuid){
		
		int result = 0;
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getInt("multiplier");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static int getPersonalBoosterMultiplier(String uuid){
		
		int result = 0;
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_PersonalBoosters` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getInt("multiplier");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static ArrayList<String> getGlobalBoostersTips(){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		ArrayList<String> list = new ArrayList<>();
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` WHERE uuid = '"+API.getGlobalBoosters().get(0)+"'");
			r.next();
			result = r.getString("tips");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		if(!result.equalsIgnoreCase("")){
			
			String[] str2list = result.split(",");
			
			for(String str: str2list){
				
				list.add(str);
				
			}
			
		}
		
		return list;
		
	}
	
	public static void addGlobalBoosterTip(String name){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` WHERE uuid = '"+API.getGlobalBoosters().get(0)+"'");
			r.next();
			result = r.getString("tips");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		result = result+name+",";
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_GlobalBoosters` SET `tips` = '"+result+"' WHERE `UltimateBoosters_GlobalBoosters`.`uuid` = '"+API.getGlobalBoosters().get(0)+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static int getPlayerGlobalTips(Player p){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		int i = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+databaseName+"`.`UltimateBoosters_players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			i = r.getInt("lastGlobalBooster");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_players` SET `lastGlobalBooster` = '0' WHERE `UltimateBoosters_players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
		return i;
		
	}
	
	public static void setPlayerGlobalTips(String uuid){
		
		String databaseName = Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getString("DatabaseName");
		int tips = API.getGlobalBoostersTips().size();
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `"+databaseName+"`.`UltimateBoosters_players` SET `lastGlobalBooster` = '"+tips+"' WHERE `UltimateBoosters_players`.`uuid` = '"+uuid+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
}