package fr.Maxime3399.LastJumper.schedulers;

import org.bukkit.Bukkit;

import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;

public class StartingScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable(){
			
			@Override
			public void run() {
				
				if(ArenasConfig.arenasList().size() != 0){
					
					for(int z = 0; z < ArenasConfig.arenasList().size(); z++){
						
						if(!ArenasManager.arenasState.containsKey(ArenasConfig.arenasList().get(z))){
							
							if(ArenasConfig.jumpDefined(ArenasConfig.arenasList().get(z)) && ArenasConfig.waitDefined(ArenasConfig.arenasList().get(z))){
								
								ArenasManager.restartGame(ArenasConfig.arenasList().get(z));
								
							}else{
								
								ArenasManager.arenasState.put(ArenasConfig.arenasList().get(z), "dev");
								
							}
							
						}else{
							
							if(ArenasManager.arenasState.get(ArenasConfig.arenasList().get(z)).equalsIgnoreCase("dev")){
								
								if(ArenasConfig.jumpDefined(ArenasConfig.arenasList().get(z)) && ArenasConfig.waitDefined(ArenasConfig.arenasList().get(z))){
									
									ArenasManager.restartGame(ArenasConfig.arenasList().get(z));
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 20, 20);
		
	}

}
