package fr.Maxime3399.MCube.cos;

import java.util.ArrayList;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class boneDeathEffect{
	
  public static ArrayList<Item> al = new ArrayList<>();
  
  public static void start(Player p) {
	  
	Location l = p.getLocation();
    
    ItemStack IS = new ItemStack(Material.BONE);
    ItemMeta IM = IS.getItemMeta();
    Random r1 = new Random();
    int ri1 = r1.nextInt(99999999);
    IM.setDisplayName(" " + ri1);
    IS.setItemMeta(IM);
    Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
    al.add(i);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 1);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 2);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 3);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 4);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 5);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
    	  
        ItemStack IS = new ItemStack(Material.BONE);
        ItemMeta IM = IS.getItemMeta();
        Random r1 = new Random();
        int ri1 = r1.nextInt(99999999);
        IM.setDisplayName(" " + ri1);
        IS.setItemMeta(IM);
        Item i = l.getWorld().dropItem(l.add(0, 1.6, 0), IS);
        boneDeathEffect.al.add(i);
        
      }
      
    }, 6);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run(){
    	  
        for (Item i : boneDeathEffect.al){
        	
          for (Player pls : Bukkit.getOnlinePlayers()) {
        	  
            pls.playSound(i.getLocation(), org.bukkit.Sound.ENTITY_CHICKEN_EGG, 40, 2);
            
          }
          
          i.remove();
          
        }
        
      }
      
    }, 85);
    
  }
  
}