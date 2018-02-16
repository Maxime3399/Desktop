package fr.Maxime3399.UltimateBoosters.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "§6§lBoosters");
		
		ItemStack ISac = new ItemStack(Material.WATCH);
		ItemMeta IMac = ISac.getItemMeta();
		ArrayList<String> ALac = new ArrayList<>();
		ALac.add("§9§l> §r§7Click to view active boosters");
		IMac.setLore(ALac);
		IMac.setDisplayName("§6Active Boosters");
		ISac.setItemMeta(IMac);
		i.setItem(11, ISac);
		
		ItemStack ISinv = new ItemStack(Material.CHEST);
		ItemMeta IMinv = ISinv.getItemMeta();
		ArrayList<String> ALinv = new ArrayList<>();
		ALinv.add("§9§l> §r§7Click to view your boosters");
		IMinv.setLore(ALinv);
		IMinv.setDisplayName("§aYour boosters");
		ISinv.setItemMeta(IMinv);
		i.setItem(13, ISinv);
		
		ItemStack ISset = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta IMset = ISset.getItemMeta();
		ArrayList<String> ALset = new ArrayList<>();
		ALset.add("§9§l> §r§7Click to open your settings");
		IMset.setLore(ALset);
		IMset.setDisplayName("§cSettings");
		ISset.setItemMeta(IMset);
		i.setItem(15, ISset);
		
		ItemStack IScl = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta IMcl = IScl.getItemMeta();
		ArrayList<String> ALcl = new ArrayList<>();
		ALcl.add("§9§l> §r§7Click to close the menu");
		IMcl.setLore(ALcl);
		IMcl.setDisplayName("§4Close");
		IScl.setItemMeta(IMcl);
		i.setItem(26, IScl);
		
		p.openInventory(i);
		
	}

}
