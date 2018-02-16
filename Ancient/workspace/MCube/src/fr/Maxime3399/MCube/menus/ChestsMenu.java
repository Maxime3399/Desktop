package fr.Maxime3399.MCube.menus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class ChestsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 54, "§8Coffres");
		CustomPlayer cp = new CustomPlayer(p);
		
		ItemStack ISsep1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		ItemMeta IMsep1 = ISsep1.getItemMeta();
		IMsep1.setDisplayName(" ");
		ISsep1.setItemMeta(IMsep1);
		i.setItem(0, ISsep1);
		i.setItem(1, ISsep1);
		i.setItem(2, ISsep1);
		i.setItem(3, ISsep1);
		i.setItem(4, ISsep1);
		i.setItem(5, ISsep1);
		i.setItem(6, ISsep1);
		i.setItem(7, ISsep1);
		i.setItem(8, ISsep1);
		i.setItem(9, ISsep1);
		i.setItem(17, ISsep1);
		i.setItem(18, ISsep1);
		i.setItem(19, ISsep1);
		i.setItem(20, ISsep1);
		i.setItem(24, ISsep1);
		i.setItem(25, ISsep1);
		i.setItem(26, ISsep1);
		i.setItem(27, ISsep1);
		i.setItem(28, ISsep1);
		i.setItem(29, ISsep1);
		i.setItem(30, ISsep1);
		i.setItem(31, ISsep1);
		i.setItem(32, ISsep1);
		i.setItem(33, ISsep1);
		i.setItem(34, ISsep1);
		i.setItem(35, ISsep1);
		
		ItemStack IS1 = new ItemStack(Material.WHITE_SHULKER_BOX);
		if(cp.getChests1() > 64){
			IS1.setAmount(64);
		}else if(cp.getChests1() < 1){
			IS1.setAmount(1);
		}else{
			IS1.setAmount(cp.getChests1());
		}
		ItemMeta IM1 = IS1.getItemMeta();
		ArrayList<String> AL1 = new ArrayList<>();
		IM1.setDisplayName("§a§lCoffre 1 étoile");
		AL1.add("  §b"+cp.getChests1());
		AL1.add(" ");
		if(cp.getChests1() > 0){
			AL1.add("§9Clique pour ouvrir ce");
			AL1.add("§9coffre");
		}else{
			AL1.add("§dVisite la boutique pour");
			AL1.add("§dobtenir plus de coffres");
		}
		IM1.setLore(AL1);
		IS1.setItemMeta(IM1);
		i.setItem(10, IS1);
		
		ItemStack IS2 = new ItemStack(Material.YELLOW_SHULKER_BOX);
		if(cp.getChests2() > 64){
			IS2.setAmount(64);
		}else if(cp.getChests2() < 1){
			IS2.setAmount(1);
		}else{
			IS2.setAmount(cp.getChests2());
		}
		ItemMeta IM2 = IS2.getItemMeta();
		ArrayList<String> AL2 = new ArrayList<>();
		IM2.setDisplayName("§a§lCoffre 2 étoiles");
		AL2.add("  §b"+cp.getChests2());
		AL2.add(" ");
		if(cp.getChests2() > 0){
			AL2.add("§9Clique pour ouvrir ce");
			AL2.add("§9coffre");
		}else{
			AL2.add("§dVisite la boutique pour");
			AL2.add("§dobtenir plus de coffres");
		}
		IM2.setLore(AL2);
		IS2.setItemMeta(IM2);
		i.setItem(11, IS2);
		
		ItemStack IS3 = new ItemStack(Material.ORANGE_SHULKER_BOX);
		if(cp.getChests3() > 64){
			IS3.setAmount(64);
		}else if(cp.getChests3() < 1){
			IS3.setAmount(1);
		}else{
			IS3.setAmount(cp.getChests3());
		}
		ItemMeta IM3 = IS3.getItemMeta();
		ArrayList<String> AL3 = new ArrayList<>();
		IM3.setDisplayName("§a§lCoffre 3 étoiles");
		AL3.add("  §b"+cp.getChests3());
		AL3.add(" ");
		if(cp.getChests3() > 0){
			AL3.add("§9Clique pour ouvrir ce");
			AL3.add("§9coffre");
		}else{
			AL3.add("§dVisite la boutique pour");
			AL3.add("§dobtenir plus de coffres");
		}
		IM3.setLore(AL3);
		IS3.setItemMeta(IM3);
		i.setItem(12, IS3);
		
		ItemStack IS4 = new ItemStack(Material.LIME_SHULKER_BOX);
		if(cp.getChests4() > 64){
			IS4.setAmount(64);
		}else if(cp.getChests4() < 1){
			IS4.setAmount(1);
		}else{
			IS4.setAmount(cp.getChests4());
		}
		ItemMeta IM4 = IS4.getItemMeta();
		ArrayList<String> AL4 = new ArrayList<>();
		IM4.setDisplayName("§a§lCoffre 4 étoiles");
		AL4.add("  §b"+cp.getChests4());
		AL4.add(" ");
		if(cp.getChests4() > 0){
			AL4.add("§9Clique pour ouvrir ce");
			AL4.add("§9coffre");
		}else{
			AL4.add("§dVisite la boutique pour");
			AL4.add("§dobtenir plus de coffres");
		}
		IM4.setLore(AL4);
		IS4.setItemMeta(IM4);
		i.setItem(13, IS4);
		
		ItemStack IS5 = new ItemStack(Material.GREEN_SHULKER_BOX);
		if(cp.getChests5() > 64){
			IS5.setAmount(64);
		}else if(cp.getChests5() < 1){
			IS5.setAmount(1);
		}else{
			IS5.setAmount(cp.getChests5());
		}
		ItemMeta IM5 = IS5.getItemMeta();
		ArrayList<String> AL5 = new ArrayList<>();
		IM5.setDisplayName("§a§lCoffre 5 étoiles");
		AL5.add("  §b"+cp.getChests5());
		AL5.add(" ");
		if(cp.getChests5() > 0){
			AL5.add("§9Clique pour ouvrir ce");
			AL5.add("§9coffre");
		}else{
			AL5.add("§dVisite la boutique pour");
			AL5.add("§dobtenir plus de coffres");
		}
		IM5.setLore(AL5);
		IS5.setItemMeta(IM5);
		i.setItem(14, IS5);
		
		ItemStack IS6 = new ItemStack(Material.MAGENTA_SHULKER_BOX);
		if(cp.getChests6() > 64){
			IS6.setAmount(64);
		}else if(cp.getChests6() < 1){
			IS6.setAmount(1);
		}else{
			IS6.setAmount(cp.getChests6());
		}
		ItemMeta IM6 = IS6.getItemMeta();
		IM6.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM6.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		ArrayList<String> AL6 = new ArrayList<>();
		IM6.setDisplayName("§a§lCoffre 6 étoiles");
		AL6.add("  §b"+cp.getChests6());
		AL6.add(" ");
		if(cp.getChests6() > 0){
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
		    if(cp.getBuyChestDate().equalsIgnoreCase(date)){
				AL6.add("§9Clique pour ouvrir ce");
				AL6.add("§9coffre");
		    }else if(!cp.getRank().equalsIgnoreCase("default")){
				AL6.add("§9Clique pour ouvrir ce");
				AL6.add("§9coffre");
		    }else{
		    	AL6.add("§cIl faut au moins être §f§lMiniVIP");
		    	AL6.add("§cpour ouvrir ce coffre");
		    }
		}else{
			AL6.add("§dVisite la boutique pour");
			AL6.add("§dobtenir plus de coffres");
		}
		IM6.setLore(AL6);
		IS6.setItemMeta(IM6);
		i.setItem(15, IS6);
		
		ItemStack IS7 = new ItemStack(Material.BROWN_SHULKER_BOX);
		if(cp.getChests7() > 64){
			IS7.setAmount(64);
		}else if(cp.getChests7() < 1){
			IS7.setAmount(1);
		}else{
			IS7.setAmount(cp.getChests7());
		}
		ItemMeta IM7 = IS7.getItemMeta();
		ArrayList<String> AL7 = new ArrayList<>();
		IM7.setDisplayName("§a§lCoffre 7 étoiles");
		AL7.add("  §b"+cp.getChests7());
		AL7.add(" ");
		if(cp.getChests7() > 0){
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
		    if(cp.getBuyChestDate().equalsIgnoreCase(date)){
				AL7.add("§9Clique pour ouvrir ce");
				AL7.add("§9coffre");
		    }else if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip")){
				AL7.add("§9Clique pour ouvrir ce");
				AL7.add("§9coffre");
		    }else{
		    	AL7.add("§cIl faut au moins être §e§lVIP");
		    	AL7.add("§cpour ouvrir ce coffre");
		    }
		}else{
			AL7.add("§dVisite la boutique pour");
			AL7.add("§dobtenir plus de coffres");
		}
		IM7.setLore(AL7);
		IS7.setItemMeta(IM7);
		i.setItem(16, IS7);
		
		ItemStack IS8 = new ItemStack(Material.LIGHT_BLUE_SHULKER_BOX);
		if(cp.getChests8() > 64){
			IS8.setAmount(64);
		}else if(cp.getChests8() < 1){
			IS8.setAmount(1);
		}else{
			IS8.setAmount(cp.getChests8());
		}
		ItemMeta IM8 = IS8.getItemMeta();
		ArrayList<String> AL8 = new ArrayList<>();
		IM8.setDisplayName("§a§lCoffre 8 étoiles");
		AL8.add("  §b"+cp.getChests8());
		AL8.add(" ");
		if(cp.getChests8() > 0){
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
		    if(cp.getBuyChestDate().equalsIgnoreCase(date)){
				AL8.add("§9Clique pour ouvrir ce");
				AL8.add("§9coffre");
		    }else if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip") && !cp.getRank().equalsIgnoreCase("vip")){
				AL8.add("§9Clique pour ouvrir ce");
				AL8.add("§9coffre");
		    }else{
		    	AL8.add("§cIl faut au moins être §b§lVIP+");
		    	AL8.add("§cpour ouvrir ce coffre");
		    }
		}else{
			AL8.add("§dVisite la boutique pour");
			AL8.add("§dobtenir plus de coffres");
		}
		IM8.setLore(AL8);
		IM8.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM8.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS8.setItemMeta(IM8);
		i.setItem(21, IS8);
		
		ItemStack IS9 = new ItemStack(Material.CYAN_SHULKER_BOX);
		if(cp.getChests9() > 64){
			IS9.setAmount(64);
		}else if(cp.getChests9() < 1){
			IS9.setAmount(1);
		}else{
			IS9.setAmount(cp.getChests9());
		}
		ItemMeta IM9 = IS9.getItemMeta();
		ArrayList<String> AL9 = new ArrayList<>();
		IM9.setDisplayName("§a§lCoffre 9 étoiles");
		AL9.add("  §b"+cp.getChests9());
		AL9.add(" ");
		if(cp.getChests9() > 0){
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
		    if(cp.getBuyChestDate().equalsIgnoreCase(date)){
				AL9.add("§9Clique pour ouvrir ce");
				AL9.add("§9coffre");
		    }else if(!cp.getRank().equalsIgnoreCase("default") && !cp.getRank().equalsIgnoreCase("minivip") && !cp.getRank().equalsIgnoreCase("vip") && !cp.getRank().equalsIgnoreCase("vip+")){
				AL9.add("§9Clique pour ouvrir ce");
				AL9.add("§9coffre");
		    }else{
		    	AL9.add("§cIl faut au moins être §a§lUltraVIP");
		    	AL9.add("§cpour ouvrir ce coffre");
		    }
		}else{
			AL9.add("§dVisite la boutique pour");
			AL9.add("§dobtenir plus de coffres");
		}
		IM9.setLore(AL9);
		IS9.setItemMeta(IM9);
		i.setItem(22, IS9);
		
		ItemStack IS10 = new ItemStack(Material.BLUE_SHULKER_BOX);
		if(cp.getChests10() > 64){
			IS10.setAmount(64);
		}else if(cp.getChests10() < 1){
			IS10.setAmount(1);
		}else{
			IS10.setAmount(cp.getChests10());
		}
		ItemMeta IM10 = IS10.getItemMeta();
		ArrayList<String> AL10 = new ArrayList<>();
		IM10.setDisplayName("§a§lCoffre 10 étoiles");
		AL10.add("  §b"+cp.getChests10());
		AL10.add(" ");
		if(cp.getChests10() > 0){
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
		    if(cp.getBuyChestDate().equalsIgnoreCase(date)){
				AL10.add("§9Clique pour ouvrir ce");
				AL10.add("§9coffre");
		    }else if(cp.getRank().equalsIgnoreCase("ultravip+")){
				AL10.add("§9Clique pour ouvrir ce");
				AL10.add("§9coffre");
		    }else{
		    	AL10.add("§cIl faut au moins être §2§lUltraVIP+");
		    	AL10.add("§cpour ouvrir ce coffre");
		    }
		}else{
			AL10.add("§dVisite la boutique pour");
			AL10.add("§dobtenir plus de coffres");
		}
		IM10.setLore(AL10);
		IM10.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM10.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS10.setItemMeta(IM10);
		i.setItem(23, IS10);
		
		ItemStack ISsep2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 15);
		ItemMeta IMsep2 = ISsep2.getItemMeta();
		IMsep2.setDisplayName(" ");
		ISsep2.setItemMeta(IMsep1);
		i.setItem(36, ISsep2);
		i.setItem(37, ISsep2);
		i.setItem(38, ISsep2);
		i.setItem(39, ISsep2);
		i.setItem(40, ISsep2);
		i.setItem(41, ISsep2);
		i.setItem(42, ISsep2);
		i.setItem(43, ISsep2);
		i.setItem(44, ISsep2);
		
		ItemStack ISinf = new ItemStack(Material.PAPER);
		ItemMeta IMinf = ISinf.getItemMeta();
		ArrayList<String> ALinf = new ArrayList<>();
		IMinf.setDisplayName("§rInformations :");
		ALinf.add(" ");
		ALinf.add("§r  §l-§r Chaque mois, les coffres que vous n'avez");
		ALinf.add("§rpas ouverts expirent.");
		ALinf.add("§r  §l-§r Il est possible d'acheter des packs de");
		ALinf.add("§rcoffres sur la boutique en ligne");
		IMinf.setLore(ALinf);
		ISinf.setItemMeta(IMinf);
		i.setItem(48, ISinf);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(53, ISba);
		
		ItemStack ISsep3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 3);
		ItemMeta IMsep3 = ISsep3.getItemMeta();
		IMsep3.setDisplayName(" ");
		ISsep3.setItemMeta(IMsep3);
		i.setItem(45, ISsep3);
		i.setItem(46, ISsep3);
		i.setItem(47, ISsep3);
		i.setItem(49, ISsep3);
		i.setItem(50, ISsep3);
		i.setItem(51, ISsep3);
		i.setItem(52, ISsep3);
		
		p.openInventory(i);
		
	}

}
