package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.actions.giveChest;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

public class ChestFinderStart
{
  static int task;
  
  public ChestFinderStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.CHESTFINDER);
    
    task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (org.bukkit.entity.Player pls : )
        {
          Random r = new Random();
          int ran = r.nextInt(46);
          
          if (ran == 0)
          {
            giveChest.setup(pls);
          }
          
        }
        
      }
      

    }, 3600L, 3600L);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    
    Bukkit.getScheduler().cancelTask(task);
  }
}
