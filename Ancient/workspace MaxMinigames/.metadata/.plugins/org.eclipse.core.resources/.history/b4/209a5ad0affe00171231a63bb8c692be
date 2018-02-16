package fr.Maxime3399.MaxQuake.actions;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.GameState;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipCurrent;
import fr.Maxime3399.MaxQuake.managers.CoinsManager;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.scoreboards.GameScoreboard;

public class Shooter {
	
	private static int task;
	
	public static void startShootSystem(){
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
					
					if(qp.getShootDelay() != getShootDelay(qp)){
						
						qp.setShootDelay(qp.getShootDelay()+1);
						float xp = qp.getShootDelay()*100;
						xp = xp/getShootDelay(qp);
						xp = xp/100;
						pls.setExp(xp);
						
					}
					
				}
				
			}
			
		}, 1, 1);
		
	}
	
	public static void stop(){
		
		Bukkit.getScheduler().cancelTask(task);
		
	}
	
	public static void shoot(Player p, boolean bonus){
		
		if(GameState.isState(GameState.PLAYING)){
			
			int shotDelay = PlayersManagers.getQuakePlayer(p).getShootDelay();
			if(bonus){
				shotDelay = getShootDelay(PlayersManagers.getQuakePlayer(p));
			}
			
			if(shotDelay == getShootDelay(PlayersManagers.getQuakePlayer(p))){
				
				PlayersManagers.getQuakePlayer(p).setShootDelay(0);
				Location start = p.getEyeLocation();
				Vector increase = start.getDirection();
				boolean block = false;
				ArrayList<Player> kills = new ArrayList<>();
				
				p.playSound(p.getLocation(), Sound.BLAZE_HIT, 100, 2);
				p.setExp(0);
				
				for (int counter = 0; counter < 1000; counter++) {
					
					if(!block){
						
					    Location point = start.add(increase);
					    Laser.placeParticle(p, point);
					    
					    for(Player pls : Bukkit.getOnlinePlayers()){
					    	
					    	QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
					    	if(qp.getRole().equalsIgnoreCase("player")){
					    		
					    		if(pls != p && !kills.contains(pls)){
					    			
						    		Location pm = pls.getLocation().add(0, 0.5, 0);
						    		Location pm2 = pls.getLocation().add(0, 1.5, 0);
						    		
						    		if(point.distance(pm) <= 0.65 || point.distance(pm2) <= 0.65){
						    			
						    			kills.add(pls);
							    		Explode.explode(p, point);
						    			pls.playSound(pls.getLocation(), Sound.BLAZE_DEATH, 100, 2);
						    			p.playSound(p.getLocation(), Sound.BAT_DEATH, 100, 2);
						    			
						    		}
					    			
					    		}
					    		
					    	}
					    	
					    }
					    
					    if(point.getWorld().getBlockAt(point).getType() != Material.AIR){
					    	
					    	block = true;
					    	
					    }
						
					}
				    
				}
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						
					    if(kills.size() != 0){
					    	
					    	for(Player s : kills){
					    		
					    		Bukkit.broadcastMessage(p.getDisplayName()+" §ea tué "+s.getDisplayName()+"§r "+getKill(kills.size()));
					    		QuakePlayer qpV = PlayersManagers.getQuakePlayer(s);
					    		qpV.setDeath(qpV.getDeath()+1);
					    		qpV.setCurrent_death(qpV.getCurrent_death()+1);
					    		Teleporter.teleport(s);
					    		
					    	}
					    	
					    	QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
					    	qp.setKills(qp.getKills()+kills.size());
					    	qp.setCurrent_kills(qp.getCurrent_kills()+kills.size());
					    	CoinsManager.giveCoins(qp, "joueur tué", kills.size()*2);
					    	if(kills.size() > 1){
					    		CoinsManager.giveCoins(qp, getKill(kills.size()).replaceAll("§c§l", ""), getMultiKillBonus(kills.size()));
					    	}
					    	p.setLevel(p.getLevel()+kills.size());
					    	
					    	for(Player pls : Bukkit.getOnlinePlayers()){
					    		
					    		GameScoreboard.loadScoreboard(pls);
					    		
					    	}
					    	
					    	if(qp.getCurrent_kills() >= 25){
					    		
					    		Stopper.end();
					    		
					    	}
					    	
					    }
						
					}
					
				}, 1);
				
			}
			
		}
		
	}
	
	private static int getMultiKillBonus(int kills){
		
		int result = 2;
		
		if(kills == 3){
			
			result = 4;
			
		}else if(kills == 4){
			
			result = 6;
			
		}else if(kills > 4){
			
			result = 8;
			
		}
		
		return result;
		
	}
	
	private static String getKill(int kills){
		
		String result = "";
		
		if(kills == 2){
			
			result = "§c§lDOUBLE KILL";
			
		}else if(kills == 3){
			
			result = "§c§lTRIPLE KILL";
			
		}else if(kills == 4){
			
			result = "§c§lQUAD KILL";
			
		}else if(kills != 1){
			
			result = "§c§lMULTIPLE KILL";
			
		}
		
		return result;
		
	}
	
	public static int getShootDelay(QuakePlayer qp){
		
		int result = 40;
		int trigger = EquipCurrent.getTrigger(qp);
		
		if(trigger == 2){
			result = 36;
		}else if(trigger == 3){
			result = 32;
		}else if(trigger == 4){
			result = 28;
		}else if(trigger == 5){
			result = 24;
		}else if(trigger == 6){
			result = 20;
		}else if(trigger == 7){
			result = 16;
		}else if(trigger == 8){
			result = 12;
		}else if(trigger == 9){
			result = 8;
		}
		
		return result;
		
	}

}
