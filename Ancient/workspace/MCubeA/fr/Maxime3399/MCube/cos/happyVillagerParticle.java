package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

public class happyVillagerParticle{
	
  static int s = 0;
  
  public static void start(){
	
	if (s == 0){
		
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	  
        double t = 0;
        double r = 0;

        public void run(){
        	
          t = t+Math.PI/16;
          
          for (Player pls : Bukkit.getOnlinePlayers()){
        	  
            if ((MCubeAPI.getActiveCos(pls).contains("happyVillager")) && (!PlayerDeath.al.contains(pls))){
            	
              Location loc = pls.getLocation().add(0, 1, 0);
              Location loc2 = pls.getLocation().add(0, 1, 0);
              Location loc3 = pls.getLocation().add(0, 1, 0);
              double x = r * Math.cos(t);
              double y = r * Math.cos(t);
              double y2 = r * Math.cos(t);
              y2 = y2*-1;
              double z = r * Math.sin(t);
              loc.add(x, y, z);
              loc2.add(x, y2, z);
              loc3.add(x, 0, z);
              
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.VILLAGER_HAPPY, loc, 0, 0, 0, 0, 2);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.VILLAGER_HAPPY, loc2, 0, 0, 0, 0, 2);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.VILLAGER_HAPPY, loc3, 0, 0, 0, 0, 6);
              
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
