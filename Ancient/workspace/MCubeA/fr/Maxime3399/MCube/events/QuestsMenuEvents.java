package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestsMenuEvents implements org.bukkit.event.Listener
{
  public QuestsMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§c§lQuêtes"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bPasser la quête"))
      {
        if (MCubeAPI.getPlayerPass(p) >= 1)
        {
          MCubeAPI.setPass(p, MCubeAPI.getPlayerPass(p) - 1);
          p.closeInventory();
          p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100.0F, 1.0F);
          fr.Maxime3399.MCube.quests.resetQuest.reset(p);
          p.sendMessage("§aLa quête à été passée !");
        }
        else
        {
          p.closeInventory();
          p.sendMessage("§cTu n'as pas assez de pass !");
        }
        
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
