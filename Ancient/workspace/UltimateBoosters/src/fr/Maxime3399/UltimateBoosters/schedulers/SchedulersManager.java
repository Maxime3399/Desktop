package fr.Maxime3399.UltimateBoosters.schedulers;

import org.bukkit.Bukkit;

public class SchedulersManager {
	
	public static void registerSchedulers(){
		
		GlobalScheduler.start();
		if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("OwnerParticles")){
			ParticlesScheduler.start();
		}
		MultScheduler.start();
		RefreshScheduler.start();
		PersonalBoosters.start();
		
	}

}
