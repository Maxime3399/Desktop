package fr.Maxime3399.MCube.start;

import org.bukkit.Bukkit;

public class NoRegenStart
{
  public NoRegenStart() {}
  
  public static void start()
  {
    fr.Maxime3399.MCube.GameState.setState(fr.Maxime3399.MCube.GameState.NOREGEN);
    Bukkit.getWorld("world").setGameRuleValue("naturalRegeneration", "false");
    Bukkit.getWorld("world_nether").setGameRuleValue("naturalRegeneration", "false");
    Bukkit.getWorld("world_the_end").setGameRuleValue("naturalRegeneration", "false");
  }
  

  public static void stop()
  {
    fr.Maxime3399.MCube.GameState.setState(fr.Maxime3399.MCube.GameState.NONE);
    Bukkit.getWorld("world").setGameRuleValue("naturalRegeneration", "true");
    Bukkit.getWorld("world_nether").setGameRuleValue("naturalRegeneration", "true");
    Bukkit.getWorld("world_the_end").setGameRuleValue("naturalRegeneration", "true");
  }
}
