package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.cosmetics.CosCounters;

public class CosMainMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "§8Cosmétiques");
		
		ItemStack ISpar = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta IMpar = ISpar.getItemMeta();
		ArrayList<String> ALpar = new ArrayList<>();
		IMpar.setDisplayName("§6Particules");
		ALpar.add("§9§l>§r §7Clique pour ouvrir le menu");
		ALpar.add("§7des particules");
		ALpar.add(" ");
		ALpar.add("  §e"+CosCounters.getParticlesCount(p)+"§d§l/§r§641");
		IMpar.setLore(ALpar);
		ISpar.setItemMeta(IMpar);
		i.setItem(13, ISpar);
		
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
