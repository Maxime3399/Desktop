package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.DataUpgrade;
import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.actions.giveChest;
import fr.Maxime3399.MCube.actions.setPermissions;
import fr.Maxime3399.MCube.cos.CosStartManager;
import fr.Maxime3399.MCube.cos.morphingPlayer;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import fr.Maxime3399.MCube.schedulers.sentinelScheduler;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.MCUtilsFonction;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class PlayerJoin implements Listener
{
  public PlayerJoin() {}
  
  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    final Player p = e.getPlayer();
    
    MCubeAPI.chargePlayerData(p);
    DataUpgrade.upgrade(p);
    fr.Maxime3399.MCube.utils.DisplayNameUtils.setDisplayName(p);
    setPermissions.set(p);
    
    for (Player pls : Bukkit.getOnlinePlayers()) {
      if (!pls.getLocation().getWorld().getName().equalsIgnoreCase("spawn")) {
        ScoreboardGame.loadScoreboard(pls);
      }
    }
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        if (p != null) {
          fr.Maxime3399.MCube.actions.SendConnectMessage.send(p);
        }
      }
    }, 10L);
    
    p.setWalkSpeed(0.2F);
    p.setMaxHealth(20.0D);
    p.setHealth(20.0D);
    p.setFoodLevel(20);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run()
      {
        giveChest.setup(p);
      }
      

    }, 20L);
    
    if (!MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin"))
    {
      if (MCUtilsFonction.maintenance.equalsIgnoreCase("true"))
      {
        p.kickPlayer(Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("MaintenanceMessage").replaceAll("&", "§"));
      }
      

      if (MCUtilsFonction.close.equalsIgnoreCase("true"))
      {
        p.kickPlayer(Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("CloseMessage").replaceAll("&", "§"));
      }
      

      for (Player pls : Bukkit.getOnlinePlayers())
      {
        if (pls != p)
        {
          if (MCubeAPI.getPlayerVanish(pls).equalsIgnoreCase("true"))
          {
            if (fr.Maxime3399.MCube.utils.selectStaff.isStaff(pls))
            {
              p.sendMessage("§f§l" + p.getName() + " §r§eest en vanish !");
            }
            else
            {
              p.hidePlayer(pls);
            }
          }
        }
      }
    }
    





    if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("true"))
    {
      if (sentinelScheduler.s == 0) {
        sentinelScheduler.s = 1;
        sentinelScheduler.start();
      }
      SentinelFunction.add(p);
    }
    

    CosStartManager.registerCosmetics();
    
    MCubeAPI.setCoins(p, (int)fr.Maxime3399.MCube.MainClass.getEcononomy().getBalance(p.getName()));
    ScoreboardGame.loadScoreboard(p);
    
    if (!MCubeAPI.getPlayerVanish(p).equalsIgnoreCase("true")) {
      e.setJoinMessage("§a§l+ §r" + p.getDisplayName());
    } else {
      e.setJoinMessage(null);
    }
    
    if (p.getGameMode() != GameMode.SURVIVAL)
    {
      Location loc = new Location(Bukkit.getWorld("world"), -303.5D, 66.1D, 383.5D);
      p.teleport(loc);
      p.setGameMode(GameMode.SURVIVAL);
    }
    

    if (GameState.isState(GameState.NOFOOD))
    {
      p.setFoodLevel(22);
    }
    

    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+")))
    {
      p.setAllowFlight(true);
      if (!p.isOnGround()) {
        p.setFlying(true);
      }
    }
    


    if (GameState.isState(GameState.DOUBLELIFE)) {
      p.setMaxHealth(40.0D);
      p.setHealth(40.0D);
    } else if (GameState.isState(GameState.HALFLIFE)) {
      p.setMaxHealth(10.0D);
      p.setHealth(10.0D);
    } else {
      p.setMaxHealth(20.0D);
      if (p.getHealth() > 20.0D) {
        p.setHealth(20.0D);
      }
    }
    
    morphingPlayer.morph(p);
    if ((MCubeAPI.getActiveCos(p).contains("villager")) && (MCubeAPI.getCurrentQuest(p) >= 46)) {
      fr.Maxime3399.MCube.cos.RemoveCosAction.removeMorph(p, true);
    }
  }
}
