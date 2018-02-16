package fr.Maxime3399.ShinobiLobby.menus;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaRemoveMenu {
	
	public static HashMap<Player, String> remover = new HashMap<>();
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 18, "§8Retirer");
		
		if(!remover.containsKey(p)){
			remover.put(p, "");
		}
		
		String uuid = p.getUniqueId().toString();
		String enable[] = DataUtils.getStringPlayerInfo(uuid, "capa-enable").split(",");
		
		for(String ena : enable){
			
			if(ena.equalsIgnoreCase("weapon01")){
				
				ItemStack IS = new ItemStack(Material.WOOD_SWORD);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eKatana en bois");
				AL.add("§7ID : weapon01");
				IM.setLore(AL);
				if(remover.get(p).contains("weapon01")){
					IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				}
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("weapon02")){
				
				ItemStack IS = new ItemStack(Material.STONE_SWORD);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eKatana en pierre");
				AL.add("§7ID : weapon02");
				IM.setLore(AL);
				if(remover.get(p).contains("weapon02")){
					IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				}
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("katon01")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eBoule de feu suprême");
				AL.add("§7ID : katon01");
				AL.add(" ");
				AL.add("§r  §e[ Katon | Feu ]");
				AL.add(" ");
				AL.add("§bChakra : 4");
				IM.setLore(AL);
				if(remover.get(p).contains("katon01")){
					IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				}
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("katon02")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eLa balasmine");
				AL.add("§7ID : katon02");
				AL.add(" ");
				AL.add("§r  §e[ Katon | Feu ]");
				AL.add(" ");
				AL.add("§bChakra : 5");
				IM.setLore(AL);
				if(remover.get(p).contains("katon02")){
					IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
					IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				}
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}
			
		}
		
		ItemStack ISadd = new ItemStack(Material.SLIME_BLOCK);
		ItemMeta IMadd = ISadd.getItemMeta();
		ArrayList<String> ALadd = new ArrayList<>();
		IMadd.setDisplayName("§a§lValider");
		ALadd.add("§9§l>§r §7Clique pour valider");
		IMadd.setLore(ALadd);
		ISadd.setItemMeta(IMadd);
		inv.setItem(15, ISadd);
		
		ItemStack ISrem = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta IMrem = ISrem.getItemMeta();
		ArrayList<String> ALrem = new ArrayList<>();
		IMrem.setDisplayName("§6§lAnnuler");
		ALrem.add("§9§l>§r §7Clique pour annuler");
		IMrem.setLore(ALrem);
		ISrem.setItemMeta(IMrem);
		inv.setItem(11, ISrem);
		
		p.openInventory(inv);
		
	}

}
