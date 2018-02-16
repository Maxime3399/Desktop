package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class MainMenu
{
  public MainMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = org.bukkit.Bukkit.createInventory(null, 9, "§9§lMenu Principal");
    
    ItemStack ISplayer = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
    SkullMeta SMplayer = (SkullMeta)ISplayer.getItemMeta();
    SMplayer.setOwner(p.getName());
    SMplayer.setDisplayName("§eProfile");
    ISplayer.setItemMeta(SMplayer);
    i.setItem(1, ISplayer);
    
    ItemStack ISshop = new ItemStack(Material.EMERALD);
    ItemMeta IMshop = ISshop.getItemMeta();
    IMshop.setDisplayName("§aBoutique");
    ISshop.setItemMeta(IMshop);
    i.setItem(2, ISshop);
    
    ItemStack IStag = new ItemStack(Material.NAME_TAG);
    ItemMeta IMtag = IStag.getItemMeta();
    ArrayList<String> ALtag = new ArrayList();
    ALtag.add("§cRéservé aux donateurs !");
    IMtag.setDisplayName("§3Tag");
    IMtag.setLore(ALtag);
    IStag.setItemMeta(IMtag);
    i.setItem(3, IStag);
    
    ItemStack ISchest = new ItemStack(Material.CHEST);
    ItemMeta IMchest = ISchest.getItemMeta();
    IMchest.setDisplayName("§9Coffres");
    ISchest.setItemMeta(IMchest);
    i.setItem(4, ISchest);
    
    ItemStack IScos = new ItemStack(Material.MAGMA_CREAM);
    ItemMeta IMcos = IScos.getItemMeta();
    IMcos.setDisplayName("§6Cosmétiques");
    IScos.setItemMeta(IMcos);
    i.setItem(5, IScos);
    
    ItemStack ISquest = new ItemStack(Material.WORKBENCH);
    ItemMeta IMquest = ISquest.getItemMeta();
    IMquest.setDisplayName("§cQuêtes");
    ISquest.setItemMeta(IMquest);
    i.setItem(6, ISquest);
    
    ItemStack ISsen = new ItemStack(Material.FIREBALL);
    ItemMeta IMsen = ISsen.getItemMeta();
    IMsen.setDisplayName("§2Sentinnel");
    ISsen.setItemMeta(IMsen);
    i.setItem(7, ISsen);
    
    p.openInventory(i);
  }
}
