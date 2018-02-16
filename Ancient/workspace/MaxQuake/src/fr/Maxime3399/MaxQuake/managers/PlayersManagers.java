package fr.Maxime3399.MaxQuake.managers;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.utils.DataUtils;

public class PlayersManagers {
	
	private static ArrayList<QuakePlayer> list = new ArrayList<>();
	
	public static void addPlayer(Player p){
		
		DataUtils.registerPlayer(p);
		QuakePlayer qp = new QuakePlayer(p);
		if(!qp.getName().equalsIgnoreCase(p.getName())){
			qp.setName(p.getName());
		}
		list.add(qp);
		
	}
	
	public static void removePlayer(Player p){
		
		QuakePlayer qp = getQuakePlayer(p);
		
		if(qp != null){
			
			list.remove(qp);
			
		}
		
	}
	
	public static void removePlayer(QuakePlayer qp){
		
		if(qp != null){
			
			list.remove(qp);
			
		}
		
	}
	
	public static QuakePlayer getQuakePlayer(Player p){
		
		QuakePlayer qp = null;
		for(QuakePlayer qps : list){
			if(qps.getName().equalsIgnoreCase(p.getName())){
				qp = qps;
			}
		}
		
		return qp;
		
	}

}
