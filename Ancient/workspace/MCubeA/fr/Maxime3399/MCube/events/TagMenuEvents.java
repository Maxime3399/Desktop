package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TagMenuEvents implements org.bukkit.event.Listener
{
  public TagMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§3§lTag"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == org.bukkit.Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fBlanc"))
      {
        MCubeAPI.setDonatorColor(p, "white");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Orange"))
      {
        MCubeAPI.setDonatorColor(p, "orange");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dMagenta"))
      {
        MCubeAPI.setDonatorColor(p, "magenta");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bBleu clair"))
      {
        MCubeAPI.setDonatorColor(p, "lightblue");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eJaune"))
      {
        MCubeAPI.setDonatorColor(p, "yellow");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aVert clair"))
      {
        MCubeAPI.setDonatorColor(p, "lightgreen");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§8Gris"))
      {
        MCubeAPI.setDonatorColor(p, "grey");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Gris clair"))
      {
        MCubeAPI.setDonatorColor(p, "lightgrey");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Cyan"))
      {
        MCubeAPI.setDonatorColor(p, "cyan");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Violet"))
      {
        MCubeAPI.setDonatorColor(p, "purple");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Bleu"))
      {
        MCubeAPI.setDonatorColor(p, "blue");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Vert"))
      {
        MCubeAPI.setDonatorColor(p, "green");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cRouge"))
      {
        MCubeAPI.setDonatorColor(p, "red");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§0Noir"))
      {
        MCubeAPI.setDonatorColor(p, "black");
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f✪"))
      {
        MCubeAPI.setDonatorSymbol(p, 1);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f✦"))
      {
        MCubeAPI.setDonatorSymbol(p, 2);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f✔"))
      {
        MCubeAPI.setDonatorSymbol(p, 3);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f✘"))
      {
        MCubeAPI.setDonatorSymbol(p, 4);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f❤ "))
      {
        MCubeAPI.setDonatorSymbol(p, 5);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f✚ "))
      {
        MCubeAPI.setDonatorSymbol(p, 6);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f♫"))
      {
        MCubeAPI.setDonatorSymbol(p, 7);
        p.sendMessage("§eTag modifié !");
        p.closeInventory();
        for (Player pls : Bukkit.getOnlinePlayers()) {
          DisplayNameUtils.setDisplayName(pls);
        }
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.MainMenu.openMenu(p);
      }
      

      e.setCancelled(true);
    }
  }
}
