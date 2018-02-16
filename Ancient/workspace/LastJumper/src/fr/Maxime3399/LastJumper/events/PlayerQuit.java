package fr.Maxime3399.LastJumper.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.actions.TestWinner;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.managers.ReturnerManager;
import fr.Maxime3399.LastJumper.scoreboards.GameScoreboard;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class PlayerQuit implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		Player p = e.getPlayer();
		
		if(ArenasManager.playerArena.containsKey(p)){
			
			String name = ArenasManager.playerArena.get(p);
			
			ArenasManager.livingPerson.get(name).remove(p);
			
			ReturnerManager.returnInventory(p);
			ReturnerManager.returnLocation(p);
			ReturnerManager.returnGM(p);
			p.setMaxHealth(20);
			p.setHealth(20);
			ReturnerManager.returnFood(p);
			ReturnerManager.returnHealth(p);
			
			ArenasManager.arenaCount.put(name, ArenasManager.arenaCount.get(name)-1);
			
			if(ArenasManager.arenasState.get(name).equalsIgnoreCase("wait")){
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
						MessagesUtils.sendMessages(pls, "PlayerQuit", true, p.getName());
					}
				}
				
				Jumper.removePlayer(p, name);
				
			}else if(ArenasManager.arenasState.get(name).equalsIgnoreCase("playing")){
				
				if(ArenasManager.livingPerson.get(name).contains(p)){
					
					Jumper.removePlayer(p, name);
					
				}
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
						if(ArenasManager.livingPerson.get(name).contains(p)){
							MessagesUtils.sendMessages(pls, "QuitInGame", true, p.getName());
							ArenasManager.livePlayers.put(name, ArenasManager.livePlayers.get(name)-1);
							Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
								
								@Override
								public void run() {
									
									GameScoreboard.loadScoreboard(pls);
									TestWinner.test(name);
									
								}
								
							}, 3);
						}
					}
				}
				
			}
			
		}
		
	}

}
