package fr.Maxime3399.MaxParticles.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WingsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Particles>Wings");
		
		ItemStack ISflame = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMflame = ISflame.getItemMeta();
		IMflame.setDisplayName("§eFire Wings");
		ISflame.setItemMeta(IMflame);
		i.setItem(1, ISflame);
		
		ItemStack ISmagic = new ItemStack(Material.EMERALD);
		ItemMeta IMmagic = ISmagic.getItemMeta();
		IMmagic.setDisplayName("§eMagic Wings");
		ISmagic.setItemMeta(IMmagic);
		i.setItem(2, ISmagic);
		
		ItemStack ISsnow = new ItemStack(Material.SNOW_BALL);
		ItemMeta IMsnow = ISsnow.getItemMeta();
		IMsnow.setDisplayName("§eSnow Wings");
		ISsnow.setItemMeta(IMsnow);
		i.setItem(3, ISsnow);
		
		ItemStack ISmulti = new ItemStack(Material.APPLE);
		ItemMeta IMmulti = ISmulti.getItemMeta();
		IMmulti.setDisplayName("§eMulticolor Wings");
		ISmulti.setItemMeta(IMmulti);
		i.setItem(4, ISmulti);
		
		ItemStack ISdeath = new ItemStack(Material.SKULL_ITEM);
		ItemMeta IMdeath = ISdeath.getItemMeta();
		IMdeath.setDisplayName("§eDeath Wings");
		ISdeath.setItemMeta(IMdeath);
		i.setItem(5, ISdeath);
		
		ItemStack ISnether = new ItemStack(Material.NETHERRACK);
		ItemMeta IMnether = ISnether.getItemMeta();
		IMnether.setDisplayName("§eNether Wings");
		ISnether.setItemMeta(IMnether);
		i.setItem(6, ISnether);
		
		ItemStack ISender = new ItemStack(Material.ENDER_PEARL);
		ItemMeta IMender = ISender.getItemMeta();
		IMender.setDisplayName("§eEnder Wings");
		ISender.setItemMeta(IMender);
		i.setItem(7, ISender);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		IMba.setDisplayName("§7§oBack");
		ISba.setItemMeta(IMba);
		i.setItem(13, ISba);
		
		p.openInventory(i);
		
	}

}
