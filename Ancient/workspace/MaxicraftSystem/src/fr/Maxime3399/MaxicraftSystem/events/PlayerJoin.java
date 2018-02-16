package fr.Maxime3399.MaxicraftSystem.events;

import java.util.concurrent.TimeUnit;

import fr.Maxime3399.MaxicraftSystem.MainClass;
import fr.Maxime3399.MaxicraftSystem.utils.DatabaseAPI;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerJoin implements Listener {
	
	Boolean problem = false;
	
	@EventHandler
	public void onJoin(PostLoginEvent e){
		
		ProxiedPlayer p = e.getPlayer();
		problem = false;
		
		DatabaseAPI.registerPlayer(p);
		
		DatabaseAPI.setIntServerInfo("playersGlobalCount", DatabaseAPI.getIntServerInfo("playersGlobalCount")+1);
		
		ServerInfo si = ProxyServer.getInstance().getServerInfo("Lobby1");
		si.ping(new Callback<ServerPing>() {
			
			@Override
			public void done(ServerPing sp, Throwable th) {
				
				if(th != null){
					
					p.disconnect(new TextComponent("§c§lLe lobby est innaccessible !"));
					problem = true;
					
				}else{
					
					ProxyServer.getInstance().getScheduler().schedule(MainClass.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							
							if(DatabaseAPI.getStringServerInfo("maintenance").equalsIgnoreCase("true")){
								
								if(!DatabaseAPI.getPlayerStaff(p).equalsIgnoreCase("admin")){
									
									p.disconnect(new TextComponent("§c§lLe serveur est en maintenance !"));
									problem = true;
									
								}
								
							}
							if(DatabaseAPI.getIntServerInfo("playersGlobalCount") >= DatabaseAPI.getIntServerInfo("maxPlayers")){
								
								if(DatabaseAPI.getPlayerRank(p).equalsIgnoreCase("default") && DatabaseAPI.getPlayerStaff(p).equalsIgnoreCase("none")){
									
									p.disconnect(new TextComponent("§cLe serveur est pleins, seuls les §e§lVIP§r §c peuvent se connecter !"));
									problem = true;
									
								}else{
									
									if(DatabaseAPI.getIntServerInfo("playersGlobalCount")-1 >= DatabaseAPI.getIntServerInfo("maxVIP")+DatabaseAPI.getIntServerInfo("maxPlayers")){
										
										p.disconnect(new TextComponent("§4§l§k|||||>>>==========<<<|||||§r\n \n§cLe serveur est entièrement pleins,\nmême les §e§lVIP§r §cou plus ne peuvent plus se connecter !§r\n \n§4§l§k|||||>>>==========<<<|||||"));
										problem = true;
										
									}
									
								}
								
							}
							
						}
						
					}, 300, TimeUnit.MILLISECONDS);
					
				}
				
			}
		});
		
	}

}
