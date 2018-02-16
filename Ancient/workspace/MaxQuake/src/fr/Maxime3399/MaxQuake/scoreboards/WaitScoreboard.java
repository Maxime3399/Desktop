package fr.Maxime3399.MaxQuake.scoreboards;

import java.text.SimpleDateFormat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.MaxQuake.events.PlayerJoin;

public class WaitScoreboard {
	
	public static void loadScoreboard(Player p){
		
	    ScoreboardManager sm = Bukkit.getScoreboardManager();
	    Scoreboard s = sm.getNewScoreboard();
	    Objective o = s.registerNewObjective("WaitSb", "dummy");
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§e§lQUAKECRAFT");
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(4);
	    
	    String time = "§4§lX";
	    if(PlayerJoin.time != 31){
	    	if(PlayerJoin.time > 60){
	    		time = new SimpleDateFormat("m:ss").format(PlayerJoin.time*1000);
	    	}else if(PlayerJoin.time > 9){
	    		time = new SimpleDateFormat("ss").format(PlayerJoin.time*1000);
	    	}else{
	    		time = new SimpleDateFormat("s").format(PlayerJoin.time*1000);
	    	}
	    }
	    Score s2 = o.getScore("§aDébut : §a"+time);
	    s2.setScore(3);
	    
	    Score s3 = o.getScore("§aJoueurs : "+Bukkit.getOnlinePlayers().size());
	    s3.setScore(2);
	    
	    Score s4 = o.getScore("§1");
	    s4.setScore(1);
	    
	    Score s5 = o.getScore("  §6§otest.maxime3399.fr");
	    s5.setScore(0);
	    
	    p.setScoreboard(s);
		
	}

}
