package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.menus.CosParticleMenu;
import fr.Maxime3399.MCube.menus.MainMenu;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CosMainMenuEvents implements org.bukkit.event.Listener
{
  public CosMainMenuEvents() {}
  
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§6§lCosmétiques"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bParticules"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        CosParticleMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cEffets de mort"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.CosDeathMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Transformations"))
      {
        if (fr.Maxime3399.MCube.MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin"))
        {
          p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
          p.closeInventory();
          fr.Maxime3399.MCube.menus.CosMorphMenu.openMenu(p);
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        MainMenu.openMenu(p);
      }
      

      e.setCancelled(true);
    }
  }
}
