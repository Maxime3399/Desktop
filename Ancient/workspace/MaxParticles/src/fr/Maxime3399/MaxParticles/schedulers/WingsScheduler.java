package fr.Maxime3399.MaxParticles.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxParticles.MainClass;
import fr.Maxime3399.MaxParticles.effects.DeathWingsEffect;
import fr.Maxime3399.MaxParticles.effects.EnderWingsEffect;
import fr.Maxime3399.MaxParticles.effects.FireWingsEffect;
import fr.Maxime3399.MaxParticles.effects.MagicWingsEffect;
import fr.Maxime3399.MaxParticles.effects.MulticolorWingsEffect;
import fr.Maxime3399.MaxParticles.effects.NetherWingsEffect;
import fr.Maxime3399.MaxParticles.effects.SnowWingsEffect;
import fr.Maxime3399.MaxParticles.manager.EffectManager;

public class WingsScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(EffectManager.lister.containsKey(pls)){
						
						String effect = EffectManager.lister.get(pls);
						Location location = pls.getLocation();
						
						if(effect.equalsIgnoreCase("snowwings")){
							SnowWingsEffect.drawParticles(location);
						}else if(effect.equalsIgnoreCase("multicolorwings")){
							MulticolorWingsEffect.drawParticles(location);
						}else if(effect.equalsIgnoreCase("deathwings")){
							DeathWingsEffect.drawParticles(location);
						}else if(effect.equalsIgnoreCase("netherwings")){
							NetherWingsEffect.drawParticles(location);
						}
						
					}
					
				}
				
			}
			
		}, 4, 4);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(EffectManager.lister.containsKey(pls)){
						
						String effect = EffectManager.lister.get(pls);
						Location location = pls.getLocation();
						
						if(effect.equalsIgnoreCase("firewings")){
							FireWingsEffect.drawParticles(location);
						}else if(effect.equalsIgnoreCase("enderwings")){
							EnderWingsEffect.drawParticles(location);
						}
						
					}
					
				}
				
			}
			
		}, 7, 7);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(EffectManager.lister.containsKey(pls)){
						
						String effect = EffectManager.lister.get(pls);
						Location location = pls.getLocation();
						
						if(effect.equalsIgnoreCase("magicwings")){
							MagicWingsEffect.drawParticles(location);
						}
						
					}
					
				}
				
			}
			
		}, 15, 15);
		
	}

}
