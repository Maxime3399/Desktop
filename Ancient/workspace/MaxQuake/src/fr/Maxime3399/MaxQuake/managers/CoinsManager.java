package fr.Maxime3399.MaxQuake.managers;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class CoinsManager {
	
	public static int booster = 1;
	
	public static void giveCoins(QuakePlayer qp, String reson, int coins){
		
		coins = coins*booster;
		
		qp.setWin_coins(qp.getWin_coins()+coins);
		qp.setCoins(qp.getCoins()+coins);
		
		qp.getPlayer().sendMessage("§6+ "+coins+" coins ( "+reson+" )");
		
	}

}
