package fr.Maxime3399.ShinobiTutorial.events;

import java.util.ArrayList;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Maxime3399.ShinobiTutorial.actions.JoinArena;
import fr.Maxime3399.ShinobiTutorial.actions.StartTutorial;
import fr.Maxime3399.ShinobiTutorial.utils.DataUtils;
import fr.Maxime3399.ShinobiTutorial.utils.DisplayUtils;
import fr.Maxime3399.ShinobiUtil.managers.LifeManager;

public class PlayerJoin implements Listener {
	
	public static ArrayList<Player> players = new ArrayList<>();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		
		if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "teleport").equalsIgnoreCase("tutorial")){
			
			players.add(p);
			
			e.setJoinMessage(null);
			
			p.setGameMode(GameMode.ADVENTURE);
			p.setHealth(20);
			p.setFoodLevel(21);
			p.setLevel(0);
			p.setExp(0);
			p.getInventory().clear();
			p.setWalkSpeed((float) 0.2);
			
			p.setDisplayName(DisplayUtils.getDisplayName(p));
			p.setPlayerListName(p.getDisplayName());
			
			DataUtils.setIntServerInfo("tutorialPlayers", DataUtils.getIntServerInfo("tutorialPlayers")+1);
			
			JoinArena.join(p);
			StartTutorial.start(p);
			
			LifeManager.load(p);
			
		}
		
	}

}
