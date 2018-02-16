package fr.Maxime3399.MCube.actions;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class goSpawn{
  
  public static void start(Player p){
	  
    final Location loc = new Location(Bukkit.getWorld("world"), -303.5, 66.1, 383.5);
    
    if ((fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("UltraVIP")) || (fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+"))) {
    	
      p.sendMessage("§dTéléportation en cours...");
      p.teleport(loc);
      p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100, 1);
      
    } else if (fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) {
    	
      p.sendMessage("§dTéléportation dans 2 secondes...");
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          p.sendMessage("§dTéléportation en cours...");
          p.teleport(loc);
          p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100, 1);
        }
      }, 40);
    } else if (fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) {
      p.sendMessage("§dTéléportation dans 3 secondes...");
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          p.sendMessage("§dTéléportation en cours...");
          p.teleport(loc);
          p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100, 1);
        }
      }, 60);
    } else if (fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) {
      p.sendMessage("§dTéléportation dans 4 secondes...");
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          p.sendMessage("§dTéléportation en cours...");
          p.teleport(loc);
          p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100, 1);
        }
      }, 80);
    } else {
      p.sendMessage("§dTéléportation dans 5 secondes...");
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          p.sendMessage("§dTéléportation en cours...");
          p.teleport(loc);
          p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 100, 1);
        }
      }, 100);
    }
  }
}
