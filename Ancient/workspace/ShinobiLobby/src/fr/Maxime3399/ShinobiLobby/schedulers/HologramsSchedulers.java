package fr.Maxime3399.ShinobiLobby.schedulers;

import org.bukkit.Bukkit;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.custom.Hologram;
import fr.Maxime3399.ShinobiLobby.managers.HologramsManager;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class HologramsSchedulers {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				Hologram h1 = HologramsManager.tutorial.get(1);
				h1.setText("§b"+DataUtils.getIntServerInfo("tutorialPlayers")+" §ajoueurs");
				Hologram h2 = HologramsManager.vs.get(1);
				h2.setText("§b"+DataUtils.getIntServerInfo("vsPlayers")+" §ajoueurs");
				Hologram h3 = HologramsManager.ranked.get(1);
				h3.setText("§b"+DataUtils.getIntServerInfo("rankedPlayers")+" §ajoueurs");
				Hologram h4 = HologramsManager.vsblocked.get(1);
				h4.setText("§b"+DataUtils.getIntServerInfo("vsPlayers")+" §ajoueurs");
				Hologram h5 = HologramsManager.rankedblocked.get(1);
				h5.setText("§b"+DataUtils.getIntServerInfo("rankedPlayers")+" §ajoueurs");
				
			}
			
		}, 100, 100);
		
	}

}
