package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.cos.RemoveCosAction;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class CosDeathMenuEvents implements org.bukkit.event.Listener
{
  public CosDeathMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    final Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§c§lEffets de mort"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == org.bukkit.Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§oEnlever"))
      {
        RemoveCosAction.removeDeathEffect(p, true);
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§c"))
      {
        p.sendMessage("§cTu ne possède pas ce cosmétique !");
        p.playSound(p.getLocation(), Sound.BLOCK_REDSTONE_TORCH_BURNOUT, 100.0F, 1.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEclairs"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "lightDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aSang"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "bloodDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aOs"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "boneDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aTexte Flottant"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "textDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aExplosion"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "explodeDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCadavre"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "corpseDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCiel"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "cielDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEnfer"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "enferDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBalise"))
      {
        RemoveCosAction.removeDeathEffect(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "baliseDeath");
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.CosMainMenu.openMenu(p);
      }
      

      e.setCancelled(true);
    }
  }
}
