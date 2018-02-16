package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.quests.TestEndQuest;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class giveMoney{
  
  @SuppressWarnings("deprecation")
public static void give(Player p, int coins){
	  
    int multi = 1;
    
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) {
      multi = 1;
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) {
      multi = 1;
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) {
      multi = 2;
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) {
      multi = 3;
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) {
      multi = 4;
    } else {
      multi = 5;
    }
    
    coins *= multi;
    
    p.sendMessage("§aTu as obtenu §6" + coins + " coins §a!");
    p.playSound(p.getLocation(), Sound.ENCHANT_THORNS_HIT, 100, 2);
    MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + coins);
    MainClass.getEcononomy().depositPlayer(p.getName(), coins);
    for (Player pls : Bukkit.getOnlinePlayers()) {
      ScoreboardGame.loadScoreboard(pls);
    }
    
    if (MCubeAPI.getCurrentQuest(p) == 45) {
      MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + coins);
      TestEndQuest.test(p);
    }
    
  }
  
}
