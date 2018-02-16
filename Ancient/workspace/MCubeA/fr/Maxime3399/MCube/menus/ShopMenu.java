package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopMenu
{
  public ShopMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 45, "§a§lBoutique");
    
    ItemStack ISmini = new ItemStack(Material.LAPIS_BLOCK);
    ItemMeta IMmini = ISmini.getItemMeta();
    ArrayList<String> ALmini = new ArrayList();
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) {
      ALmini.add("§6Coût : §r§6§l8 000");
    } else {
      ALmini.add("§2§lAcheté");
    }
    ALmini.add(" ");
    ALmini.add("§3Avantages :");
    ALmini.add("  §f§l- §r§fPréfixe : [Mini-VIP]");
    ALmini.add("  §f§l- §r§f5 Homes");
    ALmini.add("  §f§l- §r§fCommande : /tpyes");
    ALmini.add("  §f§l- §r§fAccès aux contenus beta");
    
    IMmini.setLore(ALmini);
    IMmini.setDisplayName("§f§l[§r§fMini-VIP§r§f§l]");
    ISmini.setItemMeta(IMmini);
    i.setItem(29, ISmini);
    
    ItemStack ISvip = new ItemStack(Material.GOLD_BLOCK);
    ItemMeta IMvip = ISvip.getItemMeta();
    ArrayList<String> ALvip = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip"))) {
      ALvip.add("§6Coût : §r§6§l20 000");
      ALvip.add("§3Requis : Mini-VIP");
    } else {
      ALvip.add("§2§lAcheté");
    }
    ALvip.add(" ");
    ALvip.add("§3Avantages :");
    ALvip.add("  §f§l- §r§fPréfixe : [VIP]");
    ALvip.add("  §f§l- §r§fCouleur du préfixe : Jaune");
    ALvip.add("  §f§l- §r§fGain de coins : x2");
    ALvip.add("  §f§l- §r§f10 Homes");
    ALvip.add("  §f§l- §r§fCommande : /tpyes");
    ALvip.add("  §f§l- §r§fCommande : /tphere");
    ALvip.add("  §f§l- §r§fXP Bank");
    ALvip.add("  §f§l- §r§fAccès aux contenus beta");
    
    IMvip.setLore(ALvip);
    IMvip.setDisplayName("§e§l[§r§eVIP§r§e§l]");
    ISvip.setItemMeta(IMvip);
    i.setItem(19, ISvip);
    
    ItemStack ISvipp = new ItemStack(Material.DIAMOND_BLOCK);
    ItemMeta IMvipp = ISvipp.getItemMeta();
    ArrayList<String> ALvipp = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip"))) {
      ALvipp.add("§6Coût : §r§6§l45 000");
      ALvipp.add("§3Requis : VIP");
    } else {
      ALvipp.add("§2§lAcheté");
    }
    ALvipp.add(" ");
    ALvipp.add("§3Avantages :");
    ALvipp.add("  §f§l- §r§fPréfixe : [VIP+]");
    ALvipp.add("  §f§l- §r§fCouleur du préfixe : Bleu clair");
    ALvipp.add("  §f§l- §r§fGain de coins : x3");
    ALvipp.add("  §f§l- §r§f15 Homes");
    ALvipp.add("  §f§l- §r§fCommande : /tpyes");
    ALvipp.add("  §f§l- §r§fCommande : /tphere");
    ALvipp.add("  §f§l- §r§fXP Bank");
    ALvipp.add("  §f§l- §r§fXP Bank max : 300 lvl");
    ALvipp.add("  §f§l- §r§fAccès aux contenus beta");
    
    IMvipp.setLore(ALvipp);
    IMvipp.setDisplayName("§b§l[§r§bVIP+§r§b§l]");
    ISvipp.setItemMeta(IMvipp);
    i.setItem(20, ISvipp);
    
    ItemStack ISultra = new ItemStack(Material.EMERALD_BLOCK);
    ItemMeta IMultra = ISultra.getItemMeta();
    ArrayList<String> ALultra = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+"))) {
      ALultra.add("§6Coût : §r§6§l80 000");
      ALultra.add("§3Requis : VIP+");
    } else {
      ALultra.add("§2§lAcheté");
    }
    ALultra.add(" ");
    ALultra.add("§3Avantages :");
    ALultra.add("  §f§l- §r§fPouvoir voler");
    ALultra.add("  §f§l- §r§fPréfixe : [UltraVIP]");
    ALultra.add("  §f§l- §r§fCouleur du préfixe : Vert clair");
    ALultra.add("  §f§l- §r§fGain de coins : x4");
    ALultra.add("  §f§l- §r§f20 Homes");
    ALultra.add("  §f§l- §r§fCommande : /tpyes");
    ALultra.add("  §f§l- §r§fCommande : /tphere");
    ALultra.add("  §f§l- §r§fXP Bank");
    ALultra.add("  §f§l- §r§fXP Bank max : 400 lvl");
    ALultra.add("  §f§l- §r§fRécupérer les spawners");
    ALultra.add("  §f§l- §r§fAccès aux contenus beta");
    ALultra.add("  §f§l- §r§fCommandes : /equals, /equalsyes");
    
    IMultra.setLore(ALultra);
    IMultra.setDisplayName("§a§l[§r§aUltraVIP§r§a§l]");
    ISultra.setItemMeta(IMultra);
    i.setItem(21, ISultra);
    
    ItemStack ISultrap = new ItemStack(Material.END_CRYSTAL);
    ItemMeta IMultrap = ISultrap.getItemMeta();
    ArrayList<String> ALultrap = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))) {
      ALultrap.add("§6Coût : §r§6§l140 000");
      ALultrap.add("§3Requis : UltraVIP");
    } else {
      ALultrap.add("§2§lAcheté");
    }
    ALultrap.add(" ");
    ALultrap.add("§3Avantages :");
    ALultrap.add("  §f§l- §r§fPouvoir voler");
    ALultrap.add("  §f§l- §r§fPréfixe : [UltrapVIP+]");
    ALultrap.add("  §f§l- §r§fCouleur du préfixe : Vert foncé");
    ALultrap.add("  §f§l- §r§fGain de coins : x5");
    ALultrap.add("  §f§l- §r§f40 Homes");
    ALultrap.add("  §f§l- §r§fCommande : /tpyes");
    ALultrap.add("  §f§l- §r§fCommande : /tphere");
    ALultrap.add("  §f§l- §r§fXP Bank");
    ALultrap.add("  §f§l- §r§fXP Bank max : 600 lvl");
    ALultrap.add("  §f§l- §r§fRécupérer les spawners");
    ALultrap.add("  §f§l- §r§fAccès aux contenus beta");
    ALultrap.add("  §f§l- §r§fCommandes : /equals, /equalsyes");
    ALultrap.add("  §f§l- §r§fCosmétiques exclusifs : 5");
    IMultrap.setLore(ALultrap);
    IMultrap.setDisplayName("§2§l[§r§2UltraVIP+§r§2§l]");
    ISultrap.setItemMeta(IMultrap);
    if (MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")) {
      i.setItem(11, ISultrap);
    }
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(35, ISre);
    
    ItemStack IScos = new ItemStack(Material.MAGMA_CREAM);
    ItemMeta IMcos = IScos.getItemMeta();
    ArrayList<String> ALcos = new ArrayList();
    ALcos.add("§6Coût : §r§6§l 2 000");
    IMcos.setLore(ALcos);
    IMcos.setDisplayName("§3Coffre de cosmétiques");
    IScos.setItemMeta(IMcos);
    i.setItem(15, IScos);
    
    ItemStack ISpass = new ItemStack(Material.TNT);
    ItemMeta IMpass = ISpass.getItemMeta();
    ArrayList<String> ALpass = new ArrayList();
    ALpass.add("§6Coût : §r§6§l350");
    IMpass.setLore(ALpass);
    IMpass.setDisplayName("§9Pass");
    ISpass.setItemMeta(IMpass);
    i.setItem(24, ISpass);
    
    ItemStack ISsen = new ItemStack(Material.FIREBALL);
    ItemMeta IMsen = ISsen.getItemMeta();
    ArrayList<String> ALsen = new ArrayList();
    ALsen.add("§6Coût : §r§6§l600");
    IMsen.setLore(ALsen);
    IMsen.setDisplayName("§d1 Heure pour sentinel");
    ISsen.setItemMeta(IMsen);
    i.setItem(16, ISsen);
    
    p.openInventory(i);
  }
}
