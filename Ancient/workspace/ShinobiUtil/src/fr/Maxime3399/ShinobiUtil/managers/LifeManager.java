package fr.Maxime3399.ShinobiUtil.managers;

import java.util.HashMap;

import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.scoreboards.MainScoreboard;

public class LifeManager {
	
	public static HashMap<Player, Integer> list = new HashMap<>();
	
	public static void load(Player p){
		
		list.put(p, 5);
		Arena arena = null;
		for(Arena a : ArenasManager.list){
			if(a.isIn(p)){
				arena = a;
			}
		}
		for(Player pls : arena.getPlayers()){
			MainScoreboard.load(pls);
		}
	}

}
