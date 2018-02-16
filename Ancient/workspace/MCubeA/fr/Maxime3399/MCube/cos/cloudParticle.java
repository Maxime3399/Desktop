package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.events.PlayerDeath;

public class cloudParticle{
	
  static int s = 0;
  
  public static void start(){
	  
	  if (s == 0){
		  
      s = 1;
      
      Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
        	
          for(Player pls : Bukkit.getOnlinePlayers()){
        	  
            if((MCubeAPI.getActiveCos(pls).contains("cloud")) && (!PlayerDeath.al.contains(pls))){
            	
              Location l = pls.getLocation().add(0, 0.4, 0);
              Location l2 = pls.getLocation().add(0.3, 0.4, 0);
              Location l3 = pls.getLocation().add(0, 0.4, 0.3);
              Location l4 = pls.getLocation().add(-0.3, 0.4, 0);
              Location l5 = pls.getLocation().add(0, 0.4, -0.3);
              
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.CLOUD, l, 0, 0, 0, 0, 30);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.CLOUD, l2, 0, 0, 0, 0, 30);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.CLOUD, l3, 0, 0, 0, 0, 30);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.CLOUD, l4, 0, 0, 0, 0, 30);
              Bukkit.getWorld(pls.getLocation().getWorld().getName()).spawnParticle(Particle.CLOUD, l5, 0, 0, 0, 0, 30);
            }
            
          }
          
        }

      }, 2, 2);
      
    }
	  
  }
  
}
