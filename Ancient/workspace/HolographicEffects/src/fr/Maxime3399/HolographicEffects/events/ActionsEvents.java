package fr.Maxime3399.HolographicEffects.events;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Animals;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import fr.Maxime3399.HolographicEffects.MainClass;
import fr.Maxime3399.HolographicEffects.manager.HologramsManager;
import fr.Maxime3399.HolographicEffects.utils.ConfigUtils;

public class ActionsEvents implements Listener {
	
	public static ArrayList<Player> join = new ArrayList<>();
	public static HashMap<Player, Integer> food = new HashMap<>();
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent e){
		
		if(ConfigUtils.isEnable("Health")){
			
			if(e.getEntity().getType() == EntityType.PLAYER){
				
				Player player = (Player) e.getEntity();
				
				double health = player.getHealth()-e.getDamage();
				String maxhealth = player.getMaxHealth()+"";
				String healthString = health+"";
				healthString = healthString.charAt(0)+healthString.charAt(1)+healthString.charAt(2)+"";
				String display = ConfigUtils.getDisplay("Health").replaceAll("%health%", healthString).replaceAll("%maxhealth%", maxhealth);
				boolean animationText = ConfigUtils.animationTextEnable("Health");
				boolean animationMoove = ConfigUtils.animationMooveEnable("Health");
				int time = ConfigUtils.getTime("Health");
				Location location = player.getLocation().add(0, 1.53, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
		if(ConfigUtils.isEnable("Damages")){
			
			if(e.getEntity() instanceof Animals || e.getEntity() instanceof Monster || e.getEntity() instanceof Player){
				
				double damages = e.getDamage();
				String display = ConfigUtils.getDisplay("Damages").replaceAll("%damages%", damages+"");
				boolean animationText = ConfigUtils.animationTextEnable("Damages");
				boolean animationMoove = ConfigUtils.animationMooveEnable("Damages");
				int time = ConfigUtils.getTime("Damages");
				Location location = e.getEntity().getLocation().add(0, 1.53, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onEtityExplode(EntityExplodeEvent e){
		
		if(ConfigUtils.isEnable("Creeper")){
			
			if(e.getEntity().getType() == EntityType.CREEPER){
				
				String display = ConfigUtils.getDisplay("Creeper");
				boolean animationText = ConfigUtils.animationTextEnable("Creeper");
				boolean animationMoove = ConfigUtils.animationMooveEnable("Creeper");
				int time = ConfigUtils.getTime("Creeper");
				Location location = e.getEntity().getLocation().add(0, 1.1, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
		if(ConfigUtils.isEnable("Tnt")){
			
			if(e.getEntity().getType() == EntityType.PRIMED_TNT){
				
				String display = ConfigUtils.getDisplay("Tnt");
				boolean animationText = ConfigUtils.animationTextEnable("Tnt");
				boolean animationMoove = ConfigUtils.animationMooveEnable("Tnt");
				int time = ConfigUtils.getTime("Tnt");
				Location location = e.getEntity().getLocation().add(0, 0.41, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e){
		
		if(ConfigUtils.isEnable("Death")){
			
			if(e.getEntity().getType() == EntityType.PLAYER){
				
				String display = ConfigUtils.getDisplay("Death").replaceAll("%player%", ((Player) e.getEntity()).getDisplayName());
				boolean animationText = ConfigUtils.animationTextEnable("Death");
				boolean animationMoove = ConfigUtils.animationMooveEnable("Death");
				int time = ConfigUtils.getTime("Death");
				Location location = e.getEntity().getLocation().add(0, 1.53, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onPlayerTeleport(PlayerTeleportEvent e){
		
		if(ConfigUtils.isEnable("Teleport")){
			
			if(e.getFrom() != e.getTo()){
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						
						if(join.contains(e.getPlayer())){
							
							join.remove(e.getPlayer());
							
						}else{
							
							String display = ConfigUtils.getDisplay("Teleport");
							boolean animationText = ConfigUtils.animationTextEnable("Teleport");
							boolean animationMoove = ConfigUtils.animationMooveEnable("Teleport");
							int time = ConfigUtils.getTime("Teleport");
							Location location = e.getPlayer().getLocation().add(0, 1.53, 0);
							
							HologramsManager.createHologram(display, location, time, animationText, animationMoove);
							
						}
						
					}
					
				}, 1);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onPlayerGetExp(PlayerExpChangeEvent e){
		
		if(ConfigUtils.isEnable("Exp")){
			
			String display = ConfigUtils.getDisplay("Exp").replaceAll("%exp%", e.getAmount()+"");
			boolean animationText = ConfigUtils.animationTextEnable("Exp");
			boolean animationMoove = ConfigUtils.animationMooveEnable("Exp");
			int time = ConfigUtils.getTime("Exp");
			Location location = e.getPlayer().getLocation().add(0, 1.53, 0);
			
			HologramsManager.createHologram(display, location, time, animationText, animationMoove);
			
		}
		
	}
	
	@EventHandler
	public void onPlayerLevelChange(PlayerLevelChangeEvent e){
		
		if(ConfigUtils.isEnable("LevelUp")){
			
			if(e.getNewLevel() > e.getOldLevel()){
				
				String display = ConfigUtils.getDisplay("LevelUp");
				boolean animationText = ConfigUtils.animationTextEnable("LevelUp");
				boolean animationMoove = ConfigUtils.animationMooveEnable("LevelUp");
				int time = ConfigUtils.getTime("LevelUp");
				Location location = e.getPlayer().getLocation().add(0, 1.53, 0);
				
				HologramsManager.createHologram(display, location, time, animationText, animationMoove);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		
		food.put(e.getPlayer(), e.getPlayer().getFoodLevel());
		
		if(ConfigUtils.isEnable("Eat")){
			join.add(e.getPlayer());
		}
		
		if(ConfigUtils.isEnable("Join")){
			
			String display = ConfigUtils.getDisplay("Join");
			boolean animationText = ConfigUtils.animationTextEnable("Join");
			boolean animationMoove = ConfigUtils.animationMooveEnable("Join");
			int time = ConfigUtils.getTime("Join");
			Location location = e.getPlayer().getLocation().add(0, 1.53, 0);
			
			HologramsManager.createHologram(display, location, time, animationText, animationMoove);
			
		}
		
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e){
		
		if(ConfigUtils.isEnable("Quit")){
			
			String display = ConfigUtils.getDisplay("Quit");
			boolean animationText = ConfigUtils.animationTextEnable("Quit");
			boolean animationMoove = ConfigUtils.animationMooveEnable("Quit");
			int time = ConfigUtils.getTime("Quit");
			Location location = e.getPlayer().getLocation().add(0, 1.53, 0);
			
			HologramsManager.createHologram(display, location, time, animationText, animationMoove);
			
		}
		
	}
	
	@EventHandler
	public void onPlayerEat(FoodLevelChangeEvent e){
		
		if(ConfigUtils.isEnable("Eat")){
			
			if(e.getEntity().getType() == EntityType.PLAYER){
				
				Player p = (Player) e.getEntity();
				
				if(food.containsKey(p)){
					
					if(food.get(p) < e.getFoodLevel()){
						
						int food2 = e.getFoodLevel()-food.get(p);
						String display = ConfigUtils.getDisplay("Eat").replaceAll("%food%", food2+"");
						boolean animationText = ConfigUtils.animationTextEnable("Eat");
						boolean animationMoove = ConfigUtils.animationMooveEnable("Eat");
						int time = ConfigUtils.getTime("Eat");
						Location location = e.getEntity().getLocation().add(0, 1.53, 0);
						
						HologramsManager.createHologram(display, location, time, animationText, animationMoove);
						
					}
					
				}
				
				food.put(p, e.getFoodLevel());
				
			}
			
		}
		
	}

}
