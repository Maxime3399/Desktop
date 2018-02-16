package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.cosmetics.CosCounters;

public class CosParticlesMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "§8Particules");
		
		ItemStack ISw = new ItemStack(Material.ELYTRA);
		ItemMeta IMw = ISw.getItemMeta();
		ArrayList<String> ALw = new ArrayList<>();
		IMw.setDisplayName("§eAiles");
		ALw.add("§9§l>§r §7Clique pour ouvrir le");
		ALw.add("§7menu des ailes");
		ALw.add(" ");
		ALw.add("  §e"+CosCounters.getParticlesWingsCount(p)+"§d§l/§r§614");
		IMw.setLore(ALw);
		ISw.setItemMeta(IMw);
		i.setItem(11, ISw);
		
		ItemStack ISha = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta IMha = ISha.getItemMeta();
		ArrayList<String> ALha = new ArrayList<>();
		IMha.setDisplayName("§eChapeaux");
		ALha.add("§9§l>§r §7Clique pour ouvrir le");
		ALha.add("§7menu des chapeaux");
		ALha.add(" ");
		ALha.add(" §e"+CosCounters.getParticlesHatsCount(p)+"§d§l/§r§627");
		IMha.setLore(ALha);
		ISha.setItemMeta(IMha);
		i.setItem(13, ISha);
		
		ItemStack ISaur = new ItemStack(Material.REDSTONE);
		ItemMeta IMaur = ISaur.getItemMeta();
		ArrayList<String> ALaur = new ArrayList<>();
		IMaur.setDisplayName("§eAuras");
		/*ALaur.add("§9§l>§r §7Clique pour ouvrir le");
		ALaur.add("§7menu des auras");
		ALaur.add(" ");
		ALaur.add(" §e"+CosCounters.getParticlesAurasCount(p)+"§d§l/§r§65");*/
		ALaur.add("§3§oEn développement...");
		IMaur.setLore(ALaur);
		ISaur.setItemMeta(IMaur);
		i.setItem(15, ISaur);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu de cosmétiques");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(26, ISba);
		
		p.openInventory(i);
		
	}

}
