package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

public class dropletParticle{
	
  static int s = 0;
  
  public static void start() {
	  
	  if (s == 0){
		  
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
        	
          for (Player pls : Bukkit.getOnlinePlayers()){
        	  
            if ((MCubeAPI.getActiveCos(pls).contains("droplet")) && (!PlayerDeath.al.contains(pls))){
            	
              Location l = pls.getLocation().add(0, 1, 0);
              
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.WATER_DROP, l, 1, 1, 1, 0.8, 40);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.WATER_DROP, l, 1, 1, 1, 0.8, 40);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.WATER_DROP, l, 1, 1, 1, 0.8, 40);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.WATER_DROP, l, 1, 1, 1, 0.8, 40);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.WATER_DROP, l, 1, 1, 1, 0.8, 40);
            }
            
          }
          
        }
        
      }, 1, 1);
      
    }
	  
  }
  
}
