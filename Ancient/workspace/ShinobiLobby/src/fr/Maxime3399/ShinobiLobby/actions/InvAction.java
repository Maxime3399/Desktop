package fr.Maxime3399.ShinobiLobby.actions;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InvAction {
	
	public static void setInv(Player p){
		
		ItemStack ISmenu = new ItemStack(Material.PAPER);
		ItemMeta IMmenu = ISmenu.getItemMeta();
		IMmenu.setDisplayName("§6§lMenu");
		ISmenu.setItemMeta(IMmenu);
		p.getInventory().setItem(0, ISmenu);
		
	}

}
