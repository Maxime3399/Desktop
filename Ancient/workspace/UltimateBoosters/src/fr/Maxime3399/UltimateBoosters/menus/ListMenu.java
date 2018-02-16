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

public class ListMenu {

	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "§6§lBoosters");
		
		ItemStack ISsep = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 11);
		ItemMeta IMsep = ISsep.getItemMeta();
		IMsep.setDisplayName(" ");
		ISsep.setItemMeta(IMsep);
		i.setItem(9, ISsep);
		i.setItem(10, ISsep);
		i.setItem(11, ISsep);
		i.setItem(12, ISsep);
		i.setItem(13, ISsep);
		i.setItem(14, ISsep);
		i.setItem(15, ISsep);
		i.setItem(16, ISsep);
		i.setItem(17, ISsep);
		
		ItemStack ISsep2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4);
		ItemMeta IMsep2 = ISsep2.getItemMeta();
		IMsep2.setDisplayName(" ");
		ISsep2.setItemMeta(IMsep2);
		i.setItem(21, ISsep2);
		i.setItem(23, ISsep2);
		
		if(API.isGlobalBooster()){
			
			for(int c = 0; c <= API.getGlobalBoosters().size()-1; c++){
				
				String booster = API.getGlobalBoosters().get(c);
				String name = API.getGlobalBoosterInfo(booster, "name");
				String multiplier = API.getGlobalBoosterMultiplier(booster)+"";
				
				ItemStack IS = new ItemStack(Material.EXP_BOTTLE);
				ItemMeta IM = IS.getItemMeta();
				ArrayList<String> AL = new ArrayList<>();
				IM.setDisplayName("§a§l"+name+"§r§a's network");
				AL.add("§abooster");
				AL.add(" ");
				if(c == 0){
					AL.add("§eStatus : §r§e§lActive");
				}else{
					AL.add("§eStatus : §r§e§lWaiting");
				}
				AL.add("§bMultiplier : §r§b§lx"+multiplier);
				AL.add("§6Time : §r§6§l"+MessagesUtils.secondToHours(API.getGlobalBoosterInfo(booster, "time")));
				AL.add("§3Tips : §r§3§l"+API.getGlobalBoostersTips().size());
				IM.setLore(AL);
				IS.setItemMeta(IM);
				i.addItem(IS);
				
			}
			
		}else{
			
			ItemStack ISng = new ItemStack(Material.BARRIER);
			ItemMeta IMng = ISng.getItemMeta();
			ArrayList<String> ALng = new ArrayList<>();
			ALng.add("§cboosters");
			IMng.setLore(ALng);
			IMng.setDisplayName("§cThere are no active network");
			ISng.setItemMeta(IMng);
			i.setItem(4, ISng);
			
		}
		
		if(API.getPersonalBoosters().size() != 0){
			
			for(String booster : API.getPersonalBoosters()){
				
				if(p.getUniqueId().toString().equalsIgnoreCase(booster)){
					
					String multiplier = API.getPersonalBoosterMultiplier(booster)+"";
					
					ItemStack IS = new ItemStack(Material.POTION);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					IM.setDisplayName("§a§l"+p.getName()+"§r §a's booster");
					AL.add(" ");
					AL.add("§eStatus : §r§e§lActive");
					AL.add("§bMultiplier : §r§b§l"+multiplier);
					AL.add("§6Time : §r§6§l"+MessagesUtils.secondToHours(API.getPersonalBoosterInfo(booster, "time")));
					IM.setLore(AL);
					IS.setItemMeta(IM);
					i.setItem(22, IS);
					
				}else{
					
					ItemStack ISng = new ItemStack(Material.BARRIER);
					ItemMeta IMng = ISng.getItemMeta();
					ArrayList<String> ALng = new ArrayList<>();
					ALng.add("§cboosters active");
					IMng.setLore(ALng);
					IMng.setDisplayName("§cYou don't have any personal");
					ISng.setItemMeta(IMng);
					i.setItem(22, ISng);
					
				}
				
			}
			
		}else{
			
			ItemStack ISng = new ItemStack(Material.BARRIER);
			ItemMeta IMng = ISng.getItemMeta();
			ArrayList<String> ALng = new ArrayList<>();
			ALng.add("§cboosters active");
			IMng.setLore(ALng);
			IMng.setDisplayName("§cYou don't have any personal");
			ISng.setItemMeta(IMng);
			i.setItem(22, ISng);
			
		}
		
		ItemStack IScl = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta IMcl = IScl.getItemMeta();
		ArrayList<String> ALcl = new ArrayList<>();
		ALcl.add("§9§l> §r§7Click to close the menu");
		IMcl.setLore(ALcl);
		IMcl.setDisplayName("§4Close");
		IScl.setItemMeta(IMcl);
		i.setItem(18, IScl);
		
		ItemStack ISb = new ItemStack(Material.ARROW);
		ItemMeta IMb = ISb.getItemMeta();
		ArrayList<String> ALb = new ArrayList<>();
		ALb.add("§9§l> §r§7Click to return to principal");
		ALb.add("§7menu");
		IMb.setLore(ALb);
		IMb.setDisplayName("§8§oBack");
		ISb.setItemMeta(IMb);
		i.setItem(26, ISb);

		p.openInventory(i);
		
	}
	
}
