package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

public class explodeDeathEffect{
	
  public static ArrayList<Entity> AL = new ArrayList<>();
  
  public static void start(Player p){
	  
	Location l = p.getLocation();
    
    Entity e = l.getWorld().spawn(l, TNTPrimed.class);
    TNTPrimed tnt = (TNTPrimed)e;
    
    tnt.setGravity(false);
    tnt.setFuseTicks(99999999);
    AL.add(e);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        e.remove();
        l.getWorld().spawnParticle(org.bukkit.Particle.EXPLOSION_NORMAL, l, 0, 0, 0, 0, 2);
        for (Player pls : Bukkit.getOnlinePlayers()){
          pls.playSound(l, org.bukkit.Sound.ENTITY_GENERIC_EXPLODE, 60, 1);
        }
        
      }
      
    }, 80);
    
  }
  
}
