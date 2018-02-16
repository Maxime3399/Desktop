package fr.Maxime3399.MCube.homes;

import fr.Maxime3399.MCube.MCubeAPI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.bukkit.entity.Player;

public class DecalHomes
{
  public DecalHomes() {}
  
  public static void set(Player p)
  {
    int c = 0;
    
    if (MCubeAPI.isHome(p, 1).equalsIgnoreCase("false")) {
      c = 1;
    } else if (MCubeAPI.isHome(p, 2).equalsIgnoreCase("false")) {
      c = 2;
    } else if (MCubeAPI.isHome(p, 3).equalsIgnoreCase("false")) {
      c = 3;
    } else if (MCubeAPI.isHome(p, 4).equalsIgnoreCase("false")) {
      c = 4;
    } else if (MCubeAPI.isHome(p, 5).equalsIgnoreCase("false")) {
      c = 5;
    } else if (MCubeAPI.isHome(p, 6).equalsIgnoreCase("false")) {
      c = 6;
    } else if (MCubeAPI.isHome(p, 7).equalsIgnoreCase("false")) {
      c = 7;
    } else if (MCubeAPI.isHome(p, 8).equalsIgnoreCase("false")) {
      c = 8;
    } else if (MCubeAPI.isHome(p, 9).equalsIgnoreCase("false")) {
      c = 9;
    } else if (MCubeAPI.isHome(p, 10).equalsIgnoreCase("false")) {
      c = 10;
    } else if (MCubeAPI.isHome(p, 11).equalsIgnoreCase("false")) {
      c = 11;
    } else if (MCubeAPI.isHome(p, 12).equalsIgnoreCase("false")) {
      c = 12;
    } else if (MCubeAPI.isHome(p, 13).equalsIgnoreCase("false")) {
      c = 13;
    } else if (MCubeAPI.isHome(p, 14).equalsIgnoreCase("false")) {
      c = 14;
    } else if (MCubeAPI.isHome(p, 15).equalsIgnoreCase("false")) {
      c = 15;
    } else if (MCubeAPI.isHome(p, 16).equalsIgnoreCase("false")) {
      c = 16;
    } else if (MCubeAPI.isHome(p, 17).equalsIgnoreCase("false")) {
      c = 17;
    } else if (MCubeAPI.isHome(p, 18).equalsIgnoreCase("false")) {
      c = 18;
    } else if (MCubeAPI.isHome(p, 19).equalsIgnoreCase("false")) {
      c = 19;
    } else if (MCubeAPI.isHome(p, 20).equalsIgnoreCase("false")) {
      c = 20;
    } else if (MCubeAPI.isHome(p, 21).equalsIgnoreCase("false")) {
      c = 21;
    } else if (MCubeAPI.isHome(p, 22).equalsIgnoreCase("false")) {
      c = 22;
    } else if (MCubeAPI.isHome(p, 23).equalsIgnoreCase("false")) {
      c = 23;
    } else if (MCubeAPI.isHome(p, 24).equalsIgnoreCase("false")) {
      c = 24;
    } else if (MCubeAPI.isHome(p, 25).equalsIgnoreCase("false")) {
      c = 25;
    } else if (MCubeAPI.isHome(p, 26).equalsIgnoreCase("false")) {
      c = 26;
    } else if (MCubeAPI.isHome(p, 27).equalsIgnoreCase("false")) {
      c = 27;
    } else if (MCubeAPI.isHome(p, 28).equalsIgnoreCase("false")) {
      c = 28;
    } else if (MCubeAPI.isHome(p, 29).equalsIgnoreCase("false")) {
      c = 29;
    } else if (MCubeAPI.isHome(p, 30).equalsIgnoreCase("false")) {
      c = 30;
    } else if (MCubeAPI.isHome(p, 31).equalsIgnoreCase("false")) {
      c = 31;
    } else if (MCubeAPI.isHome(p, 32).equalsIgnoreCase("false")) {
      c = 32;
    } else if (MCubeAPI.isHome(p, 33).equalsIgnoreCase("false")) {
      c = 33;
    } else if (MCubeAPI.isHome(p, 34).equalsIgnoreCase("false")) {
      c = 34;
    } else if (MCubeAPI.isHome(p, 35).equalsIgnoreCase("false")) {
      c = 35;
    } else if (MCubeAPI.isHome(p, 36).equalsIgnoreCase("false")) {
      c = 36;
    } else if (MCubeAPI.isHome(p, 37).equalsIgnoreCase("false")) {
      c = 37;
    } else if (MCubeAPI.isHome(p, 38).equalsIgnoreCase("false")) {
      c = 38;
    } else if (MCubeAPI.isHome(p, 39).equalsIgnoreCase("false")) {
      c = 39;
    } else if (MCubeAPI.isHome(p, 40).equalsIgnoreCase("false")) {
      c = 40;
    }
    
    if (c != 0)
    {
      String HOME = "none";
      
      try
      {
        ResultSet r = fr.Maxime3399.MCube.utils.MySQLUtils.state.executeQuery("SELECT * FROM `mcube`.`homes` WHERE uuid = '" + p.getUniqueId().toString() + "'");
        r.next();
        HOME = r.getString("home" + (c + 1));
      }
      catch (SQLException e)
      {
        e.printStackTrace();
      }
      

      try
      {
        fr.Maxime3399.MCube.utils.MySQLUtils.state.executeUpdate("UPDATE `mcube`.`homes` SET `home" + c + "` = '" + HOME + "' WHERE `homes`.`uuid` = '" + p.getUniqueId().toString() + "';");
      }
      catch (SQLException e)
      {
        e.printStackTrace();
      }
      

      try
      {
        fr.Maxime3399.MCube.utils.MySQLUtils.state.executeUpdate("UPDATE `mcube`.`homes` SET `home" + (c + 1) + "` = 'none' WHERE `homes`.`uuid` = '" + p.getUniqueId().toString() + "';");
      }
      catch (SQLException e)
      {
        e.printStackTrace();
      }
    }
  }
}
