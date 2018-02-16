package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class EternalNightStart
{
  public EternalNightStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.ETERNALNIGHT);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doDaylightCycle", "false");
    org.bukkit.Bukkit.getWorld("world").setTime(15000L);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doDaylightCycle", "true");
  }
}
