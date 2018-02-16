package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.Vector;

public class cielDeathEffect{
	
  public static ArrayList<Entity> al = new ArrayList<>();
  
  public static void start(Player p) { 
	  
	Location l = p.getLocation();
    
    Entity e = l.getWorld().spawn(l, ArmorStand.class);
    ArmorStand a = (ArmorStand)e;
    
    a.setInvulnerable(true);
    a.setArms(true);
    a.setBasePlate(true);
    a.setGravity(false);
    
    ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
    SkullMeta SM = (SkullMeta) IS.getItemMeta();
    SM.setOwner(p.getName());
    IS.setItemMeta(SM);
    
    ItemStack IS2 = new ItemStack(org.bukkit.Material.ELYTRA);
    
    a.setHelmet(IS);
    a.setChestplate(IS2);
    
    al.add(e);
    
    Vector v = new Vector(0, 0.75, 0);
    a.setGravity(true);
    a.setVelocity(a.getVelocity().add(v));
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        a.setVelocity(a.getVelocity().add(v));
        a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
      }

    }, 10);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 20);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 30);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 40);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 50);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 60);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 70);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 80);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 90);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 100);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

        public void run(){
      	  
          a.setVelocity(a.getVelocity().add(v));
          a.getLocation().getWorld().spawnParticle(Particle.SNOW_SHOVEL, 0, 0, 0, 0, Integer.valueOf(30));
        }

      }, 110);
    
  }
  
}
