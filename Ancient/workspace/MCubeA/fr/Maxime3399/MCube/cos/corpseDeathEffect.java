package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.EulerAngle;

public class corpseDeathEffect{
	
  public static ArrayList<Entity> al = new ArrayList<>();
  
  public static void start(Player p){
	  
	Location l = p.getLocation();
    
    Entity e = l.getWorld().spawn(l, ArmorStand.class);
    ArmorStand a = (ArmorStand)e;
    
    a.setArms(true);
    a.setBasePlate(false);
    a.setInvulnerable(true);
    
    EulerAngle ea1 = new EulerAngle(-15, 35, 10);
    a.setHeadPose(ea1);
    EulerAngle ea2 = new EulerAngle(-5, 5, 0);
    a.setBodyPose(ea2);
    EulerAngle ae3 = new EulerAngle(-30, 25, -35);
    a.setLeftArmPose(ae3);
    EulerAngle ae4 = new EulerAngle(-35, 35, 10);
    a.setRightArmPose(ae4);
    EulerAngle ae5 = new EulerAngle(-40, -15, -5);
    a.setLeftLegPose(ae5);
    EulerAngle ae6 = new EulerAngle(-65, 10, 15);
    a.setRightLegPose(ae6);
    
    ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
    SkullMeta SM = (SkullMeta)IS.getItemMeta();
    SM.setOwner(p.getName());
    IS.setItemMeta(SM);
    
    a.setHelmet(IS);
    
    al.add(e);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	

      public void run(){
    	  
        e.remove();
        
      }

    }, 400);
    
  }
  
}
