package fr.Maxime3399.LastJumper.scoreboards;

import java.text.SimpleDateFormat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class WaitScoreboard {
	
	public static void loadScoreboard(Player p){
		
		String name = ArenasManager.playerArena.get(p);
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard s = sm.getNewScoreboard();
		Objective o = s.registerNewObjective("Wait3399", "dummy");
		
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§6§lLast Jumper");
		
		Score a1 = o.getScore("§0");
		a1.setScore(2);
		
		if(ArenasManager.startingTime.get(name) != 3399){
			String time = "";
			if(ArenasManager.startingTime.get(name) >= 600){
				time = new SimpleDateFormat("mm:ss").format(ArenasManager.startingTime.get(name)*1000);
			}else if(ArenasManager.startingTime.get(name) >= 60){
				time = new SimpleDateFormat("m:ss").format(ArenasManager.startingTime.get(name)*1000);
			}else if(ArenasManager.startingTime.get(name) >= 10){
				time = new SimpleDateFormat("ss").format(ArenasManager.startingTime.get(name)*1000);
			}else{
				time = new SimpleDateFormat("s").format(ArenasManager.startingTime.get(name)*1000);
			}
			Score a2 = o.getScore("§eTime : §l"+time);
			a2.setScore(1);
		}else{
			Score a2 = o.getScore("§eTime : §r§4§l✘");
			a2.setScore(1);
		}
		
		Score a3 = o.getScore("§bPlayers : §l"+ArenasManager.arenaCount.get(name));
		a3.setScore(0);
		
		p.setScoreboard(s);
		
	}

}
