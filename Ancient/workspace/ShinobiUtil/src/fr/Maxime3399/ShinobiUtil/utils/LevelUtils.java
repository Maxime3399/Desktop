package fr.Maxime3399.ShinobiUtil.utils;

import org.bukkit.entity.Player;

public class LevelUtils {
	
	public static void setLevel(Player p, int rem){
		
		int lvl = p.getLevel()-rem;
		int require = 50;
		
		if(lvl <= 0){
			require = 1;
			lvl = 0;
		}
		
		float bar = lvl*100;
		bar = bar/require;
		bar = bar/100;
		
		p.setExp(bar);
		
		p.setLevel(lvl);
		
	}

}
