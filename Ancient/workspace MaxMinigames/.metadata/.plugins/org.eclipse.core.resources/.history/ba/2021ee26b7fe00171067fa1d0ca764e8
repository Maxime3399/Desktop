package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.actions.Stopper;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.scoreboards.WaitScoreboard;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		Player p = e.getPlayer();
		
		if(GameState.isState(GameState.WAITING)){
			
			int onlinePlayers = Bukkit.getOnlinePlayers().size()-1;
			e.setQuitMessage(p.getDisplayName()+"§r§e a quitté la partie §l[§r§e"+onlinePlayers+"§l/§r§e12§l]");
			
			if(onlinePlayers == 1){
				
				Bukkit.broadcastMessage("§cIl n'y a plus assez de joueurs");
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.playSound(pls.getLocation(), Sound.DOOR_OPEN, 100, 1);
				}
				Bukkit.getScheduler().cancelTask(PlayerJoin.task);
				PlayerJoin.time = 31;
				
			}
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					for(Player pls : Bukkit.getOnlinePlayers()){
						
						WaitScoreboard.loadScoreboard(pls);
						
					}
					
				}
				
			}, 2);
			
		}else if(GameState.isState(GameState.PLAYING)){
			
			QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
			
			if(qp.getRole().equalsIgnoreCase("player")){
				
				int onlinePlayers = Bukkit.getOnlinePlayers().size()-1;
				e.setQuitMessage(p.getDisplayName()+"§e a quitté la partie !");
				
				if(onlinePlayers == 0){
					
					GameState.setState(GameState.END);
					Bukkit.getServer().reload();
					
				}else if(onlinePlayers < 2){
					
					Bukkit.broadcastMessage("§cTous les joueurs ont quittés la partie !");
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.playSound(pls.getLocation(), Sound.ANVIL_BREAK, 100, 1);
					}
					Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
						@Override
						public void run() {
							Stopper.end();
						}
					}, 40);
					
				}
				
			}else{
				
				e.setQuitMessage(null);
				
			}
			
		}else{
			
			e.setQuitMessage(null);
			
		}
		
		PlayersManagers.getQuakePlayer(p).update();
		PlayersManagers.removePlayer(p);
		
	}

}
