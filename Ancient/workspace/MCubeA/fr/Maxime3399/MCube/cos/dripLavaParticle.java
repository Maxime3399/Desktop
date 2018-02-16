package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

public class dripLavaParticle{
	
  static int s = 0;
  
  public static void start() {
	  
	  if (s == 0){
		  
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	  
        double t = 0;
        double r = 0.2;
        double r2 = 0.4;
        double r3 = 0.6;
        double r4 = 0.8;
        

        public void run(){
        	
          t = t+Math.PI/16;
          
          for (Player pls : Bukkit.getOnlinePlayers()){
        	  
            if ((MCubeAPI.getActiveCos(pls).contains("dripLava")) && (!PlayerDeath.al.contains(pls))){
            	
              Location loc = pls.getLocation().add(0, 2.1, 0);
              Location loc2 = pls.getLocation().add(0, 2.1, 0);
              Location loc3 = pls.getLocation().add(0, 2.1, 0);
              Location loc4 = pls.getLocation().add(0, 2.1, 0);
              double x = r * Math.cos(t);
              double z = r * Math.sin(t);
              double x2 = r2 * Math.cos(t);
              double z2 = r2 * Math.sin(t);
              double x3 = r3 * Math.cos(t);
              double z3 = r3 * Math.sin(t);
              double x4 = r4 * Math.cos(t);
              double z4 = r4 * Math.sin(t);
              loc.add(x, 0, z);
              loc2.add(x2, 0, z2);
              loc3.add(x3, 0, z3);
              loc4.add(x4, 0, z4);
              
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.DRIP_LAVA, loc, 0, 0, 0, 0, 1);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.DRIP_LAVA, loc2, 0, 0, 0, 0, 1);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.DRIP_LAVA, loc3, 0, 0, 0, 0, 1);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.DRIP_LAVA, loc4, 0, 0, 0, 0, 1);
              
            }
            
          }

          if (t > 4){
        	  
            t = 0;
            
          }
          
        }

      }, 1, 1);
      
    }
	  
  }
  
}
