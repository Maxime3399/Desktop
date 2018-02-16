package fr.Maxime3399.MaxParticles.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HatsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Particles>Hats");
		
		ItemStack ISfire = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMfire = ISfire.getItemMeta();
		IMfire.setDisplayName("§eFire Hat");
		ISfire.setItemMeta(IMfire);
		i.setItem(3, ISfire);
		
		ItemStack ISmagic = new ItemStack(Material.EMERALD);
		ItemMeta IMmagic = ISmagic.getItemMeta();
		IMmagic.setDisplayName("§eMagic Hat");
		ISmagic.setItemMeta(IMmagic);
		i.setItem(4, ISmagic);
		
		ItemStack ISsnow = new ItemStack(Material.SNOW_BALL);
		ItemMeta IMsnow = ISsnow.getItemMeta();
		IMsnow.setDisplayName("§eSnow Hat");
		ISsnow.setItemMeta(IMsnow);
		i.setItem(5, ISsnow);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		IMba.setDisplayName("§7§oBack");
		ISba.setItemMeta(IMba);
		i.setItem(13, ISba);
		
		p.openInventory(i);
		
	}

}
