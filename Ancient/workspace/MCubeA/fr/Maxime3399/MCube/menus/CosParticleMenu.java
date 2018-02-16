package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CosParticleMenu
{
  public CosParticleMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 27, "§b§lParticules");
    
    ItemStack ISremove = new ItemStack(Material.BARRIER);
    ItemMeta IMremove = ISremove.getItemMeta();
    IMremove.setDisplayName("§4§oEnlever");
    ISremove.setItemMeta(IMremove);
    i.setItem(4, ISremove);
    
    ItemStack ISav = new ItemStack(Material.TORCH);
    ItemMeta IMav = ISav.getItemMeta();
    ArrayList<String> ALav = new ArrayList();
    if (MCubeAPI.getCos(p, "angryVillager").equalsIgnoreCase("true")) {
      IMav.setDisplayName("§aAngry Villager");
      ALav.add(" §2§oDébloqué !");
    } else {
      IMav.setDisplayName("§cAngry Villager");
      ALav.add(" §4§oBloqué");
    }
    IMav.setLore(ALav);
    ISav.setItemMeta(IMav);
    i.setItem(9, ISav);
    
    ItemStack ISb = new ItemStack(Material.BARRIER);
    ItemMeta IMb = ISb.getItemMeta();
    ArrayList<String> ALb = new ArrayList();
    if (MCubeAPI.getCos(p, "barrier").equalsIgnoreCase("true")) {
      IMb.setDisplayName("§aBarrier");
      ALb.add(" §2§oDébloqué !");
    } else {
      IMb.setDisplayName("§cBarrier");
      ALb.add(" §4§oBloqué");
    }
    IMb.setLore(ALb);
    ISb.setItemMeta(IMb);
    i.setItem(10, ISb);
    
    ItemStack ISbc = new ItemStack(Material.STONE, 1, (short)5);
    ItemMeta IMbc = ISbc.getItemMeta();
    ArrayList<String> ALbc = new ArrayList();
    if (MCubeAPI.getCos(p, "blockcrack").equalsIgnoreCase("true")) {
      IMbc.setDisplayName("§aBlock Crack");
      ALbc.add(" §2§oDébloqué !");
    } else {
      IMbc.setDisplayName("§cBlock Crack");
      ALbc.add(" §4§oBloqué");
    }
    IMbc.setLore(ALbc);
    ISbc.setItemMeta(IMbc);
    i.setItem(11, ISbc);
    
    ItemStack ISbubble = new ItemStack(Material.SPONGE);
    ItemMeta IMbubble = ISbubble.getItemMeta();
    ArrayList<String> ALbubble = new ArrayList();
    if (MCubeAPI.getCos(p, "bubble").equalsIgnoreCase("true")) {
      IMbubble.setDisplayName("§aBubble");
      ALbubble.add("  §2§oDébloqué !");
    } else {
      IMbubble.setDisplayName("§cBubble");
      ALbubble.add("  §4§oBloqué");
    }
    IMbubble.setLore(ALbubble);
    ISbubble.setItemMeta(IMbubble);
    i.setItem(12, ISbubble);
    
    ItemStack IScloud = new ItemStack(Material.WOOL);
    ItemMeta IMcloud = IScloud.getItemMeta();
    ArrayList<String> ALcloud = new ArrayList();
    if (MCubeAPI.getCos(p, "cloud").equalsIgnoreCase("true")) {
      IMcloud.setDisplayName("§aCloud");
      ALcloud.add("  §2§oDébloqué !");
    } else {
      IMcloud.setDisplayName("§cCloud");
      ALcloud.add("  §4§oBloqué");
    }
    IMcloud.setLore(ALcloud);
    IScloud.setItemMeta(IMcloud);
    i.setItem(13, IScloud);
    
    ItemStack IScrit = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta IMcrit = IScrit.getItemMeta();
    ArrayList<String> ALcrit = new ArrayList();
    if (MCubeAPI.getCos(p, "crit").equalsIgnoreCase("true")) {
      IMcrit.setDisplayName("§aCrit");
      ALcrit.add("  §2§oDébloqué !");
    } else {
      IMcrit.setDisplayName("§cCrit");
      ALcrit.add("  §4§oBloqué");
    }
    IMcrit.setLore(ALcrit);
    IScrit.setItemMeta(IMcrit);
    i.setItem(14, IScrit);
    
    ItemStack ISdi = new ItemStack(Material.MAGMA);
    ItemMeta IMdi = ISdi.getItemMeta();
    ArrayList<String> ALdi = new ArrayList();
    if (MCubeAPI.getCos(p, "damageIndicator").equalsIgnoreCase("true")) {
      IMdi.setDisplayName("§aDamage Indicator");
      ALdi.add("  §2§oDébloqué !");
    } else {
      IMdi.setDisplayName("§cDamage Indicator");
      ALdi.add("  §4§oBloqué");
    }
    IMdi.setLore(ALdi);
    ISdi.setItemMeta(IMdi);
    i.setItem(15, ISdi);
    
    ItemStack ISds = new ItemStack(Material.BEDROCK);
    ItemMeta IMds = ISds.getItemMeta();
    ArrayList<String> ALds = new ArrayList();
    if (MCubeAPI.getCos(p, "depthsuspend").equalsIgnoreCase("true")) {
      IMds.setDisplayName("§aDepth Suspend");
      ALds.add("  §2§oDébloqué !");
    } else {
      IMds.setDisplayName("§cDepth Suspend");
      ALds.add("  §4§oBloqué");
    }
    IMds.setLore(ALds);
    ISds.setItemMeta(IMds);
    i.setItem(16, ISds);
    
    ItemStack ISdb = new ItemStack(Material.DRAGONS_BREATH);
    ItemMeta IMdb = ISdb.getItemMeta();
    ArrayList<String> ALdb = new ArrayList();
    if (MCubeAPI.getCos(p, "dragonbreath").equalsIgnoreCase("true")) {
      IMdb.setDisplayName("§aDragon Breath");
      ALdb.add("  §2§oDébloqué !");
    } else {
      IMdb.setDisplayName("§cDragon Breath");
      ALdb.add("  §4§oBloqué");
    }
    IMdb.setLore(ALdb);
    ISdb.setItemMeta(IMdb);
    i.setItem(17, ISdb);
    
    ItemStack ISdripl = new ItemStack(Material.LAVA_BUCKET);
    ItemMeta IMdripl = ISdripl.getItemMeta();
    ArrayList<String> ALdripl = new ArrayList();
    if (MCubeAPI.getCos(p, "dripLava").equalsIgnoreCase("true")) {
      IMdripl.setDisplayName("§aDrip Lava");
      ALdripl.add("  §2§oDébloqué !");
    } else {
      IMdripl.setDisplayName("§cDrip Lava");
      ALdripl.add("  §4§oBloqué");
    }
    IMdripl.setLore(ALdripl);
    ISdripl.setItemMeta(IMdripl);
    i.setItem(18, ISdripl);
    
    ItemStack ISdripw = new ItemStack(Material.WATER_BUCKET);
    ItemMeta IMdripw = ISdripw.getItemMeta();
    ArrayList<String> ALdripw = new ArrayList();
    if (MCubeAPI.getCos(p, "dripWater").equalsIgnoreCase("true")) {
      IMdripw.setDisplayName("§aDrip Water");
      ALdripw.add("  §2§oDébloqué !");
    } else {
      IMdripw.setDisplayName("§cDrip Water");
      ALdripw.add("  §4§oBloqué");
    }
    IMdripw.setLore(ALdripw);
    ISdripw.setItemMeta(IMdripw);
    i.setItem(19, ISdripw);
    
    ItemStack ISdrop = new ItemStack(Material.SPLASH_POTION);
    ItemMeta IMdrop = ISdrop.getItemMeta();
    ArrayList<String> ALdrop = new ArrayList();
    if (MCubeAPI.getCos(p, "droplet").equalsIgnoreCase("true")) {
      IMdrop.setDisplayName("§aDroplet");
      ALdrop.add("  §2§oDébloqué !");
    } else {
      IMdrop.setDisplayName("§cDroplet");
      ALdrop.add("  §4§oBloqué");
    }
    IMdrop.setLore(ALdrop);
    ISdrop.setItemMeta(IMdrop);
    i.setItem(20, ISdrop);
    
    ItemStack ISench = new ItemStack(Material.ENCHANTMENT_TABLE);
    ItemMeta IMench = ISench.getItemMeta();
    ArrayList<String> ALench = new ArrayList();
    if (MCubeAPI.getCos(p, "enchantmenttable").equalsIgnoreCase("true")) {
      IMench.setDisplayName("§aEnchantment Table");
      ALench.add("  §2§oDébloqué !");
    } else {
      IMench.setDisplayName("§cEnchantement Table");
      ALench.add("  §4§oBloqué");
    }
    IMench.setLore(ALench);
    ISench.setItemMeta(IMench);
    i.setItem(21, ISench);
    
    ItemStack ISer = new ItemStack(Material.END_ROD);
    ItemMeta IMer = ISer.getItemMeta();
    ArrayList<String> ALer = new ArrayList();
    if (MCubeAPI.getCos(p, "endRod").equalsIgnoreCase("true")) {
      IMer.setDisplayName("§aEnd Rod");
      ALer.add("  §2§oDébloqué !");
    } else {
      IMer.setDisplayName("§cEnd Rod");
      ALer.add("  §4§oBloqué");
    }
    IMer.setLore(ALer);
    ISer.setItemMeta(IMer);
    i.setItem(22, ISer);
    
    ItemStack ISfd = new ItemStack(Material.DISPENSER);
    ItemMeta IMfd = ISfd.getItemMeta();
    ArrayList<String> ALfd = new ArrayList();
    if (MCubeAPI.getCos(p, "fallingDust").equalsIgnoreCase("true")) {
      IMfd.setDisplayName("§aFalling Dust");
      ALfd.add("  §2§oDébloqué !");
    } else {
      IMfd.setDisplayName("§cFalling Dust");
      ALfd.add("  §4§oBloqué");
    }
    IMfd.setLore(ALfd);
    ISfd.setItemMeta(IMfd);
    i.setItem(23, ISfd);
    
    ItemStack ISfw = new ItemStack(Material.FIREWORK);
    ItemMeta IMfw = ISfw.getItemMeta();
    ArrayList<String> ALfw = new ArrayList();
    if (MCubeAPI.getCos(p, "fireworksSpark").equalsIgnoreCase("true")) {
      IMfw.setDisplayName("§aFireworks Spark");
      ALfw.add("  §2§oDébloqué !");
    } else {
      IMfw.setDisplayName("§cFireworks Spark");
      ALfw.add("  §4§oBloqué");
    }
    IMfw.setLore(ALfw);
    ISfw.setItemMeta(IMfw);
    i.setItem(24, ISfw);
    
    ItemStack ISfla = new ItemStack(Material.FLINT_AND_STEEL);
    ItemMeta IMfla = ISfla.getItemMeta();
    ArrayList<String> ALfla = new ArrayList();
    if (MCubeAPI.getCos(p, "flame").equalsIgnoreCase("true")) {
      IMfla.setDisplayName("§aFlame");
      ALfla.add("  §2§oDébloqué !");
    } else {
      IMfla.setDisplayName("§cFlame");
      ALfla.add("  §4§oBloqué");
    }
    IMfla.setLore(ALfla);
    ISfla.setItemMeta(IMfla);
    i.setItem(25, ISfla);
    
    ItemStack IShv = new ItemStack(Material.EMERALD);
    ItemMeta IMhv = ISfla.getItemMeta();
    ArrayList<String> ALhv = new ArrayList();
    if (MCubeAPI.getCos(p, "happyVillager").equalsIgnoreCase("true")) {
      IMhv.setDisplayName("§aHappy Villager");
      ALhv.add("  §2§oDébloqué !");
    } else {
      IMhv.setDisplayName("§cHappy Villager");
      ALhv.add("  §4§oBloqué");
    }
    IMhv.setLore(ALhv);
    IShv.setItemMeta(IMhv);
    i.setItem(26, IShv);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(8, ISre);
    
    p.openInventory(i);
  }
}
