package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class DoubleLifeStart
{
  public DoubleLifeStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.DOUBLELIFE);
    
    for (Player pls : Bukkit.getOnlinePlayers())
    {
      pls.setMaxHealth(40.0D);
      pls.setHealth(40.0D);
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
