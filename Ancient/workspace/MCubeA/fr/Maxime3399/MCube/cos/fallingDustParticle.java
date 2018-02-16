package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

public class fallingDustParticle{
	
  static int s = 0;
  
  public static void start() {
	  
	if (s == 0){
		
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	  
        double t = 0;
        double r = 0.6;
        

        public void run(){
        	
          t = t+Math.PI/16;
          
          for (Player pls : Bukkit.getOnlinePlayers()){
        	  
            if ((MCubeAPI.getActiveCos(pls).contains("fallingDust")) && (!PlayerDeath.al.contains(pls))){
            	
              Location loc = pls.getLocation().add(0, 1.9, 0);
              double x = r * Math.cos(t);
              double z = r * Math.sin(t);
              loc.add(x, 0, z);
              
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(org.bukkit.Particle.FALLING_DUST, loc, 0, 0, 0, 0, 3);
              
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
