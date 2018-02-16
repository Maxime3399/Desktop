package fr.Maxime3399.MCube.schedulers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class cancelVanishScheduler
{
  public cancelVanishScheduler() {}
  
  public static void start()
  {
    Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        ArrayList<Player> al = new ArrayList();
        
        for (Player pls : Bukkit.getOnlinePlayers())
        {
          if (fr.Maxime3399.MCube.MCubeAPI.getPlayerVanish(pls).equalsIgnoreCase("true"))
          {
            pls.getActivePotionEffects().removeAll(pls.getActivePotionEffects());
            al.add(pls);
          }
        }
        
        Iterator localIterator2;
        
        for (??? = al.iterator(); ???.hasNext(); 
            
            localIterator2.hasNext())
        {
          Player pz = (Player)???.next();
          
          localIterator2 = Bukkit.getOnlinePlayers().iterator(); continue;Player pls = (Player)localIterator2.next();
          
          if (!fr.Maxime3399.MCube.utils.selectStaff.isStaff(pls))
          {
            pls.hidePlayer(pz);

          }
          

        }
        
      }
      

    }, 20L, 20L);
  }
}
