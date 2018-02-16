package fr.Maxime3399.MCube.events;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SpawnEggMeta;

public class PaquesEvents implements org.bukkit.event.Listener
{
  public PaquesEvents() {}
  
  @EventHandler
  public void entityDeath(EntityDeathEvent e)
  {
    if (e.getEntity().getKiller() == null)
    {
      return;
    }
    if (e.getEntity().getKiller().getType() == org.bukkit.entity.EntityType.PLAYER)
    {
      Player p = e.getEntity().getKiller();
      
      Random r = new Random();
      int ri = r.nextInt(51);
      
      if (ri == 0)
      {
        ItemStack IS = new ItemStack(Material.MONSTER_EGG);
        SpawnEggMeta SM = (SpawnEggMeta)IS.getItemMeta();
        SM.setSpawnedType(e.getEntity().getType());
        IS.setItemMeta(SM);
        p.getInventory().addItem(new ItemStack[] { IS });
        p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
      }
    }
  }
}
