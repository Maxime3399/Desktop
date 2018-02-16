package fr.Maxime3399.MCube.manager;

import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SentinelFunction
{
  public static HashMap<Player, ArmorStand> hm = new HashMap();
  public static ArrayList<Entity> al = new ArrayList();
  
  public SentinelFunction() {}
  
  public static void add(Player p) { Entity e = p.getLocation().getWorld().spawn(p.getLocation().add(0.0D, 1.5D, 0.0D), ArmorStand.class);
    ArmorStand a = (ArmorStand)e;
    
    a.setGravity(false);
    a.setSmall(true);
    a.setVisible(false);
    
    ItemStack IS = new ItemStack(Material.FIREBALL);
    a.setHelmet(IS);
    
    hm.put(p, a);
    al.add(e);
  }
  

  public static void remove(Player p)
  {
    ArmorStand a = (ArmorStand)hm.get(p);
    a.remove();
  }
}
