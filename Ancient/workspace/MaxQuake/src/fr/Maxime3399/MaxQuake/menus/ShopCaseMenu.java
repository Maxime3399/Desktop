package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipLast;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.utils.CostUtils;

public class ShopCaseMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "§8Apparences");
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack IS01 = new ItemStack(Material.STICK);
		ItemMeta IM01 = IS01.getItemMeta();
		ArrayList<String> AL01 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 1){
			AL01.add("§aDébloqué !");
			AL01.add(" ");
			if(qp.getEnable().contains("case01")){
				IM01.setDisplayName("§bApparence 1");
				AL01.add("§2Elément équipé");
			}else{
				IM01.setDisplayName("§aApparence 1");
				AL01.add("§eClique pour équiper");
			}
		}
		IM01.setLore(AL01);
		IS01.setItemMeta(IM01);
		i.addItem(IS01);
		
		ItemStack IS02 = new ItemStack(Material.STICK);
		ItemMeta IM02 = IS02.getItemMeta();
		ArrayList<String> AL02 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 2){
			AL02.add("§aDébloqué !");
			AL02.add(" ");
			if(qp.getEnable().contains("case02")){
				IM02.setDisplayName("§bApparence 2");
				AL02.add("§2Elément équipé");
			}else{
				IM02.setDisplayName("§aApparence 2");
				AL02.add("§eClique pour équiper");
			}
		}else{
			AL02.add("§cBloqué !");
			AL02.add(" ");
			if(qp.getCoins() >= CostUtils.getCaseCost(2)){
				IM02.setDisplayName("§6Apparence 2");
				AL02.add("§6Coût : "+CostUtils.getCaseCost(2));
				AL02.add(" ");
				AL02.add("§eClique pour acheter");
			}else{
				IM02.setDisplayName("§cApparence 2");
				AL02.add("§cCoût : "+CostUtils.getCaseCost(2));
			}
		}
		IM02.setLore(AL02);
		IM02.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM02.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS02.setItemMeta(IM02);
		i.addItem(IS02);
		
		ItemStack IS03 = new ItemStack(Material.WOOD_HOE);
		ItemMeta IM03 = IS03.getItemMeta();
		ArrayList<String> AL03 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 3){
			AL03.add("§aDébloqué !");
			AL03.add(" ");
			if(qp.getEnable().contains("case03")){
				IM03.setDisplayName("§bApparence 3");
				AL03.add("§2Elément équipé");
			}else{
				IM03.setDisplayName("§aApparence 3");
				AL03.add("§eClique pour équiper");
			}
		}else{
			AL03.add("§cBloqué !");
			AL03.add(" ");
			if(EquipLast.getCase(qp) == 2){
				if(qp.getCoins() >= CostUtils.getCaseCost(3)){
					IM03.setDisplayName("§6Apparence 3");
					AL03.add("§6Coût : "+CostUtils.getCaseCost(3));
					AL03.add(" ");
					AL03.add("§eClique pour acheter");
				}else{
					IM03.setDisplayName("§cApparence 3");
					AL03.add("§cCoût : "+CostUtils.getCaseCost(3));
				}
			}else{
				IM03.setDisplayName("§4Apparence 3");
				AL03.add("§cApparence 2 requise");
			}
		}
		IM03.setLore(AL03);
		IS03.setItemMeta(IM03);
		i.addItem(IS03);
		
		ItemStack IS04 = new ItemStack(Material.WOOD_HOE);
		ItemMeta IM04 = IS04.getItemMeta();
		ArrayList<String> AL04 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 4){
			AL04.add("§aDébloqué !");
			AL04.add(" ");
			if(qp.getEnable().contains("case04")){
				IM04.setDisplayName("§bApparence 4");
				AL04.add("§2Elément équipé");
			}else{
				IM04.setDisplayName("§aApparence 4");
				AL04.add("§eClique pour équiper");
			}
		}else{
			AL04.add("§cBloqué !");
			AL04.add(" ");
			if(EquipLast.getCase(qp) == 3){
				if(qp.getCoins() >= CostUtils.getCaseCost(4)){
					IM04.setDisplayName("§6Apparence 4");
					AL04.add("§6Coût : "+CostUtils.getCaseCost(4));
					AL04.add(" ");
					AL04.add("§eClique pour acheter");
				}else{
					IM04.setDisplayName("§cApparence 4");
					AL04.add("§cCoût : "+CostUtils.getCaseCost(4));
				}
			}else{
				IM04.setDisplayName("§4Apparence 4");
				AL04.add("§cApparence 3 requise");
			}
		}
		IM04.setLore(AL04);
		IM04.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM04.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS04.setItemMeta(IM04);
		i.addItem(IS04);
		
		ItemStack IS05 = new ItemStack(Material.STONE_HOE);
		ItemMeta IM05 = IS05.getItemMeta();
		ArrayList<String> AL05 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 5){
			AL05.add("§aDébloqué !");
			AL05.add(" ");
			if(qp.getEnable().contains("case05")){
				IM05.setDisplayName("§bApparence 5");
				AL05.add("§2Elément équipé");
			}else{
				IM05.setDisplayName("§aApparence 5");
				AL05.add("§eClique pour équiper");
			}
		}else{
			AL05.add("§cBloqué !");
			AL05.add(" ");
			if(EquipLast.getCase(qp) == 4){
				if(qp.getCoins() >= CostUtils.getCaseCost(5)){
					IM05.setDisplayName("§6Apparence 5");
					AL05.add("§6Coût : "+CostUtils.getCaseCost(5));
					AL05.add(" ");
					AL05.add("§eClique pour acheter");
				}else{
					IM05.setDisplayName("§cApparence 5");
					AL05.add("§cCoût : "+CostUtils.getCaseCost(5));
				}
			}else{
				IM05.setDisplayName("§4Apparence 5");
				AL05.add("§cApparence 4 requise");
			}
		}
		IM05.setLore(AL05);
		IS05.setItemMeta(IM05);
		i.addItem(IS05);
		
		ItemStack IS06 = new ItemStack(Material.STONE_HOE);
		ItemMeta IM06 = IS06.getItemMeta();
		ArrayList<String> AL06 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 6){
			AL06.add("§aDébloqué !");
			AL06.add(" ");
			if(qp.getEnable().contains("case06")){
				IM06.setDisplayName("§bApparence 6");
				AL06.add("§2Elément équipé");
			}else{
				IM06.setDisplayName("§aApparence 6");
				AL06.add("§eClique pour équiper");
			}
		}else{
			AL06.add("§cBloqué !");
			AL06.add(" ");
			if(EquipLast.getCase(qp) == 5){
				if(qp.getCoins() >= CostUtils.getCaseCost(6)){
					IM06.setDisplayName("§6Apparence 6");
					AL06.add("§6Coût : "+CostUtils.getCaseCost(6));
					AL06.add(" ");
					AL06.add("§eClique pour acheter");
				}else{
					IM06.setDisplayName("§cApparence 6");
					AL06.add("§cCoût : "+CostUtils.getCaseCost(6));
				}
			}else{
				IM06.setDisplayName("§4Apparence 6");
				AL06.add("§cApparence 5 requise");
			}
		}
		IM06.setLore(AL06);
		IM06.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM06.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS06.setItemMeta(IM06);
		i.addItem(IS06);
		
		ItemStack IS07 = new ItemStack(Material.IRON_HOE);
		ItemMeta IM07 = IS07.getItemMeta();
		ArrayList<String> AL07 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 7){
			AL07.add("§aDébloqué !");
			AL07.add(" ");
			if(qp.getEnable().contains("case07")){
				IM07.setDisplayName("§bApparence 7");
				AL07.add("§2Elément équipé");
			}else{
				IM07.setDisplayName("§aApparence 7");
				AL07.add("§eClique pour équiper");
			}
		}else{
			AL07.add("§cBloqué !");
			AL07.add(" ");
			if(EquipLast.getCase(qp) == 6){
				if(qp.getCoins() >= CostUtils.getCaseCost(7)){
					IM07.setDisplayName("§6Apparence 7");
					AL07.add("§6Coût : "+CostUtils.getCaseCost(7));
					AL07.add(" ");
					AL07.add("§eClique pour acheter");
				}else{
					IM07.setDisplayName("§cApparence 7");
					AL07.add("§cCoût : "+CostUtils.getCaseCost(7));
				}
			}else{
				IM07.setDisplayName("§4Apparence 7");
				AL07.add("§cApparence 6 requise");
			}
		}
		IM07.setLore(AL07);
		IS07.setItemMeta(IM07);
		i.addItem(IS07);
		
		ItemStack IS08 = new ItemStack(Material.IRON_HOE);
		ItemMeta IM08 = IS08.getItemMeta();
		ArrayList<String> AL08 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 8){
			AL08.add("§aDébloqué !");
			AL08.add(" ");
			if(qp.getEnable().contains("case08")){
				IM08.setDisplayName("§bApparence 8");
				AL08.add("§2Elément équipé");
			}else{
				IM08.setDisplayName("§aApparence 8");
				AL08.add("§eClique pour équiper");
			}
		}else{
			AL08.add("§cBloqué !");
			AL08.add(" ");
			if(EquipLast.getCase(qp) == 7){
				if(qp.getCoins() >= CostUtils.getCaseCost(8)){
					IM08.setDisplayName("§6Apparence 8");
					AL08.add("§6Coût : "+CostUtils.getCaseCost(8));
					AL08.add(" ");
					AL08.add("§eClique pour acheter");
				}else{
					IM08.setDisplayName("§cApparence 8");
					AL08.add("§cCoût : "+CostUtils.getCaseCost(8));
				}
			}else{
				IM08.setDisplayName("§4Apparence 8");
				AL08.add("§cApparence 7 requise");
			}
		}
		IM08.setLore(AL08);
		IM08.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM08.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS08.setItemMeta(IM08);
		i.addItem(IS08);
		
		ItemStack IS09 = new ItemStack(Material.GOLD_HOE);
		ItemMeta IM09 = IS09.getItemMeta();
		ArrayList<String> AL09 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 9){
			AL09.add("§aDébloqué !");
			AL09.add(" ");
			if(qp.getEnable().contains("case09")){
				IM09.setDisplayName("§bApparence 9");
				AL09.add("§2Elément équipé");
			}else{
				IM09.setDisplayName("§aApparence 9");
				AL09.add("§eClique pour équiper");
			}
		}else{
			AL09.add("§cBloqué !");
			AL09.add(" ");
			if(EquipLast.getCase(qp) == 8){
				if(qp.getCoins() >= CostUtils.getCaseCost(9)){
					IM09.setDisplayName("§6Apparence 9");
					AL09.add("§6Coût : "+CostUtils.getCaseCost(9));
					AL09.add(" ");
					AL09.add("§eClique pour acheter");
				}else{
					IM09.setDisplayName("§cApparence 9");
					AL09.add("§cCoût : "+CostUtils.getCaseCost(9));
				}
			}else{
				IM09.setDisplayName("§4Apparence 9");
				AL09.add("§cApparence 8 requise");
			}
		}
		IM09.setLore(AL09);
		IS09.setItemMeta(IM09);
		i.addItem(IS09);
		
		ItemStack IS10 = new ItemStack(Material.GOLD_HOE);
		ItemMeta IM10 = IS10.getItemMeta();
		ArrayList<String> AL10 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 10){
			AL10.add("§aDébloqué !");
			AL10.add(" ");
			if(qp.getEnable().contains("case10")){
				IM10.setDisplayName("§bApparence 10");
				AL10.add("§2Elément équipé");
			}else{
				IM10.setDisplayName("§aApparence 10");
				AL10.add("§eClique pour équiper");
			}
		}else{
			AL10.add("§cBloqué !");
			AL10.add(" ");
			if(EquipLast.getCase(qp) == 9){
				if(qp.getCoins() >= CostUtils.getCaseCost(10)){
					IM10.setDisplayName("§6Apparence 10");
					AL10.add("§6Coût : "+CostUtils.getCaseCost(10));
					AL10.add(" ");
					AL10.add("§eClique pour acheter");
				}else{
					IM10.setDisplayName("§cApparence 10");
					AL10.add("§cCoût : "+CostUtils.getCaseCost(10));
				}
			}else{
				IM10.setDisplayName("§4Apparence 10");
				AL10.add("§cApparence 9 requise");
			}
		}
		IM10.setLore(AL10);
		IM10.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM10.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS10.setItemMeta(IM10);
		i.setItem(11, IS10);
		
		ItemStack IS11 = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta IM11 = IS11.getItemMeta();
		ArrayList<String> AL11 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 11){
			AL11.add("§aDébloqué !");
			AL11.add(" ");
			if(qp.getEnable().contains("case11")){
				IM11.setDisplayName("§bApparence 11");
				AL11.add("§2Elément équipé");
			}else{
				IM11.setDisplayName("§aApparence 11");
				AL11.add("§eClique pour équiper");
			}
		}else{
			AL11.add("§cBloqué !");
			AL11.add(" ");
			if(EquipLast.getCase(qp) == 10){
				if(qp.getCoins() >= CostUtils.getCaseCost(11)){
					IM11.setDisplayName("§6Apparence 11");
					AL11.add("§6Coût : "+CostUtils.getCaseCost(11));
					AL11.add(" ");
					AL11.add("§eClique pour acheter");
				}else{
					IM11.setDisplayName("§cApparence 11");
					AL11.add("§cCoût : "+CostUtils.getCaseCost(11));
				}
			}else{
				IM11.setDisplayName("§4Apparence 11");
				AL11.add("§cApparence 10 requise");
			}
		}
		IM11.setLore(AL11);
		IS11.setItemMeta(IM11);
		i.setItem(12, IS11);
		
		ItemStack IS12 = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta IM12 = IS12.getItemMeta();
		ArrayList<String> AL12 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 12){
			AL12.add("§aDébloqué !");
			AL12.add(" ");
			if(qp.getEnable().contains("case12")){
				IM12.setDisplayName("§bApparence 12");
				AL12.add("§2Elément équipé");
			}else{
				IM12.setDisplayName("§aApparence 12");
				AL12.add("§eClique pour équiper");
			}
		}else{
			AL12.add("§cBloqué !");
			AL12.add(" ");
			if(EquipLast.getCase(qp) == 11){
				if(qp.getCoins() >= CostUtils.getCaseCost(12)){
					IM12.setDisplayName("§6Apparence 12");
					AL12.add("§6Coût : "+CostUtils.getCaseCost(12));
					AL12.add(" ");
					AL12.add("§eClique pour acheter");
				}else{
					IM12.setDisplayName("§cApparence 12");
					AL12.add("§cCoût : "+CostUtils.getCaseCost(12));
				}
			}else{
				IM12.setDisplayName("§4Apparence 12");
				AL12.add("§cApparence 11 requise");
			}
		}
		IM12.setLore(AL12);
		IM12.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM12.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS12.setItemMeta(IM12);
		i.setItem(13, IS12);
		
		ItemStack IS13 = new ItemStack(Material.BLAZE_ROD);
		ItemMeta IM13 = IS13.getItemMeta();
		ArrayList<String> AL13 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 13){
			AL13.add("§aDébloqué !");
			AL13.add(" ");
			if(qp.getEnable().contains("case13")){
				IM13.setDisplayName("§bApparence 13");
				AL13.add("§2Elément équipé");
			}else{
				IM13.setDisplayName("§aApparence 13");
				AL13.add("§eClique pour équiper");
			}
		}else{
			AL13.add("§cBloqué !");
			AL13.add(" ");
			if(EquipLast.getCase(qp) == 12){
				if(qp.getCoins() >= CostUtils.getCaseCost(13)){
					IM13.setDisplayName("§6Apparence 13");
					AL13.add("§6Coût : "+CostUtils.getCaseCost(13));
					AL13.add(" ");
					AL13.add("§eClique pour acheter");
				}else{
					IM13.setDisplayName("§cApparence 13");
					AL13.add("§cCoût : "+CostUtils.getCaseCost(13));
				}
			}else{
				IM13.setDisplayName("§4Apparence 13");
				AL13.add("§cApparence 12 requise");
			}
		}
		IM13.setLore(AL13);
		IS13.setItemMeta(IM13);
		i.setItem(14, IS13);
		
		ItemStack IS14 = new ItemStack(Material.BLAZE_ROD);
		ItemMeta IM14 = IS14.getItemMeta();
		ArrayList<String> AL14 = new ArrayList<>();
		if(EquipLast.getCase(qp) >= 14){
			AL14.add("§aDébloqué !");
			AL14.add(" ");
			if(qp.getEnable().contains("case14")){
				IM14.setDisplayName("§bApparence 14");
				AL14.add("§2Elément équipé");
			}else{
				IM14.setDisplayName("§aApparence 14");
				AL14.add("§eClique pour équiper");
			}
		}else{
			AL14.add("§cBloqué !");
			AL14.add(" ");
			if(EquipLast.getCase(qp) == 13){
				if(qp.getCoins() >= CostUtils.getCaseCost(14)){
					IM14.setDisplayName("§6Apparence 14");
					AL14.add("§6Coût : "+CostUtils.getCaseCost(14));
					AL14.add(" ");
					AL14.add("§eClique pour acheter");
				}else{
					IM14.setDisplayName("§cApparence 14");
					AL14.add("§cCoût : "+CostUtils.getCaseCost(14));
				}
			}else{
				IM14.setDisplayName("§4Apparence 14");
				AL14.add("§cApparence 13 requise");
			}
		}
		IM14.setLore(AL14);
		IM14.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		IM14.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		IS14.setItemMeta(IM14);
		i.setItem(15, IS14);
		
		ItemStack ISc = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMc = ISc.getItemMeta();
		IMc.setDisplayName("§6Coins : "+qp.getCoins());
		ISc.setItemMeta(IMc);
		i.setItem(22, ISc);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(26, ISba);
		
		p.openInventory(i);
		
	}

}
