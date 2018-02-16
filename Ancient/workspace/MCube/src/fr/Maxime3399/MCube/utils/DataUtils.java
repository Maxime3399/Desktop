package fr.Maxime3399.MCube.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class DataUtils {
	
	public static void registerPlayer(Player p){
		
		boolean error = false;
		
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `players` (`uuid`, `name`, `rank`, `staff`, `coins`, `trophies`, `crystals`, `data`, `pass`, `lastConnexion`, `buy-ChestDate`, `expire-ChestDate`, `prefix`) VALUES ('"+p.getUniqueId().toString()+"', '"+p.getName()+"', 'default', 'default', '0', '0', '0', '0', '0', '', '', '', '2');");
		}catch(SQLException e){
			error = true;
		}
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `quests` (`uuid`, `quest`, `c1`, `c2`, `c3`) VALUES ('"+p.getUniqueId().toString()+"', '1', '0', '0', '0');");
		}catch(SQLException e){
			error = true;
		}
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `chests` (`uuid`, `c1s`, `c2s`, `c3s`, `c4s`, `c5s`, `c6s`, `c7s`, `c8s`, `c9s`, `c10s`) VALUES ('"+p.getUniqueId().toString()+"', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');");
		}catch(SQLException e){
			error = true;
		}
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `cosmetics` (`uuid`, `netherwings`, `enderwings`, `angelwings`, `enchwings`, `dragwings`, `whitewings`, `fwwings`, `smokewings`, `godwings`, `deathhat`, `draghat`, `dlavahat`, `dwaterhat`, `enchhat`, `whitehat`, `sandhat`, `fwhat`, `flamehat`, `magichat`, `lovehat`, `lavahat`, `combathat`, `notehat`, `enderhat`, `netherhat`, `multhat`, `slimehat`, `smokehat`, `snowhat`, `angelhat`, `totemhat`, `enable`) VALUES ('"+p.getUniqueId().toString()+"', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', '');");
		}catch(SQLException e){
			error = true;
		}
		
		if(error){
			
			if(!getPlayerName(p).equalsIgnoreCase(p.getName())){
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					if(pls != p){
						pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
						pls.sendMessage("§f§l"+getPlayerName(p)+"§r §aa changé de pseudo, son nouveau pseudo est §e§l"+p.getName()+"§r §a!");
					}
				}
				
				setPlayerName(p, p.getName());
				
			}
			
		}else{
			
			for(Player pls : Bukkit.getOnlinePlayers()){
				if(pls != p){
					pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
					pls.sendMessage("§aBienvenue §f§l"+p.getName()+"§r §asur §6§lM-CUBE§r §a!");
				}
			}
			
		}
		
	}
	
	public static String getPlayerName(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("name");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerName(Player p, String name){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `name` = '"+name+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerRank(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("rank");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayeRank(Player p, String rank){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `rank` = '"+rank+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerStaff(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("staff");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayeStaff(Player p, String staff){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `staff` = '"+staff+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerCoins(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("coins");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayeCoins(Player p, int coins){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `coins` = '"+coins+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerTrophies(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("trophies");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerTrophies(Player p, int trophies){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `trophies` = '"+trophies+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerCrystals(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("crystals");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerCrystals(Player p, int crystals){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `crystals` = '"+crystals+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	public static int getPlayerData(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("data");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerData(Player p, int data){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `data` = '"+data+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerQuest(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`quests` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("quest");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerQuest(Player p, int quest){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`quests` SET `quest` = '"+quest+"' WHERE `quests`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerQuestCounter(Player p, int counter){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`quests` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("c"+counter);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerQuestCounter(Player p, int value, int counter){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`quests` SET `c"+counter+"` = '"+value+"' WHERE `quests`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerPass(Player p){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("pass");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerPass(Player p, int pass){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `pass` = '"+pass+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerLastConnexion(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("lastConnexion");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerLastConnexion(Player p, String date){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `lastConnexion` = '"+date+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getPlayerChests(Player p, int type){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`chests` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getInt("c"+type+"s");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerChests(Player p, int chests, int type){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`chests` SET `c"+type+"s` = '"+chests+"' WHERE `chests`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerBuyChestDate(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("buy-ChestDate");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerBuyChestDate(Player p, String date){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `buy-ChestDate` = '"+date+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerExpireChestDate(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("expire-ChestDate");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerExpireChestDate(Player p, String date){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `expire-ChestDate` = '"+date+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerPrefix(Player p){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`players` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString("prefix");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerPrefix(Player p, String color){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`players` SET `prefix` = '"+color+"' WHERE `players`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getPlayerCosmetic(Player p, String cosmetic){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`cosmetics` WHERE uuid = '"+p.getUniqueId().toString()+"'");
			r.next();
			result = r.getString(cosmetic);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerCosmetic(Player p, String cosmetic, String value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`cosmetics` SET `"+cosmetic+"` = '"+value+"' WHERE `cosmetics`.`uuid` = '"+p.getUniqueId().toString()+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getServerStringInfo(String type){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`server` WHERE type = '"+type+"'");
			r.next();
			result = r.getString("string_info");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setStringServerInfo(String type, String value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`server` SET `string_info` = '"+value+"' WHERE `server`.`type` = '"+type+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getServerIntInfo(String type){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`server` WHERE type = '"+type+"'");
			r.next();
			result = r.getInt("int_info");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setIntServerInfo(String type, String value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`server` SET `string_int` = '"+value+"' WHERE `server`.`type` = '"+type+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void addExpBank(Location loc, Player p){
		
		String StrLoc = LocationUtils.locationToString(loc);
		
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `expbanks` (`location`, `player`, `levels`) VALUES ('"+StrLoc+"', '"+p.getUniqueId().toString()+"', '0');");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void removeExpBank(Location loc){
		
		String StrLoc = LocationUtils.locationToString(loc);
		
		try{
			MySQLUtils.state.executeUpdate("DELETE FROM `expbanks` WHERE `expbanks`.`location` = '"+StrLoc+"' ");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void setExpBankLevel(Location loc, int level){
		
		String StrLoc = LocationUtils.locationToString(loc);
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `m-cube`.`expbanks` SET `levels` = '"+level+"' WHERE `expbanks`.`location` = '"+StrLoc+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static int getExpBankLevels(Location loc){
		
		int result = 0;
		String StrLoc = LocationUtils.locationToString(loc);
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`expbanks` WHERE location = '"+StrLoc+"'");
			r.next();
			result = r.getInt("levels");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static String getExpBankID(Location loc){
		
		String result = null;
		String StrLoc = LocationUtils.locationToString(loc);
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `m-cube`.`expbanks` WHERE location = '"+StrLoc+"'");
			r.next();
			result = r.getString("player");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
}
