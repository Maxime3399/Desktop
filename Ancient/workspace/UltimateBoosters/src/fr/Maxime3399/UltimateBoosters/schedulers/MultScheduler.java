package fr.Maxime3399.UltimateBoosters.schedulers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.UltimateBoosters.API;
import fr.Maxime3399.UltimateBoosters.MainClass;

public class MultScheduler {
	
	public static HashMap<Player, Double> list = new HashMap<>();
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("UltimateBoosters"), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				if(API.isGlobalBooster()){
					
					for(Player pls : Bukkit.getOnlinePlayers()){
						
						if(list.containsKey(pls)){
							
							double money = list.get(pls);
							double newmoney = MainClass.getEcononomy().getBalance(pls);
							
							if(money != newmoney){
								
								if(newmoney > money){
									
									double change = newmoney-money;
									String booster = API.getGlobalBoosters().get(0);
									int multiplier = API.getGlobalBoosterMultiplier(booster)-1;
									double coins = change*multiplier;
									MainClass.getEcononomy().depositPlayer(pls.getName(), coins);
									if(API.getGlobalBoostersTips().contains(pls.getName())){
										pls.sendMessage("§6§l[§r§cBooster§r§6§l] §r§aYou got §l"+coins+"§r §a"+MainClass.getEcononomy().currencyNamePlural()+"§a in bonus with the §3§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§3's §r§b§lx"+API.getGlobalBoosterMultiplier(booster)+"§r §3network booster§a !");
									}else{
										pls.sendMessage("§6§l[§r§cBooster§r§6§l] §r§aYou got §l"+coins+"§r §a"+MainClass.getEcononomy().currencyNamePlural()+"§a in bonus with the §3§l"+API.getGlobalBoosterInfo(booster, "name")+"§r§3's §r§b§lx"+API.getGlobalBoosterMultiplier(booster)+"§r §3network booster§a, use §e§l/tip §r§ato thank him !");
									}
									pls.playSound(pls.getLocation(), Sound.ORB_PICKUP, 100, 1);
									list.put(pls, MainClass.getEcononomy().getBalance(pls.getName()));
									
								}
								
							}
							
						}
						
					}
					
				}
				
				if(API.getPersonalBoosters().size() != 0){
					
					for(String booster : API.getPersonalBoosters()){
						
						for(Player pls : Bukkit.getOnlinePlayers()){
							
							if(pls.getUniqueId().toString().equalsIgnoreCase(booster)){
								
								if(list.containsValue(pls)){
									
									double money = list.get(pls);
									double newmoney = MainClass.getEcononomy().getBalance(pls);
									
									if(money != newmoney){
										
										if(newmoney > money){
											
											double change = newmoney-money;
											int multiplier = API.getPersonalBoosterMultiplier(booster)-1;
											double coins = change*multiplier;
											MainClass.getEcononomy().depositPlayer(pls.getName(), coins);
											pls.sendMessage("§6§l[§r§cBooster§r§6§l] §r§aYou got §l"+coins+"§r §a"+MainClass.getEcononomy().currencyNamePlural()+"§a in bonus with your booster !");
											pls.playSound(pls.getLocation(), Sound.ORB_PICKUP, 100, 1);
											list.put(pls, MainClass.getEcononomy().getBalance(pls.getName()));
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
	}

}
