package fr.Maxime3399.ShinobiLobby.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.actions.JoinAction;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class WaitScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				if(DataUtils.getIntServerInfo("tutorialPlayers") <= 2){
					
					if(JoinAction.waittutorial.size() != 0){
						
						Player p = JoinAction.waittutorial.get(0);
						JoinAction.waittutorial.remove(p);
						JoinAction.joinTutorial(p);
						
					}
					
				}
				
				if(DataUtils.getIntServerInfo("vsPlayers") <= 12){
					
					if(JoinAction.waitvs.size() != 0){
						
						Player p = JoinAction.waitvs.get(0);
						JoinAction.waitvs.remove(p);
						JoinAction.joinVs(p);
						
					}
					
				}
				
				if(DataUtils.getIntServerInfo("rankedPlayers") <= 8){
					
					if(JoinAction.waitranked.size() != 0){
						
						Player p = JoinAction.waitvs.get(0);
						JoinAction.waitvs.remove(p);
						JoinAction.joinRanked(p);
						
					}
					
				}
				
			}
			
		}, 5, 5);
		
	}

}
