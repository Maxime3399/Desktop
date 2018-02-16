package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;
import org.bukkit.entity.Player;

public class NoFoodStart
{
  public NoFoodStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.NOFOOD);
    
    for (Player pls : org.bukkit.Bukkit.getOnlinePlayers()) {
      pls.setFoodLevel(22);
    }
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
  }
}
