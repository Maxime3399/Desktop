package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipCounts;
import fr.Maxime3399.MaxQuake.equip.EquipItems;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class ShopMainMenu {
	
	public static void openMenu(Player p){
		
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		Inventory i = Bukkit.createInventory(null, 27, "§8Boutique");
		
		ItemStack IScase = EquipItems.getRailgunType(qp);
		ItemMeta IMcase = IScase.getItemMeta();
		ArrayList<String> ALcase = new ArrayList<>();
		IMcase.setDisplayName("§eApparence");
		ALcase.add("§9§l>§r §7Clique pour accèder");
		ALcase.add("§7au menu");
		ALcase.add(" ");
		ALcase.add("§7Débloqué : "+EquipCounts.getCases(qp)+"/14 ( "+EquipCounts.getCasePercentage(qp)+"% )");
		IMcase.setLore(ALcase);
		IScase.setItemMeta(IMcase);
		i.setItem(11, IScase);
		
		ItemStack IStrigger = EquipItems.getTriggerType(qp);
		ItemMeta IMtrigger = IStrigger.getItemMeta();
		ArrayList<String> ALtrigger = new ArrayList<>();
		IMtrigger.setDisplayName("§eRechargement");
		ALtrigger.add("§9§l>§r §7Clique pour accèder");
		ALtrigger.add("§7au menu");
		ALtrigger.add(" ");
		ALtrigger.add("§7Débloqué : "+EquipCounts.getTriggers(qp)+"/9 ( "+EquipCounts.getTriggerPercentage(qp)+"% )");
		IMtrigger.setLore(ALtrigger);
		IStrigger.setItemMeta(IMtrigger);
		i.setItem(15, IStrigger);
		
		p.openInventory(i);
		
	}

}
