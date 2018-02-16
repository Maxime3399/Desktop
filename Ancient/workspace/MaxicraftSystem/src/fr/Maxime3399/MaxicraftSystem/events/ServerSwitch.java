package fr.Maxime3399.MaxicraftSystem.events;

import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ServerSwitch implements Listener {
	
	@EventHandler
	public void onSwitch(ServerConnectEvent e){
		
		ServerInfo tar = e.getTarget();
		ProxiedPlayer p = e.getPlayer();
		
		tar.ping(new Callback<ServerPing>() {
			
			@Override
			public void done(ServerPing tar, Throwable th) {
				
				if(th != null){
					
					if(p.getServer() != null){
						
						if(p.getServer().getInfo().getName().equalsIgnoreCase("Lobby1")){
							
							p.sendMessage(new TextComponent("§c§lUne erreur est survenue !"));
							e.setCancelled(true);
							
						}else{
							
							p.sendMessage(new TextComponent("§c§lUne erreur est survenue, vous allez être téléporté sur le lobby"));
							goToLobby(p);
							
						}
						
					}
					
				}
				
			}
		});
		
	}
	
	public static void goToLobby(ProxiedPlayer p){
		
		ServerInfo si = ProxyServer.getInstance().getServerInfo("Lobby1");
		
		si.ping(new Callback<ServerPing>() {
			
			@Override
			public void done(ServerPing tar, Throwable th) {
				
				if(th != null){
					
					p.disconnect(new TextComponent("§c§lLe lobby est innaccessible !"));
					
				}else{
					
					p.connect(si);
					
				}
				
			}
		});
		
	}

}
