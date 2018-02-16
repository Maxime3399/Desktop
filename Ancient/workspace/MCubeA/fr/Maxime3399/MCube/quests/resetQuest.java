package fr.Maxime3399.MCube.quests;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class resetQuest
{
  public resetQuest() {}
  
  public static void reset(Player p)
  {
    MCubeAPI.setCurrentQuest(p, MCubeAPI.getCurrentQuest(p) + 1);
    MCubeAPI.setQuest(p, 1, 0);
    MCubeAPI.setQuest(p, 2, 0);
    MCubeAPI.setQuest(p, 3, 0);
    MCubeAPI.setQuest(p, 4, 0);
    MCubeAPI.setQuest(p, 5, 0);
    
    for (Player pls : Bukkit.getOnlinePlayers()) {
      fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(pls);
      DisplayNameUtils.setDisplayName(pls);
    }
  }
}
