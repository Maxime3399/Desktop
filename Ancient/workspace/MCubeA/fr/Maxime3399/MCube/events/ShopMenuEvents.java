package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopMenuEvents implements org.bukkit.event.Listener
{
  public ShopMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§a§lBoutique"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§l[§r§fMini-VIP§r§f§l]"))
      {
        if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur"))
        {
          if (MCubeAPI.getPlayerCoins(p) >= 8000)
          {
            MCubeAPI.setRank(p, "minivip");
            MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 8000);
            MainClass.getEcononomy().withdrawPlayer(p.getName(), 8000.0D);
            Bukkit.broadcastMessage("§b" + p.getName() + " §r§3est maintenant §r§f§lMini-VIP §r§3!");
            p.closeInventory();
            for (Player pls : Bukkit.getOnlinePlayers()) {
              ScoreboardGame.loadScoreboard(pls);
              DisplayNameUtils.setDisplayName(pls);
              pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100.0F, 1.0F);
            }
          }
          else
          {
            p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§l[§r§eVIP§r§e§l]"))
      {
        if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")))
        {
          if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip"))
          {
            if (MCubeAPI.getPlayerCoins(p) >= 20000)
            {
              MCubeAPI.setRank(p, "vip");
              MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 20000);
              MainClass.getEcononomy().withdrawPlayer(p.getName(), 20000.0D);
              Bukkit.broadcastMessage("§b" + p.getName() + " §r§3est maintenant §r§e§lVIP §r§3!");
              p.closeInventory();
              for (Player pls : Bukkit.getOnlinePlayers()) {
                ScoreboardGame.loadScoreboard(pls);
                DisplayNameUtils.setDisplayName(pls);
                pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100.0F, 1.0F);
              }
            }
            else
            {
              p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
            }
            
          }
          else
          {
            p.sendMessage("§cIl faut au moins être §r§c§lMini-VIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§l[§r§bVIP+§r§b§l]"))
      {
        if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")))
        {
          if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+"))
          {
            if (MCubeAPI.getPlayerCoins(p) >= 45000)
            {
              MCubeAPI.setRank(p, "vip");
              MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 45000);
              MainClass.getEcononomy().withdrawPlayer(p.getName(), 45000.0D);
              Bukkit.broadcastMessage("§b" + p.getName() + " §r§3est maintenant §r§b§lVIP+ §r§3!");
              p.closeInventory();
              for (Player pls : Bukkit.getOnlinePlayers()) {
                ScoreboardGame.loadScoreboard(pls);
                DisplayNameUtils.setDisplayName(pls);
                pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100.0F, 1.0F);
              }
            }
            else
            {
              p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
            }
            
          }
          else
          {
            p.sendMessage("§cIl faut au moins être §r§c§lVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§l[§r§aUltraVIP§r§a§l]"))
      {
        if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")))
        {
          if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+"))
          {
            if (MCubeAPI.getPlayerCoins(p) >= 80000)
            {
              MCubeAPI.setRank(p, "ultravip");
              MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 80000);
              MainClass.getEcononomy().withdrawPlayer(p.getName(), 80000.0D);
              Bukkit.broadcastMessage("§b" + p.getName() + " §r§3est maintenant §r§a§lUltraVIP §r§3!");
              p.closeInventory();
              for (Player pls : Bukkit.getOnlinePlayers()) {
                ScoreboardGame.loadScoreboard(pls);
                DisplayNameUtils.setDisplayName(pls);
                pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100.0F, 1.0F);
              }
              p.setAllowFlight(true);
            }
            else
            {
              p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
            }
            
          }
          else
          {
            p.sendMessage("§cIl faut au moins être §r§c§lVIP+§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2§l[§r§2UltraVIP+§r§2§l]"))
      {
        if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")))
        {
          if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))
          {
            if (MCubeAPI.getPlayerCoins(p) >= 140000)
            {
              MCubeAPI.setRank(p, "ultravip+");
              MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 140000);
              MainClass.getEcononomy().withdrawPlayer(p.getName(), 140000.0D);
              Bukkit.broadcastMessage("§b" + p.getName() + " §r§3est maintenant §r§2§lUltraVIP+ §r§3!");
              p.closeInventory();
              for (Player pls : Bukkit.getOnlinePlayers()) {
                ScoreboardGame.loadScoreboard(pls);
                DisplayNameUtils.setDisplayName(pls);
                pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100.0F, 1.0F);
              }
              p.setAllowFlight(true);
            }
            else
            {
              p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
            }
            
          }
          else
          {
            p.sendMessage("§cIl faut au moins être §r§c§lUltraVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.MainMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Coffre de cosmétiques"))
      {
        if (fr.Maxime3399.MCube.actions.chestsCount.get(p) >= 53)
        {
          p.closeInventory();
          p.sendMessage("§cTu as trop de coffres, tu dois en ouvrir pour pouvoir en acheter d'autres !");
          p.playSound(p.getLocation(), Sound.BLOCK_GRASS_PLACE, 100.0F, 1.0F);


        }
        else if (MCubeAPI.getPlayerCoins(p) >= 2000)
        {
          MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 2000);
          MainClass.getEcononomy().withdrawPlayer(p.getName(), 2000.0D);
          MCubeAPI.setChests(p, "cos", MCubeAPI.getChests(p, "cos") + 1);
          p.closeInventory();
          p.sendMessage("§eTu as reçus un §3Coffre de cosmétiques §r§e!");
          p.playSound(p.getLocation(), Sound.BLOCK_IRON_DOOR_OPEN, 100.0F, 2.0F);
          for (Player pls : Bukkit.getOnlinePlayers()) {
            ScoreboardGame.loadScoreboard(pls);
            DisplayNameUtils.setDisplayName(pls);
          }
        }
        else
        {
          p.closeInventory();
          p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);

        }
        

      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Pass"))
      {
        if (MCubeAPI.getPlayerCoins(p) >= 350)
        {
          MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 350);
          MainClass.getEcononomy().withdrawPlayer(p.getName(), 350.0D);
          MCubeAPI.setPass(p, MCubeAPI.getPlayerPass(p) + 1);
          p.closeInventory();
          p.sendMessage("§eTu as reçus un §3Pass §r§e!");
          p.playSound(p.getLocation(), Sound.BLOCK_IRON_DOOR_OPEN, 100.0F, 2.0F);
          for (Player pls : Bukkit.getOnlinePlayers()) {
            ScoreboardGame.loadScoreboard(pls);
            DisplayNameUtils.setDisplayName(pls);
          }
        }
        else
        {
          p.closeInventory();
          p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§d1 Heure pour sentinel"))
      {
        if (MCubeAPI.getPlayerCoins(p) >= 600)
        {
          if (MCubeAPI.getSentinel(p) == 0)
          {
            MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - 600);
            MainClass.getEcononomy().withdrawPlayer(p.getName(), 600.0D);
            MCubeAPI.setSentinel(p, MCubeAPI.getSentinel(p) + 3600);
            p.closeInventory();
            p.sendMessage("§eTu as reçus une §3Heure pour sentinel §r§e!");
            p.playSound(p.getLocation(), Sound.BLOCK_IRON_DOOR_OPEN, 100.0F, 2.0F);
            for (Player pls : Bukkit.getOnlinePlayers()) {
              ScoreboardGame.loadScoreboard(pls);
              DisplayNameUtils.setDisplayName(pls);
            }
          }
          else
          {
            p.sendMessage("§cTu dispose déjà d'une heure pour ton sentinnel !");
            p.playSound(p.getLocation(), Sound.BLOCK_IRON_DOOR_OPEN, 100.0F, 2.0F);
          }
          
        }
        else
        {
          p.closeInventory();
          p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
        }
      }
      


      e.setCancelled(true);
    }
  }
}
