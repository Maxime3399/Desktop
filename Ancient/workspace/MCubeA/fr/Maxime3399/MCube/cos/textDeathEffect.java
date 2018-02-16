package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class textDeathEffect{
	
  public static ArrayList<Entity> AL = new ArrayList<>();
  
  public static void start(Player p) {
	  
	Location l = p.getLocation();
    
    Entity e = l.getWorld().spawn(l, ArmorStand.class);
    ArmorStand a = (ArmorStand)e;
    a.setInvulnerable(true);
    a.setGravity(true);
    a.setVisible(false);
    a.setRemoveWhenFarAway(false);
    a.setSmall(true);
    a.setCustomName("§4§lRIP §r" + p.getDisplayName());
    a.setCustomNameVisible(true);
    
    AL.add(e);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
        textDeathEffect.AL.remove(e);
        e.remove();
      }

    }, 600);
    
  }
  
}
