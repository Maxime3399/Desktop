package fr.Maxime3399.MCube.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.utils.DataUtils;

public class PhaseScheduler {
	
	private static String phase = DataUtils.getServerStringInfo("phase");
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				String newPhase = DataUtils.getServerStringInfo("phase");
				if(!newPhase.equalsIgnoreCase(phase)){
					
					if(newPhase.equalsIgnoreCase("maintenance")){
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							CustomPlayer cps = new CustomPlayer(pls);
							if(!cps.getStaffRank().equalsIgnoreCase("admin") || !cps.getStaffRank().equalsIgnoreCase("respdev") || !cps.getStaffRank().equalsIgnoreCase("dev")){
								
								pls.kickPlayer("§b§lLe serveur est désormais en maintenance !");
								
							}
							
						}
						
					}else if(newPhase.equalsIgnoreCase("close")){
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							CustomPlayer cps = new CustomPlayer(pls);
							if(!cps.getStaffRank().equalsIgnoreCase("admin") || !cps.getStaffRank().equalsIgnoreCase("respdev") || !cps.getStaffRank().equalsIgnoreCase("dev")){
								
								pls.kickPlayer("§6§lLe seveur est fermé !");
								
							}
							
						}
						
					}
					
					phase = newPhase;
					
				}
				
			}
			
		}, 20, 20);
		
	}

}
