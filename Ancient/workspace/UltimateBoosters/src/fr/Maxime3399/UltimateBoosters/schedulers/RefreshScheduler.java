package fr.Maxime3399.UltimateBoosters.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.UltimateBoosters.menus.ListMenu;

public class RefreshScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					if(pls.getOpenInventory() == null){
						
						return;
						
					}else{
						
						Inventory i = pls.getOpenInventory().getTopInventory();
						
						if(i.getName().equalsIgnoreCase("§6§lBoosters")){
							
							if(i.contains(Material.EXP_BOTTLE) || i.contains(Material.POTION)){
								
								ItemStack ISsep2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4);
								ItemMeta IMsep2 = ISsep2.getItemMeta();
								IMsep2.setDisplayName(" ");
								ISsep2.setItemMeta(IMsep2);
								
								if(i.contains(ISsep2)){
									
									ListMenu.openMenu(pls);
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
	}

}
