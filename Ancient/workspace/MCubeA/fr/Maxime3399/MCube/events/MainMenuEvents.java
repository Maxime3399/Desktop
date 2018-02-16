package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.menus.ChestMenu;
import fr.Maxime3399.MCube.menus.CosMainMenu;
import fr.Maxime3399.MCube.menus.PlayerMenu;
import fr.Maxime3399.MCube.menus.ShopMenu;
import fr.Maxime3399.MCube.menus.TagMenu;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainMenuEvents implements org.bukkit.event.Listener
{
  public MainMenuEvents() {}
  
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getClickedInventory().getName().equalsIgnoreCase("§9§lMenu Principal"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eProfile"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        PlayerMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBoutique"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        ShopMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Coffres"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        ChestMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Tag"))
      {
        if (fr.Maxime3399.MCube.MCubeAPI.isDonator(p).equalsIgnoreCase("true"))
        {
          p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
          p.closeInventory();
          TagMenu.openMenu(p);
        }
        else
        {
          p.sendMessage("§cCe menu est réservé aux §r§c§ldonateurs§r§c, tu peux en devenir un ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
          p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 100.0F);
        }
        
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Cosmétiques"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        CosMainMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cQuêtes"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.QuestsMenu.openMenu(p);
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Sentinnel"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.SentinelMenu.openMenu(p);
      }
      

      e.setCancelled(true);
    }
  }
}
