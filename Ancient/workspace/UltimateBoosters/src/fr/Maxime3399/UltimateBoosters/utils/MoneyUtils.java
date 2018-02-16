package fr.Maxime3399.UltimateBoosters.utils;

import org.bukkit.Bukkit;

import fr.Maxime3399.UltimateBoosters.MainClass;
import fr.Maxime3399.UltimateBoosters.schedulers.MultScheduler;

public class MoneyUtils {
	
	@SuppressWarnings("deprecation")
	public static void giveMoneyToString(String name, Double money){
		
		Double count = MainClass.getEcononomy().getBalance(name);
		Double newr = count+money;
		
		if(Bukkit.getPlayer(name) != null){
			MultScheduler.list.put(Bukkit.getPlayer(name), newr);
		}
		
		MainClass.getEcononomy().depositPlayer(name, money);
		
	}

}