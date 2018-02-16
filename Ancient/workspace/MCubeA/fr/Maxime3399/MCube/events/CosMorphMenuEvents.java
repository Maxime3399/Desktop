package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.cos.RemoveCosAction;
import fr.Maxime3399.MCube.cos.morphingPlayer;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class CosMorphMenuEvents implements org.bukkit.event.Listener
{
  public CosMorphMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    final Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§6§lTransformations"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == org.bukkit.Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§oEnlever"))
      {
        RemoveCosAction.removeMorph(p, true);
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§c"))
      {
        p.sendMessage("§cTu ne possède pas ce cosmétique !");
        p.playSound(p.getLocation(), Sound.BLOCK_REDSTONE_TORCH_BURNOUT, 100.0F, 1.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aPoule"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "chicken");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCochon"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "pig");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aMouton"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "sheep");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aVache"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "cow");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCheval"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "horse");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aVillageois"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "villager");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aLapin"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "bunny");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aOcelot"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "ocelot");
            morphingPlayer.morph(p);
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aLoup"))
      {
        RemoveCosAction.removeMorph(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "wolf");
            morphingPlayer.morph(p);
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
