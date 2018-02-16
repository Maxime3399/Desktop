package fr.Maxime3399.MCube.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityExplodeEvent;

public class AntiCreeper implements org.bukkit.event.Listener
{
  public AntiCreeper() {}
  
  @org.bukkit.event.EventHandler
  public void onExplode(EntityExplodeEvent e)
  {
    if (e.getEntity().getType() == org.bukkit.entity.EntityType.CREEPER)
    {
      for (final Block b : e.blockList())
      {
        if (b.getType() != Material.CHEST)
        {
          final BlockState s = b.getState();
          
          b.setType(Material.AIR);
          
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
          {

            public void run()
            {
              s.update(true, false);
              b.getLocation().getWorld().spawnParticle(org.bukkit.Particle.HEART, b.getLocation().add(0.0D, 0.6D, 0.0D), 1, 0.0D, 0.0D, 0.0D);
              for (Player pls : Bukkit.getOnlinePlayers()) {
                if (pls.getLocation() == b.getLocation()) {
                  pls.teleport(pls.getLocation().add(0.0D, 3.0D, 0.0D));
                }
                
              }
              
            }
          }, 10L);
        }
      }
    }
  }
}
