package fr.Maxime3399.LastJumper.actions;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;

public class Jumper {
	
	public static HashMap<String, ArrayList<Player>> lister = new HashMap<>();
	public static HashMap<String, HashMap<Player, Player>> suiver = new HashMap<>();
	
	public static void createPlayer(Player p, String name){
		
		if(!lister.containsKey(name)){
			
			ArrayList<Player> list = new ArrayList<>();
			HashMap<Player, Player> suiv = new HashMap<>();
			lister.put(name, list);
			suiver.put(name, suiv);
			
		}
		
		ArrayList<Player> list = lister.get(name);
		HashMap<Player, Player> suiv = suiver.get(name);
		
		list.add(p);
		if(list.size() == 1){
			
			suiv.put(p, p);
			
		}else{
			
			int i = list.size()-2;
			suiv.put(p, list.get(0));
			suiv.put(list.get(i), p);
			
		}
		
		lister.put(name, list);
		suiver.put(name, suiv);
		
	}
	
	public static void removePlayer(Player p, String name){
		
		ArrayList<Player> list = lister.get(name);
		HashMap<Player, Player> suiv = suiver.get(name);
		
		int n = list.indexOf(p);
		
		if(n > 0){
			
			Player po = list.get(n-1);
			suiv.put(po, suiv.get(p));
			
		}else{
			
			Player po = list.get(list.size()-1);
			suiv.put(po, suiv.get(p));
			
		}
		
		list.remove(p);
		
		lister.put(name, list);
		suiver.put(name, suiv);
		
	}
	
	public static Player getSuiv(Player p, String name){
		
		HashMap<Player, Player> suiv = suiver.get(name);
		
		Player po = suiv.get(p);
		return po;
		
	}
	
	public static void selectJumper(Player p, String name){
		
		HashMap<Player, Player> suiv = suiver.get(name);
		Player po = suiv.get(p);
		
		ArenasManager.jumper.put(name, po);
		po.teleport(ArenasConfig.getLocation(name, "Jump"));
		po.setGameMode(GameMode.ADVENTURE);
		
	}

}
