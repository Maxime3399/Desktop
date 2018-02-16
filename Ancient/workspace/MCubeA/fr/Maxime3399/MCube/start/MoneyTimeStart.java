package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.actions.giveMoney;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

public class MoneyTimeStart
{
  static int task;
  
  public MoneyTimeStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.MONEYTIME);
    
    task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (org.bukkit.entity.Player pls : )
        {
          Random r = new Random();
          int ran = r.nextInt(15);
          
          if (ran == 0)
          {
            giveMoney.give(pls, 1);
          }
          
        }
        
      }
      

    }, 200L, 200L);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    
    Bukkit.getScheduler().cancelTask(task);
  }
}
