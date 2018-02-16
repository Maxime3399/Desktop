package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class PlayerKick implements org.bukkit.event.Listener
{
  public PlayerKick() {}
  
  @org.bukkit.event.EventHandler
  public void onKick(PlayerKickEvent e)
  {
    Player p = e.getPlayer();
    
    if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("true"))
    {
      SentinelFunction.remove(p);
    }
    

    MCubeAPI.setPlayedTime(p);
    MCubeAPI.setKilledlayers(p);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        for (Player pls : ) {
          fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(pls);
        }
        
      }
    }, 3L);
  }
}
