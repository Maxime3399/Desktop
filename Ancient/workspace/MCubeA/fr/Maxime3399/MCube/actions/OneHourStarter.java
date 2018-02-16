package fr.Maxime3399.MCube.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.bukkit.Bukkit;

import fr.Maxime3399.MCube.utils.MySQLUtils;

public class OneHourStarter{
	
  static int task;
  
  public static void start(){
	  
    DateFormat df = new SimpleDateFormat("hh");
    Date d = new Date();
    String time = df.format(d);
    
    task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        DateFormat df = new SimpleDateFormat("hh");
        Date d = new Date();
        String time2 = df.format(d);
        
        if (!time.equals(time2)){
        	
          MySQLUtils.connect();
          randomState.start();
          EqualsCommand.lim.clear();
          Bukkit.getScheduler().cancelTask(OneHourStarter.task);
          OneHourStarter.start();
        }
        
      }

    }, 300, 300);
    
  }
  
}