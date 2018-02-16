package fr.Maxime3399.MCube;

import fr.Maxime3399.MCube.manager.FakePlayers;
import fr.Maxime3399.MCube.utils.MySQLUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;

public class MCubeAPI{
  
  @SuppressWarnings("deprecation")
public static void chargePlayerData(Player p){
    String result = "none";
    
    try{
    	
      MySQLUtils.state.executeUpdate("INSERT INTO `mcube`.`players` (`uuid`, `name`, `rank`, `trophies`, `coins`, `chest-basic`, `chest-rare`, `chest-epic`, `chest-legendary`, `chest-cos`, `day`,`donator`, `dsymbol`, `dcolor`, `activecos`, `pass`, `vanish`, `data`, `sentinel`, `enablesent`, `time`, `kills`, `staff`) VALUES ('" + p.getUniqueId().toString() + "', '" + p.getName() + "', 'joueur', '0', '0', '0', '0', '0','0', '0', 'none', 'false', '1', 'white', '', '0', 'false', '" + DataUpgrade.lastUpgrade + "', '0', 'false', '0', '0', 'joueur');");
      MySQLUtils.state.executeUpdate("INSERT INTO `mcube`.`homes` (`uuid`, `home1`, `home2`, `home3`, `home4`, `home5`, `home6`, `home7`, `home8`, `home9`, `home10`, `home11`, `home12`, `home13`, `home14`, `home15`, `home16`, `home17`, `home18`, `home19`, `home20`, `home21`, `home22`, `home23`, `home24`, `home25, `home26`, `home27`, `home28`, `home29`, `home30`, `home31`, `home32`, `home33`, `home34`, `home35`, `home36`, `home37`, `home38`, `home39`, `home40`) VALUES ('" + p.getUniqueId().toString() + "', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none', 'none');");
      MySQLUtils.state.executeUpdate("INSERT INTO `mcube`.`cosmetics` (`uuid`, `angryVillager`, `barrier`, `blockcrack`, `bubble`, `cloud`, `crit`, `damageIndicator`, `depthsuspend`, `dragonbreath`, `dripLava`, `dripWater`, `droplet`, `enchantmenttable`, `endRod`, `fallingDust`, `fireworksSpark`, `flame`, `happyVillager`, `lightDeath`, `bloodDeath`, `boneDeath`, `textDeath`, `explodeDeath`, `corpseDeath`, `cielDeath`, `enferDeath`, `baliseDeath`, `ocelot`, `wolf`) VALUES ('" + p.getUniqueId().toString() + "', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false', 'false','false', 'false', 'false', 'false', 'false', 'false', 'false', 'false');");
      MySQLUtils.state.executeUpdate("INSERT INTO `mcube`.`quests` (`uuid`, `quest`, `c1`, `c2`, `c3`, `c4`, `c5`) VALUES ('" + p.getUniqueId().toString() + "', '1', '0', '0', '0', '0', '0');");
      result = "true";
      
    }catch (SQLException e){
    	
      result = "false";
      
    }

    if (result.equalsIgnoreCase("true")){
    	
      if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
    	  
        Bukkit.broadcastMessage("§3Bienvenue §b§l" + FakePlayers.name + " §r§3sur §6M-CUBE §3!");
        
      }else{
    	  
        Bukkit.broadcastMessage("§3Bienvenue §b§l" + p.getName() + " §r§3sur §6M-CUBE §3!");
        
      }
      
      for (Player pls : Bukkit.getOnlinePlayers()) {
    	  
        pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
        
      }
      
      MainClass.getEcononomy().withdrawPlayer(p.getName(), MainClass.getEcononomy().getBalance(p.getName()));
      
    }
    

    String Aname = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      Aname = r.getString("name");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    

    if ((!Aname.equalsIgnoreCase("none")) && (!Aname.equalsIgnoreCase(p.getName()))){
    	
      Bukkit.broadcastMessage("§b§l" + Aname + " §r§3a changé de pseudo, son pseudo est maintenant §r§o§9" + p.getName() + " §r§3!");
      
      try {
    	  
        MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `name` = '" + p.getName() + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
        
      } catch (SQLException e) {
    	  
        e.printStackTrace();
        
      }
      
      for (Player pls : Bukkit.getOnlinePlayers()) {
    	  
        pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
        
      }
      
      double coins = MainClass.getEcononomy().getBalance(Aname);
      MainClass.getEcononomy().depositPlayer(p.getName(), coins);
      
    }
    
  }

  public static String getPlayerRank(Player p){
	  
    String GRADE = "joueur";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      GRADE = r.getString("rank");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return GRADE;
    
  }
  

  public static int getPlayerCoins(Player p){
	  
    int COINS = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      COINS = r.getInt("coins");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return COINS;
    
  }
  

  public static int getPlayerTrophies(Player p){
	  
    int TROPHIES = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      TROPHIES = r.getInt("trophies");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return TROPHIES;
    
  }
  

  public static void setCoins(Player p, int coins){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `coins` = '" + coins + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void setRank(Player p, String rank){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `rank` = '" + rank + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static Location getHomeLocation(Player p, int home){
	  
    String HOME = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`homes` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      HOME = r.getString("home" + home);
      
    }catch (SQLException e){
    	
      e.printStackTrace();
    }

    String[] str2loc = HOME.split(",");
    Location l = new Location(Bukkit.getWorld(str2loc[1]), Double.parseDouble(str2loc[2]) + 0.5D, Double.parseDouble(str2loc[3]) + 0.1D, Double.parseDouble(str2loc[4]) + 0.5D);
    return l;
    
  }
  

  public static String getHomeName(Player p, int home){
	  
    String HOME = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`homes` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      HOME = r.getString("home" + home);
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    String[] str2loc = HOME.split(",");
    String r = str2loc[0];
    return r;
    
  }
  

  public static String isHome(Player p, int home){
	  
    String HOME = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`homes` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      HOME = r.getString("home" + home);
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    String r = "none";
    if (HOME.equalsIgnoreCase("none")) {
    	
      r = "false";
      
    } else {
    	
      r = "true";
      
    }
    
    return r;
    
  }
  

  public static void setHome(Player p, int home, String name){
	  
    String t = name + "," + p.getLocation().getWorld().getName() + "," + p.getLocation().getBlockX() + "," + p.getLocation().getBlockY() + "," + p.getLocation().getBlockZ();
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`homes` SET `home" + home + "` = '" + t + "' WHERE `homes`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static Location getLocation(Player p){
	  
    String HOME = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      HOME = r.getString("location");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    String[] str2loc = HOME.split(",");
    Location l = new Location(Bukkit.getWorld(str2loc[0]), Double.parseDouble(str2loc[1]) + 0.5D, Double.parseDouble(str2loc[2]) + 0.1D, Double.parseDouble(str2loc[3]) + 0.5D);
    return l;
    
  }
  

  public static void setTrophies(Player p, int trophies){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `trophies` = '" + trophies + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void deleteHome(Player p, int home){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`homes` SET `home" + home + "` = 'none' WHERE `homes`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static int getChests(Player p, String chest){
	  
    int COUNT = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      COUNT = r.getInt("chest-" + chest);
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return COUNT;
    
  }
  

  public static void setDay(Player p){
	  
    DateFormat df = new java.text.SimpleDateFormat("yyyy/MM/dd");
    String date = df.format(new java.util.Date());
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `day` = '" + date + "' WHERE `players`.`uuid` = '" + p.getUniqueId() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static String getDay(Player p){
	  
    String DAY = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      DAY = r.getString("day");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    return DAY;
    
  }
  

  public static void setChests(Player p, String chest, int count){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `chest-" + chest + "` = '" + count + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void setDonator(Player p, String value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `donator` = '" + value + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static String isDonator(Player p){
	  
    String DONATOR = "none";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      DONATOR = r.getString("donator");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    return DONATOR;
    
  }
  

  public static int getDonatorSymbol(Player p){
	  
    int SYMBOL = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      SYMBOL = r.getInt("dsymbol");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return SYMBOL;
    
  }
  

  public static String getDonatorColor(Player p){
	  
    String COLOR = "white";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      COLOR = r.getString("dcolor");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return COLOR;
    
  }
  

  public static void setDonatorSymbol(Player p, int value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `dsymbol` = '" + value + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void setDonatorColor(Player p, String color){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `dcolor` = '" + color + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static String getCos(Player p, String cos){
	  
    String COS = "false";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`cosmetics` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      COS = r.getString(cos);
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return COS;
    
  }
  

  public static void setCos(Player p, String cos, String value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`cosmetics` SET `" + cos + "` = '" + value + "' WHERE `cosmetics`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static String getActiveCos(Player p){
	  
    String ACOS = "";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      ACOS = r.getString("activecos");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return ACOS;
    
  }
  

  public static void addActiveCos(Player p, String cos){
	  
    String ACOS = getActiveCos(p);
    ACOS = ACOS + cos;
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `activecos` = '" + ACOS + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void removeActiveCos(Player p, String cos){
	  
    String ACOS = getActiveCos(p);
    ACOS = ACOS.replaceAll(cos, "");
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `activecos` = '" + ACOS + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static int getCurrentQuest(Player p){
	  
    int CQ = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`quests` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      CQ = r.getInt("quest");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }

    return CQ;
    
  }
  

  public static void setCurrentQuest(Player p, int value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`quests` SET `quest` = '" + value + "' WHERE `quests`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static int getQuest(Player p, int count){
	  
    int CQ = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`quests` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      CQ = r.getInt("c" + count);
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
    return CQ;
    
  }
  

  public static void setQuest(Player p, int count, int value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`quests` SET `c" + count + "` = '" + value + "' WHERE `quests`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static int getPlayerPass(Player p){
	  
    int PASS = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      PASS = r.getInt("pass");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return PASS;
    
  }
  

  public static void setPass(Player p, int pass){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `pass` = '" + pass + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static String getPlayerVanish(Player p){
	  
    String VA = "";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      VA = r.getString("vanish");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return VA;
    
  }
  

  public static void setVanish(Player p, String value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `vanish` = '" + value + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static int getData(Player p){
	  
    int DATA = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      DATA = r.getInt("data");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return DATA;
    
  }
  

  public static void setData(Player p, int data){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `data` = '" + data + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static int getSentinel(Player p){
	  
    int SEN = 0;
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      SEN = r.getInt("sentinel");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return SEN;
    
  }
  

  public static void setSentinel(Player p, int time){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `sentinel` = '" + time + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static String getEnabledSentinel(Player p){
	  
    String ENA = "false";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      ENA = r.getString("enablesent");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return ENA;
    
  }
  

  public static void setEnabledSentinel(Player p, String value){
	  
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `enablesent` = '" + value + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }
  


  public static void setPlayedTime(Player p){
	  
    double t = p.getStatistic(Statistic.PLAY_ONE_TICK) / 20;
    double t2 = t / 60.0D;
    double t3 = t2 / 60.0D;
    double t4 = Math.round(t3);
    String time = ""+t4;
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `time` = '" + time + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static void setKilledlayers(Player p){
	  
    int k = p.getStatistic(Statistic.PLAYER_KILLS);
    
    try{
    	
      MySQLUtils.state.executeUpdate("UPDATE `mcube`.`players` SET `kills` = '" + k + "' WHERE `players`.`uuid` = '" + p.getUniqueId().toString() + "';");
      
    }catch (SQLException e){
    	
      e.printStackTrace();
      
    }
    
  }

  public static String getStaffRank(Player p){
	  
    String GRADE = "joueur";
    
    try{
    	
      ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`players` WHERE uuid = '" + p.getUniqueId().toString() + "'");
      r.next();
      GRADE = r.getString("staff");
      
    } catch (SQLException e) {
    	
      e.printStackTrace();
      
    }
    
    return GRADE;
    
  }
  
}
