package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import fr.Maxime3399.MCube.custom.CustomPlayer;

public class EventsEvents implements Listener {
	
	@EventHandler
	public void onBreakBlock(BlockBreakEvent e){
		
		Player p = e.getPlayer();
		CustomPlayer cp = new CustomPlayer(p);
		
		if(e.getBlock().getType().equals(Material.LOG) || e.getBlock().getType().equals(Material.LOG_2)){
			
			if(cp.getQuest() == 1){
				
				cp.addQuestCounter1(1);
				cp.update();
				
			}
			
		}else if(e.getBlock().getType() == Material.STONE){
			
			if(cp.getQuest() == 2){
				
				cp.addQuestCounter1(1);
				cp.update();
				
			}
			
		}else if(e.getBlock().getType() == Material.COAL_ORE){
			
			if(cp.getQuest() == 3){
				
				cp.addQuestCounter1(1);
				cp.update();
				
			}
			
		}
		
	}

}
