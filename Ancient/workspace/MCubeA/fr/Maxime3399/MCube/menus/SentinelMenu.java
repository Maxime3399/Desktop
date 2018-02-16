package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SentinelMenu
{
  public SentinelMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 27, "§2§lSentinel");
    
    ItemStack ISon = new ItemStack(Material.SLIME_BALL);
    ItemMeta IMon = ISon.getItemMeta();
    IMon.setDisplayName("§aON");
    ISon.setItemMeta(IMon);
    i.setItem(11, ISon);
    
    ItemStack ISoff = new ItemStack(Material.MAGMA_CREAM);
    ItemMeta IMoff = ISoff.getItemMeta();
    IMoff.setDisplayName("§cOFF");
    ISoff.setItemMeta(IMoff);
    i.setItem(15, ISoff);
    
    String time = new SimpleDateFormat("mm:ss").format(new Date(MCubeAPI.getSentinel(p) * 1000));
    if (MCubeAPI.getSentinel(p) == 3600) {
      time = "60:00";
    }
    ItemStack IStemp = new ItemStack(Material.WATCH);
    ItemMeta IMtemp = IStemp.getItemMeta();
    ArrayList<String> ALtemp = new ArrayList();
    IMtemp.setDisplayName("§bTemps restant");
    ALtemp.add("  §e" + time);
    IMtemp.setLore(ALtemp);
    IStemp.setItemMeta(IMtemp);
    i.setItem(13, IStemp);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(26, ISre);
    
    p.openInventory(i);
  }
}
