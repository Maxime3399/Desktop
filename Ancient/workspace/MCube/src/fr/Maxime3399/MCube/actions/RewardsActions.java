package fr.Maxime3399.MCube.actions;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.CalculUtils;
import fr.Maxime3399.MCube.utils.InventoryUtils;

public class RewardsActions {
	
	static HashMap<String, Integer> coins = new HashMap<>();
	static HashMap<String, Integer> trophies = new HashMap<>();
	static HashMap<String, Integer> crystals = new HashMap<>();
	
	public static void clearMaxCounters(){
		
		 coins.clear();
		 trophies.clear();
		 crystals.clear();
		 
		 for(Player pls : Bukkit.getOnlinePlayers()){
			 
			 registerPlayer(pls);
			 
		 }
		
	}
	
	public static void registerPlayer(Player p){
		
		if(!coins.containsKey(p.getName())){
			
			coins.put(p.getName(), 0);
			trophies.put(p.getName(), 0);
			crystals.put(p.getName(), 0);
			
		}
		
	}
	
	public static void giveCoins(Player p, int count){
		
		int maxCoins = CalculUtils.getMaxCoins(p);
		count = CalculUtils.getCoinsMultiplier(p);
		
		if(coins.get(p.getName()) >= maxCoins){
			
			if(maxCoins == 1000){
				p.sendMessage("§cTu ne peux pas gagner plus de §l1000§r §ccoins par heure !");
			}else{
				p.sendMessage("§cTu ne peux pas gagner plus de §l"+maxCoins+"§r §ccoins par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
			}
			p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
			
		}else{
			
			if(coins.get(p.getName())+count > maxCoins){
				
				int winCoins = coins.get(p.getName())+count-maxCoins;
				coins.put(p.getName(), coins.get(p.getName())+winCoins);
				p.sendMessage("§aTu as gagné §e§l"+winCoins+"§r §ecoins §a!");
				if(maxCoins == 1000){
					p.sendMessage("§cTu as atteins ta limite de §l1000§r §ccoins par heure !");
				}else{
					p.sendMessage("§cTu as atteins ta limite de §l"+maxCoins+"§r §ccoins par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
				}
				p.playSound(p.getLocation(), Sound.ENTITY_CAT_AMBIENT, 100, 1);
				coins.put(p.getName(), coins.get(p.getName())+winCoins);
				CustomPlayer cp = new CustomPlayer(p);
				cp.addCoins(winCoins);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}else{
				
				p.sendMessage("§aTu as gagné §e§l"+count+"§r §ecoins §a!");
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 1);
				coins.put(p.getName(), coins.get(p.getName())+count);
				CustomPlayer cp = new CustomPlayer(p);
				cp.addCoins(count);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}
			
		}
		
	}
	
	public static void giveTrophies(Player p, int count){
		
		int maxTrophies = CalculUtils.getMaxTrophies(p);
		
		if(trophies.get(p.getName()) >= maxTrophies){
			
			if(maxTrophies == 1000){
				p.sendMessage("§cTu ne peux pas gagner plus de §l1000§r §ctrophés par heure !");
			}else{
				p.sendMessage("§cTu ne peux pas gagner plus de §l"+maxTrophies+"§r §ctrophés par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
			}
			p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
			
		}else{
			
			if(trophies.get(p.getName())+count > maxTrophies){
				
				int winTrophies = trophies.get(p.getName())+count-maxTrophies;
				trophies.put(p.getName(), trophies.get(p.getName())+winTrophies);
				p.sendMessage("§aTu as gagné §e§l"+winTrophies+"§r §6trophés §a!");
				if(maxTrophies == 1000){
					p.sendMessage("§cTu as atteins ta limite de §l1000§r §ctrophies par heure !");
				}else{
					p.sendMessage("§cTu as atteins ta limite de §l"+maxTrophies+"§r §ctrophés par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
				}
				p.playSound(p.getLocation(), Sound.ENTITY_CAT_AMBIENT, 100, 1);
				trophies.put(p.getName(), trophies.get(p.getName())+winTrophies);
				CustomPlayer cp = new CustomPlayer(p);
				p.setDisplayName(cp.getCalculedDisplayName());
				cp.addTrophies(winTrophies);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}else{
				
				p.sendMessage("§aTu as gagné §e§l"+count+"§r §6trophés §a!");
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 1);
				trophies.put(p.getName(), trophies.get(p.getName())+count);
				CustomPlayer cp = new CustomPlayer(p);
				p.setDisplayName(cp.getCalculedDisplayName());
				cp.addTrophies(count);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}
			
		}
		
	}
	
	public static void giveCrystals(Player p, int count){
		
		int maxCrystals = CalculUtils.getMaxCoins(p);
		count = CalculUtils.getCrystalsMultiplier(p);
		
		if(crystals.get(p.getName()) >= maxCrystals){
			
			if(maxCrystals == 100){
				p.sendMessage("§cTu ne peux pas gagner plus de §l100§r §ccrystals par heure !");
			}else{
				p.sendMessage("§cTu ne peux pas gagner plus de §l"+maxCrystals+"§r §ccrystals par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
			}
			p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
			
		}else{
			
			if(crystals.get(p.getName())+count > maxCrystals){
				
				int winCrystals = crystals.get(p.getName())+count-maxCrystals;
				crystals.put(p.getName(), crystals.get(p.getName())+winCrystals);
				p.sendMessage("§aTu as gagné §e§l"+winCrystals+"§r §2crystals §a!");
				if(maxCrystals == 100){
					p.sendMessage("§cTu as atteins ta limite de §l100§r §ccoins par heure !");
				}else{
					p.sendMessage("§cTu as atteins ta limite de §l"+maxCrystals+"§r §ccrystals par heure, pour pouvoir en gagner plus tu peux acheter un grade supérieur !");
				}
				p.playSound(p.getLocation(), Sound.ENTITY_CAT_AMBIENT, 100, 1);
				crystals.put(p.getName(), crystals.get(p.getName())+winCrystals);
				CustomPlayer cp = new CustomPlayer(p);
				cp.addCrystals(winCrystals);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}else{
				
				p.sendMessage("§aTu as gagné §e§l"+count+"§r §2crystals §a!");
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 1);
				crystals.put(p.getName(), crystals.get(p.getName())+count);
				CustomPlayer cp = new CustomPlayer(p);
				cp.addCrystals(count);
				cp.update();
				MainScoreboard.loadScoreboard(p);
				InventoryUtils.refreshInventory(p, "§8Profile");
				
			}
			
		}
		
	}

}
