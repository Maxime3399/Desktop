package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class PrefixMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Préfixe");
		CustomPlayer cp = new CustomPlayer(p);
		
		ItemStack ISazz = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAazz = (LeatherArmorMeta) ISazz.getItemMeta();
		ArrayList<String> ALazz = new ArrayList<>();
		Color Cazz = Color.AQUA;
		LAazz.setColor(Cazz);
		LAazz.setDisplayName("§bAqua");
		if(cp.getPrefix().equalsIgnoreCase("b")){
			LAazz.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAazz.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALazz.add(" §a§oCouleur active");
		}else{
			ALazz.add("§9§l>§r §7Clique pour activer");
			ALazz.add("§7cette couleur");
		}
		LAazz.setLore(ALazz);
		ISazz.setItemMeta(LAazz);
		i.setItem(0, ISazz);
		
		ItemStack ISbl = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAbl = (LeatherArmorMeta) ISbl.getItemMeta();
		ArrayList<String> ALbl = new ArrayList<>();
		Color Cbl = Color.WHITE;
		LAbl.setColor(Cbl);
		LAbl.setDisplayName("§fBlanc");
		if(cp.getPrefix().equalsIgnoreCase("f")){
			LAbl.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAbl.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALbl.add(" §a§oCouleur active");
		}else{
			ALbl.add("§9§l>§r §7Clique pour activer");
			ALbl.add("§7cette couleur");
		}
		LAbl.setLore(ALbl);
		ISbl.setItemMeta(LAbl);
		i.setItem(1, ISbl);
		
		ItemStack ISble = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAble = (LeatherArmorMeta) ISble.getItemMeta();
		ArrayList<String> ALble = new ArrayList<>();
		Color Cble = Color.BLUE;
		LAble.setColor(Cble);
		LAble.setDisplayName("§9Bleu");
		if(cp.getPrefix().equalsIgnoreCase("9")){
			LAble.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAble.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALble.add(" §a§oCouleur active");
		}else{
			ALble.add("§9§l>§r §7Clique pour activer");
			ALble.add("§7cette couleur");
		}
		LAble.setLore(ALble);
		ISble.setItemMeta(LAble);
		i.setItem(2, ISble);
		
		ItemStack ISvioc = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAvioc = (LeatherArmorMeta) ISvioc.getItemMeta();
		ArrayList<String> ALvioc = new ArrayList<>();
		Color Cvioc = Color.FUCHSIA;
		LAvioc.setColor(Cvioc);
		LAvioc.setDisplayName("§dViolet clair");
		if(cp.getPrefix().equalsIgnoreCase("d")){
			LAvioc.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAvioc.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALvioc.add(" §a§oCouleur active");
		}else{
			ALvioc.add("§9§l>§r §7Clique pour activer");
			ALvioc.add("§7cette couleur");
		}
		LAvioc.setLore(ALvioc);
		ISvioc.setItemMeta(LAvioc);
		i.setItem(3, ISvioc);
		
		ItemStack ISgra = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAgra = (LeatherArmorMeta) ISgra.getItemMeta();
		ArrayList<String> ALgra = new ArrayList<>();
		Color Cgra = Color.YELLOW;
		LAgra.setColor(Cgra);
		LAgra.setDisplayName("§eJaune");
		if(cp.getPrefix().equalsIgnoreCase("e")){
			LAgra.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAgra.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALgra.add(" §a§oCouleur active");
		}else{
			ALgra.add("§9§l>§r §7Clique pour activer");
			ALgra.add("§7cette couleur");
		}
		LAgra.setLore(ALgra);
		ISgra.setItemMeta(LAgra);
		i.setItem(4, ISgra);
		
		ItemStack ISgree = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAgree= (LeatherArmorMeta) ISgree.getItemMeta();
		ArrayList<String> ALgree = new ArrayList<>();
		Color Cgree = Color.GREEN;
		LAgree.setColor(Cgree);
		LAgree.setDisplayName("§2Vert");
		if(cp.getPrefix().equalsIgnoreCase("2")){
			LAgree.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAgree.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALgree.add(" §a§oCouleur active");
		}else{
			ALgree.add("§9§l>§r §7Clique pour activer");
			ALgree.add("§7cette couleur");
		}
		LAgree.setLore(ALgree);
		ISgree.setItemMeta(LAgree);
		i.setItem(5, ISgree);
		
		ItemStack ISdgree = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAdgree= (LeatherArmorMeta) ISdgree.getItemMeta();
		ArrayList<String> ALdgree = new ArrayList<>();
		Color Cdgree = Color.LIME;
		LAdgree.setColor(Cdgree);
		LAdgree.setDisplayName("§aVert clair");
		if(cp.getPrefix().equalsIgnoreCase("a")){
			LAdgree.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAdgree.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALdgree.add(" §a§oCouleur active");
		}else{
			ALdgree.add("§9§l>§r §7Clique pour activer");
			ALdgree.add("§7cette couleur");
		}
		LAdgree.setLore(ALdgree);
		ISdgree.setItemMeta(LAdgree);
		i.setItem(6, ISdgree);
		
		ItemStack ISmar = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LAmar = (LeatherArmorMeta) ISmar.getItemMeta();
		ArrayList<String> ALmar = new ArrayList<>();
		Color Cmar = Color.ORANGE;
		LAmar.setColor(Cmar);
		LAmar.setDisplayName("§6Orange");
		if(cp.getPrefix().equalsIgnoreCase("6")){
			LAmar.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LAmar.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALmar.add(" §a§oCouleur active");
		}else{
			ALmar.add("§9§l>§r §7Clique pour activer");
			ALmar.add("§7cette couleur");
		}
		LAmar.setLore(ALmar);
		ISmar.setItemMeta(LAmar);
		i.setItem(7, ISmar);
		
		ItemStack ISpur = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta LApur = (LeatherArmorMeta) ISpur.getItemMeta();
		ArrayList<String> ALpur = new ArrayList<>();
		Color Cpur = Color.PURPLE;
		LApur.setColor(Cpur);
		LApur.setDisplayName("§5Violet");
		if(cp.getPrefix().equalsIgnoreCase("5")){
			LApur.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			LApur.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ALpur.add(" §a§oCouleur active");
		}else{
			ALpur.add("§9§l>§r §7Clique pour activer");
			ALpur.add("§7cette couleur");
		}
		LApur.setLore(ALpur);
		ISpur.setItemMeta(LApur);
		i.setItem(8, ISpur);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(13, ISba);
		
		p.openInventory(i);
		
	}

}
