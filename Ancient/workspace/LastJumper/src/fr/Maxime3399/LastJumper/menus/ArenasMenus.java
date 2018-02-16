package fr.Maxime3399.LastJumper.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;

public class ArenasMenus {
	
	public static void openMenu(Player p){
		
		int i = 0;
		if(ArenasConfig.arenasList().size() <= 9){
			i = 9;
		}else if(ArenasConfig.arenasList().size() <= 18){
			i = 18;
		}else if(ArenasConfig.arenasList().size() <= 27){
			i = 27;
		}else if(ArenasConfig.arenasList().size() <= 36){
			i = 36;
		}else if(ArenasConfig.arenasList().size() <= 45){
			i = 45;
		}else if(ArenasConfig.arenasList().size() <= 54){
			i = 54;
		}
		
		Inventory inv = Bukkit.createInventory(null, i, "§6§lLast Jumper");
		
		for(int z = 0; z < ArenasConfig.arenasList().size(); z++){
			
			String name = ArenasConfig.arenasList().get(z);
			
			if(ArenasManager.arenasState.containsKey(name)){
				if(ArenasManager.arenasState.get(name).equalsIgnoreCase("wait")){
					ItemStack IS = new ItemStack(Material.STAINED_CLAY, 1, (short) 5);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					IM.setDisplayName("§a§l"+name);
					AL.add(" §3§l> §r§aWaiting §r§3§l<");
					AL.add(" ");
					AL.add("§ePlayers: §l"+ArenasManager.arenaCount.get(name)+"/"+Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MaxPlayers"));
					AL.add(" ");
					AL.add("§9§l> §r§7Click to join");
					IM.setLore(AL);
					IS.setItemMeta(IM);
					inv.addItem(IS);
				}else if(ArenasManager.arenasState.get(name).equalsIgnoreCase("playing")){
					ItemStack IS = new ItemStack(Material.STAINED_CLAY, 1, (short) 3);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					IM.setDisplayName("§9§l"+name);
					AL.add(" §3§l> §r§8In progress §r§3§l<");
					AL.add(" ");
					AL.add("§ePlayers: §l"+ArenasManager.arenaCount.get(name)+"/"+Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MaxPlayers"));
					AL.add("§bSurvivors : §l"+ArenasManager.livePlayers.get(name));
					IM.setLore(AL);
					IS.setItemMeta(IM);
					inv.addItem(IS);
				}else if(ArenasManager.arenasState.get(name).equalsIgnoreCase("end")){
					ItemStack IS = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					IM.setDisplayName("§c§l"+name);
					AL.add(" §3§l> §r§cEnded §r§3§l<");
					AL.add(" ");
					AL.add("§dWinner: §l"+ArenasManager.winner.get(name).getName());
					IM.setLore(AL);
					IS.setItemMeta(IM);
					inv.addItem(IS);
				}else if(ArenasManager.arenasState.get(name).equalsIgnoreCase("restart")){
					ItemStack IS = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					IM.setDisplayName("§7§l"+name);
					AL.add(" §3§l> §r§7Restarting §r§3§l<");
					IM.setLore(AL);
					IS.setItemMeta(IM);
					inv.addItem(IS);
				}else if(ArenasManager.arenasState.get(name).equalsIgnoreCase("dev")){
					if(p.hasPermission("lastjumper.viewcreation") || p.hasPermission("lastjumper.admin")){
						ItemStack IS = new ItemStack(Material.STAINED_CLAY, 1, (short) 4);
						ItemMeta IM = IS.getItemMeta();
						ArrayList<String> AL = new ArrayList<>();
						IM.setDisplayName("§e§l"+name);
						AL.add(" ");
						AL.add("§f§oThis arena is in creation.");
						IM.setLore(AL);
						IS.setItemMeta(IM);
						inv.addItem(IS);
					}
				}
			}
			
		}
		
		p.openInventory(inv);
		
	}

}
