package fr.Maxime3399.ShinobiTutorial.utils;

import org.bukkit.entity.Player;

public class DisplayUtils {
	
	public static String getDisplayName(Player p){
		
		String uuid = p.getUniqueId().toString();
		String result = "";
		
		String staff = DataUtils.getStringPlayerInfo(uuid, "staff");
		
		if(staff.equalsIgnoreCase("admin")){
			result = "§c§l[§r§cAdmin§l]§r";
		}else if(staff.equalsIgnoreCase("respdev")){
			result = "§3§l[§r§3Resp.Dev§l]§r";
		}else if(staff.equalsIgnoreCase("dev")){
			result = "§3§l[§r§3Dev§l]§r";
		}else if(staff.equalsIgnoreCase("respmod")){
			result = "§6§l[§r§6Resp.Mod§l]§r";
		}else if(staff.equalsIgnoreCase("mod")){
			result = "§6§l[§r§6Mod§l]§r";
		}else if(staff.equalsIgnoreCase("respbuild")){
			result = "§b§l[§r§bResp.Build§l]§r";
		}else if(staff.equalsIgnoreCase("build")){
			result = "§b§l[§r§bBuild§l]§r";
		}else if(staff.equalsIgnoreCase("help")){
			result = "§a§l[§r§aHelp§l]§r";
		}else if(staff.equalsIgnoreCase("yt")){
			result = "§d§l[§r§dYT§l]§r";
		}else{
			String rank = DataUtils.getStringPlayerInfo(uuid, "rank");
			if(rank.equalsIgnoreCase("vip")){
				result = "§e§l[§r§eVIP§l]§r";
			}
		}
		
		int lvl = DataUtils.getIntPlayerInfo(uuid, "lvl");
		if(lvl < 0){
			lvl = 0;
		}
		
		result = result+" §9"+lvl+"§r §7"+p.getName()+"§r";
		
		return result;
		
	}

}
