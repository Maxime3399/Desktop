package fr.Maxime3399.DivionAPI;

import org.bukkit.Bukkit;

public class PlayersCount {
	
	public static void startScheduler(){
		
		String name = ""+Bukkit.getPluginManager().getPlugin("DivionAPI").getConfig().getString("ServerName");
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("DivionAPI"), new Runnable() {
			
			@Override
			public void run() {
				
				DivionAPI.setServerCount(name, Bukkit.getOnlinePlayers().size());
				
			}
			
		}, 60, 60);
		
	}

}
