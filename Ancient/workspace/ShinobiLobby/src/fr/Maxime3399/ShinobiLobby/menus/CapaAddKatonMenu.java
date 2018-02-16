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

public class CapaAddKatonMenu {
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 9, "§8Katon | Feu");
		
		ItemStack IS1 = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IM1 = IS1.getItemMeta();
		ArrayList<String> AL1 = new ArrayList<>();
		AL1.add("§7ID : katon01");
		if(DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "capa-katon") >= 1){
			if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable").contains("katon01")){
				IM1.setDisplayName("§eBoule de feu suprême");
				AL1.add("§a§oEquipée");
				IM1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				IM1.setDisplayName("§aBoule de feu suprême");
				AL1.add("§9§l>§r §7Clique pour équiper");
			}
		}else{
			IM1.setDisplayName("§cBoule de feu suprême");
			AL1.add("§cTu ne possèdes pas");
			AL1.add("§ccette technique");
		}
		IM1.setLore(AL1);
		IS1.setItemMeta(IM1);
		inv.addItem(IS1);
		
		ItemStack IS2 = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IM2 = IS2.getItemMeta();
		ArrayList<String> AL2 = new ArrayList<>();
		AL2.add("§7ID : katon02");
		if(DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "capa-katon") >= 2){
			if(DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "capa-enable").contains("katon02")){
				IM2.setDisplayName("§eLa balasmine");
				AL2.add("§a§oEquipée");
				IM2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				IM2.setDisplayName("§aLa balasmine");
				AL2.add("§9§l>§r §7Clique pour équiper");
			}
		}else{
			IM2.setDisplayName("§cLa balasmine");
			AL2.add("§cTu ne possèdes pas");
			AL2.add("§ccette technique");
		}
		IM2.setLore(AL2);
		IS2.setItemMeta(IM2);
		inv.addItem(IS2);
		
		p.openInventory(inv);
		
	}

}
