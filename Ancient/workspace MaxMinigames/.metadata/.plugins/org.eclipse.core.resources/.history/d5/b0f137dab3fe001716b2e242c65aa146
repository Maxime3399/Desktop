package fr.Maxime3399.MaxQuake.actions;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class Explode {
	
	public static void explode(Player shooter, Location loc){
		
		Firework f = loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta fm = f.getFireworkMeta();
		FireworkEffect fr;
		
		QuakePlayer qp = PlayersManagers.getQuakePlayer(shooter);
		
		if(qp.getEnable().contains("explode01")){
			fr = FireworkEffect.builder().flicker(false).trail(false).with(Type.BALL).withColor(Color.fromBGR(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))).build();
		}else if(qp.getEnable().contains("explode02")){
			fr = FireworkEffect.builder().flicker(false).trail(false).with(Type.BURST).withColor(Color.fromBGR(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))).build();
		}else if(qp.getEnable().contains("explode03")){
			fr = FireworkEffect.builder().flicker(false).trail(false).with(Type.BALL_LARGE).withColor(Color.fromBGR(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))).build();
		}else if(qp.getEnable().contains("explode04")){
			fr = FireworkEffect.builder().flicker(false).trail(false).with(Type.CREEPER).withColor(Color.fromBGR(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))).build();
		}else{
			fr = FireworkEffect.builder().flicker(false).trail(false).with(Type.STAR).withColor(Color.fromBGR(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256))).build();
		}
		
		fm.addEffect(fr);
		fm.setPower(0);
		f.setFireworkMeta(fm);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				f.detonate();
				
			}
			
		}, 1);
		
	}

}
