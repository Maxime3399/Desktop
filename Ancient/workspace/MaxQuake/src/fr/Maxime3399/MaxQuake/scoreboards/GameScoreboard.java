package fr.Maxime3399.MaxQuake.scoreboards;

import java.text.SimpleDateFormat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.MaxQuake.actions.Timer;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.utils.PlayerClasser;

public class GameScoreboard {

	public static void loadScoreboard(Player p){
		
	    ScoreboardManager sm = Bukkit.getScoreboardManager();
	    Scoreboard s = sm.getNewScoreboard();
	    Objective o = s.registerNewObjective("GameSb", "dummy");
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§e§lQUAKECRAFT");
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(8);
	    
	    String time = "";
    	if(Timer.time > 60){
    		time = new SimpleDateFormat("m:ss").format(Timer.time*1000);
    	}else if(Timer.time > 9){
    		time = new SimpleDateFormat("ss").format(Timer.time*1000);
    	}else{
    		time = new SimpleDateFormat("s").format(Timer.time*1000);
    	}
	    Score s2 = o.getScore("§aTemps : §a"+time);
	    s2.setScore(7);
	    
	    Player p1 = PlayerClasser.getFirstPlayer();
	    Player p2 = PlayerClasser.getSecondPlayer();
	    Player p3 = PlayerClasser.getThirdPlayer();
	    int online = 0;
	    for(Player pls : Bukkit.getOnlinePlayers()){
	    	QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
	    	if(qp.getRole().equalsIgnoreCase("player")){
	    		online++;
	    	}
	    }
	    Score s3 = o.getScore("§aJoueurs : "+online);
	    s3.setScore(6);
	    
	    Score s4 = o.getScore("§1");
	    s4.setScore(5);
	    
	    Score s5 = o.getScore("§e"+p1.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p1).getCurrent_kills());
	    s5.setScore(4);
	    
	    if(p2 != null){
		    Score s6 = o.getScore("§e"+p2.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p2).getCurrent_kills());
		    s6.setScore(3);
	    }
	    
	    if(p3 != null){
		    Score s7 = o.getScore("§e"+p3.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p3).getCurrent_kills());
		    s7.setScore(2);
	    }
	    
	    Score s8 = o.getScore("§2");
	    s8.setScore(1);
	    
	    Score s9 = o.getScore("  §6§otest.maxime3399.fr");
	    s9.setScore(0);
	    
	    p.setScoreboard(s);
		
	}
	
}
