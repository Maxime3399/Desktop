package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class EternalDayStart
{
  public EternalDayStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.ETERNALDAY);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doDaylightCycle", "false");
    org.bukkit.Bukkit.getWorld("world").setTime(1000L);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doDaylightCycle", "true");
  }
}
