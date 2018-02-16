package fr.Maxime3399.MaxParticles.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AurasMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Particles>Auras");
		
		ItemStack ISflame = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMflame = ISflame.getItemMeta();
		IMflame.setDisplayName("§eFire Aura");
		ISflame.setItemMeta(IMflame);
		i.setItem(1, ISflame);
		
		ItemStack ISmagic = new ItemStack(Material.EMERALD);
		ItemMeta IMmagic = ISmagic.getItemMeta();
		IMmagic.setDisplayName("§eMagic Aura");
		ISmagic.setItemMeta(IMmagic);
		i.setItem(2, ISmagic);
		
		ItemStack ISsnow = new ItemStack(Material.SNOW_BALL);
		ItemMeta IMsnow = ISsnow.getItemMeta();
		IMsnow.setDisplayName("§eSnow Aura");
		ISsnow.setItemMeta(IMsnow);
		i.setItem(3, ISsnow);
		
		ItemStack ISender = new ItemStack(Material.ENDER_PEARL);
		ItemMeta IMender = ISender.getItemMeta();
		IMender.setDisplayName("§eEnder Aura");
		ISender.setItemMeta(IMender);
		i.setItem(4, ISender);
		
		ItemStack ISdeath = new ItemStack(Material.SKULL_ITEM);
		ItemMeta IMdeath = ISdeath.getItemMeta();
		IMdeath.setDisplayName("§eDeath Aura");
		ISdeath.setItemMeta(IMdeath);
		i.setItem(5, ISdeath);
		
		ItemStack ISench = new ItemStack(Material.ENCHANTMENT_TABLE);
		ItemMeta IMench = ISench.getItemMeta();
		IMench.setDisplayName("§eEnchantment Aura");
		ISench.setItemMeta(IMench);
		i.setItem(6, ISench);

		ItemStack ISmusic = new ItemStack(Material.NOTE_BLOCK);
		ItemMeta IMmusic = ISmusic.getItemMeta();
		IMmusic.setDisplayName("§eMusic Aura");
		ISmusic.setItemMeta(IMmusic);
		i.setItem(7, ISmusic);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		IMba.setDisplayName("§7§oBack");
		ISba.setItemMeta(IMba);
		i.setItem(13, ISba);
		
		p.openInventory(i);
		
	}

}
