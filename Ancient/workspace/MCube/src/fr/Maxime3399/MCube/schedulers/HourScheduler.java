package fr.Maxime3399.MCube.schedulers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.actions.EventsActions;
import fr.Maxime3399.MCube.actions.RewardsActions;
import fr.Maxime3399.MCube.utils.MySQLUtils;

public class HourScheduler {
	
	private static int task;
	
	public static void start(){
		
	    DateFormat df = new SimpleDateFormat("hh");
	    Date d = new Date();
	    String time = df.format(d);
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				MySQLUtils.connect();
				
			    DateFormat df = new SimpleDateFormat("hh");
			    Date d = new Date();
			    String NewTime = df.format(d);
			    
			    if(!time.equalsIgnoreCase(NewTime)){
			    	
			    	Bukkit.getScheduler().cancelTask(task);
			    	RewardsActions.clearMaxCounters();
			    	EventsActions.setlectRandomEvent();
			    	start();
			    	
			    }
				
			}
			
		}, 300, 300);
		
	}

}
