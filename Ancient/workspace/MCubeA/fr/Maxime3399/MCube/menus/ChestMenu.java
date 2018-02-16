package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChestMenu
{
  public ChestMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory inv = Bukkit.createInventory(null, 54, "§9§lCoffres");
    
    for (int c = 0; c < MCubeAPI.getChests(p, "basic"); c++) {
      ItemStack ISbasic = new ItemStack(Material.CHEST);
      ItemMeta IMbasic = ISbasic.getItemMeta();
      ArrayList<String> ALbasic = new ArrayList();
      Random r = new Random();
      ALbasic.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMbasic.setLore(ALbasic);
      IMbasic.setDisplayName("§eCoffre basique");
      ISbasic.setItemMeta(IMbasic);
      inv.addItem(new ItemStack[] { ISbasic });
    }
    
    for (int c = 0; c < MCubeAPI.getChests(p, "rare"); c++) {
      ItemStack ISrare = new ItemStack(Material.CHEST);
      ItemMeta IMrare = ISrare.getItemMeta();
      ArrayList<String> ALrare = new ArrayList();
      Random r = new Random();
      ALrare.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMrare.setLore(ALrare);
      IMrare.setDisplayName("§6Coffre rare");
      ISrare.setItemMeta(IMrare);
      inv.addItem(new ItemStack[] { ISrare });
    }
    
    for (int c = 0; c < MCubeAPI.getChests(p, "epic"); c++) {
      ItemStack ISepic = new ItemStack(Material.ENDER_CHEST);
      ItemMeta IMepic = ISepic.getItemMeta();
      ArrayList<String> ALepic = new ArrayList();
      Random r = new Random();
      ALepic.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMepic.setLore(ALepic);
      IMepic.setDisplayName("§5Coffre epic");
      ISepic.setItemMeta(IMepic);
      inv.addItem(new ItemStack[] { ISepic });
    }
    
    for (int c = 0; c < MCubeAPI.getChests(p, "legendary"); c++) {
      ItemStack ISleg = new ItemStack(Material.ENDER_CHEST);
      ItemMeta IMleg = ISleg.getItemMeta();
      ArrayList<String> ALleg = new ArrayList();
      Random r = new Random();
      ALleg.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMleg.setLore(ALleg);
      IMleg.setDisplayName("§bCoffre légendaire");
      ISleg.setItemMeta(IMleg);
      inv.addItem(new ItemStack[] { ISleg });
    }
    
    for (int c = 0; c < MCubeAPI.getChests(p, "ultimate"); c++) {
      ItemStack ISult = new ItemStack(Material.BLUE_SHULKER_BOX);
      ItemMeta IMult = ISult.getItemMeta();
      ArrayList<String> ALult = new ArrayList();
      Random r = new Random();
      ALult.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMult.setLore(ALult);
      IMult.setDisplayName("§9Coffre Ultime");
      ISult.setItemMeta(IMult);
      inv.addItem(new ItemStack[] { ISult });
    }
    
    for (int c = 0; c < MCubeAPI.getChests(p, "cos"); c++) {
      ItemStack IScos = new ItemStack(Material.MAGMA_CREAM);
      ItemMeta IMcos = IScos.getItemMeta();
      ArrayList<String> ALcos = new ArrayList();
      Random r = new Random();
      ALcos.add("§7ID §r§7§l> §r§8§o" + r.nextInt(999999999));
      IMcos.setLore(ALcos);
      IMcos.setDisplayName("§3Coffre de cosmétiques");
      IScos.setItemMeta(IMcos);
      inv.addItem(new ItemStack[] { IScos });
    }
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    inv.setItem(53, ISre);
    
    p.openInventory(inv);
  }
}
