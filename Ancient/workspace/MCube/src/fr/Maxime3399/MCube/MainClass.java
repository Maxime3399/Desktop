package fr.Maxime3399.MCube;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.MCube.actions.EventsActions;
import fr.Maxime3399.MCube.actions.RewardsActions;
import fr.Maxime3399.MCube.custom.GameEvent;
import fr.Maxime3399.MCube.events.EventsManager;
import fr.Maxime3399.MCube.menus.MainMenu;
import fr.Maxime3399.MCube.menus.PrefixMenu;
import fr.Maxime3399.MCube.schedulers.SchedulersManager;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.scoreboards.RestartScoreboard;
import fr.Maxime3399.MCube.utils.MySQLUtils;

public class MainClass extends JavaPlugin{
	
	private static Plugin plugin;
	private static final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		
		plugin = this;
		
		File f = new File(getDataFolder(), "config.yml");
		
		if(!f.exists()){
			getConfig().options().copyDefaults();
			saveDefaultConfig();
			logger.info("[M-Cube] Fichier de configuration cree !");
		}
		
		if(getConfig().getString("Adress").equalsIgnoreCase("none")){
			
			logger.warning("[M-Cube] Il faut connecter le plugin a une base de donnees !");
			getServer().getPluginManager().disablePlugin(this);
			
		}else{
			
			MySQLUtils.connect();
			GameEvent.setEvent(GameEvent.NONE);
			EventsManager.registerEvents();
			SchedulersManager.registerSchedulers();
			
			for(Player pls : Bukkit.getOnlinePlayers()){
				RewardsActions.registerPlayer(pls);
				RestartScoreboard.loadScoreboard(pls);
				pls.sendMessage("§c§lRedémarrage du serveur...");
				pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, 100, 1);
			}
			Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {
					for(Player pls : Bukkit.getOnlinePlayers()){
						pls.sendMessage("§a§lRedémarrage terminé !");
						pls.playSound(pls.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
						MainScoreboard.loadScoreboard(pls);
					}
				}
			}, 40);
			Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {
					EventsActions.setlectRandomEvent();
				}
			}, 60);
			
			for(World ws : Bukkit.getWorlds()){
				ws.setGameRuleValue("announceAdvancements", "false");
				ws.setGameRuleValue("doFireTick", "false");
			}
			
		}
		
	}
	
	public void onDisable(){
		
		EventsActions.StopEvent();
		for(Player pls : Bukkit.getOnlinePlayers()){
			if(pls.getOpenInventory() != null){
				pls.closeInventory();
			}
		}
		
	}
	
	public static Plugin getInstance(){
		
		return plugin;
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		
		if (!(sender instanceof Player) && !(sender instanceof ConsoleCommandSender)) {
			
			return false;
			
		}
		
		if(sender instanceof ConsoleCommandSender){
			
			sender.sendMessage("§cCette commande ne peut pas être utilisée par la console !");
			return false;
			
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("menu")){
			
			p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 2);
			MainMenu.openMenu(p);
			
		}else if(cmd.getName().equalsIgnoreCase("test")){
			
			PrefixMenu.openMenu(p);
			
		}
		
		return true;
		
	}

}
