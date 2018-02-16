package fr.Maxime3399.MaxicraftSystem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import net.md_5.bungee.api.connection.ProxiedPlayer;

public class DatabaseAPI {
	
	public static void registerPlayer(ProxiedPlayer p){
		
		try{
			
			MySQLUtils.state.executeUpdate("INSERT INTO `players` (`uuid`, `name`, `rank`, `staff`, `level`, `exp`, `credits`, `murder_coins`, `murder_totalcoins`, `murder_gold`, `murder_time`, `murder_innocent`, `murder_detective`, `murder_murder`, `murder_win`, `murder_achievement`) VALUES ('"+p.getUniqueId().toString()+"', '"+p.getName()+"', 'default', 'none', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');");
			
		}catch(SQLException e){
			
		}
		
		if(!getPlayerName(p).equalsIgnoreCase(p.getName())){
			
			setPlayerName(p, p.getName());
			
		}
		
	}
	
	public static String getPlayerDisplayName(ProxiedPlayer p, Boolean colored, String c){
		
		String rank = getPlayerRank(p);
		String staff = getPlayerStaff(p);
		String displayName = p.getName();
		
		if(colored){
			
			if(staff.equalsIgnoreCase("admin")){
				displayName = "§c§l[§r§cAdmin§r§c§l] §r§c"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respdev")){
				displayName = "§9§l[§r§9Resp.Dev§r§9§l] §r§9"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("dev")){
				displayName = "§9§l[§r§9Dev§r§9§l] §r§9"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respmod")){
				displayName = "§6§l[§r§6Resp.Mod§r§6§l] §r§6"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("mod")){
				displayName = "§6§l[§r§6Mod§r§6§l] §r§6"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respbuild")){
				displayName = "§3§l[§r§3Resp.Build§r§3§l] §r§3"+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("build")){
				displayName = "§3§l[§r§3Build§r§3§l] §r§3"+p.getName()+"§r";
			}else{
				if(rank.equalsIgnoreCase("vip")){
					displayName = "§e§l[§r§eVIP§r§e§l] §r§e"+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("vip+")){
					displayName = "§e§l[§r§eVIP§r§a+§r§e§l] §r§e"+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("ultravip")){
					displayName = "§a§l[§r§aUltraVIP§r§a§l] §r§a"+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("ultravip+")){
					displayName = "§a§l[§r§aUltraVIP§r§b+§r§a§l] §r§a"+p.getName()+"§r";
				}
				
			}
			
		}else{
			
			if(staff.equalsIgnoreCase("admin")){
				displayName = "§"+c+"§l[§r§"+c+"Admin§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respdev")){
				displayName = "§"+c+"§l[§r§"+c+"Resp.Dev§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("dev")){
				displayName = "§"+c+"§l[§r§"+c+"Dev§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respmod")){
				displayName = "§"+c+"§l[§r§"+c+"Resp.Mod§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("mod")){
				displayName = "§"+c+"§l[§r§"+c+"Mod§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("respbuild")){
				displayName = "§"+c+"§l[§r§"+c+"Resp.Build§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else if(staff.equalsIgnoreCase("build")){
				displayName = "§"+c+"§l[§r§"+c+"Build§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
			}else{
				if(rank.equalsIgnoreCase("vip")){
					displayName = "§"+c+"§l[§r§"+c+"VIP§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("vip+")){
					displayName = "§"+c+"§l[§r§"+c+"VIP§r§"+c+"+§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("ultravip")){
					displayName = "§"+c+"§l[§r§"+c+"UltraVIP§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
				}else if(rank.equalsIgnoreCase("ultravip+")){
					displayName = "§"+c+"§l[§r§"+c+"UltraVIP§r§"+c+"+§r§"+c+"§l] §r§"+c+""+p.getName()+"§r";
				}
			}
			
		}
		
		return displayName;
		
	}
	
	public static void setPlayerExp(ProxiedPlayer p, int exp){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `level` = '"+exp+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setPlayerLevel(ProxiedPlayer p, int level){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `level` = '"+level+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setPlayerStaff(ProxiedPlayer p, String staff){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `staff` = '"+staff+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setPlayerRank(ProxiedPlayer p, String rank){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `rank` = '"+rank+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setPlayerName(ProxiedPlayer p, String name){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `name` = '"+name+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static int getPlayerLevel(ProxiedPlayer p){
		
		int result = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("level");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static int getPlayerExp(ProxiedPlayer p){
		
		int result = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("exp");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static String getPlayerStaff(ProxiedPlayer p){
		
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("staff");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static String getPlayerRank(ProxiedPlayer p){
		
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("rank");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static String getPlayerName(ProxiedPlayer p){
		
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("name");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static void setStringServerInfo(String type, String info){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`server_infos` SET `string_info` = '"+info+"' WHERE `server_infos`.`type` = '"+type+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void setIntServerInfo(String type, int info){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`server_infos` SET `int_info` = '"+info+"' WHERE `server_infos`.`type` = '"+type+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String getStringServerInfo(String type){
		
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`server_infos` WHERE type = '"+type+"'");
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
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`server_infos` WHERE type = '"+type+"'");
			r.next();
			result = r.getInt("int_info");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
	
	public static int getMurderStats(ProxiedPlayer p, String stat){
		
		int ri = 0;
		String result = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("MurderStats");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		String str2stat[] = result.split(",");
		
		if(stat.equalsIgnoreCase("coins")){
			
			result = str2stat[0];
			result.replaceAll("coins", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("totalcoins")){
			
			result = str2stat[1];
			result.replaceAll("totalcoins", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("time")){
			
			result = str2stat[2];
			result.replaceAll("time", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("innocent")){
			
			result = str2stat[3];
			result.replaceAll("innocent", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("murder")){
			
			result = str2stat[4];
			result.replaceAll("murder", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("detective")){
			
			result = str2stat[5];
			result.replaceAll("detective", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}else if(stat.equalsIgnoreCase("victory")){
			
			result = str2stat[6];
			result.replaceAll("victory", "");
            try{
                ri = Integer.parseInt(result);
              }catch (NumberFormatException e){
                e.printStackTrace();
              }
			
		}
		
		return ri;
		
	}
	
	public static void setMurderStats(ProxiedPlayer p, String stat, int value){
		
		String result = stat+getMurderStats(p, stat);
		
		String changer = "";
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `maxicraft`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			changer = r.getString("MurderStats");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		changer.replaceAll(result, stat+value);
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `maxicraft`.`players` SET `MurderStats` = '"+changer+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}

}
