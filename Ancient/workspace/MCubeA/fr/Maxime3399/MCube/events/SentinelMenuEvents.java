package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import fr.Maxime3399.MCube.schedulers.sentinelScheduler;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SentinelMenuEvents implements org.bukkit.event.Listener
{
  public SentinelMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§2§lSentinel"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aON"))
      {
        if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("false"))
        {
          if (MCubeAPI.getSentinel(p) >= 1)
          {
            if (sentinelScheduler.s == 0) {
              sentinelScheduler.s = 1;
              sentinelScheduler.start();
            }
            MCubeAPI.setEnabledSentinel(p, "true");
            SentinelFunction.add(p);
            p.sendMessage("§aTon sentinel est activé !");
            p.playSound(p.getLocation(), Sound.ENTITY_EVOCATION_ILLAGER_PREPARE_SUMMON, 100.0F, 2.0F);
          }
          else
          {
            p.sendMessage("§cTu ne possède plus de temps d'utilisation pour ton sentinel, tu peux en acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100.0F, 1.0F);
          }
          
        }
        else
        {
          p.sendMessage("§cTon sentinel est déjà actif.");
          p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100.0F, 2.0F);
        }
        

        p.closeInventory();
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cOFF"))
      {
        if (MCubeAPI.getEnabledSentinel(p).equalsIgnoreCase("false"))
        {
          p.sendMessage("§cTon sentinel est déjà désactivé !");
          p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100.0F, 2.0F);
        }
        else
        {
          p.sendMessage("§eTon sentinel est désactivé.");
          p.playSound(p.getLocation(), Sound.ENTITY_WITCH_DRINK, 100.0F, 2.0F);
          MCubeAPI.setEnabledSentinel(p, "false");
          SentinelFunction.remove(p);
          fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(p);
        }
        

        p.closeInventory();
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
