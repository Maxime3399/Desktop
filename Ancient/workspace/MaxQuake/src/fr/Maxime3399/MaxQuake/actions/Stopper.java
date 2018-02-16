package fr.Maxime3399.MaxQuake.actions;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.BoostersManager;
import fr.Maxime3399.MaxQuake.managers.CoinsManager;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.scoreboards.EndScoreboard;
import fr.Maxime3399.MaxQuake.utils.PlayerClasser;

public class Stopper {
	
	public static void end(){
		
		GameState.setState(GameState.END);
		Timer.stopTimer();
		BoostersManager.stop();
		Shooter.stop();
		for(Entity e : Bukkit.getWorld("world").getEntities()){
			if(e.getType() != EntityType.PLAYER){
				e.remove();
			}
		}
		
	    Player p1 = PlayerClasser.getFirstPlayer();
	    Player p2 = PlayerClasser.getSecondPlayer();
	    Player p3 = PlayerClasser.getThirdPlayer();
	    
	    if(p1 != null){
	    	CoinsManager.giveCoins(PlayersManagers.getQuakePlayer(p1), "top 1", 30);
	    	PlayersManagers.getQuakePlayer(p1).setWins(PlayersManagers.getQuakePlayer(p1).getWins()+1);
	    }
	    if(p2 != null){
	    	CoinsManager.giveCoins(PlayersManagers.getQuakePlayer(p2), "top 2", 20);
	    }
	    if(p3 != null){
	    	CoinsManager.giveCoins(PlayersManagers.getQuakePlayer(p3), "top 3", 10);
	    }
	    
	    for(Player pls : Bukkit.getOnlinePlayers()){
	    	
	    	EndScoreboard.loadScoreboard(pls);
	    	pls.setExp(0);
	    	
	    	QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
	    	
	    	pls.sendMessage("  §1§l======================================");
	    	pls.sendMessage(" ");
	    	if(p1 != null){
		    	pls.sendMessage("       §e§l1§r §l§0-§r "+p1.getDisplayName()+"§r §b"+PlayersManagers.getQuakePlayer(p1).getCurrent_kills());
	    	}
	    	if(p2 != null){
		    	pls.sendMessage("       §7§l2§r §l§0-§r "+p2.getDisplayName()+"§r §b"+PlayersManagers.getQuakePlayer(p2).getCurrent_kills());
	    	}
	    	if(p3 != null){
		    	pls.sendMessage("       §6§l3§r §l§0-§r "+p2.getDisplayName()+"§r §b"+PlayersManagers.getQuakePlayer(p3).getCurrent_kills());
	    	}
	    	pls.sendMessage(" ");
	    	pls.sendMessage("    §eCoins : "+qp.getWin_coins());
	    	pls.sendMessage(" ");
	    	pls.sendMessage("  §1§l======================================");
	    	qp.setTotal_coins(qp.getTotal_coins()+qp.getWin_coins());
	    	
	    }
	    
	    Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					pls.kickPlayer("§e§lQUAKECRAFT§r\n§7par Maxime3399§r\n \n§aMerci d'avoir joué !");
					
				}
				
				Bukkit.getServer().reload();
				
			}
			
		}, 160);
		
	}

}
