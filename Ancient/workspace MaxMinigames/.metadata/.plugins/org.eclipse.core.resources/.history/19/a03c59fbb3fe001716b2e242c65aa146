package fr.Maxime3399.MaxQuake.actions;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.EntityHider;
import fr.Maxime3399.MaxQuake.custom.EntityHider.Policy;
import fr.Maxime3399.MaxQuake.custom.ParticleEffect;
import fr.Maxime3399.MaxQuake.custom.ParticleEffect.OrdinaryColor;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipCurrent;
import fr.Maxime3399.MaxQuake.equip.EquipItems;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class Laser {
	
	public static void placeParticle(Player shooter, Location loc){
		
		QuakePlayer qp = PlayersManagers.getQuakePlayer(shooter);
		
		if(EquipCurrent.getColor(qp) >= 18){
			
			ArrayList<Player> hids = new ArrayList<>();
			for(Player pls : Bukkit.getOnlinePlayers()){
				QuakePlayer qps = PlayersManagers.getQuakePlayer(pls);
				if(qps.getSettings().contains("laser")){
					if(pls.getLocation().distance(loc) < 16){
						hids.add(pls);
					}
				}
			}
			ItemStack IS = new ItemStack(EquipItems.getColorType(qp));
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName(new Random().nextInt(999999)+"");
			IS.setItemMeta(IM);
			Item i = loc.getWorld().dropItem(loc, IS);
			for(Player phs : hids){
				EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
				eh.hideEntity(phs, i);
			}
			i.setVelocity(new Vector(0, 0, 0));
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					i.remove();
					
				}
				
			}, 5);
			
		}else{
			
			if(EquipCurrent.getColor(qp) == 1){
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					QuakePlayer qps = PlayersManagers.getQuakePlayer(pls);
					if(!qps.getSettings().contains("laser")){
						ParticleEffect.FIREWORKS_SPARK.display(0, 0, 0, 0, 1, loc, pls);
					}
				}
				
			}else{
				
				int r = 0;
				int g = 0;
				int b = 0;
				int equ = EquipCurrent.getColor(qp);
				
				if(equ == 2){
					r = 255;
					g = 255;
					b = 255;
				}else if(equ == 3){
					r = 242;
					g = 171;
					b = 48;
				}else if(equ == 4){
					r = 239;
					g = 78;
					b = 231;
				}else if(equ == 5){
					r = 143;
					g = 206;
					b = 237;
				}else if(equ == 6){
					r = 238;
					g = 242;
					b = 84;
				}else if(equ == 7){
					r = 79;
					g = 242;
					b = 63;
				}else if(equ == 8){
					r = 254;
					g = 188;
					b = 255;
				}else if(equ == 9){
					r = 130;
					g = 140;
					b = 151;
				}else if(equ == 10){
					r = 221;
					g = 232;
					b = 244;
				}else if(equ == 11){
					r = 58;
					g = 236;
					b = 249;
				}else if(equ == 12){
					r = 156;
					g = 41;
					b = 136;
				}else if(equ == 13){
					r = 33;
					g = 23;
					b = 220;
				}else if(equ == 14){
					r = 101;
					g = 84;
					b = 84;
				}else if(equ == 15){
					r = 69;
					g = 121;
					b = 28;
				}else if(equ == 16){
					r = 239;
					g = 38;
					b = 38;
				}
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					QuakePlayer qps = PlayersManagers.getQuakePlayer(pls);
					if(!qps.getSettings().contains("laser")){
						ParticleEffect.REDSTONE.display(new OrdinaryColor(r, g, b), loc, pls);
						ParticleEffect.REDSTONE.display(new OrdinaryColor(r, g, b), loc, pls);
						ParticleEffect.REDSTONE.display(new OrdinaryColor(r, g, b), loc, pls);
					}
				}
				
			}
			
		}
		
	}

}
