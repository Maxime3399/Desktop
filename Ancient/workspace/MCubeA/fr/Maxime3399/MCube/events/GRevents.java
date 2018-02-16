package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.FlyPvpPatch;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

public class GRevents implements org.bukkit.event.Listener
{
  public GRevents() {}
  
  @EventHandler
  public void onDeath(PlayerDeathEvent e)
  {
    Player p = e.getEntity();
    int pt;
    if (GameState.isState(GameState.PVP))
    {
      if (e.getEntity().getKiller().getType() == EntityType.PLAYER)
      {
        Player pk = e.getEntity().getKiller();
        
        e.setKeepInventory(true);
        
        int pkt = 0;
        pt = 0;
        
        if (MCubeAPI.getPlayerTrophies(pk) > MCubeAPI.getPlayerTrophies(p))
        {
          pkt = 5;
          pt = 5;
        }
        else if (MCubeAPI.getPlayerTrophies(pk) < MCubeAPI.getPlayerTrophies(p))
        {
          pkt = 15;
          pt = 15;
        }
        else if (MCubeAPI.getPlayerTrophies(pk) == MCubeAPI.getPlayerTrophies(p))
        {
          pkt = 10;
          pt = 10;
        }
        

        MCubeAPI.setTrophies(pk, MCubeAPI.getPlayerTrophies(pk) + pkt);
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - pt);
        pk.sendMessage("§aTu as obtenu §e" + pkt + " trophés §a!");
        p.sendMessage("§cTu as perdu §c§l" + pt + " trophés §r§c!");
        
        e.setDeathMessage("§5" + p.getName() + " §r§6a été tué par §3" + pk.getName() + " §r§6!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          pls.playSound(pls.getLocation(), Sound.BLOCK_ANVIL_BREAK, 100.0F, 1.0F);
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
      }
      else
      {
        e.setDeathMessage("§5" + p.getName() + " §r§cest mort !");
        int trophies = MCubeAPI.getPlayerTrophies(p);
        if (trophies >= 20000)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 100);
          p.sendMessage("§cTu as perdu §r§c§l100 §r§ctrophés !");
        }
        else if (trophies >= 15000)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 90);
          p.sendMessage("§cTu as perdu §r§c§l90 §r§ctrophés !");
        }
        else if (trophies >= 11500)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 80);
          p.sendMessage("§cTu as perdu §r§c§l80 §r§ctrophés !");
        }
        else if (trophies >= 8500)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 70);
          p.sendMessage("§cTu as perdu §r§c§l70 §r§ctrophés !");
        }
        else if (trophies >= 6000)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 60);
          p.sendMessage("§cTu as perdu §r§c§l60 §r§ctrophés !");
        }
        else if (trophies >= 4000)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 50);
          p.sendMessage("§cTu as perdu §r§c§l50 §r§ctrophés !");
        }
        else if (trophies >= 2500)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 40);
          p.sendMessage("§cTu as perdu §r§c§l40 §r§ctrophés !");
        }
        else if (trophies >= 1500)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 30);
          p.sendMessage("§cTu as perdu §r§c§l30 §r§ctrophés !");


        }
        else if (trophies < 0)
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 10);
          p.sendMessage("§cTu as perdu §r§c§l10 §r§ctrophés !");
        }
        else
        {
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 20);
          p.sendMessage("§cTu as perdu §r§c§l20 §r§ctrophés !");
        }
        


        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        
      }
    }
    else
    {
      e.setDeathMessage("§5" + p.getName() + " §r§cest mort !");
      int trophies = MCubeAPI.getPlayerTrophies(p);
      if (trophies >= 20000)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 100);
        p.sendMessage("§cTu as perdu §r§c§l100 §r§ctrophés !");
      }
      else if (trophies >= 15000)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 90);
        p.sendMessage("§cTu as perdu §r§c§l90 §r§ctrophés !");
      }
      else if (trophies >= 11500)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 80);
        p.sendMessage("§cTu as perdu §r§c§l80 §r§ctrophés !");
      }
      else if (trophies >= 8500)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 70);
        p.sendMessage("§cTu as perdu §r§c§l70 §r§ctrophés !");
      }
      else if (trophies >= 6000)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 60);
        p.sendMessage("§cTu as perdu §r§c§l60 §r§ctrophés !");
      }
      else if (trophies >= 4000)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 50);
        p.sendMessage("§cTu as perdu §r§c§l50 §r§ctrophés !");
      }
      else if (trophies >= 2500)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 40);
        p.sendMessage("§cTu as perdu §r§c§l40 §r§ctrophés !");
      }
      else if (trophies >= 1500)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 30);
        p.sendMessage("§cTu as perdu §r§c§l30 §r§ctrophés !");


      }
      else if (trophies < 0)
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 10);
        p.sendMessage("§cTu as perdu §r§c§l10 §r§ctrophés !");
      }
      else
      {
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) - 20);
        p.sendMessage("§cTu as perdu §r§c§l20 §r§ctrophés !");
      }
      


      for (Player pls : Bukkit.getOnlinePlayers()) {
        ScoreboardGame.loadScoreboard(pls);
        DisplayNameUtils.setDisplayName(pls);
        pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_BURN, 100.0F, 2.0F);
      }
    }
  }
  


  @EventHandler
  public void onAchevment(PlayerAchievementAwardedEvent e)
  {
    MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
    e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
    e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 1.0F);
    for (Player pls : Bukkit.getOnlinePlayers()) {
      ScoreboardGame.loadScoreboard(pls);
      DisplayNameUtils.setDisplayName(pls);
    }
  }
  

  @EventHandler
  public void onDamage(EntityDamageByEntityEvent e)
  {
    if (!GameState.isState(GameState.PVP))
    {
      if (e.getEntity().getType() == EntityType.PLAYER)
      {
        if (e.getDamager().getType() == EntityType.PLAYER)
        {
          e.setCancelled(true);

        }
        
      }
      

    }
    else if (e.getEntity().getType() == EntityType.PLAYER)
    {
      if (e.getDamager().getType() == EntityType.PLAYER)
      {
        Player p1 = (Player)e.getEntity();
        if (p1.getAllowFlight()) {
          FlyPvpPatch.add((Player)e.getEntity());
        }
        Player p2 = (Player)e.getDamager();
        if (p2.getAllowFlight()) {
          FlyPvpPatch.add((Player)e.getDamager());
        }
      }
    }
  }
  





  @EventHandler
  public void onDeathMob(EntityDeathEvent e)
  {
    if (GameState.isState(GameState.MOBMONEY))
    {
      if ((e.getEntity().getType() != EntityType.PLAYER) || (e.getEntity().getType() == EntityType.CREEPER))
      {
        if ((e.getEntity().getKiller() == null) || (e.getEntity().getKiller().getType() != EntityType.PLAYER))
        {
          return;
        }
        

        fr.Maxime3399.MCube.actions.giveMoney.give(e.getEntity().getKiller(), 1);

      }
      

    }
    else if (GameState.isState(GameState.MOBTROPHIES))
    {
      if (e.getEntity().getType() != EntityType.PLAYER)
      {
        if ((e.getEntity().getKiller() == null) || (e.getEntity().getKiller().getType() != EntityType.PLAYER))
        {
          return;
        }
        

        MCubeAPI.setTrophies(e.getEntity().getKiller(), MCubeAPI.getPlayerTrophies(e.getEntity().getKiller()) + 1);
        e.getEntity().getKiller().sendMessage("§aTu as obtenu §r§e1 trophé §r§a!");
        e.getEntity().getKiller().playSound(e.getEntity().getKiller().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 1.0F);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
      }
    }
  }
}
