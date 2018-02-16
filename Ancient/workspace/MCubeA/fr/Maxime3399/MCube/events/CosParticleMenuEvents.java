package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.cos.CosStartManager;
import fr.Maxime3399.MCube.cos.RemoveCosAction;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class CosParticleMenuEvents implements org.bukkit.event.Listener
{
  public CosParticleMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    final Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§b§lParticules"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == org.bukkit.Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§oEnlever"))
      {
        RemoveCosAction.removeParticle(p, true);
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 100.0F, 2.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§c"))
      {
        p.sendMessage("§cTu ne possède pas ce cosmétique !");
        p.playSound(p.getLocation(), Sound.BLOCK_REDSTONE_TORCH_BURNOUT, 100.0F, 1.0F);
        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAngry Villager"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique séléctionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "angryVillager");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBarrier"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "barrier");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlock Crack"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "blockcrack");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBubble"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "bubble");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCloud"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "cloud");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aCrit"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "crit");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDamage Indicator"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "damageIndicator");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDepth Suspend"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "depthsuspend");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDragon Breath"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "dragonbreath");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDrip Lava"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "dripLava");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDrip Water"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "dripWater");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aDroplet"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "droplet");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEnchantment Table"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "enchantmenttable");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEnd Rod"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "endRod");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aFalling Dust"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "fallingDust");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aFireworks Spark"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "fireworksSpark");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aFlame"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "flame");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aHappy Villager"))
      {
        RemoveCosAction.removeParticle(p, false);
        p.sendMessage("§eCosmétique sélectionné !");
        p.playSound(p.getLocation(), Sound.BLOCK_STONE_PRESSUREPLATE_CLICK_ON, 100.0F, 2.0F);
        p.closeInventory();
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
        {
          public void run() {
            fr.Maxime3399.MCube.MCubeAPI.addActiveCos(p, "happyVillager");
            CosStartManager.registerCosmetics();
          }
        }, 5L);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.CosMainMenu.openMenu(p);
      }
    }
  }
}
