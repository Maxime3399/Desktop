package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class enferDeathEffect{
	
  public static ArrayList<Entity> al = new ArrayList<>();
  
  public static void start(Player p){
	  
	Location l = p.getLocation().add(0, 1, 0);
    
    Entity e = l.getWorld().spawn(l, ArmorStand.class);
    ArmorStand a = (ArmorStand)e;
    
    a.setInvulnerable(true);
    a.setArms(true);
    a.setBasePlate(true);
    a.setGravity(false);
    
    ItemStack IS = new ItemStack(org.bukkit.Material.SKULL_ITEM, 1, (short)3);
    SkullMeta SM = (SkullMeta) IS.getItemMeta();
    SM.setOwner(p.getName());
    IS.setItemMeta(SM);
    
    ItemStack IS2 = new ItemStack(org.bukkit.Material.IRON_CHESTPLATE);
    
    a.setHelmet(IS);
    a.setChestplate(IS2);
    
    al.add(e);
    
    Location loc = a.getLocation().add(0, -0.25, 0);
    a.teleport(loc);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        Location loc2 = a.getLocation().add(0, -0.25, 0);
        a.teleport(loc2);
        a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
      }

    }, 10);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 20);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 30);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 40);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 50);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 60);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 70);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 80);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 90);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 100);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          Location loc2 = a.getLocation().add(0, -0.25, 0);
          a.teleport(loc2);
          a.getLocation().getWorld().playEffect(loc2, Effect.MOBSPAWNER_FLAMES, 3);
        }

      }, 110);

  }
  
}
