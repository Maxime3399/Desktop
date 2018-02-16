package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class StatsMenu {
	
	public static void openMenu(Player p){
		
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		Inventory i = Bukkit.createInventory(null, 27, "§8Statistiques");
		
		ItemStack ISkills = new ItemStack(Material.ARROW);
		ItemMeta IMkills = ISkills.getItemMeta();
		ArrayList<String> ALkills = new ArrayList<>();
		IMkills.setDisplayName("§eTués :");
		ALkills.add("  §e"+qp.getKills());
		IMkills.setLore(ALkills);
		ISkills.setItemMeta(IMkills);
		i.setItem(10, ISkills);
		
		ItemStack ISdea = new ItemStack(Material.SKULL_ITEM);
		ItemMeta IMdea = ISdea.getItemMeta();
		ArrayList<String> ALdea = new ArrayList<>();
		IMdea.setDisplayName("§eMorts :");
		ALdea.add("  §e"+qp.getDeath());
		IMdea.setLore(ALdea);
		ISdea.setItemMeta(IMdea);
		i.setItem(11, ISdea);
		
		ItemStack ISbsp = new ItemStack(Material.POTION);
		ItemMeta IMbsp = ISbsp.getItemMeta();
		ArrayList<String> ALbsp = new ArrayList<>();
		IMbsp.setDisplayName("§eBonus de vitesse :");
		ALbsp.add("  §e"+qp.getBooster_speed());
		IMbsp.setLore(ALbsp);
		ISbsp.setItemMeta(IMbsp);
		i.setItem(12, ISbsp);
		
		ItemStack ISbsh = new ItemStack(Material.FIREWORK);
		ItemMeta IMbsh = ISbsh.getItemMeta();
		ArrayList<String> ALbsh = new ArrayList<>();
		IMbsh.setDisplayName("§eBonus de tirs :");
		ALbsh.add("  §e"+qp.getBooster_shoot());
		IMbsh.setLore(ALbsh);
		ISbsh.setItemMeta(IMbsh);
		i.setItem(13, ISbsh);
		
		ItemStack ISwi = new ItemStack(Material.NETHER_STAR);
		ItemMeta IMwi = ISwi.getItemMeta();
		ArrayList<String> ALwi = new ArrayList<>();
		IMwi.setDisplayName("§eVictoires :");
		ALwi.add("  §e"+qp.getWins());
		IMwi.setLore(ALwi);
		ISwi.setItemMeta(IMwi);
		i.setItem(14, ISwi);
		
		ItemStack ISpl = new ItemStack(Material.WATCH);
		ItemMeta IMpl = ISpl.getItemMeta();
		ArrayList<String> ALpl = new ArrayList<>();
		IMpl.setDisplayName("§eParties jouée :");
		ALpl.add("  §e"+qp.getPlays());
		IMpl.setLore(ALpl);
		ISpl.setItemMeta(IMpl);
		i.setItem(15, ISpl);
		
		ItemStack ISco = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMco = ISco.getItemMeta();
		ArrayList<String> ALco = new ArrayList<>();
		IMco.setDisplayName("§eCoins gagnés :");
		ALco.add("  §e"+qp.getTotal_coins());
		IMco.setLore(ALco);
		ISco.setItemMeta(IMco);
		i.setItem(16, ISco);
		
		p.openInventory(i);
		
	}

}
