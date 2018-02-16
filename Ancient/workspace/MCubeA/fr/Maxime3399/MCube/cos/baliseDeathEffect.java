package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class baliseDeathEffect{
	
  public static ArrayList<Entity> al = new ArrayList<>();
  
  public static void start(Player p){
	  
	Location l = p.getLocation();
    
    Entity e = l.getWorld().spawn(l, EnderSignal.class);
    al.add(e);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	

      public void run(){
    	  
        al.remove(e);
        e.remove();
        
      }

    }, 200);
    
  }
  
}