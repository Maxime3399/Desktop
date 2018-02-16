package fr.Maxime3399.MaxParticles.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 36, "§8Particles");
		
		ItemStack ISwings = new ItemStack(Material.FEATHER);
		ItemMeta IMwings = ISwings.getItemMeta();
		IMwings.setDisplayName("§6Wings");
		ISwings.setItemMeta(IMwings);
		i.setItem(11, ISwings);
		
		ItemStack ISaura = new ItemStack(Material.POTION);
		ItemMeta IMaura = ISaura.getItemMeta();
		IMaura.setDisplayName("§6Auras");
		ISaura.setItemMeta(IMaura);
		i.setItem(13, ISaura);
		
		ItemStack IShats = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta IMhats = IShats.getItemMeta();
		IMhats.setDisplayName("§6Hats");
		IShats.setItemMeta(IMhats);
		i.setItem(15, IShats);
		
		ItemStack ISremove = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta IMremove = ISremove.getItemMeta();
		IMremove.setDisplayName("§c§oRemove effect");
		ISremove.setItemMeta(IMremove);
		i.setItem(31, ISremove);
		
		p.openInventory(i);
		
	}

}
