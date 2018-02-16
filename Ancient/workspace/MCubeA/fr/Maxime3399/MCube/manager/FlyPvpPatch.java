package fr.Maxime3399.MCube.manager;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class FlyPvpPatch
{
  static HashMap<Player, Integer> hm = new HashMap();
  static int task;
  
  public FlyPvpPatch() {}
  
  public static void start() { Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : )
        {
          if (FlyPvpPatch.hm.containsKey(pls))
          {
            if (((Integer)FlyPvpPatch.hm.get(pls)).intValue() == 1)
            {
              FlyPvpPatch.hm.remove(pls);
              pls.setAllowFlight(true);
              pls.playSound(pls.getLocation(), Sound.BLOCK_PISTON_EXTEND, 100.0F, 1.0F);
            }
            else
            {
              FlyPvpPatch.hm.put(pls, Integer.valueOf(((Integer)FlyPvpPatch.hm.get(pls)).intValue() - 1));
            }
            
          }
          
        }
        
      }
      

    }, 20L, 20L);
  }
  

  public static void stop()
  {
    Bukkit.getScheduler().cancelTask(task);
  }
  

  public static void add(Player p)
  {
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))
    {
      hm.put(p, Integer.valueOf(8));
      p.setAllowFlight(false);
      p.setFlying(false);
      p.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 100.0F, 1.0F);
    }
  }
}
