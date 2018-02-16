package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Maxime3399.ShinobiLobby.actions.InvAction;
import fr.Maxime3399.ShinobiLobby.managers.HologramsManager;
import fr.Maxime3399.ShinobiLobby.managers.NPCManager;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;
import fr.Maxime3399.ShinobiLobby.utils.DisplayUtils;
import fr.Maxime3399.ShinobiLobby.utils.LevelUtils;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		DataUtils.registerPlayer(p);
		
		e.setJoinMessage(null);
		
		Location loc = new Location(Bukkit.getWorld("world"), 0.5, 80.1, 0.5);
		loc.setYaw(90);
		loc.setPitch(0);
		p.teleport(loc);
		
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(21);
		p.getInventory().clear();
		
		DataUtils.setStringPlayerInfo(p.getUniqueId().toString(), "teleport", "none");
		
		p.setDisplayName(DisplayUtils.getDisplayName(p));
		p.setPlayerListName(p.getDisplayName());
		
		HologramsManager.setVisibility(p);
		NPCManager.setVisibility(p);
		
		LevelUtils.setLevel(p);
		InvAction.setInv(p);
		
	}

}
