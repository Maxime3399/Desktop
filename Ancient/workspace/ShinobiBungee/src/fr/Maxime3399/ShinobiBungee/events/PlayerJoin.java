package fr.Maxime3399.ShinobiBungee.events;

import fr.Maxime3399.ShinobiBungee.utils.DataUtils;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PostLoginEvent e){
		
		ProxiedPlayer p = e.getPlayer();
		
		if(DataUtils.getStringServerInfo("maintenance").equalsIgnoreCase("true")){
			
			p.disconnect(new TextComponent("§cCe serveur est en maintenance !"));
			
		}else{
			
			if(DataUtils.getIntServerInfo("onlinePlayers") >= DataUtils.getIntServerInfo("maxPlayers")){
				
				p.disconnect(new TextComponent("§cCe serveur est pleins !"));
				
			}else{
				
				DataUtils.setIntServerInfo("onlinePlayers", DataUtils.getIntServerInfo("onlinePlayers")+1);
				
			}
			
		}
		
	}

}
