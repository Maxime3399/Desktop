package fr.Maxime3399.ShinobiLobby.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaAddWeaponsMenu {
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 9, "§8Armes");
		
		ItemStack IS1 = new ItemStack(Material.WOOD_SWORD);
		ItemMeta IM1 = IS1.getItemMeta();
		ArrayList<String> AL1 = new ArrayList<>();
		AL1.add("§7ID : weapon01");
		if(DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "capa-weapons") >= 1){
			if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable").contains("weapon01")){
				IM1.setDisplayName("§eKatana en bois");
				AL1.add("§a§oEquipée");
				IM1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				IM1.setDisplayName("§aKatana en bois");
				AL1.add("§9§l>§r §7Clique pour équiper");
			}
		}else{
			IM1.setDisplayName("§cKatana en bois");
			AL1.add("§cTu ne possèdes pas");
			AL1.add("§ccette arme");
		}
		IM1.setLore(AL1);
		IS1.setItemMeta(IM1);
		inv.addItem(IS1);
		
		ItemStack IS2 = new ItemStack(Material.STONE_SWORD);
		ItemMeta IM2 = IS2.getItemMeta();
		ArrayList<String> AL2 = new ArrayList<>();
		AL2.add("§7ID : weapon02");
		if(DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "capa-weapons") >= 2){
			if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable").contains("weapon02")){
				IM2.setDisplayName("§eKatana en pierre");
				AL2.add("§a§oEquipée");
				IM2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				IM2.setDisplayName("§aKatana en pierre");
				AL2.add("§9§l>§r §7Clique pour équiper");
			}
		}else{
			IM2.setDisplayName("§cKatana en pierre");
			AL2.add("§cTu ne possèdes pas");
			AL2.add("§ccette arme");
		}
		IM2.setLore(AL2);
		IS2.setItemMeta(IM2);
		inv.addItem(IS2);
		
		p.openInventory(inv);
		
	}

}
