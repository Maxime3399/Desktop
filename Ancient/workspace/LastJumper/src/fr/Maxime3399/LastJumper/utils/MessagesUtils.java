package fr.Maxime3399.LastJumper.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.LastJumper.managers.ArenasManager;

public class MessagesUtils {
	
	public static void sendMessages(Player p, String message, boolean prefix, String other){
		
		message = Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getString(message);
		message = message.replaceAll("&", "§");
		message = message.replaceAll("%player%", p.getName());
		message = message.replaceAll("%display%", p.getDisplayName());
		message = message.replaceAll("%max%", ""+Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MaxPlayers"));
		message = message.replaceAll("%min%", ""+Bukkit.getPluginManager().getPlugin("LastJumper").getConfig().getInt("MinPlayers"));
		message = message.replaceAll("%joiner%", other);
		message = message.replaceAll("%time%", other);
		message = message.replaceAll("%leaver%", other);
		message = message.replaceAll("%dead%", other);
		message = message.replaceAll("%winner%", other);
		
		if(ArenasManager.playerArena.containsKey(p)){
			message = message.replaceAll("%arena%", ArenasManager.playerArena.get(p));
			message = message.replaceAll("%count%", ""+ArenasManager.arenaCount.get(ArenasManager.playerArena.get(p)));
		}
			
		if(prefix){
			
			message = "§6§l[§r§bLastJumper§r§6§l] §r"+message;
					
		}
		
		p.sendMessage(message);
		
	}

}
