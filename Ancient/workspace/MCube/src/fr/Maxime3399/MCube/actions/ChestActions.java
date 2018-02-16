package fr.Maxime3399.MCube.actions;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.utils.InventoryUtils;

public class ChestActions {
	
	public static void giveRandomChest(Player p){
		
		CustomPlayer cp = new CustomPlayer(p);
		Random r = new Random();
		int chest = 1;
		
		if(r.nextInt(10) == 370){
			chest = 10;
			cp.addChests10(1);
		}else if(r.nextInt(10) == 280){
			chest = 9;
			cp.addChests9(1);
		}else if(r.nextInt(10) == 200){
			chest = 8;
			cp.addChests8(1);
		}else if(r.nextInt(10) == 150){
			chest = 7;
			cp.addChests8(1);
		}else if(r.nextInt(1) == 90){
			chest = 6;
			cp.addChests6(1);
		}else if(r.nextInt(1) == 60){
			chest = 5;
			cp.addChests5(1);
		}else if(r.nextInt(1) == 40){
			chest = 4;
			cp.addChests4(1);
		}else if(r.nextInt(1) == 20){
			chest = 3;
			cp.addChests3(1);
		}else if(r.nextInt(1) == 10){
			chest = 2;
			cp.addChests2(1);
		}else{
			cp.addChests1(1);
		}
		
		if(chest == 1){
			p.sendMessage("§aTu as trouvé un coffre §e§l"+chest+"§r§e étoile §a!");
		}else{
			p.sendMessage("§aTu as trouvé un coffre §e§l"+chest+"§r§e étoiles §a!");
		}
		p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 100, 1);
		cp.update();
		InventoryUtils.refreshInventory(p, "§8Coffres");
		
	}

}
