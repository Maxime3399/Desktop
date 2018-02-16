package fr.Maxime3399.ShinobiBungee.events;

import fr.Maxime3399.ShinobiBungee.utils.DataUtils;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.ServerPing.Protocol;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PingEvent implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPing(ProxyPingEvent e){
		
		ServerPing sp = e.getResponse();
		
		if(sp == null){
			
			return;
			
		}else{
			
			if(DataUtils.getStringServerInfo("maintenance").equalsIgnoreCase("true")){
				
				sp.setPlayers(new ServerPing.Players(0, 0, sp.getPlayers().getSample()));
				sp.setDescription(DataUtils.getStringServerInfo("Motd1")+"§r\n§c§lLe serveur est en maintenance !");
				sp.setVersion(new Protocol("§3§l§k||§r §bMAINTENANCE §r§3§l§k||", 4));
				
			}else{
				
				sp.setPlayers(new ServerPing.Players(DataUtils.getIntServerInfo("maxPlayers"), DataUtils.getIntServerInfo("onlinePlayers"), sp.getPlayers().getSample()));
				sp.setDescription("§r"+DataUtils.getStringServerInfo("Motd1")+"§r\n"+DataUtils.getStringServerInfo("Motd2"));
				
			}
			
			e.setResponse(sp);
			
		}
		
	}
	
}
