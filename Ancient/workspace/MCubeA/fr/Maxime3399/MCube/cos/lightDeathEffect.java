package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class lightDeathEffect{
  
  public static void start(Player p){
	  
    Location l = p.getLocation();
    
    l.getWorld().strikeLightningEffect(l);
    for (Player pls : Bukkit.getOnlinePlayers()) {
      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
    }
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
      public void run() {
    	    l.getWorld().strikeLightningEffect(l);
    	    for (Player pls : Bukkit.getOnlinePlayers()) {
    	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
    	    }
      }
    }, 4);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 8);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 12);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 16);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 20);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 24);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 28);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 32);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 36);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 40);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        public void run() {
      	    l.getWorld().strikeLightningEffect(l);
      	    for (Player pls : Bukkit.getOnlinePlayers()) {
      	      pls.playSound(l, Sound.ENTITY_LIGHTNING_THUNDER, 80, 1);
      	    }
        }
      }, 44);
    
  }
  
}
