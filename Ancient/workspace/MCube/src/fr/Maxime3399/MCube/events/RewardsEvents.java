package fr.Maxime3399.MCube.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.Maxime3399.MCube.actions.RewardsActions;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.custom.GameEvent;

public class RewardsEvents implements Listener {
	
	@EventHandler
	public void onXPpickup(PlayerExpChangeEvent e){
		
		Player p = e.getPlayer();
		CustomPlayer cp = new CustomPlayer(p);
		int exp = e.getAmount();
		if(cp.getRank().equalsIgnoreCase("vip")){
			exp = exp*2;
		}else if(cp.getRank().equalsIgnoreCase("vip+")){
			exp = exp*3;
		}else if(cp.getRank().equalsIgnoreCase("ultravip")){
			exp = exp*4;
		}else if(cp.getRank().equalsIgnoreCase("ultravip+")){
			exp = exp*5;
		}
		
		e.setAmount(exp);
		
	}
	
	@EventHandler
	public void onMobDeath(EntityDeathEvent e){
		
		if(GameEvent.isEvent(GameEvent.MOBMONEY)){
			if(e.getEntity() == null){
				return;
			}else if(e.getEntity().getType() != EntityType.PLAYER && e.getEntity().getType() != EntityType.CREEPER){
				
				if(e.getEntity().getKiller() == null){
					
					return;
					
				}else if(e.getEntity().getKiller().getType() == EntityType.PLAYER){
					
					Player p = e.getEntity().getKiller();
					RewardsActions.giveCoins(p, 1);
					
				}
				
			}
		}else if(GameEvent.isEvent(GameEvent.MOBTROPHIES)){
			if(e.getEntity() == null){
				return;
			}else if(e.getEntity().getType() != EntityType.PLAYER && e.getEntity().getType() != EntityType.CREEPER){
				
				if(e.getEntity().getKiller() == null){
					
					return;
					
				}else if(e.getEntity().getKiller().getType() == EntityType.PLAYER){
					
					Player p = e.getEntity().getKiller();
					RewardsActions.giveTrophies(p, 1);
					
				}
				
			}
		}
		
	}
	
	private static HashMap<String, ArrayList<Chunk>> exploredChunks = new HashMap<>();
	@EventHandler
	public void onMove(PlayerMoveEvent e){
		
		if(GameEvent.isEvent(GameEvent.EXPLOREMONEY)){
			
			Player p = e.getPlayer();
			Chunk c = p.getLocation().getChunk();
			
			if(!exploredChunks.containsKey(p.getName())){
				ArrayList<Chunk> list = new ArrayList<>();
				exploredChunks.put(p.getName(), list);
			}
			
			ArrayList<Chunk> list = exploredChunks.get(p.getName());
			if(!list.contains(c)){
				list.add(c);
				exploredChunks.put(p.getName(), list);
				Random r = new Random();
				if(r.nextInt(3) == 0){
					RewardsActions.giveCoins(p, 1);
				}
			}
			
		}else if(GameEvent.isEvent(GameEvent.EXPLORETROPHIES)){
			
			Player p = e.getPlayer();
			Chunk c = p.getLocation().getChunk();
			
			if(!exploredChunks.containsKey(p.getName())){
				ArrayList<Chunk> list = new ArrayList<>();
				exploredChunks.put(p.getName(), list);
			}
			
			ArrayList<Chunk> list = exploredChunks.get(p.getName());
			if(!list.contains(c)){
				list.add(c);
				exploredChunks.put(p.getName(), list);
				Random r = new Random();
				if(r.nextInt(3) == 0){
					RewardsActions.giveTrophies(p, 1);
				}
			}
			
		}
		
	}
	public static void StopExploreEvent(){
		exploredChunks.clear();
	}

}
