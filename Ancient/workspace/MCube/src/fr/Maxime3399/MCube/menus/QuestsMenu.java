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

public class QuestsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 36, "§8Quêtes");
		CustomPlayer cp = new CustomPlayer(p);
		int quest = cp.getQuest();
		
		if(quest == 1){
			ItemStack IS = new ItemStack(Material.BOOK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aQuête 1");
			AL.add(" ");
			AL.add("§rObjectifs :");
			AL.add("§r - §eMiner §3§l>§r §bBois §r§6"+cp.getQuestCounter1()+"§d§l/§r§d5");
			AL.add(" ");
			if(cp.getQuestCounter1() >= 5){
				AL.add("§9§oClique pour obtenir ta récompense et");
				AL.add("§9§opour passer à la quête suivante !");
				IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				AL.add("§e§oTu peux passer cette quête");
				AL.add("§e§oavec un pass !");
			}
			IM.setLore(AL);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
		}else if(quest == 2){
			ItemStack IS = new ItemStack(Material.BOOK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aQuête 2");
			AL.add(" ");
			AL.add("§rObjectifs :");
			AL.add("§r - §eMiner §3§l>§r §bPierre §r§6"+cp.getQuestCounter1()+"§d§l/§r§d10");
			AL.add(" ");
			if(cp.getQuestCounter1() >= 10){
				AL.add("§9§oClique pour obtenir ta récompense et");
				AL.add("§9§opour passer à la quête suivante !");
				IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				AL.add("§e§oTu peux passer cette quête");
				AL.add("§e§oavec un pass !");
			}
			IM.setLore(AL);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
		}else if(quest == 3){
			ItemStack IS = new ItemStack(Material.BOOK);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aQuête 3");
			AL.add(" ");
			AL.add("§rObjectifs :");
			AL.add("§r - §eMiner §3§l>§r §bCharbon §r§6"+cp.getQuestCounter1()+"§d§l/§r§d8");
			AL.add(" ");
			if(cp.getQuestCounter1() >= 8){
				AL.add("§9§oClique pour obtenir ta récompense et");
				AL.add("§9§opour passer à la quête suivante !");
				IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
				IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}else{
				AL.add("§e§oTu peux passer cette quête");
				AL.add("§e§oavec un pass !");
			}
			IM.setLore(AL);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
		}else{
			ItemStack IS = new ItemStack(Material.BARRIER);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§cTu as terminé toutes les");
			AL.add("§cquêtes disponibles !");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			i.setItem(13, IS);
		}
		
		ItemStack ISsep1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		ItemMeta IMsep1 = ISsep1.getItemMeta();
		IMsep1.setDisplayName(" ");
		ISsep1.setItemMeta(IMsep1);
		i.setItem(12, ISsep1);
		i.setItem(14, ISsep1);
		
		ItemStack ISsep2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 11);
		ItemMeta IMsep2 = ISsep2.getItemMeta();
		IMsep2.setDisplayName(" ");
		ISsep2.setItemMeta(IMsep2);
		i.setItem(27, ISsep2);
		i.setItem(29, ISsep2);
		i.setItem(30, ISsep2);
		i.setItem(31, ISsep2);
		i.setItem(32, ISsep2);
		i.setItem(33, ISsep2);
		i.setItem(34, ISsep2);
		
		ItemStack ISpass = new ItemStack(Material.TNT);
		if(cp.getPass() > 64){
			ISpass.setAmount(64);
		}else if(cp.getPass() < 1){
			ISpass.setAmount(1);
		}else{
			ISpass.setAmount(cp.getPass());
		}
		ItemMeta IMpass = ISpass.getItemMeta();
		ArrayList<String> ALpass = new ArrayList<>();
		ALpass.add("§c"+cp.getPass());
		ALpass.add(" ");
		if(cp.getPass() > 0){
			IMpass.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMpass.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALpass.add("§9Clique pour passer la");
			ALpass.add("§9quête !");
		}else{
			ALpass.add("§dVisite la boutique pour obtenir");
			ALpass.add("§dplus de pass !");
		}
		IMpass.setDisplayName("§cPass :");
		IMpass.setLore(ALpass);
		ISpass.setItemMeta(IMpass);
		i.setItem(28, ISpass);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(35, ISba);
		
		p.openInventory(i);
		
	}

}
