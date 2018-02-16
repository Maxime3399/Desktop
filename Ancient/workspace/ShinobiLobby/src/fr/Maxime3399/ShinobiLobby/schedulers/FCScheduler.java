package fr.Maxime3399.ShinobiLobby.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.actions.JoinAction;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class FCScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					int lvl = DataUtils.getIntPlayerInfo(pls.getUniqueId().toString(), "lvl");
					
					if(lvl < 1){
						
						pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -17, 77, 0), Material.STEP, (byte) 6);
						
					}else{
						
						if(JoinAction.waitvs.contains(pls)){
							
							pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -17, 77, 0), Material.STEP, (byte) 7);
							
						}else{
							
							pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -17, 77, 0), Material.STEP, (byte) 0);
							
						}
						
					}
					
					if(lvl < 10){
						
						pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -16, 77, -5), Material.STEP, (byte) 6);
						
					}else{
						
						if(JoinAction.waitranked.contains(pls)){
							
							pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -16, 77, -5), Material.STEP, (byte) 7);
							
						}else{
							
							pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -16, 77, -5), Material.STEP, (byte) 0);
							
						}
						
					}
					
					if(JoinAction.waittutorial.contains(pls)){
						
						pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -16, 77, 5), Material.STEP, (byte) 7);
						
					}else{
						
						pls.sendBlockChange(new Location(Bukkit.getWorld("world"), -16, 77, 5), Material.STEP, (byte) 0);
						
					}
					
				}
				
			}
			
		}, 5, 5);
		
	}

}
