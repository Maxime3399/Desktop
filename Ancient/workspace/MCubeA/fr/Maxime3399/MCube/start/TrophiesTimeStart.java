package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.MCubeAPI;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class TrophiesTimeStart
{
  static int task;
  
  public TrophiesTimeStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.TROPHIESTIME);
    
    task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : )
        {
          Random r = new Random();
          int ran = r.nextInt(15);
          
          if (ran == 0)
          {
            MCubeAPI.setTrophies(pls, MCubeAPI.getPlayerTrophies(pls) + 1);
            pls.sendMessage("§aTu as obtenus §e1 trophés !");
            for (Player pls2 : Bukkit.getOnlinePlayers()) {
              fr.Maxime3399.MCube.utils.DisplayNameUtils.setDisplayName(pls2);
              fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(pls2);
            }
            
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
