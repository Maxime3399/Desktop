package fr.Maxime3399.MCube.start;

import fr.Maxime3399.MCube.GameState;

public class AntiSpawnStart
{
  public AntiSpawnStart() {}
  
  public static void start()
  {
    GameState.setState(GameState.ANTISPAWN);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doMobSpawning", "false");
  }
  

  public static void stop()
  {
    GameState.setState(GameState.NONE);
    org.bukkit.Bukkit.getWorld("world").setGameRuleValue("doMobSpawning", "true");
  }
}
