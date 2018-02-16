package fr.Maxime3399.MCube.quests;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TestEndQuest
{
  public TestEndQuest() {}
  
  public static void test(Player p)
  {
    if ((MCubeAPI.getCurrentQuest(p) == 8) && (MCubeAPI.getQuest(p, 1) >= 8))
    {
      p.sendMessage("§aTu as terminé la quête 8 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 9) && (MCubeAPI.getQuest(p, 1) >= 12))
    {
      p.sendMessage("§aTu as terminé la quête 9 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 10) && (MCubeAPI.getQuest(p, 1) >= 16))
    {
      p.sendMessage("§aTu as terminé la quête 10 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 11) && (MCubeAPI.getQuest(p, 1) >= 64) && (MCubeAPI.getQuest(p, 2) >= 32))
    {
      p.sendMessage("§aTu as terminé la quête 11 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 12) && (MCubeAPI.getQuest(p, 1) >= 8))
    {
      p.sendMessage("§aTu as terminé la quête 12 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 13) && (MCubeAPI.getQuest(p, 1) >= 6))
    {
      p.sendMessage("§aTu as terminé la quête 13 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 14) && (MCubeAPI.getQuest(p, 1) >= 1))
    {
      p.sendMessage("§aTu as terminé la quête 14 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 15) && (MCubeAPI.getQuest(p, 1) >= 1) && (MCubeAPI.getQuest(p, 2) >= 9))
    {
      p.sendMessage("§aTu as terminé la quête 15 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 16) && (MCubeAPI.getQuest(p, 1) >= 64))
    {
      p.sendMessage("§aTu as terminé la quête 16 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 17) && (MCubeAPI.getQuest(p, 1) >= 32))
    {
      p.sendMessage("§aTu as terminé la quête 17 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 18) && (MCubeAPI.getQuest(p, 1) >= 1))
    {
      p.sendMessage("§aTu as terminé la quête 18 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 19) && (MCubeAPI.getQuest(p, 1) >= 20))
    {
      p.sendMessage("§aTu as terminé la quête 19 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 20) && (MCubeAPI.getQuest(p, 1) >= 64))
    {
      p.sendMessage("§aTu as terminé la quête 20 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 21) && (MCubeAPI.getQuest(p, 1) >= 5))
    {
      p.sendMessage("§aTu as terminé la quête 21 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 22) && (MCubeAPI.getQuest(p, 1) >= 7))
    {
      p.sendMessage("§aTu as terminé la quête 22 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 23) && (MCubeAPI.getQuest(p, 1) >= 30) && (MCubeAPI.getQuest(p, 2) >= 30) && (MCubeAPI.getQuest(p, 3) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 23 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 24) && (MCubeAPI.getQuest(p, 1) >= 60) && (MCubeAPI.getQuest(p, 2) >= 40))
    {
      p.sendMessage("§aTu as terminé la quête 24 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 25) && (MCubeAPI.getQuest(p, 1) >= 60) && (MCubeAPI.getQuest(p, 2) >= 60))
    {
      p.sendMessage("§aTu as terminé la quête 25 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 26) && (MCubeAPI.getQuest(p, 1) >= 50) && (MCubeAPI.getQuest(p, 2) >= 70))
    {
      p.sendMessage("§aTu as terminé la quête 26 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 27) && (MCubeAPI.getQuest(p, 1) >= 60) && (MCubeAPI.getQuest(p, 2) >= 40))
    {
      p.sendMessage("§aTu as terminé la quête 27 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 28) && (MCubeAPI.getQuest(p, 1) >= 80) && (MCubeAPI.getQuest(p, 2) >= 10))
    {
      p.sendMessage("§aTu as terminé la quête 28 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 29) && (MCubeAPI.getQuest(p, 1) >= 40) && (MCubeAPI.getQuest(p, 2) >= 10))
    {
      p.sendMessage("§aTu as terminé la quête 29 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 30) && (MCubeAPI.getQuest(p, 1) >= 10))
    {
      p.sendMessage("§aTu as terminé la quête 30 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 31) && (MCubeAPI.getQuest(p, 1) >= 20) && (MCubeAPI.getQuest(p, 2) >= 3))
    {
      p.sendMessage("§aTu as terminé la quête 31 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 32) && (MCubeAPI.getQuest(p, 1) >= 8) && (MCubeAPI.getQuest(p, 2) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 32 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 33) && (MCubeAPI.getQuest(p, 1) >= 12))
    {
      p.sendMessage("§aTu as terminé la quête 33 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 34) && (MCubeAPI.getQuest(p, 1) >= 40))
    {
      p.sendMessage("§aTu as terminé la quête 34 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 35) && (MCubeAPI.getQuest(p, 1) >= 60))
    {
      p.sendMessage("§aTu as terminé la quête 35 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 36) && (MCubeAPI.getQuest(p, 1) >= 350))
    {
      p.sendMessage("§aTu as terminé la quête 36 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 37) && (MCubeAPI.getQuest(p, 1) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 37 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 38) && (MCubeAPI.getQuest(p, 1) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 38 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 39) && (MCubeAPI.getQuest(p, 1) >= 5))
    {
      p.sendMessage("§aTu as terminé la quête 39 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 40) && (MCubeAPI.getQuest(p, 1) >= 10))
    {
      p.sendMessage("§aTu as terminé la quête 40 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 41) && (MCubeAPI.getQuest(p, 1) >= 50))
    {
      p.sendMessage("§aTu as terminé la quête 41 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 42) && (MCubeAPI.getQuest(p, 1) >= 40) && (MCubeAPI.getQuest(p, 2) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 42 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 43) && (MCubeAPI.getQuest(p, 1) >= 30))
    {
      p.sendMessage("§aTu as terminé la quête 43 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    else if ((MCubeAPI.getCurrentQuest(p) == 44) && (MCubeAPI.getQuest(p, 1) >= 10))
    {
      p.sendMessage("§aTu as terminé la quête 44 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      fr.Maxime3399.MCube.actions.giveMoney.give(p, 5);
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
    
    if ((MCubeAPI.getCurrentQuest(p) == 45) && (MCubeAPI.getQuest(p, 1) >= 100))
    {
      p.sendMessage("§aTu as terminé la quête 45 !");
      MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 30);
      p.sendMessage("§aTu as obtenus §e30 trophés §r§a!");
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
      }
      resetQuest.reset(p);
    }
  }
}
