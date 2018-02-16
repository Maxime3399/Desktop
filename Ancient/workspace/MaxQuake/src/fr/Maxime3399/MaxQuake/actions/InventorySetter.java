package fr.Maxime3399.MaxQuake.actions;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipItems;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class InventorySetter {
	
	public static void setWaitInventory(Player p){
		
		p.getInventory().clear();
		
		ItemStack ISsh = new ItemStack(Material.EMERALD);
		ItemMeta IMsh = ISsh.getItemMeta();
		IMsh.setDisplayName("§aBoutique ( clique droit )");
		ISsh.setItemMeta(IMsh);
		p.getInventory().setItem(4, ISsh);
		
		ItemStack ISsta = new ItemStack(Material.PAPER);
		ItemMeta IMsta = ISsta.getItemMeta();
		IMsta.setDisplayName("§bStatistiques ( clique droit )");
		ISsta.setItemMeta(IMsta);
		p.getInventory().setItem(7, ISsta);
		
		ItemStack ISpa = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta IMpa = ISpa.getItemMeta();
		IMpa.setDisplayName("§cParamètres ( clique droit )");
		ISpa.setItemMeta(IMpa);
		p.getInventory().setItem(8, ISpa);
		
	}
	
	public static void setSpectatorInventory(Player p){
		
		p.getInventory().clear();
		
		ItemStack IScom = new ItemStack(Material.COMPASS);
		ItemMeta IMcom = IScom.getItemMeta();
		ArrayList<String> ALcom = new ArrayList<>();
		IMcom.setDisplayName("§eJoueurs");
		ALcom.add("§9§l>§r §7Clique pour ouvrir le");
		ALcom.add("§7menu des joueurs");
		IMcom.setLore(ALcom);
		IScom.setItemMeta(IMcom);
		p.getInventory().setItem(0, IScom);
		
		ItemStack ISsh = new ItemStack(Material.EMERALD);
		ItemMeta IMsh = ISsh.getItemMeta();
		ArrayList<String> ALsh = new ArrayList<>();
		IMsh.setDisplayName("§aBoutique");
		ALsh.add("§9§l>§r §7Clique pour ouvrir la");
		ALsh.add("§7boutique");
		IMsh.setLore(ALsh);
		ISsh.setItemMeta(IMsh);
		p.getInventory().setItem(4, ISsh);
		
		ItemStack ISsta = new ItemStack(Material.PAPER);
		ItemMeta IMsta = ISsta.getItemMeta();
		ArrayList<String> ALsta = new ArrayList<>();
		IMsta.setDisplayName("§bStatistiques");
		ALsta.add("§9§l>§r §7Clique pour voir tes");
		ALsta.add("§7statistiques");
		IMsta.setLore(ALsta);
		ISsta.setItemMeta(IMsta);
		p.getInventory().setItem(7, ISsta);
		
		ItemStack ISpa = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta IMpa = ISpa.getItemMeta();
		ArrayList<String> ALpa = new ArrayList<>();
		IMpa.setDisplayName("§cParamètres");
		ALpa.add("§9§l>§r §7Clique pour ouvrir les");
		ALpa.add("§7paramètres");
		IMpa.setLore(ALpa);
		ISpa.setItemMeta(IMpa);
		p.getInventory().setItem(8, ISpa);
		
	}
	
	public static void setGameInventory(Player p){
		
		p.getInventory().clear();
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack IS = EquipItems.getRailgunType(qp);
		ItemMeta IM = IS.getItemMeta();
		IM.setDisplayName("§e§lRailgun");

		IS.setItemMeta(IM);
		
		ItemStack ISpa = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta IMpa = ISpa.getItemMeta();
		IMpa.setDisplayName("§cParamètres ( clique droit )");
		ISpa.setItemMeta(IMpa);
		p.getInventory().setItem(8, ISpa);
		
		p.getInventory().setItem(0, IS);
		
	}

}
