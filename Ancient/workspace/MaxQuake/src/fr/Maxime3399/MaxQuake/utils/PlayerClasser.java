package fr.Maxime3399.MaxQuake.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class PlayerClasser {
	
	public static Player first = null;
	public static Player second = null;
	public static Player third = null;
	
	public static Player getFirstPlayer(){
		
		Player p = null;
		
		for(Player pls : Bukkit.getOnlinePlayers()){
			
			if(p == null){
				
				p = pls;
				
			}else{
				
				QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
				QuakePlayer qpZ = PlayersManagers.getQuakePlayer(p);
				if(qp.getCurrent_kills() > qpZ.getCurrent_kills()){
					p = pls;
				}
				
			}
			
		}
		
		first = p;
		
		return p;
		
	}
	
	public static Player getSecondPlayer(){
		
		Player p = null;
		
		for(Player pls : Bukkit.getOnlinePlayers()){
			
			if(pls != first){
				
				if(p == null){
					
					p = pls;
					
				}else{
					
					QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
					QuakePlayer qpZ = PlayersManagers.getQuakePlayer(p);
					if(qp.getCurrent_kills() >= qpZ.getCurrent_kills()){
						p = pls;
					}
					
				}
				
			}
			
		}
		
		second = p;
		
		return p;
		
	}
	
	public static Player getThirdPlayer(){
		
		Player p = null;
		
		for(Player pls : Bukkit.getOnlinePlayers()){
			
			if(pls != first && pls != second){
				
				if(p == null){
					
					p = pls;
					
				}else{
					
					QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
					QuakePlayer qpZ = PlayersManagers.getQuakePlayer(p);
					if(qp.getCurrent_kills() >= qpZ.getCurrent_kills()){
						p = pls;
					}
					
				}
				
			}
			
		}
		
		third = p;
		
		return p;
		
	}

}
