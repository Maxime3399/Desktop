package fr.Maxime3399.MCube.scoreboards;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardGame
{
  public ScoreboardGame() {}
  
  public static void loadScoreboard(Player p)
  {
    ScoreboardManager sm = Bukkit.getScoreboardManager();
    Scoreboard s = sm.getNewScoreboard();
    Objective o = s.registerNewObjective("ScoreboardGame", "dummy");
    
    o.setDisplaySlot(DisplaySlot.SIDEBAR);
    o.setDisplayName("§6§lM-CUBE");
    
    Score a1 = o.getScore("§0");
    a1.setScore(11);
    int mc = 0;
    for (Player pls : Bukkit.getOnlinePlayers()) {
      if (!MCubeAPI.getPlayerVanish(pls).equalsIgnoreCase("true")) {
        mc++;
      }
    }
    if (mc >= 8) {
      Score a2 = o.getScore("§aJoueurs : §r§6§l" + mc);
      a2.setScore(10);
    } else {
      Score a2 = o.getScore("§aJoueurs : §r§a§l" + mc);
      a2.setScore(10);
    }
    Score a3 = o.getScore("§eTrophés : §r§e§l" + MCubeAPI.getPlayerTrophies(p));
    a3.setScore(9);
    Score a4 = o.getScore("§6Coins : §r§6§l" + MCubeAPI.getPlayerCoins(p));
    a4.setScore(8);
    Score a5 = null;
    if (MCubeAPI.getCurrentQuest(p) == 46) {
      a5 = o.getScore("§cQuête : §r§4§lX");
    } else {
      a5 = o.getScore("§cQuête : §r§c§l" + MCubeAPI.getCurrentQuest(p));
    }
    a5.setScore(7);
    if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("true")) {
      String time = new SimpleDateFormat("mm:ss").format(new Date(MCubeAPI.getSentinel(p) * 1000));
      Score a6 = o.getScore("§dSentinnel : §r§d§l" + time);
      a6.setScore(6);
    }
    Score a7 = o.getScore("§1");
    a7.setScore(5);
    Score a8 = o.getScore("§9§l> §r§3Evènements :");
    a8.setScore(4);
    Score a9 = null;
    if (GameState.isState(GameState.ETERNALDAY)) {
      a9 = o.getScore(" §f§l- §r§bEternal Day");
    } else if (GameState.isState(GameState.ETERNALNIGHT)) {
      a9 = o.getScore(" §f§l- §r§bEternal Night");
    } else if (GameState.isState(GameState.PVP)) {
      a9 = o.getScore("  §f§l- §r§bPvP");
    } else if (GameState.isState(GameState.KEEPINVENTORY)) {
      a9 = o.getScore("  §f§l- §r§bKeep Inventory");
    } else if (GameState.isState(GameState.MOBMONEY)) {
      a9 = o.getScore("  §f§l- §r§bMob Money");
    } else if (GameState.isState(GameState.MOBTROPHIES)) {
      a9 = o.getScore("  §f§l- §r§bMob Trophies");
    } else if (GameState.isState(GameState.DOUBLELIFE)) {
      a9 = o.getScore("  §f§l- §r§bDouble Life");
    } else if (GameState.isState(GameState.MONEYTIME)) {
      a9 = o.getScore("  §f§l- §r§bMoney Time");
    } else if (GameState.isState(GameState.TROPHIESTIME)) {
      a9 = o.getScore("  §f§l- §r§bTrophies Time");
    } else if (GameState.isState(GameState.ANTIWEATHER)) {
      a9 = o.getScore("  §f§l- §r§bAnti Weather");
    } else if (GameState.isState(GameState.NOFOOD)) {
      a9 = o.getScore("  §f§l- §r§bNo Food");
    } else if (GameState.isState(GameState.NOREGEN)) {
      a9 = o.getScore("  §f§l- §r§bNo Regen");
    } else if (GameState.isState(GameState.USELESSEVNT)) {
      a9 = o.getScore("  §f§l- §r§bUseless Event");
    } else if (GameState.isState(GameState.HASTE)) {
      a9 = o.getScore("  §f§l- §r§bHaste");
    } else if (GameState.isState(GameState.ANTISPAWN)) {
      a9 = o.getScore("  §f§l- §r§bAnti Spawn");
    } else if (GameState.isState(GameState.CHESTFINDER)) {
      a9 = o.getScore("  §f§l- §r§bChest Finder");
    } else if (GameState.isState(GameState.HALFLIFE)) {
      a9 = o.getScore("  §f§l- §r§bHalf Life");
    } else {
      a9 = o.getScore("      §5§l*****");
    }
    a9.setScore(3);
    
    Score a10 = null;
    if (MainClass.specialevent.equalsIgnoreCase("pâques")) {
      a10 = o.getScore("  §f§l- §r§bPâques");
    } else {
      a10 = o.getScore("      §5§l*****");
    }
    a10.setScore(2);
    
    Score a11 = o.getScore("§2");
    a11.setScore(1);
    
    Score a12 = o.getScore("   §e§omaxime3399.fr");
    a12.setScore(0);
    
    p.setScoreboard(s);
  }
}
