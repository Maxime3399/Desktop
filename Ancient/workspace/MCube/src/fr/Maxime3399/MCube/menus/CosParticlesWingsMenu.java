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

public class CosParticlesWingsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Particules>Ailes");
		CustomPlayer cp = new CustomPlayer(p);
		
		ItemStack ISfir = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMfir = ISfir.getItemMeta();
		ArrayList<String> ALfir = new ArrayList<>();
		IMfir.setDisplayName("§9Ailes de feu");
		ALfir.add("§fRareté : §9§oMythique");
		ALfir.add(" ");
		if(cp.getRank().equalsIgnoreCase("default")){
			ALfir.add("§cRéservé aux §f§lMiniVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("firewings")){
				IMfir.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMfir.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALfir.add("§a§oEffect actif");
			}else{
				ALfir.add("§9§l>§r §7Clique pour activer");
				ALfir.add("§7cet effet");
			}
		}
		IMfir.setLore(ALfir);
		ISfir.setItemMeta(IMfir);
		i.setItem(0, ISfir);
		
		ItemStack ISmagic = new ItemStack(Material.EMERALD);
		ItemMeta IMmagic = ISmagic.getItemMeta();
		ArrayList<String> ALmagic = new ArrayList<>();
		IMmagic.setDisplayName("§9Ailes magiques");
		ALmagic.add("§fRareté : §9§oMythique");
		ALmagic.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip")){
			ALmagic.add("§cRéservé aux §e§lVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("magicwings")){
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
		i.setItem(1, ISmagic);
		
		ItemStack ISsnow = new ItemStack(Material.SNOW_BALL);
		ItemMeta IMsnow = ISsnow.getItemMeta();
		ArrayList<String> ALsnow = new ArrayList<>();
		IMsnow.setDisplayName("§9Ailes de neige");
		ALsnow.add("§fRareté : §9§oMythique");
		ALsnow.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip")){
			ALsnow.add("§cRéservé aux §b§lVIP+§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("snowwings")){
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
		i.setItem(2, ISsnow);
		
		ItemStack ISmult = new ItemStack(Material.APPLE);
		ItemMeta IMmult = ISmult.getItemMeta();
		ArrayList<String> ALmult = new ArrayList<>();
		IMmult.setDisplayName("§9Ailes multicolores");
		ALmult.add("§fRareté : §9§oMythique");
		ALmult.add(" ");
		if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip") || cp.getRank().equalsIgnoreCase("vip+")){
			ALmult.add("§cRéservé aux §a§lUltraVIP§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("multicolorwings")){
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
		i.setItem(3, ISmult);
		
		ItemStack ISdeath = new ItemStack(Material.BONE);
		ItemMeta IMdeath = ISdeath.getItemMeta();
		ArrayList<String> ALdeath = new ArrayList<>();
		IMdeath.setDisplayName("§9Ailes de la mort");
		ALdeath.add("§fRareté : §9§oMythique");
		ALdeath.add(" ");
		if(!cp.getRank().equalsIgnoreCase("ultravip+")){
			ALdeath.add("§cRéservé aux §2§lUltraVIP+§r§c et plus !");
		}else{
			if(cp.getEnabledCosmetics().contains("deathwings")){
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
		i.setItem(4, ISdeath);
		
		ItemStack ISnether = new ItemStack(Material.NETHERRACK);
		ItemMeta IMnether = ISnether.getItemMeta();
		ArrayList<String> ALnether = new ArrayList<>();
		IMnether.setDisplayName("§9Ailes du nether");
		ALnether.add("§fRareté : §9§oMythique");
		ALnether.add(" ");
		if(!cp.HasCosmetic("netherwings")){
			ALnether.add("§cAchetable sur la boutique");
		}else{
			if(cp.getEnabledCosmetics().contains("netherwings")){
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
		i.setItem(5, ISnether);
		
		ItemStack ISender = new ItemStack(Material.ENDER_PEARL);
		ItemMeta IMender = ISender.getItemMeta();
		ArrayList<String> ALender = new ArrayList<>();
		IMender.setDisplayName("§9Ailes de l'ender");
		ALender.add("§fRareté : §9§oMythique");
		ALender.add(" ");
		if(!cp.HasCosmetic("enderwings")){
			ALender.add("§cObtenable lors d'events");
		}else{
			if(cp.getEnabledCosmetics().contains("enderwings")){
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
		i.setItem(6, ISender);
		
		ItemStack ISangel = new ItemStack(Material.WOOL);
		ItemMeta IMangel = ISangel.getItemMeta();
		ArrayList<String> ALangel = new ArrayList<>();
		IMangel.setDisplayName("§aAiles d'ange");
		ALangel.add("§fRareté : §a§oCommun");
		ALangel.add(" ");
		if(!cp.HasCosmetic("angelwings")){
			ALangel.add("§cTrouvable dans les coffres ou");
			ALangel.add("§cachetable avec des crystals");
			ALangel.add(" ");
			ALangel.add("§6Coût : §280 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("angelwings")){
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
		i.setItem(7, ISangel);
		
		ItemStack ISench = new ItemStack(Material.ENCHANTMENT_TABLE);
		ItemMeta IMench = ISench.getItemMeta();
		ArrayList<String> ALench = new ArrayList<>();
		IMench.setDisplayName("§2Ailes enchantées");
		ALench.add("§fRareté : §2§oPeu-Commun");
		ALench.add(" ");
		if(!cp.HasCosmetic("enchwings")){
			ALench.add("§cTrouvable dans les coffres ou");
			ALench.add("§cachetable avec des crystals");
			ALench.add(" ");
			ALench.add("§6Coût : §2160 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("enchwings")){
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
		i.setItem(8, ISench);
		
		ItemStack ISdrag = new ItemStack(Material.DRAGONS_BREATH);
		ItemMeta IMdrag = ISdrag.getItemMeta();
		ArrayList<String> ALdrag = new ArrayList<>();
		IMdrag.setDisplayName("§dAiles de dragon");
		ALdrag.add("§fRareté : §d§oRare");
		ALdrag.add(" ");
		if(!cp.HasCosmetic("dragwings")){
			ALdrag.add("§cTrouvable dans les coffres ou");
			ALdrag.add("§cachetable avec des crystals");
			ALdrag.add(" ");
			ALdrag.add("§6Coût : §2240 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("dragwings")){
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
		i.setItem(10, ISdrag);
		
		ItemStack ISwhite = new ItemStack(Material.END_ROD);
		ItemMeta IMwhite = ISwhite.getItemMeta();
		ArrayList<String> ALwhite = new ArrayList<>();
		IMwhite.setDisplayName("§5Ailes blanches");
		ALwhite.add("§fRareté : §5§oSuper");
		ALwhite.add(" ");
		if(!cp.HasCosmetic("whitewings")){
			ALwhite.add("§cTrouvable dans les coffres ou");
			ALwhite.add("§cachetable avec des crystals");
			ALwhite.add(" ");
			ALwhite.add("§6Coût : §2320 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("whitewings")){
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
		i.setItem(11, ISwhite);
		
		ItemStack ISfw = new ItemStack(Material.FIREWORK);
		ItemMeta IMfw = ISfw.getItemMeta();
		ArrayList<String> ALfw = new ArrayList<>();
		IMfw.setDisplayName("§bAiles brillantes");
		ALfw.add("§fRareté : §b§oEpique");
		ALfw.add(" ");
		if(!cp.HasCosmetic("fwwings")){
			ALfw.add("§cTrouvable dans les coffres ou");
			ALfw.add("§cachetable avec des crystals");
			ALfw.add(" ");
			ALfw.add("§6Coût : §2400 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("fwwings")){
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
		
		ItemStack ISsmoke = new ItemStack(Material.FIREBALL);
		ItemMeta IMsmoke = ISsmoke.getItemMeta();
		ArrayList<String> ALsmoke = new ArrayList<>();
		IMsmoke.setDisplayName("§3Ailes de fumée");
		ALsmoke.add("§fRareté : §3§oLégendaire");
		ALsmoke.add(" ");
		if(!cp.HasCosmetic("smokewings")){
			ALsmoke.add("§cTrouvable dans les coffres ou");
			ALsmoke.add("§cachetable avec des crystals");
			ALsmoke.add(" ");
			ALsmoke.add("§6Coût : §2480 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("smokewings")){
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
		i.setItem(13, ISsmoke);
		
		ItemStack ISgod = new ItemStack(Material.TOTEM);
		ItemMeta IMgod = ISgod.getItemMeta();
		ArrayList<String> ALgod = new ArrayList<>();
		IMgod.setDisplayName("§9Ailes de dieu");
		ALgod.add("§fRareté : §9§oMythique");
		ALgod.add(" ");
		if(!cp.HasCosmetic("godwings")){
			ALgod.add("§cTrouvable dans les coffres ou");
			ALgod.add("§cachetable avec des crystals");
			ALgod.add(" ");
			ALgod.add("§6Coût : §2560 crystals");
		}else{
			if(cp.getEnabledCosmetics().contains("godwings")){
				IMgod.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IMgod.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				ALgod.add("§a§oEffect actif");
			}else{
				ALgod.add("§9§l>§r §7Clique pour activer");
				ALgod.add("§7cet effet");
			}
		}
		IMgod.setLore(ALgod);
		ISgod.setItemMeta(IMgod);
		i.setItem(14, ISgod);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu de particules");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(17, ISba);
		
		p.openInventory(i);
		
	}

}
