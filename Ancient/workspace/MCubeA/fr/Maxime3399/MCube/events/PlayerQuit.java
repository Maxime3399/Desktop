package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class PlayerQuit implements org.bukkit.event.Listener
{
  public PlayerQuit() {}
  
  @org.bukkit.event.EventHandler
  public void onQuit(PlayerQuitEvent e)
  {
    Player p = e.getPlayer();
    
    if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("true"))
    {
      SentinelFunction.remove(p);
    }
    

    MCubeAPI.setPlayedTime(p);
    MCubeAPI.setKilledlayers(p);
    
    if (!MCubeAPI.getPlayerVanish(p).equalsIgnoreCase("true")) {
      e.setQuitMessage("§c§l- §r" + p.getDisplayName());
    } else {
      e.setQuitMessage(null);
    }
    
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
