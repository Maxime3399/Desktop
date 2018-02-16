package fr.Maxime3399.ShinobiTutorial.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TypeMenu {
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 9, "§8Type");
		
		ItemStack ISka = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMka = ISka.getItemMeta();
		ArrayList<String> ALka = new ArrayList<>();
		IMka.setDisplayName("§cKaton | Feu");
		ALka.add("§9§l>§r §7Clique pour sélectionner");
		ALka.add("§7ce type");
		IMka.setLore(ALka);
		ISka.setItemMeta(IMka);
		inv.setItem(2, ISka);
		
		ItemStack ISsu = new ItemStack(Material.WATER_BUCKET);
		ItemMeta IMsu = ISsu.getItemMeta();
		ArrayList<String> ALsu = new ArrayList<>();
		IMsu.setDisplayName("§bSuiton | Eau");
		ALsu.add("§9§l>§r §7Clique pour sélectionner");
		ALsu.add("§7ce type");
		IMsu.setLore(ALsu);
		ISsu.setItemMeta(IMsu);
		inv.setItem(3, ISsu);
		
		ItemStack ISdo = new ItemStack(Material.DIRT);
		ItemMeta IMdo = ISdo.getItemMeta();
		ArrayList<String> ALdo = new ArrayList<>();
		IMdo.setDisplayName("§6Doton | Terre");
		ALdo.add("§9§l>§r §7Clique pour sélectionner");
		ALdo.add("§7ce type");
		IMdo.setLore(ALdo);
		ISdo.setItemMeta(IMdo);
		inv.setItem(4, ISdo);
		
		ItemStack ISra = new ItemStack(Material.BLAZE_ROD);
		ItemMeta IMra = ISra.getItemMeta();
		ArrayList<String> ALra = new ArrayList<>();
		IMra.setDisplayName("§3Raiton | Foudre");
		ALra.add("§9§l>§r §7Clique pour sélectionner");
		ALra.add("§7ce type");
		IMra.setLore(ALra);
		ISra.setItemMeta(IMra);
		inv.setItem(5, ISra);
		
		ItemStack ISfu = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta IMfu = ISfu.getItemMeta();
		ArrayList<String> ALfu = new ArrayList<>();
		IMfu.setDisplayName("§fFuton | Vent");
		ALfu.add("§9§l>§r §7Clique pour sélectionner");
		ALfu.add("§7ce type");
		IMfu.setLore(ALfu);
		ISfu.setItemMeta(IMfu);
		inv.setItem(6, ISfu);
		
		p.openInventory(inv);
		
	}

}
