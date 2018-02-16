package fr.Maxime3399.MCube.events;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class UtilsEvents implements org.bukkit.event.Listener
{
  public UtilsEvents() {}
  
  @EventHandler
  public void serverPing(ServerListPingEvent e)
  {
    String l1 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Motd1").replaceAll("&", "§");
    String l2 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Motd2").replaceAll("&", "§");
    
    e.setMotd(l1 + "§r\n" + l2 + "§r");
  }
  

  @EventHandler
  public void lostFood(FoodLevelChangeEvent e)
  {
    if (fr.Maxime3399.MCube.GameState.isState(fr.Maxime3399.MCube.GameState.NOFOOD))
    {
      if (e.getEntity().getType() == org.bukkit.entity.EntityType.PLAYER)
      {
        Player p = (Player)e.getEntity();
        if (p.getLocation().getWorld().getName().equalsIgnoreCase("spawn"))
        {
          p.setFoodLevel(22);
          e.setCancelled(true);
        }
      }
    }
  }
}
