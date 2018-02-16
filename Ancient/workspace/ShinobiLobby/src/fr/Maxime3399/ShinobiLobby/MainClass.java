package fr.Maxime3399.ShinobiLobby;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import fr.Maxime3399.ShinobiLobby.events.EventsManager;
import fr.Maxime3399.ShinobiLobby.managers.HologramsManager;
import fr.Maxime3399.ShinobiLobby.menus.CapaMainMenu;
import fr.Maxime3399.ShinobiLobby.schedulers.SchedulersManager;
import fr.Maxime3399.ShinobiLobby.utils.MySQLUtils;

public class MainClass extends JavaPlugin implements PluginMessageListener{
	
	private static Plugin plugin;
	
	public void onEnable(){
		
		plugin = this;
		MySQLUtils.connect();
		EventsManager.registerEvents(this);
		HologramsManager.spawnClassicHolograms();
		SchedulersManager.registerSchedulers();
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
		
	}
	
	public void onDisable(){
		
		HologramsManager.dispawnClassicHolograms();
		
	}
	
	public static Plugin getInstance(){
		
		return plugin;
		
	}
	
	public static void teleportToServer(Player player, String server){
		
		try{
			ByteArrayOutputStream ba = new ByteArrayOutputStream();
			DataOutputStream out = new DataOutputStream(ba);
			out.writeUTF("Connect");
			out.writeUTF(server);
			player.sendPluginMessage(Bukkit.getPluginManager().getPlugin("ShinobiLobby"), "BungeeCord", ba.toByteArray());
		}catch(Exception e){
			player.sendMessage("§cUne erreur est survenue !");
		}
		
	}

	@Override
	public void onPluginMessageReceived(String arg0, Player arg1, byte[] arg2) {
		return;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("test")){
			
			CapaMainMenu.openMenu(p);
			
		}
		
		return true;
		
	}

}
