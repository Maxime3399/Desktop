package fr.Maxime3399.MCube.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class RestartScoreboard {
	
	public static void loadScoreboard(Player p){
		
	    ScoreboardManager sm = Bukkit.getScoreboardManager();
	    Scoreboard s = sm.getNewScoreboard();
	    Objective o = s.registerNewObjective("RestartScore", "dummy");
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§6§lM-CUBE");
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(3);
	    
	    Score s2 = o.getScore("§cRedémarrage...");
	    s2.setScore(2);
	    
	    Score s3 = o.getScore("§1");
	    s3.setScore(1);
	    
	    Score s4 = o.getScore("  §e§omaxime3399.fr");
	    s4.setScore(0);
		
	    p.setScoreboard(s);
	    
	}

}
