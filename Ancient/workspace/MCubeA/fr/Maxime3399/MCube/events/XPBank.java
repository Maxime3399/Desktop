package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import java.util.Iterator;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.PluginManager;

public class XPBank implements org.bukkit.event.Listener
{
  public XPBank() {}
  
  @org.bukkit.event.EventHandler
  public void createSign(SignChangeEvent e)
  {
    if (e.getLine(0).equalsIgnoreCase("[xpbank]"))
    {
      e.setLine(0, "§6§l[§r§6XP Bank§r§6§l]");
      e.setLine(1, "§k||||||||");
      e.setLine(2, "§50");
      e.setLine(3, "§1§l=====");
    }
    

    for (final Player pls : Bukkit.getOnlinePlayers()) {
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run()
        {
          MCubeAPI.setCoins(pls, (int)MainClass.getEcononomy().getBalance(pls.getName()));
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
          {
            public void run() {
              ScoreboardGame.loadScoreboard(val$pls);
            }
            
          }, 10L);
        }
      }, 10L);
    }
  }
  


  @org.bukkit.event.EventHandler
  public void onInteract(PlayerInteractEvent e)
  {
    final Player p = e.getPlayer();
    
    if ((e.getClickedBlock() == null) || (e.getClickedBlock().getType() == Material.AIR))
    {
      return;
    }
    if ((e.getClickedBlock().getType() == Material.SIGN_POST) || (e.getClickedBlock().getType() == Material.WALL_SIGN))
    {
      org.bukkit.block.BlockState s = e.getClickedBlock().getState();
      Sign a = (Sign)s;
      
      if (a.getLine(0).contains("§6XP Bank"))
      {
        if (e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)
        {
          if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")))
          {
            p.sendMessage("§cIl faut au moins être §r§c§lVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);


          }
          else if (MCubeAPI.getPlayerCoins(p) >= 50)
          {
            a.setLine(0, "§a§l[§r§aXP Bank§r§a§l]");
            a.setLine(1, p.getName());
            a.setLine(2, "0");
            a.setLine(3, "§9§l=====");
            a.update();
            
            MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 50);
            MainClass.getEcononomy().withdrawPlayer(p.getName(), 50.0D);
            p.sendMessage("§aXP bank crée !§r\n§6Tu as payé 50 coins.");
            p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 100.0F, 2.0F);
            for (Player pls : Bukkit.getOnlinePlayers()) {
              ScoreboardGame.loadScoreboard(pls);
            }
          }
          else
          {
            p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);

          }
          
        }
        

      }
      else if (a.getLine(0).contains("§aXP Bank"))
      {
        if (a.getLine(1).contains(p.getName()))
        {
          if (e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)
          {
            String max = "200";
            if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) {
              max = "300";
            } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) {
              max = "400";
            } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+")) {
              max = "600";
            }
            
            if (a.getLine(2).contains(max))
            {
              p.sendMessage("§cTon XP Bank est pleine !");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 100.0F, 1.0F);


            }
            else if (p.getLevel() >= 5)
            {
              int l = 0;
              
              try
              {
                l = Integer.parseInt(a.getLine(2));
              }
              catch (NumberFormatException ex)
              {
                ex.printStackTrace();
              }
              

              l += 5;
              p.setLevel(p.getLevel() - 5);
              a.setLine(2, l);
              a.update();
            }
            else
            {
              p.sendMessage("§cIl te faut au moins 5 niveaux !");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 100.0F, 1.0F);

            }
            

          }
          else if (e.getAction() == org.bukkit.event.block.Action.LEFT_CLICK_BLOCK)
          {
            int l = 0;
            
            try
            {
              l = Integer.parseInt(a.getLine(2));
            }
            catch (NumberFormatException ex)
            {
              ((NumberFormatException)ex).printStackTrace();
            }
            

            if (l != 0)
            {
              p.setLevel(p.getLevel() + 5);
              l -= 5;
              a.setLine(2, l);
              a.update();
            }
            else
            {
              p.sendMessage("§cTon XP Bank doit au moins avoir 5 niveaux !");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 100.0F, 1.0F);
            }
            
          }
          
        }
        else
        {
          p.sendMessage("§cCe n'est pas ton XP Bank !");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 100.0F, 2.0F);
          e.setCancelled(true);
        }
      }
      


      for (ex = Bukkit.getOnlinePlayers().iterator(); ((Iterator)ex).hasNext();) { final Player pls = (Player)((Iterator)ex).next();
        if (a.getLine(0).contains(pls.getName())) {
          MCubeAPI.setCoins(pls, (int)MainClass.getEcononomy().getBalance(pls.getName()));
          MCubeAPI.setCoins(p, (int)MainClass.getEcononomy().getBalance(p.getName()));
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
          {
            public void run() {
              ScoreboardGame.loadScoreboard(pls);
              ScoreboardGame.loadScoreboard(p);
            }
          }, 20L);
        }
        if (pls.getName().equalsIgnoreCase("Maxime3399")) {
          MCubeAPI.setCoins(pls, (int)MainClass.getEcononomy().getBalance(pls.getName()));
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
          {
            public void run() {
              ScoreboardGame.loadScoreboard(pls);
            }
          }, 20L);
        }
      }
    }
  }
  



  @org.bukkit.event.EventHandler
  public void onBreak(BlockBreakEvent e)
  {
    Player p = e.getPlayer();
    
    if ((e.getBlock().getType() == Material.SIGN_POST) || (e.getBlock().getType() == Material.WALL_SIGN))
    {
      org.bukkit.block.BlockState s = e.getBlock().getState();
      Sign a = (Sign)s;
      
      if (a.getLine(0).contains("§aXP Bank"))
      {
        if (a.getLine(1).contains(p.getName()))
        {
          int l = 0;
          
          try
          {
            l = Integer.parseInt(a.getLine(2));
          }
          catch (NumberFormatException ex)
          {
            ex.printStackTrace();
          }
          

          p.setLevel(p.getLevel() + l);
          p.sendMessage("§6Ton XP Bank a été détruite !");
          p.playSound(p.getLocation(), Sound.BLOCK_GLASS_BREAK, 100.0F, 2.0F);
        }
        else
        {
          p.sendMessage("§cCe n'est pas ton XP Bank !");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 100.0F, 1.0F);
          e.setCancelled(true);
        }
      }
    }
  }
}
