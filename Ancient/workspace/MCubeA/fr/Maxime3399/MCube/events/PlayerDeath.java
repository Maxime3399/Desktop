package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.cos.startDeathEffect;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand.EnumClientCommand;
import net.minecraft.server.v1_12_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class PlayerDeath implements Listener
{
  HashMap<Player, Location> hm = new HashMap();
  public static ArrayList<Player> al = new ArrayList();
  HashMap<Player, Location> respawn = new HashMap();
  
  public PlayerDeath() {}
  
  @EventHandler
  public void onDeath(PlayerDeathEvent e) { final Player p = e.getEntity();
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {

      public void run()
      {
        PacketPlayInClientCommand packet = new PacketPlayInClientCommand(PacketPlayInClientCommand.EnumClientCommand.PERFORM_RESPAWN);
        pgetHandleplayerConnection.a(packet);
      }
      

    }, 20L);
  }
  

  @EventHandler
  public void onDamage(EntityDamageEvent e)
  {
    if (e.getEntity().getType() == org.bukkit.entity.EntityType.PLAYER)
    {
      Player p = (Player)e.getEntity();
      
      if (e.getDamage() >= p.getHealth())
      {
        hm.put(p, p.getLocation());
        startDeathEffect.start(p);
        al.add(p);
      }
    }
  }
  



  @EventHandler
  public void onRespawn(PlayerRespawnEvent e)
  {
    final Player p = e.getPlayer();
    
    p.setGameMode(GameMode.SPECTATOR);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        respawn.put(p, p.getLocation());
        p.teleport((Location)hm.get(p));
        p.sendMessage("§eRespawn dans §e§l5 §r§esecondes !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_STEP, 100.0F, 2.0F);
      }
    }, 10L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        p.sendMessage("§eRespawn dans §e§l4 §r§esecondes !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_STEP, 100.0F, 2.0F);
      }
    }, 30L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        p.sendMessage("§eRespawn dans §e§l3 §r§esecondes !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_STEP, 100.0F, 2.0F);
      }
    }, 50L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        p.sendMessage("§eRespawn dans §e§l2 §r§esecondes !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_STEP, 100.0F, 2.0F);
      }
    }, 70L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        p.sendMessage("§eRespawn dans §e§l1 §r§esecondes !");
        p.playSound(p.getLocation(), Sound.BLOCK_GRASS_STEP, 100.0F, 2.0F);
      }
    }, 90L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run()
      {
        p.teleport((Location)respawn.get(p));
        p.setGameMode(GameMode.SURVIVAL);
        if (fr.Maxime3399.MCube.MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) {
          p.setAllowFlight(true);
        }
        PlayerDeath.al.remove(p);
      }
      
    }, 120L);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        PlayerDeath.al.remove(p);
      }
    }, 122L);
  }
  

  @EventHandler
  public void onMove(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    
    if (al.contains(p))
    {
      e.setCancelled(true);
    }
  }
}
