package fr.Maxime3399.MaxicraftSystem.events;

import fr.Maxime3399.MaxicraftSystem.utils.DatabaseAPI;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.ServerPing.Protocol;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PingEvent implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onProxyPing(ProxyPingEvent e){
		
		ServerPing sp = e.getResponse();
		
		if(sp == null){
			
			return;
			
		}else{
			
			sp.setPlayers(new ServerPing.Players(DatabaseAPI.getIntServerInfo("maxPlayers"), DatabaseAPI.getIntServerInfo("playersGlobalCount"), sp.getPlayers().getSample()));
			
			if(DatabaseAPI.getStringServerInfo("maintenance").equalsIgnoreCase("false")){
				
				if(DatabaseAPI.getIntServerInfo("playersGlobalCount") >= DatabaseAPI.getIntServerInfo("maxPlayers")){
					
					sp.setDescription(DatabaseAPI.getStringServerInfo("Motd1")+"§r   §cLe serveur est pleins,\nles §e§lVIP§r §cpeuvent toujours se connecter !");
					
					if(DatabaseAPI.getIntServerInfo("playersGlobalCount") >= DatabaseAPI.getIntServerInfo("maxVIP")+DatabaseAPI.getIntServerInfo("maxPlayers")){
						
						sp.setDescription(DatabaseAPI.getStringServerInfo("Motd1")+"§r\n§c§lLe serveur est entièrement pleins !");
						
					}
					
				}else{
					
					sp.setDescription(DatabaseAPI.getStringServerInfo("Motd1")+"§r\n"+DatabaseAPI.getStringServerInfo("Motd2"));
					
				}
				
			}else{
				
				sp.setPlayers(new ServerPing.Players(0, 0, sp.getPlayers().getSample()));
				sp.setDescription(DatabaseAPI.getStringServerInfo("Motd1")+"§r\n§c§lLe serveur est en maintenance !");
				sp.setVersion(new Protocol("§3§l§k||§r §bMAINTENANCE §r§3§l§k||", 4));
				
			}
			
			e.setResponse(sp);
			
		}
		
	}

}
