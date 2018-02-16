package fr.Maxime3399.LastJumper.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class GameScoreboard {
	
	public static void loadScoreboard(Player p){
		
		String name = ArenasManager.playerArena.get(p);
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard s = sm.getNewScoreboard();
		Objective o = s.registerNewObjective("Game3399", "dummy");
		
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§6§lLast Jumper");
		
		if(Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("Lifes") >= 1){
			
			Score a1 = o.getScore("§0");
			a1.setScore(3);
			
			Score a2 = o.getScore("§dSurvivors : §l"+ArenasManager.livePlayers.get(name));
			a2.setScore(2);

			Score a3 = o.getScore("§9> §b§l"+ArenasManager.jumper.get(name).getName());
			a3.setScore(1);
			
			Score a4 = o.getScore("§aLifes : §l"+ArenasManager.lifes.get(p));
			a4.setScore(0);
			
		}else{
			
			Score a1 = o.getScore("§0");
			a1.setScore(2);
			
			Score a2 = o.getScore("§dSurvivors : §l"+ArenasManager.livePlayers.get(name));
			a2.setScore(1);

			Score a3 = o.getScore("§9> §b§l"+ArenasManager.jumper.get(name).getName());
			a3.setScore(0);
			
		}
		
		p.setScoreboard(s);
		
	}

}
