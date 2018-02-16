package fr.Maxime3399.MCube.schedulers;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class sentinelScheduler
{
  public static int s = 0;
  
  public sentinelScheduler() {}
  
  public static void start() { Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : )
        {
          if (MCubeAPI.getEnabledSentinel(pls).equalsIgnoreCase("true"))
          {
            for (Entity es : pls.getWorld().getEntities())
            {
              if ((es instanceof Monster))
              {
                Location playloc = pls.getLocation().add(0.0D, 2.48D, 0.0D);
                Location monstloc = es.getLocation().add(0.0D, 1.0D, 0.0D);
                
                if (playloc.distance(monstloc) <= 6.0D)
                {
                  playloc.getWorld().spawnParticle(Particle.FLAME, playloc, 0, 0.0D, 0.0D, 0.0D, 3.0D);
                  monstloc.getWorld().spawnParticle(Particle.LAVA, monstloc, 0, 0.0D, 0.0D, 0.0D, 5.0D);
                  
                  ((Monster)es).damage(1.0D, pls);
                }
                
              }
              
            }
            
          }
          
        }
        
      }
      

    }, 4L, 4L);
    
    Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : )
        {
          if (MCubeAPI.getEnabledSentinel(pls).equalsIgnoreCase("true"))
          {
            ArmorStand a = (ArmorStand)SentinelFunction.hm.get(pls);
            a.teleport(pls.getLocation().add(0.0D, 1.5D, 0.0D));
          }
          
        }
        
      }
      

    }, 1L, 1L);
    
    Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : )
        {
          if (MCubeAPI.getEnabledSentinel(pls).equalsIgnoreCase("true"))
          {
            if (MCubeAPI.getSentinel(pls) == 0)
            {
              MCubeAPI.setEnabledSentinel(pls, "false");
              MCubeAPI.setSentinel(pls, 0);
              pls.playSound(pls.getLocation(), org.bukkit.Sound.BLOCK_BREWING_STAND_BREW, 100.0F, 2.0F);
              pls.sendMessage("§cLe temps de ton sentinel est écoulé !");
              SentinelFunction.remove(pls);
            }
            else
            {
              MCubeAPI.setSentinel(pls, MCubeAPI.getSentinel(pls) - 1);
            }
            

            fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(pls);
          }
          
        }
        
      }
      

    }, 20L, 20L);
  }
}
