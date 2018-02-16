package fr.Maxime3399.ShinobiLobby.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.ShinobiLobby.utils.DataUtils;

public class CapaMainMenu {
	
	public static void openMenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 18, "§8Equipement");
		
		String uuid = p.getUniqueId().toString();
		String enable[] = DataUtils.getStringPlayerInfo(uuid, "capa-enable").split(",");
		int enableCount = 0;
		
		for(String ena : enable){
			
			enableCount++;
			
			if(ena.equalsIgnoreCase("weapon01")){
				
				ItemStack IS = new ItemStack(Material.WOOD_SWORD);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§eKatana en bois");
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("weapon02")){
				
				ItemStack IS = new ItemStack(Material.STONE_SWORD);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§eKatana en pierre");
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("katon01")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eBoule de feu suprême");
				AL.add("§r  §e[ Katon | Feu ]");
				AL.add(" ");
				AL.add("§bChakra : 4");
				IM.setLore(AL);
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}else if(ena.equalsIgnoreCase("katon02")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§eLa balasmine");
				AL.add("§r  §e[ Katon | Feu ]");
				AL.add(" ");
				AL.add("§bChakra : 5");
				IM.setLore(AL);
				IS.setItemMeta(IM);
				inv.addItem(IS);
				
			}
			
		}
		
		ItemStack ISadd = new ItemStack(Material.SLIME_BALL);
		ItemMeta IMadd = ISadd.getItemMeta();
		ArrayList<String> ALadd = new ArrayList<>();
		if(enableCount >= 9){
			IMadd.setDisplayName("§cAjouter");
			ALadd.add(" ");
			ALadd.add("§cTu as déjà 9 capacitées actives !");
		}else{
			IMadd.setDisplayName("§aAjouter");
			ALadd.add("§9§l>§r §7Clique pour ajouter une");
			ALadd.add("§7autre capacitée");
		}
		IMadd.setLore(ALadd);
		ISadd.setItemMeta(IMadd);
		inv.setItem(15, ISadd);
		
		ItemStack ISrem = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta IMrem = ISrem.getItemMeta();
		ArrayList<String> ALrem = new ArrayList<>();
		if(enableCount <= 1){
			IMrem.setDisplayName("§cRetirer");
			ALrem.add(" ");
			ALrem.add("§cIl te faut au moins une capacitée !");
		}else{
			IMrem.setDisplayName("§6Retirer");
			ALrem.add("§9§l>§r §7Clique pour retirer");
			ALrem.add("§7des capacitées");
		}
		IMrem.setLore(ALrem);
		ISrem.setItemMeta(IMrem);
		inv.setItem(11, ISrem);
		
		p.openInventory(inv);
		
	}

}
