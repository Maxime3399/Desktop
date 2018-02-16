package fr.Maxime3399.ShinobiLobby.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaAddMainMenu {
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 9, "§8Ajouter");
		
		String type = DataUtils.getStringPlayerInfo(p.getUniqueId().toString(), "chakratype");
		ArrayList<ItemStack> deblocked = new ArrayList<>();
		ArrayList<ItemStack> blocked = new ArrayList<>();
		
		ItemStack ISwea = new ItemStack(Material.IRON_SWORD);
		ItemMeta IMwea = ISwea.getItemMeta();
		ArrayList<String> ALwea = new ArrayList<>();
		IMwea.setDisplayName("§aArmes");
		ALwea.add("§9§l>§r §7Clique pour ouvrir");
		ALwea.add("§7cette catégorie");
		IMwea.setLore(ALwea);
		ISwea.setItemMeta(IMwea);
		deblocked.add(ISwea);
		
		if(type.contains("katon")){
			
			ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§aKaton | Feu");
			AL.add("§9§l>§r §7Clique pour ouvrir");
			AL.add("§7cette catégorie");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			deblocked.add(IS);
			
		}else{
			
			ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
			ItemMeta IM = IS.getItemMeta();
			ArrayList<String> AL = new ArrayList<>();
			IM.setDisplayName("§cKaton | Feu");
			AL.add("§7Tu ne possèdes pas encore");
			AL.add("§7ce pouvoir");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			blocked.add(IS);
			
		}
		
		for(ItemStack item : deblocked){
			
			inv.addItem(item);
			
		}
		
		for(ItemStack item : blocked){
			
			inv.addItem(item);
			
		}
		
		p.openInventory(inv);
		
	}

}
