package fr.Maxime3399.MCube.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class MainScoreboard {
	
	public static void loadScoreboard(Player p){
		
	    ScoreboardManager sm = Bukkit.getScoreboardManager();
	    Scoreboard s = sm.getNewScoreboard();
	    Objective o = s.registerNewObjective("MainScore", "dummy");
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§6§lM-CUBE");
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(9);
	    
	    int onlinePlayers = Bukkit.getOnlinePlayers().size();
	    Score s2 = null;
	    if(onlinePlayers >= 6){
	    	s2 = o.getScore("§aJoueurs : §c"+onlinePlayers);
	    }else{
	    	s2 = o.getScore("§aJoueurs : "+onlinePlayers);
	    }
	    s2.setScore(8);
	    
	    Score s3 = o.getScore("  §b"+DisplayerUtils.getEventName());
	    s3.setScore(7);
	    
	    Score s4 = o.getScore("§1");
	    s4.setScore(6);
	    
	    CustomPlayer cp = new CustomPlayer(p);
	    
	    Score s5 = o.getScore("§eCoins : "+cp.getCoins());
	    s5.setScore(5);
	    
	    Score s6 = o.getScore("§6Trophés : "+cp.getTrophies());
	    s6.setScore(4);
	    
	    Score s7 = o.getScore("§2Crystals : "+cp.getCrystals());
	    s7.setScore(3);
	    
	    Score s8 = null;
	    if(cp.getQuest() <= 3){
	    	s8 = o.getScore("§cQuête : "+cp.getQuest());
	    }else{
	    	s8 = o.getScore("§cQuête : §4§l✘");
	    }
	    s8.setScore(2);
	    
	    Score s9 = o.getScore("§2");
	    s9.setScore(1);
	    
	    Score s10 = o.getScore("  §e§omaxime3399.fr");
	    s10.setScore(0);
	    
	    p.setScoreboard(s);
		
	}

}
