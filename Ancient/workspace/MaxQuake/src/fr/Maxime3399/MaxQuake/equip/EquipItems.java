package fr.Maxime3399.MaxQuake.equip;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipItems {
	
	public static ItemStack getTriggerType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("trigger01")){
			result = new ItemStack(Material.STONE_BUTTON, 20);
		}else if(enable.contains("trigger02")){
			result = new ItemStack(Material.STONE_BUTTON, 18);
		}else if(enable.contains("trigger03")){
			result = new ItemStack(Material.STONE_BUTTON, 16);
		}else if(enable.contains("trigger04")){
			result = new ItemStack(Material.STONE_BUTTON, 14);
		}else if(enable.contains("trigger05")){
			result = new ItemStack(Material.STONE_BUTTON, 12);
		}else if(enable.contains("trigger06")){
			result = new ItemStack(Material.STONE_BUTTON, 10);
		}else if(enable.contains("trigger07")){
			result = new ItemStack(Material.STONE_BUTTON, 8);
		}else if(enable.contains("trigger08")){
			result = new ItemStack(Material.STONE_BUTTON, 6);
		}else if(enable.contains("trigger09")){
			result = new ItemStack(Material.STONE_BUTTON, 4);
		}
		
		return result;
		
	}
	
	public static ItemStack getTriggerType(String trigger){
		
		ItemStack result = null;
		String enable = trigger;
		
		if(enable.contains("trigger01")){
			result = new ItemStack(Material.STONE_BUTTON, 20);
		}else if(enable.contains("trigger02")){
			result = new ItemStack(Material.STONE_BUTTON, 18);
		}else if(enable.contains("trigger03")){
			result = new ItemStack(Material.STONE_BUTTON, 16);
		}else if(enable.contains("trigger04")){
			result = new ItemStack(Material.STONE_BUTTON, 14);
		}else if(enable.contains("trigger05")){
			result = new ItemStack(Material.STONE_BUTTON, 12);
		}else if(enable.contains("trigger06")){
			result = new ItemStack(Material.STONE_BUTTON, 10);
		}else if(enable.contains("trigger07")){
			result = new ItemStack(Material.STONE_BUTTON, 8);
		}else if(enable.contains("trigger08")){
			result = new ItemStack(Material.STONE_BUTTON, 6);
		}else if(enable.contains("trigger09")){
			result = new ItemStack(Material.STONE_BUTTON, 4);
		}
		
		return result;
		
	}
	
	public static ItemStack getRailgunType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("case01")){
			result = new ItemStack(Material.STICK);
		}else if(enable.contains("case02")){
			result = new ItemStack(Material.STICK);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case03")){
			result = new ItemStack(Material.WOOD_HOE);
		}else if(enable.contains("case04")){
			result = new ItemStack(Material.WOOD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case05")){
			result = new ItemStack(Material.STONE_HOE);
		}else if(enable.contains("case06")){
			result = new ItemStack(Material.STONE_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case07")){
			result = new ItemStack(Material.IRON_HOE);
		}else if(enable.contains("case08")){
			result = new ItemStack(Material.IRON_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case09")){
			result = new ItemStack(Material.GOLD_HOE);
		}else if(enable.contains("case10")){
			result = new ItemStack(Material.GOLD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case11")){
			result = new ItemStack(Material.DIAMOND_HOE);
		}else if(enable.contains("case12")){
			result = new ItemStack(Material.DIAMOND_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case13")){
			result = new ItemStack(Material.BLAZE_ROD);
		}else if(enable.contains("case14")){
			result = new ItemStack(Material.BLAZE_ROD);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}
		
		return result;
		
	}
	
	public static ItemStack getRailgunType(String railgun){
		
		ItemStack result = null;
		String enable = railgun;
		
		if(enable.contains("case01")){
			result = new ItemStack(Material.STICK);
		}else if(enable.contains("case02")){
			result = new ItemStack(Material.STICK);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case03")){
			result = new ItemStack(Material.WOOD_HOE);
		}else if(enable.contains("case04")){
			result = new ItemStack(Material.WOOD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case05")){
			result = new ItemStack(Material.STONE_HOE);
		}else if(enable.contains("case06")){
			result = new ItemStack(Material.STONE_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case07")){
			result = new ItemStack(Material.IRON_HOE);
		}else if(enable.contains("case08")){
			result = new ItemStack(Material.IRON_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case09")){
			result = new ItemStack(Material.GOLD_HOE);
		}else if(enable.contains("case10")){
			result = new ItemStack(Material.GOLD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case11")){
			result = new ItemStack(Material.DIAMOND_HOE);
		}else if(enable.contains("case12")){
			result = new ItemStack(Material.DIAMOND_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case13")){
			result = new ItemStack(Material.BLAZE_ROD);
		}else if(enable.contains("case14")){
			result = new ItemStack(Material.BLAZE_ROD);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}
		
		return result;
		
	}

}
