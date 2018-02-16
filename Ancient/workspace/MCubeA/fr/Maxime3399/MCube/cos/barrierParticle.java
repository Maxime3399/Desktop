package fr.Maxime3399.MCube.cos;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class barrierParticle{
	
  static int s = 0;
  
  public static void start() {
	  
	  if (s == 0){
		  
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
        	
          for (Player pls : Bukkit.getOnlinePlayers()){
        	  
            if ((MCubeAPI.getActiveCos(pls).contains("barrier")) && (!PlayerDeath.al.contains(pls))){
            	
              Location loc = pls.getLocation().add(0, 0.9, 0);
              Random r = new Random();
              int y = r.nextInt(14) / 10;
              loc.add(0, y, 0);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(org.bukkit.Particle.BARRIER, loc, 0, 0, 0, 0, 1);
              
            }
            
          }
          
        }

      }, 7, 7);
      
    }
	  
  }
  
}