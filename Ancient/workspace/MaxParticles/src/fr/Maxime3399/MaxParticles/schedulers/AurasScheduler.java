package fr.Maxime3399.MaxParticles.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxParticles.MainClass;
import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.spaces.Particles;

public class AurasScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(EffectManager.lister.containsKey(pls)){
						
						String effect = EffectManager.lister.get(pls);
						Location l = pls.getLocation();
						
						if(effect.equalsIgnoreCase("fireaura")){
							Particles.FLAME.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 6, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("magicaura")){
							Particles.VILLAGER_HAPPY.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 6, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("snowaura")){
							Particles.SNOW_SHOVEL.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 10, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("enderaura")){
							Particles.PORTAL.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 10, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("deathaura")){
							Particles.SUSPENDED_DEPTH.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 10, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("enchantaura")){
							Particles.ENCHANTMENT_TABLE.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 10, l.add(0, 1, 0), 1);
						}else if(effect.equalsIgnoreCase("musicaura")){
							Particles.NOTE.display((float)0.68,(float) 0.9, (float)0.68, (float) 0.1, 10, l.add(0, 1, 0), 1);
						}
						
					}
					
				}
				
			}
			
		}, 5, 5);
		
	}

}
