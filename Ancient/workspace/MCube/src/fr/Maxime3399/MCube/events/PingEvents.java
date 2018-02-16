package fr.Maxime3399.MCube.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import fr.Maxime3399.MCube.utils.DataUtils;

public class PingEvents implements Listener {
	
	@EventHandler
	public void onPing(ServerListPingEvent e){
		
		int onlinePlayers = Bukkit.getOnlinePlayers().size();
		int maxPlayers = DataUtils.getServerIntInfo("maxplayers");
		int maxVIP = DataUtils.getServerIntInfo("maxvip");
		String motd1 = DataUtils.getServerStringInfo("motd1");
		String motd2 = DataUtils.getServerStringInfo("motd2");
		String  finalMotd = "";
		String phase = DataUtils.getServerStringInfo("phase");
		
		e.setMaxPlayers(maxPlayers);
		
		if(phase.equalsIgnoreCase("maintenance")){
			
			motd2 = "§3§oMaintenance en cours...";
			e.setMaxPlayers(0);
			
		}else if(phase.equalsIgnoreCase("close")){
			
			motd2 = "  §9§l§k|||§r §eOuverture le §l10/05§r §ea §b16h §9§l§k|||";
			e.setMaxPlayers(0);
			
		}else{
			
			if(onlinePlayers >= maxPlayers){
				
				if(onlinePlayers >= maxVIP+maxPlayers){
					
					motd2 = "§c§lServeur entièrement pleins !";
					
				}else{
					
					motd2 = "§cServeurt pleins, accès réservé aux §f§lMini-VIP§r §cou plus !";
					
				}
				
			}
			
		}
		
		finalMotd = motd1+"§r\n"+motd2;
		e.setMotd(finalMotd);
		
	}

}
