package fr.Maxime3399.DivionAPI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.bukkit.entity.Player;

public class DivionAPI {
	
	public static void registerPlayer(Player player){
		
		try{
			
			MySQLUtils.state.executeUpdate("INSERT INTO `divion`.`players` (`uuid`, `name`, `rank`, `money`, `faction-kills`, `faction-deaths`, `faction-time`, `pvp-kills`, `pvp-deaths`, `pvp-time`, `hcf-kills`, `hcf-deaths`, `hcf-time`, `hcf-bankill`, `friends-count`, `friends-list`, `settings`) VALUES ('"+player.getUniqueId().toString()+"', '"+player.getName()+"', 'player', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '');");
			
		}catch(SQLException e){
			
		}
		
		String AncientName = "none";
		
		try{
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			AncientName = r.getString("name");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
		if(!AncientName.equalsIgnoreCase("none") && !AncientName.equalsIgnoreCase(player.getName())){
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `name` = '"+player.getName()+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
			player.sendMessage("§eTon changement de pseudo a bien été pris en compte !");
			
		}
		
	}
	
	public static int getPlayerStat(Player player, String game, String type){
		
		int STAT = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			STAT = r.getInt(game+"-"+type);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return STAT;
		
	}
	
	public static void setPlayerStat(Player player, String game, String type, int value){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `"+game+"-"+type+"` = '"+value+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String getPlayerRank(Player player){
		
		String RANK = "player";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			RANK = r.getString("rank");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return RANK;
		
	}
	
	public static void setPlayerRank(Player player, String rank){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `rank` = '"+rank+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static int getPlayerMoney(Player player){
		
		int MONEY = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			MONEY = r.getInt("money");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return MONEY;
		
	}
	
	public static void setPlayerMoney(Player player, int money){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `money` = '"+money+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static boolean isStaff(Player player){
		
		if(getPlayerRank(player).equalsIgnoreCase("creator") || getPlayerRank(player).equalsIgnoreCase("cocreator") || getPlayerRank(player).equalsIgnoreCase("admin") || getPlayerRank(player).equalsIgnoreCase("respdev") || getPlayerRank(player).equalsIgnoreCase("dev") || getPlayerRank(player).equalsIgnoreCase("devtest") || getPlayerRank(player).equalsIgnoreCase("respmod") || getPlayerRank(player).equalsIgnoreCase("mod") || getPlayerRank(player).equalsIgnoreCase("modtest") || getPlayerRank(player).equalsIgnoreCase("respbuild") || getPlayerRank(player).equalsIgnoreCase("build") || getPlayerRank(player).equalsIgnoreCase("buildtest")){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	public static void changeServer(Player player, String server){
		
		MainClass.teleportToServer(player, server);
		
	}
	
	public static int getServerCount(String server){
		
		int COUNT = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`servers` WHERE name = '"+server+"'");
			r.next();
			COUNT = r.getInt("count");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return COUNT;
		
	}
	
	public static void setServerCount(String server, int count){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`servers` SET `count` = '"+count+"' WHERE `servers`.`name` = '"+server+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String getServerMode(String server){
		
		String MODE = "offline";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`servers` WHERE name = '"+server+"'");
			r.next();
			MODE = r.getString("mode");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return MODE;
		
	}
	
	public static void setServerMode(String server, String mode){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`servers` SET `mode` = '"+mode+"' WHERE `servers`.`name` = '"+server+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static int getPlayerFriendsCount(Player player){
		
		int FRIENDS = 0;
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			FRIENDS = r.getInt("friends-count");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return FRIENDS;
		
	}
	
	public static void setPlayerFriendsCount(Player player, int count){
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `friends-count` = '"+count+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static boolean haveFriend(Player player, String friend){
		
		String FRIENDS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			FRIENDS = r.getString("friends-list");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		if(FRIENDS.contains(friend)){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	public static ArrayList<String> getPlayerFriendsList(Player player){
		
		String FRIENDS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			FRIENDS = r.getString("friends-list");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		if(getPlayerFriendsCount(player) != 0){
			
			ArrayList<String> AL = new ArrayList<>();
			String str2list[] = FRIENDS.split(",");
			for(int i = 0; i <= getPlayerFriendsCount(player); i++){
				
				AL.add(str2list[i]);
				
			}
			
			return AL;
			
		}else{
			
			ArrayList<String> AL = new ArrayList<>();
			return AL;
			
		}
		
	}
	
	public static void addFriend(Player player, String name){
		
		String FRIENDS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			FRIENDS = r.getString("friends-list");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		FRIENDS = FRIENDS+name+",";
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `friends-list` = '"+FRIENDS+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void removeFriend(Player player, String name){
		
		String FRIENDS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			FRIENDS = r.getString("friends-list");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		if(FRIENDS.contains(name)){
			
			String raplacer = name+",";
			FRIENDS = FRIENDS.replaceAll(raplacer, "");
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `friends-list` = '"+FRIENDS+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	public static ArrayList<String> getPlayerSettings(Player player){
		
		String SETTINGS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			SETTINGS = r.getString("settings");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		ArrayList<String> AL = new ArrayList<>();
		String str2list[] = SETTINGS.split(",");
		for(int i = 0; i <= getPlayerFriendsCount(player); i++){
			
			AL.add(str2list[i]);
			
		}
		
		return AL;
		
	}
	
	public static void removeSettings(Player player, String name){
		
		String SETTINGS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			SETTINGS = r.getString("settings");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		if(SETTINGS.contains(name)){
			
			String raplacer = name+",";
			SETTINGS = SETTINGS.replaceAll(raplacer, "");
			
			try{
				
				MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `settings` = '"+SETTINGS+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
				
			}catch(SQLException e){
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	public static void addSetting(Player player, String name){
		
		String SETTINGS = "";
		
		try {
			
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `divion`.`players` WHERE uuid = '"+player.getUniqueId().toString()+"'");
			r.next();
			SETTINGS = r.getString("settings");
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		SETTINGS = SETTINGS+name+",";
		
		try{
			
			MySQLUtils.state.executeUpdate("UPDATE `divion`.`players` SET `settings` = '"+SETTINGS+"' WHERE `players`.`uuid` = '"+player.getUniqueId().toString()+"';");
			
		}catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
	}

}
