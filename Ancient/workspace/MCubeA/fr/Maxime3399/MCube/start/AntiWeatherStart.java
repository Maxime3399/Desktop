package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class AntiWeatherStart
{
  public AntiWeatherStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.ANTIWEATHER);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doWeatherCycle", "false");
    org.bukkit.Bukkit.getWorld("world").setWeatherDuration(0);
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doWeatherCycle", "true");
  }
}
