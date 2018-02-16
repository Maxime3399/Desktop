package fr.Maxime3399.UltimateBoosters.events;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Maxime3399.UltimateBoosters.API;
import fr.Maxime3399.UltimateBoosters.MainClass;
import fr.Maxime3399.UltimateBoosters.schedulers.MultScheduler;

public class PlayerJoin implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		
		API.registerPlayer(p);
		
		if(API.isGlobalBooster()){
			
			String booster = API.getGlobalBoosters().get(0);
			String name = API.getGlobalBoosterInfo(booster, "name");
			
			if(booster.equalsIgnoreCase(p.getUniqueId().toString())){
				
				if(!p.getName().equalsIgnoreCase(name)){
					
					API.setGlobalBoosterInfo(booster, "name", p.getName());
					
				}
				
				int players = API.getGlobalBoostersTips().size();
				
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("SendMessages").getBoolean("TipsRecap")){
					
					if(players != 0){
						
						double total = players*Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterOwner").getDouble("Money");
						
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§eYou won §l"+total+" "+MainClass.getEcononomy().currencyNamePlural()+"§r §ewith your network booster ( §l"+players+"§r§e players ) !");
						if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("TipJoinMessageSound")){
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
						}
						
					}
					
				}
				
			}else{
				
				int players = API.getPlayerGlobalTips(p);
				
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("SendMessages").getBoolean("TipsRecap")){
					
					if(players != 0){
						
						double total = players*Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterOwner").getDouble("Money");
						
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§eYou won §l"+total+" "+MainClass.getEcononomy().currencyNamePlural()+"§r §ewith your network booster ( §l"+players+"§r§e players ) !");
						if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("TipJoinMessageSound")){
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
						}
						
					}
					
				}
				
				if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("SendMessages").getBoolean("CurrentBooster")){
					if(API.getGlobalBoostersTips().contains(p)){
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§3§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§3's §b§lx"+API.getGlobalBoosterMultiplier(booster)+"§r§3 network booster is active !");
					}else{
						p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§3§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§3's §b§lx"+API.getGlobalBoosterMultiplier(booster)+"§r§3 network booster is active, use §e§l/tip§r§3 to thank him !");
					}
				}
				
			}
			
			MultScheduler.list.put(p, MainClass.getEcononomy().getBalance(p.getName()));
			
		}else{
			
			int players = API.getPlayerGlobalTips(p);
			
			if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("SendMessages").getBoolean("TipsRecap")){
				
				if(players != 0){
					
					double total = players*Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("TipRewards").getConfigurationSection("BoosterOwner").getDouble("Money");
					
					p.sendMessage("§6§l[§r§cBooster§r§6§l] §r§eYou won §l"+total+" "+MainClass.getEcononomy().currencyNamePlural()+"§r §ewith your network booster ( §l"+players+"§r§e players ) !");
					if(Bukkit.getPluginManager().getPlugin("UltimateBoosters").getConfig().getConfigurationSection("Effects").getBoolean("TipJoinMessageSound")){
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
					}
					
				}
				
			}
			
		}
		
	}

}
