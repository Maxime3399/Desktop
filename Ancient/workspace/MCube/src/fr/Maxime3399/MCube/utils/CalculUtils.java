package fr.Maxime3399.MCube.utils;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class CalculUtils {
	
	public static int rarityToPrice(String rarity){
		
		int price = 80;
		
		if(rarity.equalsIgnoreCase("peucommun")){
			price = 160;
		}else if(rarity.equalsIgnoreCase("rare")){
			price = 240;
		}else if(rarity.equalsIgnoreCase("super")){
			price = 320;
		}else if(rarity.equalsIgnoreCase("epique")){
			price = 400;
		}else if(rarity.equalsIgnoreCase("legendaire")){
			price = 480;
		}else if(rarity.equalsIgnoreCase("mythique")){
			price = 560;
		}
		
		return price;
		
	}
	
	public static String colorToRarity(String value){
		
		String rarity = "commun";
		
		if(value.contains("§2")){
			rarity = "peucommun";
		}else if(value.contains("§d")){
			rarity = "rare";
		}else if(value.contains("§5")){
			rarity = "super";
		}else if(value.contains("§b")){
			rarity = "epique";
		}else if(value.contains("§3")){
			rarity = "legendaire";
		}else if(value.contains("§9")){
			rarity = "mythique";
		}
		
		return rarity;
		
	}
	
	public static String calculTrophiesRank(Player p){
		
		int trophies = DataUtils.getPlayerTrophies(p);
		String result = "charbon";
		
		if(trophies >= 36000){
			result = "légende";
		}else if(trophies >= 28000){
			result = "emeraude";
		}else if(trophies >= 21000){
			result = "diamant";
		}else if(trophies >= 15000){
			result = "or";
		}else if(trophies >= 10000){
			result = "lapis";
		}else if(trophies >= 6000){
			result = "redstone";
		}else if(trophies >= 3000){
			result = "fer";
		}else if(trophies >= 1000){
			result = "bronze";
		}
		
		return result;
		
	}
	
	public static int getMaxCoins(Player p){
		
		int result = 100;
		
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 1000;
		}else if(rank.equalsIgnoreCase("ultravip")){
			result = 800;
		}else if(rank.equalsIgnoreCase("vip+")){
			result = 600;
		}else if(rank.equalsIgnoreCase("vip")){
			result = 400;
		}else if(rank.equalsIgnoreCase("minivip")){
			result = 200;
		}
		
		return result;
		
	}
	
	public static int getMaxTrophies(Player p){
		
		int result = 100;
		
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 1000;
		}else if(rank.equalsIgnoreCase("ultravip")){
			result = 800;
		}else if(rank.equalsIgnoreCase("vip+")){
			result = 600;
		}else if(rank.equalsIgnoreCase("vip")){
			result = 400;
		}else if(rank.equalsIgnoreCase("minivip")){
			result = 200;
		}
		
		return result;
		
	}
	
	public static int getMaxCrystals(Player p){
		
		int result = 10;
		
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 100;
		}else if(rank.equalsIgnoreCase("ultravip")){
			result = 70;
		}else if(rank.equalsIgnoreCase("vip+")){
			result = 50;
		}else if(rank.equalsIgnoreCase("vip")){
			result = 35;
		}else if(rank.equalsIgnoreCase("minivip")){
			result = 20;
		}
		
		return result;
		
	}
	
	public static int getCoinsMultiplier(Player p){
		
		int result = 1;
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 4;
		}else if(rank.equalsIgnoreCase("ultravip")){
			result = 3;
		}else if(rank.equalsIgnoreCase("vip+")){
			result = 2;
		}
		
		return result;
		
	}
	
	public static int getExpMultiplier(Player p){
		
		int result = 1;
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 5;
		}else if(rank.equalsIgnoreCase("ultravip")){
			result = 4;
		}else if(rank.equalsIgnoreCase("vip+")){
			result = 3;
		}else if(rank.equalsIgnoreCase("vip")){
			result = 2;
		}
		
		return result;
		
	}
	
	public static int getCrystalsMultiplier(Player p){
		
		int result = 1;
		CustomPlayer cp = new CustomPlayer(p);
		String rank = cp.getRank();
		
		if(rank.equalsIgnoreCase("ultravip+")){
			result = 2;
		}
		
		return result;
		
	}

}
