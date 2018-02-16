package fr.Maxime3399.LastJumper.actions;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.managers.ReturnerManager;
import fr.Maxime3399.LastJumper.schedulers.PlayerJumps;
import fr.Maxime3399.LastJumper.scoreboards.EndScoreboard;
import fr.Maxime3399.LastJumper.scoreboards.GameScoreboard;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class TestWinner {
	
	public static void test(String name){
		
		if(ArenasManager.livePlayers.get(name) == 1){
			
			ArenasManager.arenasState.put(name, "end");
			
			Player p = ArenasManager.livingPerson.get(name).get(0);
			
			ArenasManager.winner.put(name, p);
			
			for(Player pls : Bukkit.getOnlinePlayers()){
				
				if(ArenasManager.playerArena.containsKey(pls)){
					
					if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
						
						MessagesUtils.sendMessages(pls, "Winner", true, p.getName());
						EndScoreboard.loadScoreboard(pls);
						
					}
					
				}
				
			}
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					
					for(Player pls : Bukkit.getOnlinePlayers()){
						
						if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
							
							ArenasManager.arenaCount.put(name, ArenasManager.arenaCount.get(name)-1);
							
							ReturnerManager.returnInventory(pls);
							ReturnerManager.returnLocation(pls);
							ReturnerManager.returnGM(pls);
							pls.setMaxHealth(20);
							ReturnerManager.returnFood(pls);
							ReturnerManager.returnHealth(pls);
							
							if(Jumper.lister.get(name).contains(pls)){
								Jumper.removePlayer(pls, name);
							}
							
							ArenasManager.playerArena.remove(pls);
							pls.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
							
						}
						
					}
					
				}
				
			}, 100);
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("LastJumper"), new Runnable() {
				
				@Override
				public void run() {
					
					for(Block bs : PlayerJumps.bl.get(name)){
						
						bs.setType(Material.WATER);
						
					}
					
					ArenasManager.restartGame(name);
					
				}
				
			}, 110);
			
		}else{
			
			Player po = Jumper.getSuiv(ArenasManager.jumper.get(name), name);
			Jumper.selectJumper(po, name);
			
			for(Player pls : Bukkit.getOnlinePlayers()){
				
				if(ArenasManager.playerArena.get(pls).equalsIgnoreCase(name)){
					
					GameScoreboard.loadScoreboard(pls);
					
				}
				
			}
			
		}
		
	}

}
