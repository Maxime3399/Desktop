package fr.Maxime3399.MCube.start;

import org.bukkit.Bukkit;

public class KeepInventoryStart
{
  public KeepInventoryStart() {}
  
  public static void start()
  {
    fr.Maxime3399.MCube.GameState.setState(fr.Maxime3399.MCube.GameState.KEEPINVENTORY);
    Bukkit.getWorld("world").setGameRuleValue("keepInventory", "true");
    Bukkit.getWorld("world_nether").setGameRuleValue("keepInventory", "true");
    Bukkit.getWorld("world_the_end").setGameRuleValue("keepInventory", "true");
  }
  

  public static void stop()
  {
    fr.Maxime3399.MCube.GameState.setState(fr.Maxime3399.MCube.GameState.NONE);
    Bukkit.getWorld("world").setGameRuleValue("keepInventory", "false");
    Bukkit.getWorld("world_nether").setGameRuleValue("keepInventory", "false");
    Bukkit.getWorld("world_the_end").setGameRuleValue("keepInventory", "false");
  }
}
