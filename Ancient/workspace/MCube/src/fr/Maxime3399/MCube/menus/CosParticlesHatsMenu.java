package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class CosParticlesHatsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 36, "§8Particules>Chapeaux");
		CustomPlayer cp = new CustomPlayer(p);
		
		ItemStack ISangryv = new ItemStack(Material.BLAZE_ROD);
		ItemMeta IMangryv = ISangryv.getItemMeta();
		ArrayList<String> ALangryv = new ArrayList<>();
		IMangryv.setDisplayName("§9Chapeau de colère");
		ALangryv.add("§fRareté : §9§oMythique");
		ALangryv.add(" ");
		if(cp.getRank().equalsIgnoreCase("default")){
			ALangryv.add("§cRéservé aux §f§lMiniVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("angryvhat")){
				IMangryv.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMangryv.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALangryv.add("§a§oEffect actif");
			}else{
				ALangryv.add("§9§l>§r §7Clique pour activer");
				ALangryv.add("§7cet effet");
			}
		}
		IMangryv.setLore(ALangryv);
		ISangryv.setItemMeta(IMangryv);
		i.setItem(0, ISangryv);
		
		ItemStack ISbubble = new ItemStack(Material.GLASS_BOTTLE);
		ItemMeta IMbubble = ISbubble.getItemMeta();
		ArrayList<String> ALbubble = new ArrayList<>();
		IMbubble.setDisplayName("§9Chapeau bulles");
		ALbubble.add("§fRareté : §9§oMythique");
		ALbubble.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip")){
			ALbubble.add("§cRéservé aux §e§lVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("bubblehat")){
				IMbubble.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMbubble.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALbubble.add("§a§oEffect actif");
			}else{
				ALbubble.add("§9§l>§r §7Clique pour activer");
				ALbubble.add("§7cet effet");
			}
		}
		IMbubble.setLore(ALbubble);
		ISbubble.setItemMeta(IMbubble);
		i.setItem(1, ISbubble);
		
		ItemStack ISnuage = new ItemStack(Material.SNOW_BLOCK);
		ItemMeta IMnuage = ISnuage.getItemMeta();
		ArrayList<String> ALnuage = new ArrayList<>();
		IMnuage.setDisplayName("§9Chapeau nuage");
		ALnuage.add("§fRareté : §9§oMythique");
		ALnuage.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip")){
			ALnuage.add("§cRéservé aux §b§lVIP+§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("nuagehat")){
				IMnuage.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMnuage.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALnuage.add("§a§oEffect actif");
			}else{
				ALnuage.add("§9§l>§r §7Clique pour activer");
				ALnuage.add("§7cet effet");
			}
		}
		IMnuage.setLore(ALnuage);
		ISnuage.setItemMeta(IMnuage);
		i.setItem(2, ISnuage);
		
		ItemStack IScrit = new ItemStack(Material.WEB);
		ItemMeta IMcrit = IScrit.getItemMeta();
		ArrayList<String> ALcrit = new ArrayList<>();
		IMcrit.setDisplayName("§9Chapeau critique");
		ALcrit.add("§fRareté : §9§oMythique");
		ALcrit.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip") || cp.getRank().equalsIgnoreCase("vip+")){
			ALcrit.add("§cRéservé aux §a§lUltraVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("crithat")){
				IMcrit.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMcrit.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALcrit.add("§a§oEffect actif");
			}else{
				ALcrit.add("§9§l>§r §7Clique pour activer");
				ALcrit.add("§7cet effet");
			}
		}
		IMcrit.setLore(ALcrit);
		IScrit.setItemMeta(IMcrit);
		i.setItem(3, IScrit);
		
		ItemStack ISdamageindic = new ItemStack(Material.GOLD_AXE);
		ItemMeta IMdamageindic = ISdamageindic.getItemMeta();
		ArrayList<String> ALdamageindic = new ArrayList<>();
		IMdamageindic.setDisplayName("§9Chapeau d'amour sombre");
		ALdamageindic.add("§fRareté : §9§oMythique");
		ALdamageindic.add(" ");
		if(!cp.getRank().equalsIgnoreCase("ultravip+")){
			ALdamageindic.add("§cRéservé aux §2§lUltraVIP+§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("damageindichat")){
				IMdamageindic.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMdamageindic.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALdamageindic.add("§a§oEffect actif");
			}else{
				ALdamageindic.add("§9§l>§r §7Clique pour activer");
				ALdamageindic.add("§7cet effet");
			}
		}
		IMdamageindic.setLore(ALdamageindic);
		ISdamageindic.setItemMeta(IMdamageindic);
		i.setItem(4, ISdamageindic);
		
		ItemStack ISdeath = new ItemStack(Material.BONE);
		ItemMeta IMdeath = ISdeath.getItemMeta();
		ArrayList<String> ALdeath = new ArrayList<>();
		IMdeath.setDisplayName("§9Chapeau de la mort");
		ALdeath.add("§fRareté : §9§oMythique");
		ALdeath.add(" ");
		if(!cp.HasCosmetic("deathhat")){
			ALdeath.add("§cAchetable sur la boutique");
		}else{
			if(cp.getEnabledCosmetics().contains("deathhat")){
				IMdeath.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMdeath.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALdeath.add("§a§oEffect actif");
			}else{
				ALdeath.add("§9§l>§r §7Clique pour activer");
				ALdeath.add("§7cet effet");
			}
		}
		IMdeath.setLore(ALdeath);
		ISdeath.setItemMeta(IMdeath);
		i.setItem(5, ISdeath);
		
		ItemStack ISdrag = new ItemStack(Material.DRAGONS_BREATH);
		ItemMeta IMdrag = ISdrag.getItemMeta();
		ArrayList<String> ALdrag = new ArrayList<>();
		IMdrag.setDisplayName("§9Chapeau de dragon");
		ALdrag.add("§fRareté : §9§oMythique");
		ALdrag.add(" ");
		if(!cp.HasCosmetic("draghat")){
			ALdrag.add("§cObtenable lors d'events");
		}else{
			if(cp.getEnabledCosmetics().contains("draghat")){
				IMdrag.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMdrag.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALdrag.add("§a§oEffect actif");
			}else{
				ALdrag.add("§9§l>§r §7Clique pour activer");
				ALdrag.add("§7cet effet");
			}
		}
		IMdrag.setLore(ALdrag);
		ISdrag.setItemMeta(IMdrag);
		i.setItem(6, ISdrag);
		
		ItemStack ISdlava = new ItemStack(Material.LAVA_BUCKET);
		ItemMeta IMdlava = ISdlava.getItemMeta();
		ArrayList<String> ALdlava = new ArrayList<>();
		IMdlava.setDisplayName("§aChapeau de lave");
		ALdlava.add("§fRareté : §a§oCommun");
		ALdlava.add(" ");
		if(!cp.HasCosmetic("dlavahat")){
			ALdlava.add("§cTrouvable dans les coffres ou");
			ALdlava.add("§cachetable avec des crystals");
			ALdlava.add(" ");
			ALdlava.add("§6Coût : §280 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("dlavahat")){
				IMdlava.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMdlava.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALdlava.add("§a§oEffect actif");
			}else{
				ALdlava.add("§9§l>§r §7Clique pour activer");
				ALdlava.add("§7cet effet");
			}
		}
		IMdlava.setLore(ALdlava);
		ISdlava.setItemMeta(IMdlava);
		i.setItem(7, ISdlava);
		
		ItemStack ISdwater = new ItemStack(Material.WATER_BUCKET);
		ItemMeta IMdwater = ISdwater.getItemMeta();
		ArrayList<String> ALdwater = new ArrayList<>();
		IMdwater.setDisplayName("§aChapeau d'eau");
		ALdwater.add("§fRareté : §a§oCommun");
		ALdwater.add(" ");
		if(!cp.HasCosmetic("dwaterhat")){
			ALdwater.add("§cTrouvable dans les coffres ou");
			ALdwater.add("§cachetable avec des crystals");
			ALdwater.add(" ");
			ALdwater.add("§6Coût : §280 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("dwaterhat")){
				IMdwater.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMdwater.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALdwater.add("§a§oEffect actif");
			}else{
				ALdwater.add("§9§l>§r §7Clique pour activer");
				ALdwater.add("§7cet effet");
			}
		}
		IMdwater.setLore(ALdwater);
		ISdwater.setItemMeta(IMdwater);
		i.setItem(8, ISdwater);
		
		ItemStack ISench = new ItemStack(Material.ENCHANTMENT_TABLE);
		ItemMeta IMench = ISench.getItemMeta();
		ArrayList<String> ALench = new ArrayList<>();
		IMench.setDisplayName("§2Chapeau enchanté");
		ALench.add("§fRareté : §2§oPeu-Commun");
		ALench.add(" ");
		if(!cp.HasCosmetic("enchhat")){
			ALench.add("§cTrouvable dans les coffres ou");
			ALench.add("§cachetable avec des crystals");
			ALench.add(" ");
			ALench.add("§6Coût : §2160 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("enchhat")){
				IMench.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMench.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALench.add("§a§oEffect actif");
			}else{
				ALench.add("§9§l>§r §7Clique pour activer");
				ALench.add("§7cet effet");
			}
		}
		IMench.setLore(ALench);
		ISench.setItemMeta(IMench);
		i.setItem(9, ISench);
		
		ItemStack ISwhite = new ItemStack(Material.END_ROD);
		ItemMeta IMwhite = ISwhite.getItemMeta();
		ArrayList<String> ALwhite = new ArrayList<>();
		IMwhite.setDisplayName("§2Chapeau blanc");
		ALwhite.add("§fRareté : §2§oPeu-Commun");
		ALwhite.add(" ");
		if(!cp.HasCosmetic("whitehat")){
			ALwhite.add("§cTrouvable dans les coffres ou");
			ALwhite.add("§cachetable avec des crystals");
			ALwhite.add(" ");
			ALwhite.add("§6Coût : §2160 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("whitehat")){
				IMwhite.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMwhite.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALwhite.add("§a§oEffect actif");
			}else{
				ALwhite.add("§9§l>§r §7Clique pour activer");
				ALwhite.add("§7cet effet");
			}
		}
		IMwhite.setLore(ALwhite);
		ISwhite.setItemMeta(IMwhite);
		i.setItem(10, ISwhite);
		
		ItemStack ISsand = new ItemStack(Material.SAND);
		ItemMeta IMsand = ISsand.getItemMeta();
		ArrayList<String> ALsand = new ArrayList<>();
		IMsand.setDisplayName("§dChapeau de sable");
		ALsand.add("§fRareté : §d§oRare");
		ALsand.add(" ");
		if(!cp.HasCosmetic("sandhat")){
			ALsand.add("§cTrouvable dans les coffres ou");
			ALsand.add("§cachetable avec des crystals");
			ALsand.add(" ");
			ALsand.add("§6Coût : §2240 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("sandhat")){
				IMsand.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMsand.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALsand.add("§a§oEffect actif");
			}else{
				ALsand.add("§9§l>§r §7Clique pour activer");
				ALsand.add("§7cet effet");
			}
		}
		IMsand.setLore(ALsand);
		ISsand.setItemMeta(IMsand);
		i.setItem(11, ISsand);
		
		ItemStack ISfw = new ItemStack(Material.FIREWORK);
		ItemMeta IMfw = ISfw.getItemMeta();
		ArrayList<String> ALfw = new ArrayList<>();
		IMfw.setDisplayName("§dChapeau brillant");
		ALfw.add("§fRareté : §d§oRare");
		ALfw.add(" ");
		if(!cp.HasCosmetic("fwhat")){
			ALfw.add("§cTrouvable dans les coffres ou");
			ALfw.add("§cachetable avec des crystals");
			ALfw.add(" ");
			ALfw.add("§6Coût : §2240 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("fwhat")){
				IMfw.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMfw.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALfw.add("§a§oEffect actif");
			}else{
				ALfw.add("§9§l>§r §7Clique pour activer");
				ALfw.add("§7cet effet");
			}
		}
		IMfw.setLore(ALfw);
		ISfw.setItemMeta(IMfw);
		i.setItem(12, ISfw);
		
		ItemStack ISflame = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMflame = ISflame.getItemMeta();
		ArrayList<String> ALflame = new ArrayList<>();
		IMflame.setDisplayName("§5Chapeau de feu");
		ALflame.add("§fRareté : §5§oSuper");
		ALflame.add(" ");
		if(!cp.HasCosmetic("flamehat")){
			ALflame.add("§cTrouvable dans les coffres ou");
			ALflame.add("§cachetable avec des crystals");
			ALflame.add(" ");
			ALflame.add("§6Coût : §2320 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("flamehat")){
				IMflame.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMflame.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALflame.add("§a§oEffect actif");
			}else{
				ALflame.add("§9§l>§r §7Clique pour activer");
				ALflame.add("§7cet effet");
			}
		}
		IMflame.setLore(ALflame);
		ISflame.setItemMeta(IMflame);
		i.setItem(13, ISflame);
		
		ItemStack ISmagic = new ItemStack(Material.EMERALD);
		ItemMeta IMmagic = ISmagic.getItemMeta();
		ArrayList<String> ALmagic = new ArrayList<>();
		IMmagic.setDisplayName("§5Chapeau magique");
		ALmagic.add("§fRareté : §5§oSuper");
		ALmagic.add(" ");
		if(!cp.HasCosmetic("magichat")){
			ALmagic.add("§cTrouvable dans les coffres ou");
			ALmagic.add("§cachetable avec des crystals");
			ALmagic.add(" ");
			ALmagic.add("§6Coût : §2320 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("magichat")){
				IMmagic.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMmagic.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALmagic.add("§a§oEffect actif");
			}else{
				ALmagic.add("§9§l>§r §7Clique pour activer");
				ALmagic.add("§7cet effet");
			}
		}
		IMmagic.setLore(ALmagic);
		ISmagic.setItemMeta(IMmagic);
		i.setItem(14, ISmagic);
		
		ItemStack ISlove = new ItemStack(Material.PINK_GLAZED_TERRACOTTA);
		ItemMeta IMlove = ISlove.getItemMeta();
		ArrayList<String> ALlove = new ArrayList<>();
		IMlove.setDisplayName("§bChapeau d'amour");
		ALlove.add("§fRareté : §b§oEpique");
		ALlove.add(" ");
		if(!cp.HasCosmetic("lovehat")){
			ALlove.add("§cTrouvable dans les coffres ou");
			ALlove.add("§cachetable avec des crystals");
			ALlove.add(" ");
			ALlove.add("§6Coût : §2400 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("lovehat")){
				IMlove.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMlove.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALlove.add("§a§oEffect actif");
			}else{
				ALlove.add("§9§l>§r §7Clique pour activer");
				ALlove.add("§7cet effet");
			}
		}
		IMlove.setLore(ALlove);
		ISlove.setItemMeta(IMlove);
		i.setItem(15, ISlove);
		
		ItemStack ISlava = new ItemStack(Material.FLINT_AND_STEEL);
		ItemMeta IMlava = ISlava.getItemMeta();
		ArrayList<String> ALlava = new ArrayList<>();
		IMlava.setDisplayName("§bChapeau de jets de lave");
		ALlava.add("§fRareté : §b§oEpique");
		ALlava.add(" ");
		if(!cp.HasCosmetic("lavahat")){
			ALlava.add("§cTrouvable dans les coffres ou");
			ALlava.add("§cachetable avec des crystals");
			ALlava.add(" ");
			ALlava.add("§6Coût : §2400 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("lavahat") && !cp.getEnabledCosmetics().contains("dlavahat")){
				IMlava.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMlava.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALlava.add("§a§oEffect actif");
			}else{
				ALlava.add("§9§l>§r §7Clique pour activer");
				ALlava.add("§7cet effet");
			}
		}
		IMlava.setLore(ALlava);
		ISlava.setItemMeta(IMlava);
		i.setItem(16, ISlava);
		
		ItemStack IScombat = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta IMcombat = IScombat.getItemMeta();
		ArrayList<String> ALcombat = new ArrayList<>();
		IMcombat.setDisplayName("§3Chapeau du combattant");
		ALcombat.add("§fRareté : §3§oLégendaire");
		ALcombat.add(" ");
		if(!cp.HasCosmetic("combathat")){
			ALcombat.add("§cTrouvable dans les coffres ou");
			ALcombat.add("§cachetable avec des crystals");
			ALcombat.add(" ");
			ALcombat.add("§6Coût : §2480 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("combathat")){
				IMcombat.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMcombat.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALcombat.add("§a§oEffect actif");
			}else{
				ALcombat.add("§9§l>§r §7Clique pour activer");
				ALcombat.add("§7cet effet");
			}
		}
		IMcombat.setLore(ALcombat);
		IScombat.setItemMeta(IMcombat);
		i.setItem(17, IScombat);
		
		ItemStack ISnote = new ItemStack(Material.NOTE_BLOCK);
		ItemMeta IMnote = ISnote.getItemMeta();
		ArrayList<String> ALnote = new ArrayList<>();
		IMnote.setDisplayName("§3Chapeau de musique");
		ALnote.add("§fRareté : §3§oLégendaire");
		ALnote.add(" ");
		if(!cp.HasCosmetic("notehat")){
			ALnote.add("§cTrouvable dans les coffres ou");
			ALnote.add("§cachetable avec des crystals");
			ALnote.add(" ");
			ALnote.add("§6Coût : §2480 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("notehat")){
				IMnote.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMnote.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALnote.add("§a§oEffect actif");
			}else{
				ALnote.add("§9§l>§r §7Clique pour activer");
				ALnote.add("§7cet effet");
			}
		}
		IMnote.setLore(ALnote);
		ISnote.setItemMeta(IMnote);
		i.setItem(18, ISnote);
		
		ItemStack ISender = new ItemStack(Material.ENDER_PEARL);
		ItemMeta IMender = ISender.getItemMeta();
		ArrayList<String> ALender = new ArrayList<>();
		IMender.setDisplayName("§9Chapeau de l'ender");
		ALender.add("§fRareté : §9§oMythique");
		ALender.add(" ");
		if(!cp.HasCosmetic("enderhat")){
			ALender.add("§cTrouvable dans les coffres ou");
			ALender.add("§cachetable avec des crystals");
			ALender.add(" ");
			ALender.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("enderhat")){
				IMender.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMender.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALender.add("§a§oEffect actif");
			}else{
				ALender.add("§9§l>§r §7Clique pour activer");
				ALender.add("§7cet effet");
			}
		}
		IMender.setLore(ALender);
		ISender.setItemMeta(IMender);
		i.setItem(19, ISender);
		
		ItemStack ISnether = new ItemStack(Material.NETHERRACK);
		ItemMeta IMnether = ISnether.getItemMeta();
		ArrayList<String> ALnether = new ArrayList<>();
		IMnether.setDisplayName("§9Chapeau du nether");
		ALnether.add("§fRareté : §9§oMythique");
		ALnether.add(" ");
		if(!cp.HasCosmetic("netherhat")){
			ALnether.add("§cTrouvable dans les coffres ou");
			ALnether.add("§cachetable avec des crystals");
			ALnether.add(" ");
			ALnether.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("netherhat")){
				IMnether.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMnether.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALnether.add("§a§oEffect actif");
			}else{
				ALnether.add("§9§l>§r §7Clique pour activer");
				ALnether.add("§7cet effet");
			}
		}
		IMnether.setLore(ALnether);
		ISnether.setItemMeta(IMnether);
		i.setItem(20, ISnether);
		
		ItemStack ISmult = new ItemStack(Material.APPLE);
		ItemMeta IMmult = ISmult.getItemMeta();
		ArrayList<String> ALmult = new ArrayList<>();
		IMmult.setDisplayName("§9Chapeau multicolor");
		ALmult.add("§fRareté : §9§oMythique");
		ALmult.add(" ");
		if(!cp.HasCosmetic("multhat")){
			ALmult.add("§cTrouvable dans les coffres ou");
			ALmult.add("§cachetable avec des crystals");
			ALmult.add(" ");
			ALmult.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("multhat")){
				IMmult.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMmult.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALmult.add("§a§oEffect actif");
			}else{
				ALmult.add("§9§l>§r §7Clique pour activer");
				ALmult.add("§7cet effet");
			}
		}
		IMmult.setLore(ALmult);
		ISmult.setItemMeta(IMmult);
		i.setItem(21, ISmult);
		
		ItemStack ISslime = new ItemStack(Material.SLIME_BALL);
		ItemMeta IMslime = ISslime.getItemMeta();
		ArrayList<String> ALslime = new ArrayList<>();
		IMslime.setDisplayName("§9Chapeau de slime");
		ALslime.add("§fRareté : §9§oMythique");
		ALslime.add(" ");
		if(!cp.HasCosmetic("slimehat")){
			ALslime.add("§cTrouvable dans les coffres ou");
			ALslime.add("§cachetable avec des crystals");
			ALslime.add(" ");
			ALslime.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("slimehat")){
				IMslime.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMslime.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALslime.add("§a§oEffect actif");
			}else{
				ALslime.add("§9§l>§r §7Clique pour activer");
				ALslime.add("§7cet effet");
			}
		}
		IMslime.setLore(ALslime);
		ISslime.setItemMeta(IMslime);
		i.setItem(22, ISslime);
		
		ItemStack ISsmoke = new ItemStack(Material.FIREBALL);
		ItemMeta IMsmoke = ISsmoke.getItemMeta();
		ArrayList<String> ALsmoke = new ArrayList<>();
		IMsmoke.setDisplayName("§9Chapeau de fumée");
		ALsmoke.add("§fRareté : §9§oMythique");
		ALsmoke.add(" ");
		if(!cp.HasCosmetic("smokehat")){
			ALsmoke.add("§cTrouvable dans les coffres ou");
			ALsmoke.add("§cachetable avec des crystals");
			ALsmoke.add(" ");
			ALsmoke.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("smokehat")){
				IMsmoke.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMsmoke.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALsmoke.add("§a§oEffect actif");
			}else{
				ALsmoke.add("§9§l>§r §7Clique pour activer");
				ALsmoke.add("§7cet effet");
			}
		}
		IMsmoke.setLore(ALsmoke);
		ISsmoke.setItemMeta(IMsmoke);
		i.setItem(23, ISsmoke);
		
		ItemStack ISsnow = new ItemStack(Material.SNOW_BALL);
		ItemMeta IMsnow = ISsnow.getItemMeta();
		ArrayList<String> ALsnow = new ArrayList<>();
		IMsnow.setDisplayName("§9Chapeau de neige");
		ALsnow.add("§fRareté : §9§oMythique");
		ALsnow.add(" ");
		if(!cp.HasCosmetic("snowhat")){
			ALsnow.add("§cTrouvable dans les coffres ou");
			ALsnow.add("§cachetable avec des crystals");
			ALsnow.add(" ");
			ALsnow.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("snowhat")){
				IMsnow.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMsnow.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALsnow.add("§a§oEffect actif");
			}else{
				ALsnow.add("§9§l>§r §7Clique pour activer");
				ALsnow.add("§7cet effet");
			}
		}
		IMsnow.setLore(ALsnow);
		ISsnow.setItemMeta(IMsnow);
		i.setItem(24, ISsnow);
		
		ItemStack ISangel = new ItemStack(Material.WOOL);
		ItemMeta IMangel = ISangel.getItemMeta();
		ArrayList<String> ALangel = new ArrayList<>();
		IMangel.setDisplayName("§9Chapeau d'ange");
		ALangel.add("§fRareté : §9§oMythique");
		ALangel.add(" ");
		if(!cp.HasCosmetic("angelhat")){
			ALangel.add("§cTrouvable dans les coffres ou");
			ALangel.add("§cachetable avec des crystals");
			ALangel.add(" ");
			ALangel.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("angelhat")){
				IMangel.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMangel.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALangel.add("§a§oEffect actif");
			}else{
				ALangel.add("§9§l>§r §7Clique pour activer");
				ALangel.add("§7cet effet");
			}
		}
		IMangel.setLore(ALangel);
		ISangel.setItemMeta(IMangel);
		i.setItem(25, ISangel);
		
		ItemStack IStotem = new ItemStack(Material.TOTEM);
		ItemMeta IMtotem = IStotem.getItemMeta();
		ArrayList<String> ALtotem = new ArrayList<>();
		IMtotem.setDisplayName("§9Chapeau totémique");
		ALtotem.add("§fRareté : §9§oMythique");
		ALtotem.add(" ");
		if(!cp.HasCosmetic("totemhat")){
			ALtotem.add("§cTrouvable dans les coffres ou");
			ALtotem.add("§cachetable avec des crystals");
			ALtotem.add(" ");
			ALtotem.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("totemhat")){
				IMtotem.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMtotem.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALtotem.add("§a§oEffect actif");
			}else{
				ALtotem.add("§9§l>§r §7Clique pour activer");
				ALtotem.add("§7cet effet");
			}
		}
		IMtotem.setLore(ALtotem);
		IStotem.setItemMeta(IMtotem);
		i.setItem(26, IStotem);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu de particules");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(31, ISba);
		
		p.openInventory(i);
		
	}

}
