package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ConfirmMenu {
	
	public static void openMenu(Player p, String type){
		
		Inventory i = Bukkit.createInventory(null, 45, "§8Confirmation");
		boolean open = true;
		
		if(type.equalsIgnoreCase("pass") || type.equalsIgnoreCase("qpass")){
			
			ItemStack IS = new ItemStack(Material.TNT);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§c1 Pass");
			int r = new Random().nextInt(999);
			AL.add("§8ID §l>§r §8"+type+r);
			AL.add(" ");
			AL.add("§6Coût : §e150 coins");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet de sauter la");
			AL.add("§rquête de son choix.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.equalsIgnoreCase("usep")){
			
			ItemStack IS = new ItemStack(Material.TNT);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§cUtilisation Pass");
			int r = new Random().nextInt(999);
			AL.add("§8ID §l>§r §8"+type+r);
			AL.add(" ");
			AL.add("§rEffet :");
			AL.add("§r§l>§r Permet de sauter la");
			AL.add("§rquête actuelle.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("usec")){
			
			String ct = type.replaceAll("usec", "");
			int sup = 1;
            try{
                sup = Integer.parseInt(ct);
              }catch (NumberFormatException ex){
                ex.printStackTrace();
              }
			ItemStack IS = new ItemStack(Material.WHITE_SHULKER_BOX);
			if(sup == 2){
				IS.setType(Material.YELLOW_SHULKER_BOX);
			}else if(sup == 3){
				IS.setType(Material.ORANGE_SHULKER_BOX);
			}else if(sup == 4){
				IS.setType(Material.LIME_SHULKER_BOX);
			}else if(sup == 5){
				IS.setType(Material.GREEN_SHULKER_BOX);
			}else if(sup == 6){
				IS.setType(Material.MAGENTA_SHULKER_BOX);
			}else if(sup == 7){
				IS.setType(Material.BROWN_SHULKER_BOX);
			}else if(sup == 8){
				IS.setType(Material.LIGHT_BLUE_SHULKER_BOX);
			}else if(sup == 9){
				IS.setType(Material.CYAN_SHULKER_BOX);
			}else if(sup == 10){
				IS.setType(Material.BLUE_SHULKER_BOX);
			}
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			if(sup == 1){
				IM.setDisplayName("§a§lCoffre "+sup+" étoile");
			}else{
				IM.setDisplayName("§a§lCoffre "+sup+" étoiles");
			}
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§rEffet :");
			AL.add("§r§l>§r Ouvre le coffre");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosangelwings")){
			
			ItemStack IS = new ItemStack(Material.WOOL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aAiles d'ange");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §280 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes d'ange.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosenchwings")){
			
			ItemStack IS = new ItemStack(Material.ENCHANTMENT_TABLE);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§2Ailes d'ange");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2160 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes enchantées.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosdragwings")){
			
			ItemStack IS = new ItemStack(Material.DRAGONS_BREATH);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§dAiles de dragon");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2240 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes de dragon.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("coswhitewings")){
			
			ItemStack IS = new ItemStack(Material.END_ROD);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§5Ailes blanches");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2320 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes blanches.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosfwwings")){
			
			ItemStack IS = new ItemStack(Material.FIREWORK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§bAiles brillantes");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2400 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes brillantes.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cossmokewings")){
			
			ItemStack IS = new ItemStack(Material.FIREBALL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§3Ailes de fumée");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2480 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes de fumée.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosgodwings")){
			
			ItemStack IS = new ItemStack(Material.TOTEM);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Ailes de dieu");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§railes de dieu.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosdlavahat")){
			
			ItemStack IS = new ItemStack(Material.LAVA_BUCKET);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aChapeau de lave");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §280 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de lave.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosdwaterhat")){
			
			ItemStack IS = new ItemStack(Material.WATER_BUCKET);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aChapeau d'eau");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §280 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau d'eau.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosenchhat")){
			
			ItemStack IS = new ItemStack(Material.ENCHANTMENT_TABLE);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§2Chapeau enchanté");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2160 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau enchanté.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("coswhitehat")){
			
			ItemStack IS = new ItemStack(Material.END_ROD);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§2Chapeau blanc");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2160 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau blanc.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cossandhat")){
			
			ItemStack IS = new ItemStack(Material.SAND);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("d5Chapeau de sable");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2240 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de sable.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosfwhat")){
			
			ItemStack IS = new ItemStack(Material.FIREWORK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§dChapeau brillant");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2240 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau brillant.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosflamehat")){
			
			ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§5Chapeau de feu");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2320 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de feu.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosmagichat")){
			
			ItemStack IS = new ItemStack(Material.EMERALD);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§5Chapeau magique");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2320 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau magique.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("coslovehat")){
			
			ItemStack IS = new ItemStack(Material.PINK_GLAZED_TERRACOTTA);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§bChapeau d'amour");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2400 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau d'amour.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("coslavahat")){
			
			ItemStack IS = new ItemStack(Material.FLINT_AND_STEEL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§bChapeau de jets de lave");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2400 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de jets de lave.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("coscombathat")){
			
			ItemStack IS = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§3Chapeau du combattant");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2480 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau du combattant.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosnotehat")){
			
			ItemStack IS = new ItemStack(Material.NOTE_BLOCK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§3Chapeau de musique");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2480 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de musique.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosenderhat")){
			
			ItemStack IS = new ItemStack(Material.ENDER_PEARL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau de l'ender");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de l'ender.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosnetherhat")){
			
			ItemStack IS = new ItemStack(Material.NETHERRACK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau de l'ender");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau du nether.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosmulthat")){
			
			ItemStack IS = new ItemStack(Material.NETHERRACK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau multicolor");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau multicolor.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosslimehat")){
			
			ItemStack IS = new ItemStack(Material.APPLE);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau de slime");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de slime.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cossmokehat")){
			
			ItemStack IS = new ItemStack(Material.FIREBALL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau de fumée");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de fumée.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cossnowhat")){
			
			ItemStack IS = new ItemStack(Material.SNOW_BALL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau de neige");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau de neige.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("cosangelhat")){
			
			ItemStack IS = new ItemStack(Material.WOOL);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau d'ange");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau d'ange.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else if(type.contains("costotemhat")){
			
			ItemStack IS = new ItemStack(Material.TOTEM);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§9Chapeau totémique");
			AL.add("§8ID §l>§r §8"+type);
			AL.add(" ");
			AL.add("§6Coût : §2560 crystals");
			AL.add(" ");
			AL.add("§rUtilisation :");
			AL.add("§r§l>§r Permet d'obtenir le cosmétique");
			AL.add("§rchapeau totémique.");
			IM.setLore(AL);
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
			
		}else{
			
			open = false;
			
		}
		
		ItemStack ISyes = new ItemStack(Material.WOOL, 1, (short) 5);
		ItemMeta IMyes = ISyes.getItemMeta();
		IMyes.setDisplayName("§a§lCONFIRMER");
		ISyes.setItemMeta(IMyes);
		i.setItem(29, ISyes);
		
		ItemStack ISno = new ItemStack(Material.WOOL, 1, (short) 14);
		ItemMeta IMno = ISno.getItemMeta();
		IMno.setDisplayName("§c§lANNULER");
		ISno.setItemMeta(IMno);
		i.setItem(33, ISno);
		
		if(open){
			if(p.getOpenInventory() != null){
				p.closeInventory();
			}
			p.openInventory(i);
		}
		
	}

}
