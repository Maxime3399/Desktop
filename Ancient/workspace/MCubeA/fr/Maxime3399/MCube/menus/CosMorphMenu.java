package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SpawnEggMeta;

public class CosMorphMenu
{
  public CosMorphMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 18, "§6§lTransformations");
    
    ItemStack ISremove = new ItemStack(Material.BARRIER);
    ItemMeta IMremove = ISremove.getItemMeta();
    IMremove.setDisplayName("§4§oEnlever");
    ISremove.setItemMeta(IMremove);
    i.setItem(4, ISremove);
    
    ItemStack ISch = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMch = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALch = new ArrayList();
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) {
      SMch.setDisplayName("§cPoule");
      ALch.add(" §4§oBloqué");
      ALch.add(" ");
      ALch.add("§cRéservé aux Mini-VIP ou plus !");
    } else {
      SMch.setDisplayName("§aPoule");
      ALch.add(" §2§oDébloqué !");
    }
    SMch.setLore(ALch);
    SMch.setSpawnedType(EntityType.CHICKEN);
    ISch.setItemMeta(SMch);
    i.setItem(9, ISch);
    
    ItemStack ISpig = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMpig = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALpig = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip"))) {
      SMpig.setDisplayName("§cCochon");
      ALpig.add(" §4§oBloqué");
      ALpig.add(" ");
      ALpig.add("§cRéservé aux VIP ou plus !");
    } else {
      SMpig.setDisplayName("§aCochon");
      ALpig.add(" §2§oDébloqué !");
    }
    SMpig.setLore(ALpig);
    SMpig.setSpawnedType(EntityType.PIG);
    ISpig.setItemMeta(SMpig);
    i.setItem(10, ISpig);
    
    ItemStack ISsh = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMsh = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALsh = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip"))) {
      SMsh.setDisplayName("§cMouton");
      ALsh.add(" §4§oBloqué");
      ALsh.add(" ");
      ALsh.add("§cRéservé aux VIP+ ou plus !");
    } else {
      SMsh.setDisplayName("§aMouton");
      ALsh.add(" §2§oDébloqué !");
    }
    SMsh.setLore(ALsh);
    SMsh.setSpawnedType(EntityType.SHEEP);
    ISsh.setItemMeta(SMsh);
    i.setItem(11, ISsh);
    
    ItemStack IScow = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMcow = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALcow = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+"))) {
      SMcow.setDisplayName("§cVache");
      ALcow.add(" §4§oBloqué");
      ALcow.add(" ");
      ALcow.add("§cRéservé aux UltraVIP ou plus !");
    } else {
      SMcow.setDisplayName("§aVache");
      ALcow.add(" §2§oDébloqué !");
    }
    SMcow.setLore(ALcow);
    SMcow.setSpawnedType(EntityType.COW);
    IScow.setItemMeta(SMcow);
    i.setItem(12, IScow);
    
    ItemStack IShor = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMhor = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALhor = new ArrayList();
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))) {
      SMhor.setDisplayName("§cCheval");
      ALhor.add(" §4§oBloqué");
      ALhor.add(" ");
      ALhor.add("§7§oBientôt...");
    } else {
      SMhor.setDisplayName("§aCheval");
      ALhor.add(" §2§oDébloqué !");
    }
    SMhor.setLore(ALhor);
    SMhor.setSpawnedType(EntityType.HORSE);
    IShor.setItemMeta(SMhor);
    i.setItem(13, IShor);
    
    ItemStack ISvilla = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMvilla = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALvilla = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) >= 46) {
      SMvilla.setDisplayName("§aVillageois");
      ALvilla.add(" §2§oDébloqué !");
    } else {
      SMvilla.setDisplayName("§cVillageois");
      ALvilla.add(" §4§oBloqué");
      ALvilla.add(" ");
      ALvilla.add("§6Quêtes §3: §e" + MCubeAPI.getCurrentQuest(p) + "§r§d/45");
    }
    SMvilla.setLore(ALvilla);
    SMvilla.setSpawnedType(EntityType.VILLAGER);
    ISvilla.setItemMeta(SMvilla);
    i.setItem(14, ISvilla);
    
    ItemStack ISbun = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMbun = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALbun = new ArrayList();
    if (MCubeAPI.isDonator(p).equalsIgnoreCase("false")) {
      SMbun.setDisplayName("§cLapin");
      ALbun.add(" §4§oBloqué");
      ALbun.add(" ");
      ALbun.add("§cRéservé aux donateurs !");
    } else {
      SMbun.setDisplayName("§aLapin");
      ALbun.add(" §2§oDébloqué !");
    }
    SMbun.setLore(ALbun);
    SMbun.setSpawnedType(EntityType.RABBIT);
    ISbun.setItemMeta(SMbun);
    i.setItem(15, ISbun);
    
    ItemStack ISocel = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMocel = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALocel = new ArrayList();
    if (MCubeAPI.getCos(p, "ocelot").equalsIgnoreCase("true")) {
      SMocel.setDisplayName("§aOcelot");
      ALocel.add(" §2§oDébloqué !");
    } else {
      SMocel.setDisplayName("§cOcelot");
      ALocel.add(" §4§oBloqué");
      ALocel.add(" ");
      ALocel.add("§eAchetable sur la boutique ou gagnable");
      ALocel.add("§edurant un event");
    }
    SMocel.setLore(ALocel);
    SMocel.setSpawnedType(EntityType.OCELOT);
    ISocel.setItemMeta(SMocel);
    i.setItem(16, ISocel);
    
    ItemStack ISwolf = new ItemStack(Material.MONSTER_EGG);
    SpawnEggMeta SMwolf = (SpawnEggMeta)ISch.getItemMeta();
    ArrayList<String> ALwolf = new ArrayList();
    if (MCubeAPI.getCos(p, "wolf").equalsIgnoreCase("true")) {
      SMwolf.setDisplayName("§aLoup");
      ALwolf.add(" §2§oDébloqué !");
    } else {
      SMwolf.setDisplayName("§cLoup");
      ALwolf.add(" §4§oBloqué");
      ALwolf.add(" ");
      ALwolf.add("§eAchetable sur la boutique ou gagnable");
      ALwolf.add("§edurant un event");
    }
    SMwolf.setLore(ALwolf);
    SMwolf.setSpawnedType(EntityType.WOLF);
    ISwolf.setItemMeta(SMwolf);
    i.setItem(17, ISwolf);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(8, ISre);
    
    p.openInventory(i);
  }
}
