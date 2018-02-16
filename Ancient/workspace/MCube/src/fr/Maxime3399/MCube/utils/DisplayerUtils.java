package fr.Maxime3399.MCube.utils;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.custom.GameEvent;

public class DisplayerUtils {
	
	public static String getRarityDisplay(String rarity){
		
		String result = "§aCommun";
		
		if(rarity.equalsIgnoreCase("peucommun")){
			result = "§2Peu-Commun";
		}else if(rarity.equalsIgnoreCase("rare")){
			result = "§dRare";
		}else if(rarity.equalsIgnoreCase("super")){
			result = "§5Super";
		}else if(rarity.equalsIgnoreCase("epique")){
			result = "§bEpique";
		}else if(rarity.equalsIgnoreCase("legendaire")){
			result = "§3Légendaire";
		}else if(rarity.equalsIgnoreCase("mythique")){
			result = "§9Mythique";
		}
		
		return result;
		
	}
	
	public static String getCalculedLigueDisplay(String ligue){
		
		String result = "§7Charbon";
		
		if(ligue.equalsIgnoreCase("légende")){
			result = "§3Légende";
		}else if(ligue.equalsIgnoreCase("emeraude")){
			result = "§aEmeraude";
		}else if(ligue.equalsIgnoreCase("diamant")){
			result = "§bDiamant";
		}else if(ligue.equalsIgnoreCase("or")){
			result = "§eOr";
		}else if(ligue.equalsIgnoreCase("lapis")){
			result = "§9Lapis";
		}else if(ligue.equalsIgnoreCase("redstone")){
			result = "§cRedstone";
		}else if(ligue.equalsIgnoreCase("fer")){
			result = "Fer";
		}
		
		return result;
		
	}
	
	public static String getCalculedPlayerDisplayName(Player p){
		
		String staff = DataUtils.getPlayerStaff(p);
		String rank = DataUtils.getPlayerRank(p);
		String trophies = CalculUtils.calculTrophiesRank(p);
		String result = null;
		String display1 = "";
		String display2 = "";
		
		if(staff.equalsIgnoreCase("admin")){
			display1 = "§c§l[§r§cAdmin§l]§r ";
		}else if(staff.equalsIgnoreCase("respdev")){
			display1 = "§9§l[§r§9Resp.Dev§l]§r ";
		}else if(staff.equalsIgnoreCase("dev")){
			display1 = "§9§l[§r§9Dev§l]§r ";
		}else if(staff.equalsIgnoreCase("respmod")){
			display1 = "§6§l[§r§6Resp.Mod§l]§r ";
		}else if(staff.equalsIgnoreCase("mod")){
			display1 = "§6§l[§r§6Mod§l]§r ";
		}else if(staff.equalsIgnoreCase("resphelp")){
			display1 = "§3§l[§r§3Resp.Help§l]§r ";
		}else if(staff.equalsIgnoreCase("help")){
			display1 = "§3§l[§r§3Help§l]§r ";
		}else if(staff.equalsIgnoreCase("yt")){
			display1 = "§d§l[§r§dYT§l]§r ";
		}else if(rank.equalsIgnoreCase("ultravip+")){
			display1 = "§2§l[§r§2UltraVIP§r§"+DataUtils.getPlayerPrefix(p)+"+§r§2§l]§r ";
		}else if(rank.equalsIgnoreCase("ultravip")){
			display1 = "§a§l[§r§aUltraVIP§l]§r ";
		}else if(rank.equalsIgnoreCase("vip+")){
			display1 = "§b§l[§r§bVIP+§l]§r ";
		}else if(rank.equalsIgnoreCase("vip")){
			display1 = "§e§l[§r§eVIP§l]§r ";
		}else if(rank.equalsIgnoreCase("minivip")){
			display1 = "§l[§rMiniVIP§l]§r ";
		}
		if(trophies.equalsIgnoreCase("légende")){
			display2 = "§3";
		}else if(trophies.equalsIgnoreCase("emeraude")){
			display2 = "§a";
		}else if(trophies.equalsIgnoreCase("diamant")){
			display2 = "§b";
		}else if(trophies.equalsIgnoreCase("or")){
			display2 = "§e";
		}else if(trophies.equalsIgnoreCase("lapis")){
			display2 = "§9";
		}else if(trophies.equalsIgnoreCase("redstone")){
			display2 = "§c";
		}else if(!trophies.equalsIgnoreCase("fer")){
			display2 = "§7";
		}
		
		result = display1+display2+p.getName()+"§r";
		
		return result;
		
	}
	
	public static String getEventName(){
		
		String result = "§5§l*****";
		
		if(GameEvent.isEvent(GameEvent.ETERNALDAY)){
			result = "Eternal Day";
		}else if(GameEvent.isEvent(GameEvent.ETERNALNIGHT)){
			result = "Eternal Night";
		}else if(GameEvent.isEvent(GameEvent.SPEEDTIME)){
			result = "Speed Time";
		}else if(GameEvent.isEvent(GameEvent.ANTIWEATHER)){
			result = "Anti Weather";
		}else if(GameEvent.isEvent(GameEvent.DOUBLELIFE)){
			result = "Double Life";
		}else if(GameEvent.isEvent(GameEvent.HALFLIFE)){
			result = "Half Life";
		}else if(GameEvent.isEvent(GameEvent.NOFOOD)){
			result = "No Food";
		}else if(GameEvent.isEvent(GameEvent.NOREGEN)){
			result = "No Regen";
		}else if(GameEvent.isEvent(GameEvent.MOBMONEY)){
			result = "Mob Money";
		}else if(GameEvent.isEvent(GameEvent.MOBTROPHIES)){
			result = "Mob Trophies";
		}else if(GameEvent.isEvent(GameEvent.MONEYTIME)){
			result = "Money Time";
		}else if(GameEvent.isEvent(GameEvent.TROPHIESTIME)){
			result = "Trophies Time";
		}else if(GameEvent.isEvent(GameEvent.EXPLOREMONEY)){
			result = "Explore Money";
		}else if(GameEvent.isEvent(GameEvent.EXPLORETROPHIES)){
			result = "Explore Trophies";
		}else if(GameEvent.isEvent(GameEvent.HALFDAMAGES)){
			result = "Half Damages";
		}else if(GameEvent.isEvent(GameEvent.DOUBLEDAMAGES)){
			result = "Double Damages";
		}else if(GameEvent.isEvent(GameEvent.HASTE)){
			result = "Haste";
		}else if(GameEvent.isEvent(GameEvent.RESISTANCE)){
			result = "Resistance";
		}else if(GameEvent.isEvent(GameEvent.FORCE)){
			result = "Force";
		}else if(GameEvent.isEvent(GameEvent.SPEED)){
			result = "Speed";
		}else if(GameEvent.isEvent(GameEvent.SLOWNESS)){
			result = "Slowness";
		}else if(GameEvent.isEvent(GameEvent.CRYSTALSFINDER)){
			result = "Crystals Finder";
		}else if(GameEvent.isEvent(GameEvent.DEATHCOINS)){
			result = "Death Coins";
		}else if(GameEvent.isEvent(GameEvent.DEATHSTUFF)){
			result = "Death Stuff";
		}else if(GameEvent.isEvent(GameEvent.USELESSEVENT)){
			result = "Useless Event";
		}else if(GameEvent.isEvent(GameEvent.CHESTFINDER)){
			result = "Chest Finder";
		}
		
		return result;
		
	}

}
