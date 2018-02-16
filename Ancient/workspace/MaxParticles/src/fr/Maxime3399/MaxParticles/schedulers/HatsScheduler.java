package fr.Maxime3399.MaxParticles.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxParticles.MainClass;
import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.spaces.Particles;
import fr.Maxime3399.MaxParticles.utils.UtilParticles;

public class HatsScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			double t = 0;
			double r = 0.45;
			
			@Override
			public void run() {
				
				t = t+Math.PI/8;
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(EffectManager.lister.containsKey(pls)){
						
						String effect = EffectManager.lister.get(pls);
						Location l = pls.getLocation().add(0, 2.09, 0);
			              double x = r * Math.cos(t);
			              double z = r * Math.sin(t);
			              l.add(x, 0, z);
			              
			              if(effect.equalsIgnoreCase("firehat")){
			            	  UtilParticles.display(Particles.FLAME, l);
			              }else if(effect.equalsIgnoreCase("magichat")){
			            	  UtilParticles.display(Particles.VILLAGER_HAPPY, l);
			              }else if(effect.equalsIgnoreCase("snowhat")){
			            	  UtilParticles.display(Particles.SNOWBALL, l);
			              }
						
					}
					
				}
				
				if(t > 6){
					
					t = 0;
					
				}
				
			}
			
		}, 1, 1);
		
	}

}
