package fr.Maxime3399.MCube.menus;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.managers.ChestsManager;

public class RollMenu {
	
	static HashMap<Player, Integer> NewState = new HashMap<>();
	static HashMap<Player, Integer> NewSecondState = new HashMap<>();
	static HashMap<Player, Integer> NewWait = new HashMap<>();
	static HashMap<Player, Integer> NewSound = new HashMap<>();
	
	public static void startRollTirage(Player p, int chest, int state, int SecondState, int wait, int sound){
		
		Inventory i = Bukkit.createInventory(null, 9, "§8Tirage");
		
		ItemStack IS = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		ItemMeta IM = IS.getItemMeta();
		IM.setDisplayName(" ");
		IS.setItemMeta(IM);
		if(state == 0){
			i.setItem(0, IS);
			i.setItem(8, IS);
		}else if(state == 1){
			i.setItem(1, IS);
			i.setItem(7, IS);
		}else if(state == 2){
			i.setItem(2, IS);
			i.setItem(6, IS);
		}else if(state == 3){
			i.setItem(3, IS);
			i.setItem(5, IS);
			if(SecondState < 13){
				SecondState++;
				state = -1;
			}else{
				SecondState++;
			}
			if(SecondState > 6){
				wait++;
			}
		}
		state++;
		
		if(sound == 0){
			p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 100, 1);
			sound++;
		}else{
			p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 100, 2);
			sound = 0;
		}
		
		p.openInventory(i);
		NewState.put(p, state);
		NewSecondState.put(p, SecondState);
		NewWait.put(p, wait);
		NewSound.put(p, sound);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				if(NewSecondState.get(p) == 14){
					
					NewState.remove(p);
					NewSecondState.remove(p);
					NewWait.remove(p);
					NewSound.remove(p);
					String rarity = ChestsManager.getRandomRarity(chest);
					String reward = ChestsManager.getRandomReward(rarity);
					i.setItem(4, ChestsManager.getRewardItem(reward, rarity));
					ChestsManager.giveReward(p, reward, rarity, ChestsManager.getRewardItem(reward, rarity).getItemMeta().getDisplayName());
					p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
					
				}else{
					startRollTirage(p, chest, NewState.get(p), NewSecondState.get(p), NewWait.get(p), NewSound.get(p));
				}
				
			}
			
		}, wait);
		
	}

}
