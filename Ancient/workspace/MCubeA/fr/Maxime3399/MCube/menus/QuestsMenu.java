package fr.Maxime3399.MCube.menus;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestsMenu
{
  public QuestsMenu() {}
  
  public static void openMenu(Player p)
  {
    Inventory i = Bukkit.createInventory(null, 54, "§c§lQuêtes");
    
    ItemStack IS1 = new ItemStack(Material.STONE);
    ItemMeta IM1 = IS1.getItemMeta();
    ArrayList<String> AL1 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 1) {
      IS1.setType(Material.REDSTONE_BLOCK);
      IM1.setDisplayName("§c§lQuête 1");
      AL1.add("§cTermine les quêtes antérieures pour");
      AL1.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 1) {
      IS1.setType(Material.QUARTZ_BLOCK);
      IM1.setDisplayName("§9§lQuête 1");
      AL1.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 1) {
      IS1.setType(Material.SLIME_BLOCK);
      IM1.setDisplayName("§a§lQuête 1");
      AL1.add("§eProgression :");
      AL1.add("  §f- §r§3Miner §r§b§l> §r§6Charbon §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM1.setLore(AL1);
    IS1.setItemMeta(IM1);
    i.setItem(0, IS1);
    
    ItemStack IS2 = new ItemStack(Material.STONE);
    ItemMeta IM2 = IS2.getItemMeta();
    ArrayList<String> AL2 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 2) {
      IS2.setType(Material.REDSTONE_BLOCK);
      IM2.setDisplayName("§c§lQuête 2");
      AL2.add("§cTermine les quêtes antérieures pour");
      AL2.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 2) {
      IS2.setType(Material.QUARTZ_BLOCK);
      IM2.setDisplayName("§9§lQuête 2");
      AL2.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 2) {
      IS2.setType(Material.SLIME_BLOCK);
      IM2.setDisplayName("§a§lQuête 2");
      AL2.add("§eProgression :");
      AL2.add("  §f- §r§3Miner §r§b§l> §r§6Fer §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM2.setLore(AL2);
    IS2.setItemMeta(IM2);
    i.setItem(1, IS2);
    
    ItemStack IS3 = new ItemStack(Material.STONE);
    ItemMeta IM3 = IS3.getItemMeta();
    ArrayList<String> AL3 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 3) {
      IS3.setType(Material.REDSTONE_BLOCK);
      IM3.setDisplayName("§c§lQuête 3");
      AL3.add("§cTermine les quêtes antérieures pour");
      AL3.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 3) {
      IS3.setType(Material.QUARTZ_BLOCK);
      IM3.setDisplayName("§9§lQuête 3");
      AL3.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 3) {
      IS3.setType(Material.SLIME_BLOCK);
      IM3.setDisplayName("§a§lQuête 3");
      AL3.add("§eProgression :");
      AL3.add("  §f- §r§3Miner §r§b§l> §r§6Redstone §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM3.setLore(AL3);
    IS3.setItemMeta(IM3);
    i.setItem(2, IS3);
    
    ItemStack IS4 = new ItemStack(Material.STONE);
    ItemMeta IM4 = IS4.getItemMeta();
    ArrayList<String> AL4 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 4) {
      IS4.setType(Material.REDSTONE_BLOCK);
      IM4.setDisplayName("§c§lQuête 4");
      AL4.add("§cTermine les quêtes antérieures pour");
      AL4.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 4) {
      IS4.setType(Material.QUARTZ_BLOCK);
      IM4.setDisplayName("§9§lQuête 4");
      AL4.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 4) {
      IS4.setType(Material.SLIME_BLOCK);
      IM4.setDisplayName("§a§lQuête 4");
      AL4.add("§eProgression :");
      AL4.add("  §f- §r§3Miner §r§b§l> §r§6Or §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM4.setLore(AL4);
    IS4.setItemMeta(IM4);
    i.setItem(3, IS4);
    
    ItemStack IS5 = new ItemStack(Material.STONE);
    ItemMeta IM5 = IS5.getItemMeta();
    ArrayList<String> AL5 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 5) {
      IS5.setType(Material.REDSTONE_BLOCK);
      IM5.setDisplayName("§c§lQuête 5");
      AL5.add("§cTermine les quêtes antérieures pour");
      AL5.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 5) {
      IS5.setType(Material.QUARTZ_BLOCK);
      IM5.setDisplayName("§9§lQuête 5");
      AL5.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 5) {
      IS5.setType(Material.SLIME_BLOCK);
      IM5.setDisplayName("§a§lQuête 5");
      AL5.add("§eProgression :");
      AL5.add("  §f- §r§3Miner §r§b§l> §r§6Lapis §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM5.setLore(AL5);
    IS5.setItemMeta(IM5);
    i.setItem(4, IS5);
    
    ItemStack IS6 = new ItemStack(Material.STONE);
    ItemMeta IM6 = IS6.getItemMeta();
    ArrayList<String> AL6 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 6) {
      IS6.setType(Material.REDSTONE_BLOCK);
      IM6.setDisplayName("§c§lQuête 6");
      AL6.add("§cTermine les quêtes antérieures pour");
      AL6.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 6) {
      IS6.setType(Material.QUARTZ_BLOCK);
      IM6.setDisplayName("§9§lQuête 6");
      AL6.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 6) {
      IS6.setType(Material.SLIME_BLOCK);
      IM6.setDisplayName("§a§lQuête 6");
      AL6.add("§eProgression :");
      AL6.add("  §f- §r§3Miner §r§b§l> §r§6Diamant §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM6.setLore(AL6);
    IS6.setItemMeta(IM6);
    i.setItem(5, IS6);
    
    ItemStack IS7 = new ItemStack(Material.STONE);
    ItemMeta IM7 = IS7.getItemMeta();
    ArrayList<String> AL7 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 7) {
      IS7.setType(Material.REDSTONE_BLOCK);
      IM7.setDisplayName("§c§lQuête 7");
      AL7.add("§cTermine les quêtes antérieures pour");
      AL7.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 7) {
      IS7.setType(Material.QUARTZ_BLOCK);
      IM7.setDisplayName("§9§lQuête 7");
      AL7.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 7) {
      IS7.setType(Material.SLIME_BLOCK);
      IM7.setDisplayName("§a§lQuête 7");
      AL7.add("§eProgression :");
      AL7.add("  §f- §r§3Miner §r§b§l> §r§6Emeraude §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM7.setLore(AL7);
    IS7.setItemMeta(IM7);
    i.setItem(6, IS7);
    
    ItemStack IS8 = new ItemStack(Material.STONE);
    ItemMeta IM8 = IS8.getItemMeta();
    ArrayList<String> AL8 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 8) {
      IS8.setType(Material.REDSTONE_BLOCK);
      IM8.setDisplayName("§c§lQuête 8");
      AL8.add("§cTermine les quêtes antérieures pour");
      AL8.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 8) {
      IS8.setType(Material.QUARTZ_BLOCK);
      IM8.setDisplayName("§9§lQuête 8");
      AL8.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 8) {
      IS8.setType(Material.SLIME_BLOCK);
      IM8.setDisplayName("§a§lQuête 8");
      AL8.add("§eProgression :");
      AL8.add("  §f- §r§3Miner §r§b§l> §r§6Obsidienne §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/8");
    }
    IM8.setLore(AL8);
    IS8.setItemMeta(IM8);
    i.setItem(7, IS8);
    
    ItemStack IS9 = new ItemStack(Material.STONE);
    ItemMeta IM9 = IS8.getItemMeta();
    ArrayList<String> AL9 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 9) {
      IS9.setType(Material.REDSTONE_BLOCK);
      IM9.setDisplayName("§c§lQuête 9");
      AL9.add("§cTermine les quêtes antérieures pour");
      AL9.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 9) {
      IS9.setType(Material.QUARTZ_BLOCK);
      IM9.setDisplayName("§9§lQuête 9");
      AL9.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 9) {
      IS9.setType(Material.SLIME_BLOCK);
      IM9.setDisplayName("§a§lQuête 9");
      AL9.add("§eProgression :");
      AL9.add("  §f- §r§3Miner §r§b§l> §r§6Quartz §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/12");
    }
    IM9.setLore(AL9);
    IS9.setItemMeta(IM9);
    i.setItem(8, IS9);
    
    ItemStack IS10 = new ItemStack(Material.STONE);
    ItemMeta IM10 = IS10.getItemMeta();
    ArrayList<String> AL10 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 10) {
      IS10.setType(Material.REDSTONE_BLOCK);
      IM10.setDisplayName("§c§lQuête 10");
      AL10.add("§cTermine les quêtes antérieures pour");
      AL10.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 10) {
      IS10.setType(Material.QUARTZ_BLOCK);
      IM10.setDisplayName("§9§lQuête 10");
      AL10.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 10) {
      IS10.setType(Material.SLIME_BLOCK);
      IM10.setDisplayName("§a§lQuête 10");
      AL10.add("§eProgression :");
      AL10.add("  §f- §r§3Miner §r§b§l> §r§6Glowstone §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/16");
    }
    IM10.setLore(AL10);
    IS10.setItemMeta(IM10);
    i.setItem(9, IS10);
    
    ItemStack IS11 = new ItemStack(Material.STONE);
    ItemMeta IM11 = IS11.getItemMeta();
    ArrayList<String> AL11 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 11) {
      IS11.setType(Material.REDSTONE_BLOCK);
      IM11.setDisplayName("§c§lQuête 11");
      AL11.add("§cTermine les quêtes antérieures pour");
      AL11.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 11) {
      IS11.setType(Material.QUARTZ_BLOCK);
      IM11.setDisplayName("§9§lQuête 11");
      AL11.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 11) {
      IS11.setType(Material.SLIME_BLOCK);
      IM11.setDisplayName("§a§lQuête 11");
      AL11.add("§eProgression :");
      AL11.add("  §f- §r§3Miner §r§b§l> §r§6Roche du nether §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/64");
      AL11.add("  §f- §r§3Miner §r§b§l> §r§6Brique du nether §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/32");
    }
    IM11.setLore(AL11);
    IS11.setItemMeta(IM11);
    i.setItem(10, IS11);
    
    ItemStack IS12 = new ItemStack(Material.STONE);
    ItemMeta IM12 = IS12.getItemMeta();
    ArrayList<String> AL12 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 12) {
      IS12.setType(Material.REDSTONE_BLOCK);
      IM12.setDisplayName("§c§lQuête 12");
      AL12.add("§cTermine les quêtes antérieures pour");
      AL12.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 12) {
      IS12.setType(Material.QUARTZ_BLOCK);
      IM12.setDisplayName("§9§lQuête 12");
      AL12.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 12) {
      IS12.setType(Material.SLIME_BLOCK);
      IM12.setDisplayName("§a§lQuête 12");
      AL12.add("§eProgression :");
      AL12.add("  §f- §r§3Tuer §r§b§l> §r§6Blaze §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/8");
    }
    IM12.setLore(AL12);
    IS12.setItemMeta(IM12);
    i.setItem(11, IS12);
    
    ItemStack IS13 = new ItemStack(Material.STONE);
    ItemMeta IM13 = IS13.getItemMeta();
    ArrayList<String> AL13 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 13) {
      IS13.setType(Material.REDSTONE_BLOCK);
      IM13.setDisplayName("§c§lQuête 13");
      AL13.add("§cTermine les quêtes antérieures pour");
      AL13.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 13) {
      IS13.setType(Material.QUARTZ_BLOCK);
      IM13.setDisplayName("§9§lQuête 13");
      AL13.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 13) {
      IS13.setType(Material.SLIME_BLOCK);
      IM13.setDisplayName("§a§lQuête 13");
      AL13.add("§eProgression :");
      AL13.add("  §f- §r§3Tuer §r§b§l> §r§6Wither squelette §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/6");
    }
    IM13.setLore(AL13);
    IS13.setItemMeta(IM13);
    i.setItem(12, IS13);
    
    ItemStack IS14 = new ItemStack(Material.STONE);
    ItemMeta IM14 = IS14.getItemMeta();
    ArrayList<String> AL14 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 14) {
      IS14.setType(Material.REDSTONE_BLOCK);
      IM14.setDisplayName("§c§lQuête 14");
      AL14.add("§cTermine les quêtes antérieures pour");
      AL14.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 14) {
      IS14.setType(Material.QUARTZ_BLOCK);
      IM14.setDisplayName("§9§lQuête 14");
      AL14.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 14) {
      IS14.setType(Material.SLIME_BLOCK);
      IM14.setDisplayName("§a§lQuête 14");
      AL14.add("§eProgression :");
      AL14.add("  §f- §r§3Tuer §r§b§l> §r§6Wither §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM14.setLore(AL14);
    IS14.setItemMeta(IM14);
    i.setItem(13, IS14);
    
    ItemStack IS15 = new ItemStack(Material.STONE);
    ItemMeta IM15 = IS15.getItemMeta();
    ArrayList<String> AL15 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 15) {
      IS15.setType(Material.REDSTONE_BLOCK);
      IM15.setDisplayName("§c§lQuête 15");
      AL15.add("§cTermine les quêtes antérieures pour");
      AL15.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 15) {
      IS15.setType(Material.QUARTZ_BLOCK);
      IM15.setDisplayName("§9§lQuête 15");
      AL15.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 15) {
      IS15.setType(Material.SLIME_BLOCK);
      IM15.setDisplayName("§a§lQuête 15");
      AL15.add("§eProgression :");
      AL15.add("  §f- §r§3Poser §r§b§l> §r§6Balise §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
      AL15.add("  §f- §r§3Poser §r§b§l> §r§6Bloc de fer §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/9");
    }
    IM15.setLore(AL15);
    IS15.setItemMeta(IM15);
    i.setItem(14, IS15);
    
    ItemStack IS16 = new ItemStack(Material.STONE);
    ItemMeta IM16 = IS16.getItemMeta();
    ArrayList<String> AL16 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 16) {
      IS16.setType(Material.REDSTONE_BLOCK);
      IM16.setDisplayName("§c§lQuête 16");
      AL16.add("§cTermine les quêtes antérieures pour");
      AL16.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 16) {
      IS16.setType(Material.QUARTZ_BLOCK);
      IM16.setDisplayName("§9§lQuête 16");
      AL16.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 16) {
      IS16.setType(Material.SLIME_BLOCK);
      IM16.setDisplayName("§a§lQuête 16");
      AL16.add("§eProgression :");
      AL16.add("  §f- §r§3Miner §r§b§l> §r§6Roche de l'end §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/64");
    }
    IM16.setLore(AL16);
    IS16.setItemMeta(IM16);
    i.setItem(15, IS16);
    
    ItemStack IS17 = new ItemStack(Material.STONE);
    ItemMeta IM17 = IS17.getItemMeta();
    ArrayList<String> AL17 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 17) {
      IS17.setType(Material.REDSTONE_BLOCK);
      IM17.setDisplayName("§c§lQuête 17");
      AL17.add("§cTermine les quêtes antérieures pour");
      AL17.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 17) {
      IS17.setType(Material.QUARTZ_BLOCK);
      IM17.setDisplayName("§9§lQuête 17");
      AL17.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 17) {
      IS17.setType(Material.SLIME_BLOCK);
      IM17.setDisplayName("§a§lQuête 17");
      AL17.add("§eProgression :");
      AL17.add("  §f- §r§3Tuer §r§b§l> §r§6Enderman §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/32");
    }
    IM17.setLore(AL17);
    IS17.setItemMeta(IM17);
    i.setItem(16, IS17);
    
    ItemStack IS18 = new ItemStack(Material.STONE);
    ItemMeta IM18 = IS18.getItemMeta();
    ArrayList<String> AL18 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 18) {
      IS18.setType(Material.REDSTONE_BLOCK);
      IM18.setDisplayName("§c§lQuête 18");
      AL18.add("§cTermine les quêtes antérieures pour");
      AL18.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 18) {
      IS18.setType(Material.QUARTZ_BLOCK);
      IM18.setDisplayName("§9§lQuête 18");
      AL18.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 18) {
      IS18.setType(Material.SLIME_BLOCK);
      IM18.setDisplayName("§a§lQuête 18");
      AL18.add("§eProgression :");
      AL18.add("  §f- §r§3Tuer §r§b§l> §r§6Dragon de l'ender §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/1");
    }
    IM18.setLore(AL18);
    IS18.setItemMeta(IM18);
    i.setItem(17, IS18);
    
    ItemStack IS19 = new ItemStack(Material.STONE);
    ItemMeta IM19 = IS19.getItemMeta();
    ArrayList<String> AL19 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 19) {
      IS19.setType(Material.REDSTONE_BLOCK);
      IM19.setDisplayName("§c§lQuête 19");
      AL19.add("§cTermine les quêtes antérieures pour");
      AL19.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 19) {
      IS19.setType(Material.QUARTZ_BLOCK);
      IM19.setDisplayName("§9§lQuête 19");
      AL19.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 19) {
      IS19.setType(Material.SLIME_BLOCK);
      IM19.setDisplayName("§a§lQuête 19");
      AL19.add("§eProgression :");
      AL19.add("  §f- §r§3Tuer §r§b§l> §r§6Shulker §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/20");
    }
    IM19.setLore(AL19);
    IS19.setItemMeta(IM19);
    i.setItem(18, IS19);
    
    ItemStack IS20 = new ItemStack(Material.STONE);
    ItemMeta IM20 = IS20.getItemMeta();
    ArrayList<String> AL20 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 20) {
      IS20.setType(Material.REDSTONE_BLOCK);
      IM20.setDisplayName("§c§lQuête 20");
      AL20.add("§cTermine les quêtes antérieures pour");
      AL20.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 20) {
      IS20.setType(Material.QUARTZ_BLOCK);
      IM20.setDisplayName("§9§lQuête 20");
      AL20.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 20) {
      IS20.setType(Material.SLIME_BLOCK);
      IM20.setDisplayName("§a§lQuête 20");
      AL20.add("§eProgression :");
      AL20.add("  §f- §r§3Miner §r§b§l> §r§6Chorus §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/64");
    }
    IM20.setLore(AL20);
    IS20.setItemMeta(IM20);
    i.setItem(19, IS20);
    
    ItemStack IS21 = new ItemStack(Material.STONE);
    ItemMeta IM21 = IS21.getItemMeta();
    ArrayList<String> AL21 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 21) {
      IS21.setType(Material.REDSTONE_BLOCK);
      IM21.setDisplayName("§c§lQuête 21");
      AL21.add("§cTermine les quêtes antérieures pour");
      AL21.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 21) {
      IS21.setType(Material.QUARTZ_BLOCK);
      IM21.setDisplayName("§9§lQuête 21");
      AL21.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 21) {
      IS21.setType(Material.SLIME_BLOCK);
      IM21.setDisplayName("§a§lQuête 21");
      AL21.add("§eProgression :");
      AL21.add("  §f- §r§3Miner §r§b§l> §r§6Tête §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/5");
    }
    IM21.setLore(AL21);
    IS21.setItemMeta(IM21);
    i.setItem(20, IS21);
    
    ItemStack IS22 = new ItemStack(Material.STONE);
    ItemMeta IM22 = IS22.getItemMeta();
    ArrayList<String> AL22 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 22) {
      IS22.setType(Material.REDSTONE_BLOCK);
      IM22.setDisplayName("§c§lQuête 22");
      AL22.add("§cTermine les quêtes antérieures pour");
      AL22.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 22) {
      IS22.setType(Material.QUARTZ_BLOCK);
      IM22.setDisplayName("§9§lQuête 22");
      AL22.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 22) {
      IS22.setType(Material.SLIME_BLOCK);
      IM22.setDisplayName("§a§lQuête 22");
      AL22.add("§eProgression :");
      AL22.add("  §f- §r§3Se connecter plusieurs jours §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/7");
    }
    IM22.setLore(AL22);
    IS22.setItemMeta(IM22);
    i.setItem(21, IS22);
    
    ItemStack IS23 = new ItemStack(Material.STONE);
    ItemMeta IM23 = IS23.getItemMeta();
    ArrayList<String> AL23 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 23) {
      IS23.setType(Material.REDSTONE_BLOCK);
      IM23.setDisplayName("§c§lQuête 23");
      AL23.add("§cTermine les quêtes antérieures pour");
      AL23.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 23) {
      IS23.setType(Material.QUARTZ_BLOCK);
      IM23.setDisplayName("§9§lQuête 23");
      AL23.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 23) {
      IS23.setType(Material.SLIME_BLOCK);
      IM23.setDisplayName("§a§lQuête 23");
      AL23.add("§eProgression :");
      AL23.add("  §f- §r§3Tuer §r§b§l> §r§6Cochon §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/30");
      AL23.add("  §f- §r§3Tuer §r§b§l> §r§6Vache §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/30");
      AL23.add("  §f- §r§3Tuer §r§b§l> §r§6Mouton §r§3: §d" + MCubeAPI.getQuest(p, 3) + "/30");
    }
    IM23.setLore(AL23);
    IS23.setItemMeta(IM23);
    i.setItem(22, IS23);
    
    ItemStack IS24 = new ItemStack(Material.STONE);
    ItemMeta IM24 = IS24.getItemMeta();
    ArrayList<String> AL24 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 24) {
      IS24.setType(Material.REDSTONE_BLOCK);
      IM24.setDisplayName("§c§lQuête 24");
      AL24.add("§cTermine les quêtes antérieures pour");
      AL24.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 24) {
      IS24.setType(Material.QUARTZ_BLOCK);
      IM24.setDisplayName("§9§lQuête 24");
      AL24.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 24) {
      IS24.setType(Material.SLIME_BLOCK);
      IM24.setDisplayName("§a§lQuête 24");
      AL24.add("§eProgression :");
      AL24.add("  §f- §r§3Tuer §r§b§l> §r§6Poulet §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/60");
      AL24.add("  §f- §r§3Tuer §r§b§l> §r§6Cheval §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/40");
    }
    IM24.setLore(AL24);
    IS24.setItemMeta(IM24);
    i.setItem(23, IS24);
    
    ItemStack IS25 = new ItemStack(Material.STONE);
    ItemMeta IM25 = IS25.getItemMeta();
    ArrayList<String> AL25 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 25) {
      IS25.setType(Material.REDSTONE_BLOCK);
      IM25.setDisplayName("§c§lQuête 25");
      AL25.add("§cTermine les quêtes antérieures pour");
      AL25.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 25) {
      IS25.setType(Material.QUARTZ_BLOCK);
      IM25.setDisplayName("§9§lQuête 25");
      AL25.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 25) {
      IS25.setType(Material.SLIME_BLOCK);
      IM25.setDisplayName("§a§lQuête 25");
      AL25.add("§eProgression :");
      AL25.add("  §f- §r§3Tuer §r§b§l> §r§6Zombie §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/60");
      AL25.add("  §f- §r§3Tuer §r§b§l> §r§6Squelette §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/60");
    }
    IM25.setLore(AL25);
    IS25.setItemMeta(IM25);
    i.setItem(24, IS25);
    
    ItemStack IS26 = new ItemStack(Material.STONE);
    ItemMeta IM26 = IS26.getItemMeta();
    ArrayList<String> AL26 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 26) {
      IS26.setType(Material.REDSTONE_BLOCK);
      IM26.setDisplayName("§c§lQuête 26");
      AL26.add("§cTermine les quêtes antérieures pour");
      AL26.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 26) {
      IS26.setType(Material.QUARTZ_BLOCK);
      IM26.setDisplayName("§9§lQuête 26");
      AL26.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 26) {
      IS26.setType(Material.SLIME_BLOCK);
      IM26.setDisplayName("§a§lQuête 26");
      AL26.add("§eProgression :");
      AL26.add("  §f- §r§3Tuer §r§b§l> §r§6Creeper §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/50");
      AL26.add("  §f- §r§3Tuer §r§b§l> §r§6Araigné §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/70");
    }
    IM26.setLore(AL26);
    IS26.setItemMeta(IM26);
    i.setItem(25, IS26);
    
    ItemStack IS27 = new ItemStack(Material.STONE);
    ItemMeta IM27 = IS27.getItemMeta();
    ArrayList<String> AL27 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 27) {
      IS27.setType(Material.REDSTONE_BLOCK);
      IM27.setDisplayName("§c§lQuête 27");
      AL27.add("§cTermine les quêtes antérieures pour");
      AL27.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 27) {
      IS27.setType(Material.QUARTZ_BLOCK);
      IM27.setDisplayName("§9§lQuête 27");
      AL27.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 27) {
      IS27.setType(Material.SLIME_BLOCK);
      IM27.setDisplayName("§a§lQuête 27");
      AL27.add("§eProgression :");
      AL27.add("  §f- §r§3Tuer §r§b§l> §r§6Araigné empoisonée §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/60");
      AL27.add("  §f- §r§3Tuer §r§b§l> §r§6Poulpe §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/40");
    }
    IM27.setLore(AL27);
    IS27.setItemMeta(IM27);
    i.setItem(26, IS27);
    
    ItemStack IS28 = new ItemStack(Material.STONE);
    ItemMeta IM28 = IS28.getItemMeta();
    ArrayList<String> AL28 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 28) {
      IS28.setType(Material.REDSTONE_BLOCK);
      IM28.setDisplayName("§c§lQuête 28");
      AL28.add("§cTermine les quêtes antérieures pour");
      AL28.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 28) {
      IS28.setType(Material.QUARTZ_BLOCK);
      IM28.setDisplayName("§9§lQuête 28");
      AL28.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 28) {
      IS28.setType(Material.SLIME_BLOCK);
      IM28.setDisplayName("§a§lQuête 28");
      AL28.add("§eProgression :");
      AL28.add("  §f- §r§3Tuer §r§b§l> §r§6Cochon zombiee §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/80");
      AL28.add("  §f- §r§3Tuer §r§b§l> §r§6Ghast §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/10");
    }
    IM28.setLore(AL28);
    IS28.setItemMeta(IM28);
    i.setItem(27, IS28);
    
    ItemStack IS29 = new ItemStack(Material.STONE);
    ItemMeta IM29 = IS29.getItemMeta();
    ArrayList<String> AL29 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 29) {
      IS29.setType(Material.REDSTONE_BLOCK);
      IM29.setDisplayName("§c§lQuête 29");
      AL29.add("§cTermine les quêtes antérieures pour");
      AL29.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 29) {
      IS29.setType(Material.QUARTZ_BLOCK);
      IM29.setDisplayName("§9§lQuête 29");
      AL29.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 29) {
      IS29.setType(Material.SLIME_BLOCK);
      IM29.setDisplayName("§a§lQuête 29");
      AL29.add("§eProgression :");
      AL29.add("  §f- §r§3Tuer §r§b§l> §r§6Slime §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/40");
      AL29.add("  §f- §r§3Tuer §r§b§l> §r§6Sorcière §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/10");
    }
    IM29.setLore(AL29);
    IS29.setItemMeta(IM29);
    i.setItem(28, IS29);
    
    ItemStack IS30 = new ItemStack(Material.STONE);
    ItemMeta IM30 = IS30.getItemMeta();
    ArrayList<String> AL30 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 30) {
      IS30.setType(Material.REDSTONE_BLOCK);
      IM30.setDisplayName("§c§lQuête 30");
      AL30.add("§cTermine les quêtes antérieures pour");
      AL30.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 30) {
      IS30.setType(Material.QUARTZ_BLOCK);
      IM30.setDisplayName("§9§lQuête 30");
      AL30.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 30) {
      IS30.setType(Material.SLIME_BLOCK);
      IM30.setDisplayName("§a§lQuête 30");
      AL30.add("§eProgression :");
      AL30.add("  §f- §r§3Tuer §r§b§l> §r§6Poisson d'argent §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/10");
    }
    IM30.setLore(AL30);
    IS30.setItemMeta(IM30);
    i.setItem(29, IS30);
    
    ItemStack IS31 = new ItemStack(Material.STONE);
    ItemMeta IM31 = IS31.getItemMeta();
    ArrayList<String> AL31 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 31) {
      IS31.setType(Material.REDSTONE_BLOCK);
      IM31.setDisplayName("§c§lQuête 31");
      AL31.add("§cTermine les quêtes antérieures pour");
      AL31.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 31) {
      IS31.setType(Material.QUARTZ_BLOCK);
      IM31.setDisplayName("§9§lQuête 31");
      AL31.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 31) {
      IS31.setType(Material.SLIME_BLOCK);
      IM31.setDisplayName("§a§lQuête 31");
      AL31.add("§eProgression :");
      AL31.add("  §f- §r§3Tuer §r§b§l> §r§6Guardien §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/20");
      AL31.add("  §f- §r§3Tuer §r§b§l> §r§6Boss Guardien §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/3");
    }
    IM31.setLore(AL31);
    IS31.setItemMeta(IM31);
    i.setItem(30, IS31);
    
    ItemStack IS32 = new ItemStack(Material.STONE);
    ItemMeta IM32 = IS32.getItemMeta();
    ArrayList<String> AL32 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 32) {
      IS32.setType(Material.REDSTONE_BLOCK);
      IM32.setDisplayName("§c§lQuête 32");
      AL32.add("§cTermine les quêtes antérieures pour");
      AL32.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 32) {
      IS32.setType(Material.QUARTZ_BLOCK);
      IM32.setDisplayName("§9§lQuête 32");
      AL32.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 32) {
      IS32.setType(Material.SLIME_BLOCK);
      IM32.setDisplayName("§a§lQuête 32");
      AL32.add("§eProgression :");
      AL32.add("  §f- §r§3Miner §r§b§l> §r§6Blocd'or §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/8");
      AL32.add("  §f- §r§3Miner §r§b§l> §r§6Prismarine §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/30");
    }
    IM32.setLore(AL32);
    IS32.setItemMeta(IM32);
    i.setItem(31, IS32);
    
    ItemStack IS33 = new ItemStack(Material.STONE);
    ItemMeta IM33 = IS33.getItemMeta();
    ArrayList<String> AL33 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 33) {
      IS33.setType(Material.REDSTONE_BLOCK);
      IM33.setDisplayName("§c§lQuête 33");
      AL33.add("§cTermine les quêtes antérieures pour");
      AL33.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 33) {
      IS33.setType(Material.QUARTZ_BLOCK);
      IM33.setDisplayName("§9§lQuête 33");
      AL33.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 33) {
      IS33.setType(Material.SLIME_BLOCK);
      IM33.setDisplayName("§a§lQuête 33");
      AL33.add("§eProgression :");
      AL33.add("  §f- §r§3Tuer §r§b§l> §r§6Endermite §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/12");
    }
    IM33.setLore(AL33);
    IS33.setItemMeta(IM33);
    i.setItem(32, IS33);
    
    ItemStack IS34 = new ItemStack(Material.STONE);
    ItemMeta IM34 = IS34.getItemMeta();
    ArrayList<String> AL34 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 34) {
      IS34.setType(Material.REDSTONE_BLOCK);
      IM34.setDisplayName("§c§lQuête 34");
      AL34.add("§cTermine les quêtes antérieures pour");
      AL34.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 34) {
      IS34.setType(Material.QUARTZ_BLOCK);
      IM34.setDisplayName("§9§lQuête 34");
      AL34.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 34) {
      IS34.setType(Material.SLIME_BLOCK);
      IM34.setDisplayName("§a§lQuête 34");
      AL34.add("§eProgression :");
      AL34.add("  §f- §r§3Miner §r§b§l> §r§6Pierre moussue §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/40");
    }
    IM34.setLore(AL34);
    IS34.setItemMeta(IM34);
    i.setItem(33, IS34);
    
    ItemStack IS35 = new ItemStack(Material.STONE);
    ItemMeta IM35 = IS35.getItemMeta();
    ArrayList<String> AL35 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 35) {
      IS35.setType(Material.REDSTONE_BLOCK);
      IM35.setDisplayName("§c§lQuête 35");
      AL35.add("§cTermine les quêtes antérieures pour");
      AL35.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 35) {
      IS35.setType(Material.QUARTZ_BLOCK);
      IM35.setDisplayName("§9§lQuête 35");
      AL35.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 35) {
      IS35.setType(Material.SLIME_BLOCK);
      IM35.setDisplayName("§a§lQuête 35");
      AL35.add("§eProgression :");
      AL35.add("  §f- §r§3Miner §r§b§l> §r§6Argile §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/60");
    }
    IM35.setLore(AL35);
    IS35.setItemMeta(IM35);
    i.setItem(34, IS35);
    
    ItemStack IS36 = new ItemStack(Material.STONE);
    ItemMeta IM36 = IS36.getItemMeta();
    ArrayList<String> AL36 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 36) {
      IS36.setType(Material.REDSTONE_BLOCK);
      IM36.setDisplayName("§c§lQuête 36");
      AL36.add("§cTermine les quêtes antérieures pour");
      AL36.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 36) {
      IS36.setType(Material.QUARTZ_BLOCK);
      IM36.setDisplayName("§9§lQuête 36");
      AL36.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 36) {
      IS36.setType(Material.SLIME_BLOCK);
      IM36.setDisplayName("§a§lQuête 36");
      AL36.add("§eProgression :");
      AL36.add("  §f- §r§3Miner §r§b§l> §r§6Neige §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/350");
    }
    IM36.setLore(AL36);
    IS36.setItemMeta(IM36);
    i.setItem(35, IS36);
    
    ItemStack IS37 = new ItemStack(Material.STONE);
    ItemMeta IM37 = IS37.getItemMeta();
    ArrayList<String> AL37 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 37) {
      IS37.setType(Material.REDSTONE_BLOCK);
      IM37.setDisplayName("§c§lQuête 37");
      AL37.add("§cTermine les quêtes antérieures pour");
      AL37.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 37) {
      IS37.setType(Material.QUARTZ_BLOCK);
      IM37.setDisplayName("§9§lQuête 37");
      AL37.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 37) {
      IS37.setType(Material.SLIME_BLOCK);
      IM37.setDisplayName("§a§lQuête 37");
      AL37.add("§eProgression :");
      AL37.add("  §f- §r§3Tuer §r§b§l> §r§6Champimeuh §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/30");
    }
    IM37.setLore(AL37);
    IS37.setItemMeta(IM37);
    i.setItem(36, IS37);
    
    ItemStack IS38 = new ItemStack(Material.STONE);
    ItemMeta IM38 = IS38.getItemMeta();
    ArrayList<String> AL38 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 38) {
      IS38.setType(Material.REDSTONE_BLOCK);
      IM38.setDisplayName("§c§lQuête 38");
      AL38.add("§cTermine les quêtes antérieures pour");
      AL38.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 38) {
      IS38.setType(Material.QUARTZ_BLOCK);
      IM38.setDisplayName("§9§lQuête 38");
      AL38.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 38) {
      IS38.setType(Material.SLIME_BLOCK);
      IM38.setDisplayName("§a§lQuête 38");
      AL38.add("§eProgression :");
      AL38.add("  §f- §r§3Tuer §r§b§l> §r§6Ours polaire §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/30");
    }
    IM38.setLore(AL38);
    IS38.setItemMeta(IM38);
    i.setItem(37, IS38);
    
    ItemStack IS39 = new ItemStack(Material.STONE);
    ItemMeta IM39 = IS39.getItemMeta();
    ArrayList<String> AL39 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 39) {
      IS39.setType(Material.REDSTONE_BLOCK);
      IM39.setDisplayName("§c§lQuête 39");
      AL39.add("§cTermine les quêtes antérieures pour");
      AL39.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 39) {
      IS39.setType(Material.QUARTZ_BLOCK);
      IM39.setDisplayName("§9§lQuête 39");
      AL39.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 39) {
      IS39.setType(Material.SLIME_BLOCK);
      IM39.setDisplayName("§a§lQuête 39");
      AL39.add("§eProgression :");
      AL39.add("  §f- §r§3Tuer §r§b§l> §r§6Villageois §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/5");
    }
    IM39.setLore(AL39);
    IS39.setItemMeta(IM39);
    i.setItem(38, IS39);
    
    ItemStack IS40 = new ItemStack(Material.STONE);
    ItemMeta IM40 = IS40.getItemMeta();
    ArrayList<String> AL40 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 40) {
      IS40.setType(Material.REDSTONE_BLOCK);
      IM40.setDisplayName("§c§lQuête 40");
      AL40.add("§cTermine les quêtes antérieures pour");
      AL40.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 40) {
      IS40.setType(Material.QUARTZ_BLOCK);
      IM40.setDisplayName("§9§lQuête 40");
      AL40.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 40) {
      IS40.setType(Material.SLIME_BLOCK);
      IM40.setDisplayName("§a§lQuête 40");
      AL40.add("§eProgression :");
      AL40.add("  §f- §r§3Tuer §r§b§l> §r§6Vindicator §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/10");
    }
    IM40.setLore(AL40);
    IS40.setItemMeta(IM40);
    i.setItem(39, IS40);
    
    ItemStack IS41 = new ItemStack(Material.STONE);
    ItemMeta IM41 = IS41.getItemMeta();
    ArrayList<String> AL41 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 41) {
      IS41.setType(Material.REDSTONE_BLOCK);
      IM41.setDisplayName("§c§lQuête 41");
      AL41.add("§cTermine les quêtes antérieures pour");
      AL41.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 41) {
      IS41.setType(Material.QUARTZ_BLOCK);
      IM41.setDisplayName("§9§lQuête 41");
      AL41.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 41) {
      IS41.setType(Material.SLIME_BLOCK);
      IM41.setDisplayName("§a§lQuête 41");
      AL41.add("§eProgression :");
      AL41.add("  §f- §r§3Miner §r§b§l> §r§6Glace compactée §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/50");
    }
    IM41.setLore(AL41);
    IS41.setItemMeta(IM41);
    i.setItem(40, IS41);
    
    ItemStack IS42 = new ItemStack(Material.STONE);
    ItemMeta IM42 = IS42.getItemMeta();
    ArrayList<String> AL42 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 42) {
      IS42.setType(Material.REDSTONE_BLOCK);
      IM42.setDisplayName("§c§lQuête 42");
      AL42.add("§cTermine les quêtes antérieures pour");
      AL42.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 42) {
      IS42.setType(Material.QUARTZ_BLOCK);
      IM42.setDisplayName("§9§lQuête 42");
      AL42.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 42) {
      IS42.setType(Material.SLIME_BLOCK);
      IM42.setDisplayName("§a§lQuête 42");
      AL42.add("§eProgression :");
      AL42.add("  §f- §r§3Tuer §r§b§l> §r§6Lama §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/40");
      AL42.add("  §f- §r§3Tuer §r§b§l> §r§6Lapin §r§3: §d" + MCubeAPI.getQuest(p, 2) + "/30");
    }
    IM42.setLore(AL42);
    IS42.setItemMeta(IM42);
    i.setItem(41, IS42);
    
    ItemStack IS43 = new ItemStack(Material.STONE);
    ItemMeta IM43 = IS43.getItemMeta();
    ArrayList<String> AL43 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 43) {
      IS43.setType(Material.REDSTONE_BLOCK);
      IM43.setDisplayName("§c§lQuête 43");
      AL43.add("§cTermine les quêtes antérieures pour");
      AL43.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 43) {
      IS43.setType(Material.QUARTZ_BLOCK);
      IM43.setDisplayName("§9§lQuête 43");
      AL43.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 43) {
      IS43.setType(Material.SLIME_BLOCK);
      IM43.setDisplayName("§a§lQuête 43");
      AL43.add("§eProgression :");
      AL43.add("  §f- §r§3Tuer §r§b§l> §r§6Loup §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/30");
    }
    IM43.setLore(AL43);
    IS43.setItemMeta(IM43);
    i.setItem(42, IS43);
    
    ItemStack IS44 = new ItemStack(Material.STONE);
    ItemMeta IM44 = IS44.getItemMeta();
    ArrayList<String> AL44 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 44) {
      IS44.setType(Material.REDSTONE_BLOCK);
      IM44.setDisplayName("§c§lQuête 44");
      AL44.add("§cTermine les quêtes antérieures pour");
      AL44.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 44) {
      IS44.setType(Material.QUARTZ_BLOCK);
      IM44.setDisplayName("§9§lQuête 44");
      AL44.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 44) {
      IS44.setType(Material.SLIME_BLOCK);
      IM44.setDisplayName("§a§lQuête 44");
      AL44.add("§eProgression :");
      AL44.add("  §f- §r§3Miner §r§b§l> §r§6Mycélium §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/10");
    }
    IM44.setLore(AL44);
    IS44.setItemMeta(IM44);
    i.setItem(43, IS44);
    
    ItemStack IS45 = new ItemStack(Material.STONE);
    ItemMeta IM45 = IS45.getItemMeta();
    ArrayList<String> AL45 = new ArrayList();
    if (MCubeAPI.getCurrentQuest(p) < 45) {
      IS45.setType(Material.REDSTONE_BLOCK);
      IM45.setDisplayName("§c§lQuête 45");
      AL45.add("§cTermine les quêtes antérieures pour");
      AL45.add("§cdébloquer celle - ci !");
    } else if (MCubeAPI.getCurrentQuest(p) > 45) {
      IS45.setType(Material.QUARTZ_BLOCK);
      IM45.setDisplayName("§9§lQuête 45");
      AL45.add("§bQuête déjà terminée !");
    } else if (MCubeAPI.getCurrentQuest(p) == 45) {
      IS45.setType(Material.SLIME_BLOCK);
      IM45.setDisplayName("§a§lQuête 45");
      AL45.add("§eProgression :");
      AL45.add("  §f- §r§3Gagner §r§b§l> §r§6Coins §r§3: §d" + MCubeAPI.getQuest(p, 1) + "/100");
    }
    IM45.setLore(AL45);
    IS45.setItemMeta(IM45);
    i.setItem(44, IS45);
    
    ItemStack ISpass = new ItemStack(Material.TNT);
    ItemMeta IMpass = ISpass.getItemMeta();
    ArrayList<String> ALpass = new ArrayList();
    ALpass.add("§3Pass : §r§3§l" + MCubeAPI.getPlayerPass(p));
    ALpass.add(" ");
    ALpass.add("§9> §r§7Clique pour passer la");
    ALpass.add("§7quête !");
    IMpass.setLore(ALpass);
    IMpass.setDisplayName("§bPasser la quête");
    ISpass.setItemMeta(IMpass);
    i.setItem(46, ISpass);
    
    ItemStack ISmid = new ItemStack(Material.ENDER_PEARL);
    ItemMeta IMmid = ISmid.getItemMeta();
    IMmid.setDisplayName("§ePage : 1/1");
    ISmid.setItemMeta(IMmid);
    i.setItem(49, ISmid);
    
    ItemStack IScha = new ItemStack(Material.BARRIER);
    ItemMeta IMcha = IScha.getItemMeta();
    IMcha.setDisplayName(" ");
    IScha.setItemMeta(IMcha);
    i.setItem(48, IScha);
    i.setItem(50, IScha);
    
    ItemStack ISre = new ItemStack(Material.ARROW);
    ItemMeta IMre = ISre.getItemMeta();
    IMre.setDisplayName("§f§oRetour");
    ISre.setItemMeta(IMre);
    i.setItem(52, ISre);
    
    p.openInventory(i);
  }
}
