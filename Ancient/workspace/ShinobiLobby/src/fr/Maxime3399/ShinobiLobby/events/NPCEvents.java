package fr.Maxime3399.ShinobiLobby.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import fr.Maxime3399.ShinobiLobby.actions.JoinAction;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

public class NPCEvents implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractAtEntityEvent e){
		
		Player p = e.getPlayer();
		
		if(e.getRightClicked() == null){
			
			return;
			
		}else{
			
			if(CitizensAPI.getNPCRegistry().isNPC(e.getRightClicked())){
				
				NPC npc = CitizensAPI.getNPCRegistry().getNPC(e.getRightClicked());
				
				if(npc.getFullName().equalsIgnoreCase("tutorial")){
					
					JoinAction.joinTutorial(p);
					
				}else if(npc.getFullName().equalsIgnoreCase("vs")){
					
					JoinAction.joinVs(p);
					
				}else if(npc.getFullName().equalsIgnoreCase("ranked")){
					
					JoinAction.joinRanked(p);
					
				}
				
			}
			
		}
		
	}

}
