package fr.Maxime3399.MCube.cosmetics;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class CosCounters {
	
	public static int getAllEffects(Player p){
		
		return getParticlesCount(p);
		
	}
	
	public static int getParticlesCount(Player p){
		
		return getParticlesWingsCount(p)+getParticlesHatsCount(p);
		
	}
	
	public static int getParticlesAurasCount(Player p){
		
		int result = 0;
		CustomPlayer cp = new CustomPlayer(p);
		
		if(cp.getRank().equalsIgnoreCase("ultravip+")){
			result = result+5;
		}else if(cp.getRank().equalsIgnoreCase("ultravip")){
			result = result+4;
		}else if(cp.getRank().equalsIgnoreCase("vip+")){
			result = result+3;
		}else if(cp.getRank().equalsIgnoreCase("vip")){
			result = result+2;
		}else if(cp.getRank().equalsIgnoreCase("minivip")){
			result++;
		}
		
		return result;
		
	}
	
	public static int getParticlesHatsCount(Player p){
		
		int result = 0;
		CustomPlayer cp = new CustomPlayer(p);
		
		if(cp.getRank().equalsIgnoreCase("ultravip+")){
			result = result+5;
		}else if(cp.getRank().equalsIgnoreCase("ultravip")){
			result = result+4;
		}else if(cp.getRank().equalsIgnoreCase("vip+")){
			result = result+3;
		}else if(cp.getRank().equalsIgnoreCase("vip")){
			result = result+2;
		}else if(cp.getRank().equalsIgnoreCase("minivip")){
			result++;
		}
		if(cp.HasCosmetic("deathhat")){
			result++;
		}
		if(cp.HasCosmetic("draghat")){
			result++;
		}
		if(cp.HasCosmetic("dlavahat")){
			result++;
		}
		if(cp.HasCosmetic("dwaterhat")){
			result++;
		}
		if(cp.HasCosmetic("enchhat")){
			result++;
		}
		if(cp.HasCosmetic("whitehat")){
			result++;
		}
		if(cp.HasCosmetic("sandhat")){
			result++;
		}
		if(cp.HasCosmetic("fwhat")){
			result++;
		}
		if(cp.HasCosmetic("flamehat")){
			result++;
		}
		if(cp.HasCosmetic("magichat")){
			result++;
		}
		if(cp.HasCosmetic("lovehat")){
			result++;
		}
		if(cp.HasCosmetic("lavahat")){
			result++;
		}
		if(cp.HasCosmetic("combathat")){
			result++;
		}
		if(cp.HasCosmetic("notehat")){
			result++;
		}
		if(cp.HasCosmetic("enderhat")){
			result++;
		}
		if(cp.HasCosmetic("netherhat")){
			result++;
		}
		if(cp.HasCosmetic("multhat")){
			result++;
		}
		if(cp.HasCosmetic("slimehat")){
			result++;
		}
		if(cp.HasCosmetic("smokehat")){
			result++;
		}
		if(cp.HasCosmetic("snowhat")){
			result++;
		}
		if(cp.HasCosmetic("angelhat")){
			result++;
		}
		if(cp.HasCosmetic("totemhat")){
			result++;
		}
		
		return result;
		
	}
	
	public static int getParticlesWingsCount(Player p){
		
		int result = 0;
		CustomPlayer cp = new CustomPlayer(p);
		
		if(cp.getRank().equalsIgnoreCase("ultravip+")){
			result = result+5;
		}else if(cp.getRank().equalsIgnoreCase("ultravip")){
			result = result+4;
		}else if(cp.getRank().equalsIgnoreCase("vip+")){
			result = result+3;
		}else if(cp.getRank().equalsIgnoreCase("vip")){
			result = result+2;
		}else if(cp.getRank().equalsIgnoreCase("minivip")){
			result++;
		}
		if(cp.HasCosmetic("netherwings")){
			result++;
		}
		if(cp.HasCosmetic("enderwings")){
			result++;
		}
		if(cp.HasCosmetic("angelwings")){
			result++;
		}
		if(cp.HasCosmetic("enchwings")){
			result++;
		}
		if(cp.HasCosmetic("dragwings")){
			result++;
		}
		if(cp.HasCosmetic("whitewings")){
			result++;
		}
		if(cp.HasCosmetic("fwwings")){
			result++;
		}
		if(cp.HasCosmetic("smokewings")){
			result++;
		}
		if(cp.HasCosmetic("godwings")){
			result++;
		}
		
		return result;
		
	}

}
