package fr.Maxime3399.LastJumper.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class EndScoreboard {
	
	public static void loadScoreboard(Player p){
		
		String name = ArenasManager.playerArena.get(p);
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard s = sm.getNewScoreboard();
		Objective o = s.registerNewObjective("End3399", "dummy");
		
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§6§lLast Jumper");
		
		Score a1 = o.getScore("§0");
		a1.setScore(1);
		
		Score a2 = o.getScore("§2§l> §r§a"+ArenasManager.winner.get(name).getName());
		a2.setScore(0);
		
		p.setScoreboard(s);
		
	}

}
