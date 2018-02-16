package fr.Maxime3399.UltimateBoosters;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.UltimateBoosters.events.EventsManager;
import fr.Maxime3399.UltimateBoosters.menus.MainMenu;
import fr.Maxime3399.UltimateBoosters.schedulers.MultScheduler;
import fr.Maxime3399.UltimateBoosters.schedulers.SchedulersManager;
import fr.Maxime3399.UltimateBoosters.utils.MoneyUtils;
import fr.Maxime3399.UltimateBoosters.utils.MySQLUtils;
import net.milkbowl.vault.economy.Economy;

public class MainClass extends JavaPlugin{

	private static Economy economy = null;
	
	private boolean setupEconomy(){

        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);

        if (economyProvider != null) {

            economy = economyProvider.getProvider();

        }

        return (economy != null);

    }
	
	public static Economy getEcononomy() {
        return economy;
    }
	
	@SuppressWarnings("deprecation")
	public void onEnable(){
		
		File file = new File(getDataFolder(), "config.yml");
		
		if(!file.exists()){
			getConfig().options().copyDefaults();
			saveDefaultConfig();
			Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§aThe config.yml file has been created");
		}
		
		if(getConfig().getString("Adress").equalsIgnoreCase("")){
			
			Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§b§lPlease connect the plugin to the database.");
			getServer().getPluginManager().disablePlugin(this);
			
		}else{
			
			if(getServer().getPluginManager().getPlugin("Vault") == null){
				
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§b§lThe server must have the plugin vault !");
				getServer().getPluginManager().disablePlugin(this);
				
			}else{
				
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§cBooster§r§6§l] §r§6§lConnecting plugin to database...");
				MySQLUtils.connect();
				setupEconomy();
				API.registerServer();
				EventsManager.registerEvents(this);
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					MultScheduler.list.put(pls, getEcononomy().getBalance(pls.getName()));
					
				}
				
				SchedulersManager.registerSchedulers();
				
			}
			
		}
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("tip")){
			
			if(API.isGlobalBooster()){
				
				String booster = API.getGlobalBoosters().get(0);
				
				if(API.getGlobalBoostersTips().contains(p.getName())){
					
					p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§cYou already have to thank this player !");
					if(getConfig().getConfigurationSection("Effects").getBoolean("ErrorSound")){
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					}
					
				}else{
					
					if(API.getGlobalBoosterInfo(booster, "name").equalsIgnoreCase(p.getName())){
						
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§cYou can not thank yourself !");
						if(getConfig().getConfigurationSection("Effects").getBoolean("ErrorSound")){
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
						}
						
					}else{
						
						MoneyUtils.giveMoneyToString(p.getName(), getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterUser").getDouble("Money"));
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§aYou thanked §l"+API.getGlobalBoosterInfo(booster, "name")+"§r§a, you won §e§l"+getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterUser").getDouble("Money")+" "+getEcononomy().currencyNamePlural()+" §r§a!");
						if(getConfig().getConfigurationSection("Effects").getBoolean("TipSound")){
							p.playSound(p.getLocation(), Sound.ORB_PICKUP, 100, 2);
						}
						
						MoneyUtils.giveMoneyToString(API.getGlobalBoosterInfo(booster, "name"), getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterOwner").getDouble("Money"));
						if(Bukkit.getPlayer(API.getGlobalBoosterInfo(booster, "name")) != null){
							Bukkit.getPlayer(API.getGlobalBoosterInfo(booster, "name")).sendMessage("§6§l[§r§cBooster§r§6§l] §r§a§l"+p.getName()+" §r§athanked you, you won §e§l"+getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterOwner").getDouble("Money")+" "+getEcononomy().currencyNamePlural()+" §r§a!");
							if(getConfig().getConfigurationSection("Effects").getBoolean("TipSound")){
								Bukkit.getPlayer(API.getGlobalBoosterInfo(booster, "name")).playSound(Bukkit.getPlayer(API.getGlobalBoosterInfo(booster, "name")).getLocation(), Sound.ORB_PICKUP, 100, 2);
							}
						}
						
						API.addGlobalBoosterTip(p.getName());
						
					}
					
				}
				
			}else{
				
				p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§cThere are no active network boosters !");
				if(getConfig().getConfigurationSection("Effects").getBoolean("ErrorSound")){
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
				}
				
			}
			
		}else if(cmd.getName().equalsIgnoreCase("booster") || cmd.getName().equalsIgnoreCase("boosters")){
			
			MainMenu.openMenu(p);
			if(getConfig().getConfigurationSection("Effects").getBoolean("MenuSounds")){
				p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 1);
			}
			
		}
		
		return true;
		
	}
	
}
