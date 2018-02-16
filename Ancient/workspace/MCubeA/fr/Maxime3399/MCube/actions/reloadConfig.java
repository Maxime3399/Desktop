package fr.Maxime3399.MCube.actions;

import org.bukkit.Bukkit;

public class reloadConfig {
  
  public static void start() {
	  
    Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        Bukkit.getPluginManager().getPlugin("M-Cube").reloadConfig();
        
      }

    }, 1000, 1000);
    
  }
  
}