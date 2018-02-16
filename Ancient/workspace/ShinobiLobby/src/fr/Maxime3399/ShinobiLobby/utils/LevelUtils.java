package fr.Maxime3399.ShinobiLobby.utils;

import org.bukkit.entity.Player;

public class LevelUtils {
	
	public static void setLevel(Player p){
		
		int lvl = DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "lvl");
		int xp = DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "xp");
		
		if(lvl == -1){
			lvl = 0;
		}
		
		if(xp == 0){
			
			p.setExp(0);
			
		}else{
			
			int require = lvl*3;
			
			if(lvl == 0){
				require = 1;
			}
			
			float bar = xp*100;
			bar = bar/require;
			bar = bar/100;
			
			p.setExp(bar);
			
		}
		
		p.setLevel(lvl);
		
	}

}
