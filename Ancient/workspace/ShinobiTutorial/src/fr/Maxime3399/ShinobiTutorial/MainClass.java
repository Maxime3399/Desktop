package fr.Maxime3399.ShinobiTutorial;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import fr.Maxime3399.ShinobiTutorial.events.EventsManager;
import fr.Maxime3399.ShinobiTutorial.utils.MySQLUtils;

public class MainClass extends JavaPlugin implements PluginMessageListener{
	
	private static Plugin plugin;
	
	public void onEnable(){
		
		plugin = this;
		MySQLUtils.connect();
		EventsManager.registerEvents(this);
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
		
	}
	
	public static Plugin getInstance(){
		
		return plugin;
		
	}
	
	public void onDisable(){
		
		for(Entity e : Bukkit.getWorld("world").getEntities()){
			
			e.remove();
			
		}
		
	}
	
	public static void teleportToServer(Player player, String server){
		
		try{
			ByteArrayOutputStream ba = new ByteArrayOutputStream();
			DataOutputStream out = new DataOutputStream(ba);
			out.writeUTF("Connect");
			out.writeUTF(server);
			player.sendPluginMessage(Bukkit.getPluginManager().getPlugin("ShinobiTutorial"), "BungeeCord", ba.toByteArray());
		}catch(Exception e){
			player.sendMessage("§cUne erreur est survenue !");
		}
		
	}

	@Override
	public void onPluginMessageReceived(String arg0, Player arg1, byte[] arg2) {
		return;
	}

}
