package fr.Maxime3399.ShinobiUtil.actions;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.ShinobiUtil.utils.DataUtils;
import fr.Maxime3399.ShinobiUtil.utils.LevelUtils;

public class EquipAction {
	
	@SuppressWarnings("deprecation")
	public static void equip(Player p){
		
		String uuid = p.getUniqueId().toString();
		String capa[] = DataUtils.getStringPlayerInfo(uuid, "capa-enable").split(",");
		
		p.setLevel(50);
		LevelUtils.setLevel(p, 0);
		
		for(String s : capa){
			
			if(s.equalsIgnoreCase("weapon01")){
				
				ItemStack IS = new ItemStack(Material.WOOD_SWORD);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§eKatana en bois");
				IM.spigot().setUnbreakable(true);
				IS.setItemMeta(IM);
				p.getInventory().addItem(IS);
				
			}else if(s.equalsIgnoreCase("weapon02")){
				
				ItemStack IS = new ItemStack(Material.STONE_SWORD);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§eKatana en pierre");
				IM.spigot().setUnbreakable(true);
				IS.setItemMeta(IM);
				p.getInventory().addItem(IS);
				
			}else if(s.equalsIgnoreCase("katon01")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§cBoule de feu suprême §b§l4");
				IM.spigot().setUnbreakable(true);
				IS.setItemMeta(IM);
				p.getInventory().addItem(IS);
				
			}else if(s.equalsIgnoreCase("katon02")){
				
				ItemStack IS = new ItemStack(Material.BLAZE_POWDER);
				ItemMeta IM = IS.getItemMeta();
				IM.setDisplayName("§cLa balasmine §b§l5");
				IM.spigot().setUnbreakable(true);
				IS.setItemMeta(IM);
				p.getInventory().addItem(IS);
				
			}
			
		}
		
	}

}
