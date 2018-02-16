package fr.Maxime3399.UltimateBoosters.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.UltimateBoosters.API;
import fr.Maxime3399.UltimateBoosters.utils.MessagesUtils;

public class InvMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 54, "§6§lBoosters");
		
		if(API.getPlayerGlobalBoosters(p).size() != 0){
			
			int s = API.getPlayerGlobalBoosters(p).size();
			if(s > 45){
				s = 45;
			}
			
			for(int c = s; c <= s-1; c++){
				
				int mult = API.getPlayerGlobalBoostersARRAY(p).get(c);
				
				ItemStack IS = new ItemStack(Material.EXP_BOTTLE);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§a§l"+p.getName()+"§r§a's network");
				AL.add("§abooster");
				AL.add(" ");
				AL.add("§bMultiplier : §r§b§lx"+mult);
				AL.add("§6Time : §r§6§l"+MessagesUtils.secondToHours(API.getGlobalBoosterInfo(booster, "time")));
				AL.add("§3Tips : §r§3§l"+API.getGlobalBoostersTips().size());
				IM.setLore(AL);
				IS.setItemMeta(IM);
				i.addItem(IS);
				
			}
			
		}
		
		p.openInventory(i);
		
	}

}
