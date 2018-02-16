package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.actions.Shooter;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.BoostersManager;
import fr.Maxime3399.MaxQuake.managers.CoinsManager;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class PickupBooster implements Listener {
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e){
		
		Player p = e.getPlayer();
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		if(e.getItem().getItemStack().getType() == Material.POTION){
			
			BoostersManager.remove(e.getItem());
			
			if(qp.isActiveSpeedBooster()){
				
				p.sendMessage("§cBonus de vitesse déjà actif !");
				p.playSound(p.getLocation(), Sound.ARROW_HIT, 100, 1);
				CoinsManager.giveCoins(qp, "double bonus", 3);
				
			}else{
				
				qp.setActiveSpeedBooster(true);
				p.setWalkSpeed((float) 0.35);
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 1);
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					@Override
					public void run() {
						p.setWalkSpeed((float) 0.288);
						qp.setActiveSpeedBooster(false);
					}
				}, 400);
				
				qp.setCurrent_booster_speed(qp.getCurrent_booster_speed()+1);
				qp.setBooster_speed(qp.getBooster_speed()+1);
				CoinsManager.giveCoins(qp, "bonus de vitesse", 1);
				
			}
			
		}else if(e.getItem().getItemStack().getType() == Material.FIREWORK){
			
			BoostersManager.remove(e.getItem());
			
			if(qp.isActiveShootBooster()){
				
				p.sendMessage("§cBonus de tir déjà actif !");
				p.playSound(p.getLocation(), Sound.ARROW_HIT, 100, 1);
				CoinsManager.giveCoins(qp, "double bonus", 3);
				
			}else{
				
				qp.setActiveShootBooster(true);
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 1);
				for(int i = 0; i <= 30; i++){
					
					Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							
							Shooter.shoot(p, true);
							
						}
						
					}, i*5+1);
					
					if(i == 30){
						
						Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
							
							@Override
							public void run() {
								
								qp.setActiveShootBooster(false);
								
							}
							
						}, 151);
						
					}
					
				}
				
				qp.setCurrent_booster_shoot(qp.getCurrent_booster_shoot()+1);
				qp.setBooster_shoot(qp.getBooster_shoot()+1);
				CoinsManager.giveCoins(qp, "bonus de tir", 2);
				
			}
			
		}
		
		e.setCancelled(true);
		
	}

}
