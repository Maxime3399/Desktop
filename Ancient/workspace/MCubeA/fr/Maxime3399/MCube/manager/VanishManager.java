package fr.Maxime3399.MCube.manager;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.cos.RemoveCosAction;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import fr.Maxime3399.MCube.utils.selectStaff;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public abstract interface VanishManager
{
  public static void setVanish(Player p)
  {
    if (MCubeAPI.getPlayerVanish(p).equalsIgnoreCase("true"))
    {
      MCubeAPI.setVanish(p, "false");
      DisplayNameUtils.setDisplayName(p);
      
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        
        if (selectStaff.isStaff(pls))
        {
          if (pls != p)
          {
            pls.sendMessage("§f§l" + p.getName() + " §r§en'est plus en vanish !");
          }
          else
          {
            p.sendMessage("§eTu n'es plus en vanish !");
          }
          

        }
        else {
          pls.showPlayer(p);
        }
      }
      


      Bukkit.broadcastMessage("§a§l+ §r" + p.getDisplayName());
    }
    else
    {
      MCubeAPI.setVanish(p, "true");
      RemoveCosAction.removeParticle(p, false);
      
      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        
        if (selectStaff.isStaff(pls))
        {
          if (pls != p)
          {
            pls.sendMessage("§f§l" + p.getName() + " §r§eest en vanish !");
          }
          else
          {
            p.sendMessage("§eTu es maintenant en vanish !");
          }
          

        }
        else {
          pls.hidePlayer(p);
        }
      }
      


      Bukkit.broadcastMessage("§c§l- §r" + p.getDisplayName());
      DisplayNameUtils.setDisplayName(p);
    }
  }
}
