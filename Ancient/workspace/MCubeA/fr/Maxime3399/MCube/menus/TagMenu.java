package fr.Maxime3399.MCube.menus;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TagMenu
{
  public TagMenu() {}
  
  public static void openMenu(org.bukkit.entity.Player p)
  {
    Inventory i = org.bukkit.Bukkit.createInventory(null, 36, "§3§lTag");
    
    ItemStack ISwhite = new ItemStack(Material.WOOL);
    ItemMeta IMwhite = ISwhite.getItemMeta();
    IMwhite.setDisplayName("§fBlanc");
    ISwhite.setItemMeta(IMwhite);
    i.setItem(0, ISwhite);
    
    ItemStack ISorange = new ItemStack(Material.WOOL, 1, (short)1);
    ItemMeta IMorange = ISorange.getItemMeta();
    IMorange.setDisplayName("§6Orange");
    ISorange.setItemMeta(IMorange);
    i.setItem(1, ISorange);
    
    ItemStack ISmagenta = new ItemStack(Material.WOOL, 1, (short)2);
    ItemMeta IMmagenta = ISmagenta.getItemMeta();
    IMmagenta.setDisplayName("§dMagenta");
    ISmagenta.setItemMeta(IMmagenta);
    i.setItem(2, ISmagenta);
    
    ItemStack ISlightblue = new ItemStack(Material.WOOL, 1, (short)3);
    ItemMeta IMlightblue = ISlightblue.getItemMeta();
    IMlightblue.setDisplayName("§bBleu clair");
    ISlightblue.setItemMeta(IMlightblue);
    i.setItem(3, ISlightblue);
    
    ItemStack ISyellow = new ItemStack(Material.WOOL, 1, (short)4);
    ItemMeta IMyellow = ISyellow.getItemMeta();
    IMyellow.setDisplayName("§eJaune");
    ISyellow.setItemMeta(IMyellow);
    i.setItem(4, ISyellow);
    
    ItemStack ISlightgreen = new ItemStack(Material.WOOL, 1, (short)5);
    ItemMeta IMlightgreen = ISlightgreen.getItemMeta();
    IMlightgreen.setDisplayName("§aVert clair");
    ISlightgreen.setItemMeta(IMlightgreen);
    i.setItem(5, ISlightgreen);
    
    ItemStack ISgrey = new ItemStack(Material.WOOL, 1, (short)7);
    ItemMeta IMgrey = ISgrey.getItemMeta();
    IMgrey.setDisplayName("§8Gris");
    ISgrey.setItemMeta(IMgrey);
    i.setItem(6, ISgrey);
    
    ItemStack ISlightgrey = new ItemStack(Material.WOOL, 1, (short)8);
    ItemMeta IMlightgrey = ISlightgrey.getItemMeta();
    IMlightgrey.setDisplayName("§7Gris clair");
    ISlightgrey.setItemMeta(IMlightgrey);
    i.setItem(7, ISlightgrey);
    
    ItemStack IScyan = new ItemStack(Material.WOOL, 1, (short)9);
    ItemMeta IMcyan = IScyan.getItemMeta();
    IMcyan.setDisplayName("§3Cyan");
    IScyan.setItemMeta(IMcyan);
    i.setItem(8, IScyan);
    
    ItemStack ISpurple = new ItemStack(Material.WOOL, 1, (short)10);
    ItemMeta IMpurple = ISpurple.getItemMeta();
    IMpurple.setDisplayName("§5Violet");
    ISpurple.setItemMeta(IMpurple);
    i.setItem(11, ISpurple);
    
    ItemStack ISblue = new ItemStack(Material.WOOL, 1, (short)11);
    ItemMeta IMblue = ISblue.getItemMeta();
    IMblue.setDisplayName("§9Bleu");
    ISblue.setItemMeta(IMblue);
    i.setItem(12, ISblue);
    
    ItemStack ISgreen = new ItemStack(Material.WOOL, 1, (short)13);
    ItemMeta IMgreen = ISgreen.getItemMeta();
    IMgreen.setDisplayName("§2Vert");
    ISgreen.setItemMeta(IMgreen);
    i.setItem(13, ISgreen);
    
    ItemStack ISred = new ItemStack(Material.WOOL, 1, (short)14);
    ItemMeta IMred = ISred.getItemMeta();
    IMred.setDisplayName("§cRouge");
    ISred.setItemMeta(IMred);
    i.setItem(14, ISred);
    
    ItemStack ISblack = new ItemStack(Material.WOOL, 1, (short)15);
    ItemMeta IMblack = ISblack.getItemMeta();
    IMblack.setDisplayName("§0Noir");
    ISblack.setItemMeta(IMblack);
    i.setItem(15, ISblack);
    
    ItemStack IS1 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM1 = IS1.getItemMeta();
    IM1.setDisplayName("§f✪");
    IS1.setItemMeta(IM1);
    i.setItem(27, IS1);
    
    ItemStack IS2 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM2 = IS2.getItemMeta();
    IM2.setDisplayName("§f✦");
    IS2.setItemMeta(IM2);
    i.setItem(28, IS2);
    
    ItemStack IS3 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM3 = IS3.getItemMeta();
    IM3.setDisplayName("§f✔");
    IS3.setItemMeta(IM3);
    i.setItem(29, IS3);
    
    ItemStack IS4 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM4 = IS4.getItemMeta();
    IM4.setDisplayName("§f✘");
    IS4.setItemMeta(IM4);
    i.setItem(30, IS4);
    
    ItemStack IS5 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM5 = IS5.getItemMeta();
    IM5.setDisplayName("§f❤ ");
    IS5.setItemMeta(IM5);
    i.setItem(31, IS5);
    
    ItemStack IS6 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM6 = IS6.getItemMeta();
    IM6.setDisplayName("§f✚ ");
    IS6.setItemMeta(IM6);
    i.setItem(32, IS6);
    
    ItemStack IS7 = new ItemStack(Material.NAME_TAG);
    ItemMeta IM7 = IS7.getItemMeta();
    IM7.setDisplayName("§f♫");
    IS7.setItemMeta(IM7);
    i.setItem(33, IS7);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(35, ISre);
    
    p.openInventory(i);
  }
}
