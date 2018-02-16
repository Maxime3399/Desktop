package fr.Maxime3399.DivionAPI;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class MainClass extends JavaPlugin implements PluginMessageListener{

	private static final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		
		logger.info("[DivonAPI] Plugin enabled, with the version "+getDescription().getVersion());
		logger.info("[DivonAPI] Plugin made by "+getDescription().getAuthors());
		
		MySQLUtils.connect();
		logger.info("[DivionAPI] Connecting to databse...");
		
		if(getServer().getPluginManager().getPlugin("DivionLobby") == null){
			logger.info("[DivonAPI] DivionLobby not found.");
		}else{
			logger.info("[DivonAPI] DivionLobby founded !");
		}
		if(getServer().getPluginManager().getPlugin("DivionMining") == null){
			logger.info("[DivonAPI] DivionMining not found.");
		}else{
			logger.info("[DivonAPI] DivionMining founded !");
		}
		if(getServer().getPluginManager().getPlugin("DivionFaction") == null){
			logger.info("[DivonAPI] DivionFaction not found.");
		}else{
			logger.info("[DivonAPI] DivionFaction founded !");
		}
		if(getServer().getPluginManager().getPlugin("DivionBuild") == null){
			logger.info("[DivonAPI] DivionBuild not found.");
		}else{
			logger.info("[DivonAPI] DivionBuild founded !");
		}
		
		File file = new File(getDataFolder(), "config.yml");
		
		if(!file.exists()){
			getConfig().options().copyDefaults();
			saveDefaultConfig();
			logger.info("[DivionAPI] Configuration file created !");
		}
		
		if(getConfig().getString("ServerName").equalsIgnoreCase("NONE")){
			logger.info("[DivonAPI] Please specify the name of the server !");
			logger.info("[DivionAPI] Plugin disabled.");
			getServer().getPluginManager().disablePlugin(this);
		}else{
			logger.info("[DivionAPI] Server name : "+getConfig().getString("ServerName"));
			PlayersCount.startScheduler();
			if(!DivionAPI.getServerMode(getConfig().getString("ServerName")).equalsIgnoreCase("maintenance")){
				DivionAPI.setServerMode(getConfig().getString("ServerName"), "online");
			}
		}
		
		logger.info("[DivionAPI] BungeeCord plugin channel registered !");
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
		
	}
	
	public static void teleportToServer(Player player, String server){
		
		try{
			ByteArrayOutputStream ba = new ByteArrayOutputStream();
			DataOutputStream out = new DataOutputStream(ba);
			out.writeUTF("Connect");
			out.writeUTF(server);
			player.sendPluginMessage(Bukkit.getPluginManager().getPlugin("DivionAPI"), "BungeeCord", ba.toByteArray());
		}catch(Exception e){
			player.sendMessage("§c§lUne erreur est survenue lors de la connexion au serveur !");
		}
		
	}
	
	public void onDisable(){
		
		if(!getConfig().getString("ServerName").equalsIgnoreCase("NONE") && !DivionAPI.getServerMode(getConfig().getString("ServerName")).equalsIgnoreCase("maintenance")){
			DivionAPI.setServerMode(getConfig().getString("ServerName"), "offline");
		}
		
	}

	@Override
	public void onPluginMessageReceived(String arg0, Player arg1, byte[] arg2) {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("maintenance")){
			
			if(DivionAPI.getPlayerRank(player).equalsIgnoreCase("respdev") || DivionAPI.getPlayerRank(player).equalsIgnoreCase("dev")){
				
				if(getConfig().getString("ServerName").contains("Lobby")){
					
					player.sendMessage("§eCette commande est désactivée sur les hubs.");
					
				}else{
					
					if(DivionAPI.getServerMode(getConfig().getString("ServerName")).equalsIgnoreCase("maintenance")){
						
						player.sendMessage("§eLe serveur n'est plus en maintenance.");
						DivionAPI.setServerMode(getConfig().getString("ServerName"), "online");
						
					}else{
						
						Bukkit.broadcastMessage("§b§l§k||§r §eLe serveur passe en maintenance dans 5 secondes §r§b§l§k||");
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							pls.playSound(pls.getLocation(), Sound.ANVIL_LAND, 100, 1);
							
						}
						
						Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("DivionAPI"), new Runnable() {
							
							@Override
							public void run() {
								
								for(Player pls : Bukkit.getOnlinePlayers()){
									
									DivionAPI.changeServer(pls, "Lobby1");
									DivionAPI.setServerMode(getConfig().getString("ServerName"), "maintenance");
									
								}
								
							}
							
						}, 100);
						
					}
					
				}
				
			}else{
				
				player.sendMessage("§cVous ne possèdez pas la permission.");
				
			}
			
		}else if(cmd.getName().equalsIgnoreCase("hub") || cmd.getName().equalsIgnoreCase("lobby")){
			
			if(getConfig().getString("ServerName").contains("Lobby")){
				
				player.sendMessage("§eVous êtes déjà sur le hub.");
				
			}else{
				
				DivionAPI.changeServer(player, "Lobby1");
				
			}
			
		}
		
		return true;
		
	}
	
}
