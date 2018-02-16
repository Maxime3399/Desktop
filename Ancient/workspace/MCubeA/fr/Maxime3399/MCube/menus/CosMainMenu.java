package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.cos.getCosCount;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CosMainMenu
{
  public CosMainMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 9, "§6§lCosmétiques");
    
    ItemStack ISparticle = new ItemStack(Material.FIREWORK);
    ItemMeta IMparticle = ISparticle.getItemMeta();
    ArrayList<String> ALparticle = new ArrayList();
    ALparticle.add("  §e" + getCosCount.getParticles(p) + "§6/§r§6§l18");
    IMparticle.setLore(ALparticle);
    IMparticle.setDisplayName("§bParticules");
    ISparticle.setItemMeta(IMparticle);
    i.setItem(1, ISparticle);
    
    ItemStack ISdeath = new ItemStack(Material.SKULL_ITEM, 1, (short)1);
    ItemMeta IMdeath = ISdeath.getItemMeta();
    ArrayList<String> ALdeath = new ArrayList();
    ALdeath.add(" §e" + getCosCount.getDeathEffects(p) + "§6/§r§6§l9");
    IMdeath.setLore(ALdeath);
    IMdeath.setDisplayName("§cEffets de mort");
    ISdeath.setItemMeta(IMdeath);
    i.setItem(3, ISdeath);
    
    ItemStack ISmorph = new ItemStack(Material.SLIME_BALL);
    ItemMeta IMmorph = ISmorph.getItemMeta();
    ArrayList<String> ALmorph = new ArrayList();
    
    ALmorph.add("§7§oBientôt...");
    IMmorph.setLore(ALmorph);
    IMmorph.setDisplayName("§6Transformations");
    ISmorph.setItemMeta(IMmorph);
    i.setItem(5, ISmorph);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(8, ISre);
    
    p.openInventory(i);
  }
}
