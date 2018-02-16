package fr.Maxime3399.LastJumper.actions;

import java.util.Random;

import org.bukkit.Bukkit;

public class coloredWool {
	
	public static int getColor(){
		
		int color = 17;
		int config = Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("WoolColor");
		
		if(config < 0 || config > 17){
			
			color = 0;
			
		}else if(config == 17){
			
			Random r = new Random();
			color = r.nextInt(17);
			
		}
		
		return color;
		
	}

}
