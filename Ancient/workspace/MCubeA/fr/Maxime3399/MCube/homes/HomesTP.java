package fr.Maxime3399.MCube.homes;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class HomesTP
{
  public HomesTP() {}
  
  public static void tp(Player p, final String home)
  {
    final HashMap<String, Location> hm = new HashMap();
    
    if (MCubeAPI.isHome(p, 1).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 1), MCubeAPI.getHomeLocation(p, 1));
    }
    if (MCubeAPI.isHome(p, 2).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 2), MCubeAPI.getHomeLocation(p, 2));
    }
    if (MCubeAPI.isHome(p, 3).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 3), MCubeAPI.getHomeLocation(p, 3));
    }
    if (MCubeAPI.isHome(p, 4).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 4), MCubeAPI.getHomeLocation(p, 4));
    }
    if (MCubeAPI.isHome(p, 5).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 5), MCubeAPI.getHomeLocation(p, 5));
    }
    if (MCubeAPI.isHome(p, 6).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 6), MCubeAPI.getHomeLocation(p, 6));
    }
    if (MCubeAPI.isHome(p, 7).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 7), MCubeAPI.getHomeLocation(p, 7));
    }
    if (MCubeAPI.isHome(p, 8).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 8), MCubeAPI.getHomeLocation(p, 8));
    }
    if (MCubeAPI.isHome(p, 9).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 9), MCubeAPI.getHomeLocation(p, 9));
    }
    if (MCubeAPI.isHome(p, 10).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 10), MCubeAPI.getHomeLocation(p, 10));
    }
    if (MCubeAPI.isHome(p, 11).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 11), MCubeAPI.getHomeLocation(p, 11));
    }
    if (MCubeAPI.isHome(p, 12).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 12), MCubeAPI.getHomeLocation(p, 12));
    }
    if (MCubeAPI.isHome(p, 13).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 13), MCubeAPI.getHomeLocation(p, 13));
    }
    if (MCubeAPI.isHome(p, 14).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 14), MCubeAPI.getHomeLocation(p, 14));
    }
    if (MCubeAPI.isHome(p, 15).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 15), MCubeAPI.getHomeLocation(p, 15));
    }
    if (MCubeAPI.isHome(p, 16).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 16), MCubeAPI.getHomeLocation(p, 16));
    }
    if (MCubeAPI.isHome(p, 17).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 17), MCubeAPI.getHomeLocation(p, 17));
    }
    if (MCubeAPI.isHome(p, 18).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 18), MCubeAPI.getHomeLocation(p, 18));
    }
    if (MCubeAPI.isHome(p, 19).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 19), MCubeAPI.getHomeLocation(p, 19));
    }
    if (MCubeAPI.isHome(p, 20).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 20), MCubeAPI.getHomeLocation(p, 20));
    }
    if (MCubeAPI.isHome(p, 21).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 21), MCubeAPI.getHomeLocation(p, 21));
    }
    if (MCubeAPI.isHome(p, 22).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 22), MCubeAPI.getHomeLocation(p, 22));
    }
    if (MCubeAPI.isHome(p, 23).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 23), MCubeAPI.getHomeLocation(p, 23));
    }
    if (MCubeAPI.isHome(p, 24).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 24), MCubeAPI.getHomeLocation(p, 24));
    }
    if (MCubeAPI.isHome(p, 25).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 25), MCubeAPI.getHomeLocation(p, 25));
    }
    if (MCubeAPI.isHome(p, 26).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 26), MCubeAPI.getHomeLocation(p, 26));
    }
    if (MCubeAPI.isHome(p, 27).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 27), MCubeAPI.getHomeLocation(p, 27));
    }
    if (MCubeAPI.isHome(p, 28).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 28), MCubeAPI.getHomeLocation(p, 28));
    }
    if (MCubeAPI.isHome(p, 29).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 29), MCubeAPI.getHomeLocation(p, 29));
    }
    if (MCubeAPI.isHome(p, 30).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 30), MCubeAPI.getHomeLocation(p, 30));
    }
    if (MCubeAPI.isHome(p, 31).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 31), MCubeAPI.getHomeLocation(p, 31));
    }
    if (MCubeAPI.isHome(p, 32).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 32), MCubeAPI.getHomeLocation(p, 32));
    }
    if (MCubeAPI.isHome(p, 33).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 33), MCubeAPI.getHomeLocation(p, 33));
    }
    if (MCubeAPI.isHome(p, 34).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 34), MCubeAPI.getHomeLocation(p, 34));
    }
    if (MCubeAPI.isHome(p, 35).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 35), MCubeAPI.getHomeLocation(p, 35));
    }
    if (MCubeAPI.isHome(p, 36).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 36), MCubeAPI.getHomeLocation(p, 36));
    }
    if (MCubeAPI.isHome(p, 37).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 37), MCubeAPI.getHomeLocation(p, 37));
    }
    if (MCubeAPI.isHome(p, 38).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 38), MCubeAPI.getHomeLocation(p, 38));
    }
    if (MCubeAPI.isHome(p, 39).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 39), MCubeAPI.getHomeLocation(p, 39));
    }
    if (MCubeAPI.isHome(p, 40).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 40), MCubeAPI.getHomeLocation(p, 40));
    }
    
    if (hm.containsKey(home))
    {
      if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+"))) {
        p.sendMessage("§dTéléportation en cours...");
        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100.0F, 1.0F);
        p.teleport((Location)hm.get(home));
      } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) {
        p.sendMessage("§dTéléportation dans 2 secondes...");
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            sendMessage("§dTéléportation en cours...");
            playSound(getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100.0F, 1.0F);
            teleport((Location)hm.get(home));
          }
        }, 40L);
      } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) {
        p.sendMessage("§dTéléportation dans 3 secondes...");
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            sendMessage("§dTéléportation en cours...");
            playSound(getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100.0F, 1.0F);
            teleport((Location)hm.get(home));
          }
        }, 60L);
      } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) {
        p.sendMessage("§dTéléportation dans 4 secondes...");
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            sendMessage("§dTéléportation en cours...");
            playSound(getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100.0F, 1.0F);
            teleport((Location)hm.get(home));
          }
        }, 80L);
      } else {
        p.sendMessage("§dTéléportation dans 5 secondes...");
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            sendMessage("§dTéléportation en cours...");
            playSound(getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100.0F, 1.0F);
            teleport((Location)hm.get(home));
          }
        }, 100L);
      }
    }
    else
    {
      p.sendMessage("§cCe home n'éxiste pas !");
      p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100.0F, 2.0F);
    }
  }
}
