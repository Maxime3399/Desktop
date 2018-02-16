package fr.Maxime3399.ShinobiUtil.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;
import fr.Maxime3399.ShinobiUtil.managers.LifeManager;

public class MainScoreboard {
	
	public static void load(Player p){
		
		Arena arena = null;
		for(Arena a : ArenasManager.list){
			if(a.isIn(p)){
				arena = a;
			}
		}
		
	    ScoreboardManager sm = Bukkit.getScoreboardManager();
	    Scoreboard s = sm.getNewScoreboard();
	    Objective o = s.registerNewObjective("MainScore", "dummy");
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§6§lSHINOBI CRAFT");
	    
	    int count = 0;
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(count);
	    count--;
	    
	    Score s2 = o.getScore("§aVies :");
	    s2.setScore(count);
	    count--;
	    
	    for(Player pls : arena.getPlayers()){
	    	Score s3 = o.getScore("§b"+pls.getName()+" §e§l"+LifeManager.list.get(pls));
	    	s3.setScore(count);
	    	count--;
	    }
	    
	    p.setScoreboard(s);
		
	}

}
