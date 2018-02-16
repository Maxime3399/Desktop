package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class HalfLifeStart
{
  public HalfLifeStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.HALFLIFE);
    
    for (Player pls : Bukkit.getOnlinePlayers())
    {
      pls.setMaxHealth(10.0D);
      pls.setHealth(10.0D);
    }
  }
  



  public static void stop()
  {
    GameState.setState(GameState.NONE);
    
    for (Player pls : Bukkit.getOnlinePlayers())
    {
      pls.setMaxHealth(20.0D);
      pls.setHealth(20.0D);
    }
  }
}
