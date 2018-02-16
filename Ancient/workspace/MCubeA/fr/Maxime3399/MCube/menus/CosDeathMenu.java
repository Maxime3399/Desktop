package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class CosDeathMenu
{
  public CosDeathMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 18, "§c§lEffets de mort");
    
    ItemStack ISremove = new ItemStack(Material.BARRIER);
    ItemMeta IMremove = ISremove.getItemMeta();
    IMremove.setDisplayName("§4§oEnlever");
    ISremove.setItemMeta(IMremove);
    i.setItem(4, ISremove);
    
    ItemStack ISlight = new ItemStack(Material.BLAZE_POWDER);
    ItemMeta IMlight = ISlight.getItemMeta();
    ArrayList<String> ALlight = new ArrayList();
    if (MCubeAPI.getCos(p, "lightDeath").equalsIgnoreCase("true")) {
      IMlight.setDisplayName("§aEclairs");
      ALlight.add(" §2§oDébloqué !");
    } else {
      IMlight.setDisplayName("§cEclairs");
      ALlight.add(" §4§oBloqué");
    }
    IMlight.setLore(ALlight);
    ISlight.setItemMeta(IMlight);
    i.setItem(9, ISlight);
    
    ItemStack ISblood = new ItemStack(351, 1, (short)1);
    ItemMeta IMblood = ISblood.getItemMeta();
    ArrayList<String> ALblood = new ArrayList();
    if (MCubeAPI.getCos(p, "bloodDeath").equalsIgnoreCase("true")) {
      IMblood.setDisplayName("§aSang");
      ALblood.add(" §2§oDébloqué !");
    } else {
      IMblood.setDisplayName("§cSang");
      ALblood.add(" §4§oBloqué");
    }
    IMblood.setLore(ALblood);
    ISblood.setItemMeta(IMblood);
    i.setItem(10, ISblood);
    
    ItemStack ISbone = new ItemStack(Material.BONE);
    ItemMeta IMbone = ISbone.getItemMeta();
    ArrayList<String> ALbone = new ArrayList();
    if (MCubeAPI.getCos(p, "boneDeath").equalsIgnoreCase("true")) {
      IMbone.setDisplayName("§aOs");
      ALbone.add(" §2§oDébloqué !");
    } else {
      IMbone.setDisplayName("§cOs");
      ALbone.add(" §4§oBloqué");
    }
    IMbone.setLore(ALbone);
    ISbone.setItemMeta(IMbone);
    i.setItem(11, ISbone);
    
    ItemStack IStext = new ItemStack(Material.SIGN);
    ItemMeta IMtext = IStext.getItemMeta();
    ArrayList<String> ALtext = new ArrayList();
    if (MCubeAPI.getCos(p, "textDeath").equalsIgnoreCase("true")) {
      IMtext.setDisplayName("§aTexte Flottant");
      ALtext.add(" §2§oDébloqué !");
    } else {
      IMtext.setDisplayName("§cTexte Flottant");
      ALtext.add(" §4§oBloqué");
    }
    IMtext.setLore(ALtext);
    IStext.setItemMeta(IMtext);
    i.setItem(12, IStext);
    
    ItemStack ISexplode = new ItemStack(Material.TNT);
    ItemMeta IMexplode = ISexplode.getItemMeta();
    ArrayList<String> ALexplode = new ArrayList();
    if (MCubeAPI.getCos(p, "explodeDeath").equalsIgnoreCase("true")) {
      IMexplode.setDisplayName("§aExplosion");
      ALexplode.add(" §2§oDébloqué !");
    } else {
      IMexplode.setDisplayName("§cExplosion");
      ALexplode.add(" §4§oBloqué");
    }
    IMexplode.setLore(ALexplode);
    ISexplode.setItemMeta(IMexplode);
    i.setItem(13, ISexplode);
    
    ItemStack IScorpse = new ItemStack(Material.ARMOR_STAND);
    ItemMeta IMcorpse = IScorpse.getItemMeta();
    ArrayList<String> ALcorpse = new ArrayList();
    if (MCubeAPI.getCos(p, "corpseDeath").equalsIgnoreCase("true")) {
      IMcorpse.setDisplayName("§aCadavre");
      ALcorpse.add(" §2§oDébloqué !");
    } else {
      IMcorpse.setDisplayName("§cCadavre");
      ALcorpse.add(" §4§oBloqué");
    }
    IMcorpse.setLore(ALcorpse);
    IScorpse.setItemMeta(IMcorpse);
    i.setItem(14, IScorpse);
    
    ItemStack ISciel = new ItemStack(Material.FEATHER);
    ItemMeta IMciel = ISciel.getItemMeta();
    ArrayList<String> ALciel = new ArrayList();
    if (MCubeAPI.getCos(p, "cielDeath").equalsIgnoreCase("true")) {
      IMciel.setDisplayName("§aCiel");
      ALciel.add(" §2§oDébloqué !");
    } else {
      IMciel.setDisplayName("§cCiel");
      ALciel.add(" §4§oBloqué");
    }
    IMciel.setLore(ALciel);
    ISciel.setItemMeta(IMciel);
    i.setItem(15, ISciel);
    
    ItemStack ISenfer = new ItemStack(Material.NETHERRACK);
    ItemMeta IMenfer = ISenfer.getItemMeta();
    ArrayList<String> ALenfer = new ArrayList();
    if (MCubeAPI.getCos(p, "enferDeath").equalsIgnoreCase("true")) {
      IMenfer.setDisplayName("§aEnfer");
      ALenfer.add(" §2§oDébloqué !");
    } else {
      IMenfer.setDisplayName("§cEnfer");
      ALenfer.add(" §4§oBloqué");
    }
    IMenfer.setLore(ALenfer);
    ISenfer.setItemMeta(IMenfer);
    i.setItem(16, ISenfer);
    
    ItemStack ISbalise = new ItemStack(Material.BEACON);
    ItemMeta IMbalise = ISbalise.getItemMeta();
    ArrayList<String> ALbalise = new ArrayList();
    if (MCubeAPI.getCos(p, "baliseDeath").equalsIgnoreCase("true")) {
      IMbalise.setDisplayName("§aBalise");
      ALbalise.add(" §2§oDébloqué !");
    } else {
      IMbalise.setDisplayName("§cBalise");
      ALbalise.add(" §4§oBloqué");
    }
    IMbalise.setLore(ALbalise);
    ISbalise.setItemMeta(IMbalise);
    i.setItem(17, ISbalise);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(8, ISre);
    
    p.openInventory(i);
  }
}
