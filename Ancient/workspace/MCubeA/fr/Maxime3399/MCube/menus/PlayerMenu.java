package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class PlayerMenu
{
  public PlayerMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 45, "§e§lProfile");
    
    ItemStack IScoal = new ItemStack(Material.COAL);
    ItemMeta IMcoal = IScoal.getItemMeta();
    ArrayList<String> ALcoal = new ArrayList();
    ALcoal.add("§eTrophés : §r§e§l0 +");
    IMcoal.setLore(ALcoal);
    IMcoal.setDisplayName("§8Charbon");
    IScoal.setItemMeta(IMcoal);
    i.setItem(0, IScoal);
    
    ItemStack ISbronze = new ItemStack(336);
    ItemMeta IMbronze = ISbronze.getItemMeta();
    ArrayList<String> ALbronze = new ArrayList();
    ALbronze.add("§eTrophés : §r§e§l1 500 +");
    IMbronze.setLore(ALbronze);
    IMbronze.setDisplayName("§6Bronze");
    ISbronze.setItemMeta(IMbronze);
    i.setItem(1, ISbronze);
    
    ItemStack ISiron = new ItemStack(Material.IRON_INGOT);
    ItemMeta IMiron = ISiron.getItemMeta();
    ArrayList<String> ALiron = new ArrayList();
    ALiron.add("§eTrophés : §r§e§l2 500 +");
    IMiron.setLore(ALiron);
    IMiron.setDisplayName("§fFer");
    ISiron.setItemMeta(IMiron);
    i.setItem(2, ISiron);
    
    ItemStack ISred = new ItemStack(Material.REDSTONE_BLOCK);
    ItemMeta IMred = ISred.getItemMeta();
    ArrayList<String> ALred = new ArrayList();
    ALred.add("§eTrophés : §r§e§l4 000 +");
    IMred.setLore(ALiron);
    IMred.setDisplayName("§cRedstone");
    ISred.setItemMeta(IMred);
    i.setItem(3, ISred);
    
    ItemStack ISlapis = new ItemStack(Material.LAPIS_BLOCK);
    ItemMeta IMlapis = ISlapis.getItemMeta();
    ArrayList<String> ALlapis = new ArrayList();
    ALlapis.add("§eTrophés : §r§e§l6 000 +");
    IMlapis.setLore(ALlapis);
    IMlapis.setDisplayName("§9Lapis");
    ISlapis.setItemMeta(IMlapis);
    i.setItem(4, ISlapis);
    
    ItemStack ISgold = new ItemStack(Material.GOLD_INGOT);
    ItemMeta IMgold = ISgold.getItemMeta();
    ArrayList<String> ALgold = new ArrayList();
    ALgold.add("§eTrophés : §r§e§l8 500 +");
    IMgold.setLore(ALgold);
    IMgold.setDisplayName("§eOr");
    ISgold.setItemMeta(IMgold);
    i.setItem(5, ISgold);
    
    ItemStack ISdiam = new ItemStack(Material.DIAMOND);
    ItemMeta IMdiam = ISdiam.getItemMeta();
    ArrayList<String> ALdiam = new ArrayList();
    ALdiam.add("§eTrophés : §r§e§l11 500 +");
    IMdiam.setLore(ALdiam);
    IMdiam.setDisplayName("§bDiamant");
    ISdiam.setItemMeta(IMdiam);
    i.setItem(6, ISdiam);
    
    ItemStack ISeme = new ItemStack(Material.EMERALD);
    ItemMeta IMeme = ISeme.getItemMeta();
    ArrayList<String> ALeme = new ArrayList();
    ALeme.add("§eTrophés : §r§e§l15 000 +");
    IMeme.setLore(ALeme);
    IMeme.setDisplayName("§aEmeraude");
    ISeme.setItemMeta(IMeme);
    i.setItem(7, ISeme);
    
    ItemStack ISleg = new ItemStack(Material.NETHER_STAR);
    ItemMeta IMleg = ISleg.getItemMeta();
    ArrayList<String> ALleg = new ArrayList();
    ALleg.add("§eTrophés : §r§e§l20 000 +");
    IMleg.setLore(ALleg);
    IMleg.setDisplayName("§3Légende");
    ISleg.setItemMeta(IMleg);
    i.setItem(8, ISleg);
    
    int trophies = MCubeAPI.getPlayerTrophies(p);
    ItemStack ISskull = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
    SkullMeta SMskull = (SkullMeta)ISskull.getItemMeta();
    ArrayList<String> ALskull = new ArrayList();
    ALskull.add("§eTrophés : §r§e§l" + trophies);
    SMskull.setLore(ALskull);
    SMskull.setOwner(p.getName());
    SMskull.setDisplayName(p.getDisplayName());
    ISskull.setItemMeta(SMskull);
    if (trophies >= 20000) {
      i.setItem(17, ISskull);
    } else if (trophies >= 15000) {
      i.setItem(16, ISskull);
    } else if (trophies >= 11500) {
      i.setItem(15, ISskull);
    } else if (trophies >= 8500) {
      i.setItem(14, ISskull);
    } else if (trophies >= 6000) {
      i.setItem(13, ISskull);
    } else if (trophies >= 4000) {
      i.setItem(12, ISskull);
    } else if (trophies >= 2500) {
      i.setItem(11, ISskull);
    } else if (trophies >= 1500) {
      i.setItem(10, ISskull);
    } else {
      i.setItem(9, ISskull);
    }
    
    ItemStack IScoins = new ItemStack(Material.GOLD_NUGGET);
    ItemMeta IMcoins = IScoins.getItemMeta();
    IMcoins.setDisplayName("§6Coins : §r§6§l" + MCubeAPI.getPlayerCoins(p));
    IScoins.setItemMeta(IMcoins);
    i.setItem(29, IScoins);
    
    ItemStack IStro = new ItemStack(Material.ANVIL);
    ItemMeta IMtro = IStro.getItemMeta();
    IMtro.setDisplayName("§eTrophés : §r§e§l" + trophies);
    IStro.setItemMeta(IMtro);
    i.setItem(30, IStro);
    
    ItemStack ISrs = new ItemStack(Material.CHEST);
    ItemMeta IMrs = ISrs.getItemMeta();
    ArrayList<String> ALrs = new ArrayList();
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")) {
      ALrs.add("§f§l[§r§fMini-VIP§r§f§l]");
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")) {
      ALrs.add("§e§l[§r§eVIP§r§e§l]");
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")) {
      ALrs.add("§b§l[§r§bVIP+§r§b§l]");
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) {
      ALrs.add("§a§l[§r§aUltraVIP§r§a§l]");
    } else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+")) {
      ALrs.add("§2§l[§r§2UltraVIP+§r§2§l]");
    } else {
      ALrs.add("§7Joueur");
    }
    IMrs.setLore(ALrs);
    IMrs.setDisplayName("§bGrade");
    ISrs.setItemMeta(IMrs);
    i.setItem(32, ISrs);
    
    ItemStack ISrb = new ItemStack(Material.ENDER_CHEST);
    ItemMeta IMrb = ISrb.getItemMeta();
    ArrayList<String> ALrb = new ArrayList();
    String battlerank = "none";
    if (trophies >= 20000) {
      battlerank = "§3Légende";
    } else if (trophies >= 15000) {
      battlerank = "§aEmeraude";
    } else if (trophies >= 11500) {
      battlerank = "§bDiamant";
    } else if (trophies >= 8500) {
      battlerank = "§eOr";
    } else if (trophies >= 6000) {
      battlerank = "§9Lapis";
    } else if (trophies >= 4000) {
      battlerank = "§cRedstone";
    } else if (trophies >= 2500) {
      battlerank = "§fFer";
    } else if (trophies >= 1500) {
      battlerank = "§6Bronze";
    } else {
      battlerank = "§8Charbon";
    }
    ALrb.add(battlerank);
    IMrb.setLore(ALrb);
    IMrb.setDisplayName("§2Rang");
    ISrb.setItemMeta(IMrb);
    i.setItem(33, ISrb);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(44, ISre);
    
    p.openInventory(i);
  }
}
