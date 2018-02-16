package fr.Maxime3399.ShinobiLobby.managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiLobby.MainClass;
import fr.Maxime3399.ShinobiLobby.custom.EntityHider;
import fr.Maxime3399.ShinobiLobby.custom.EntityHider.Policy;
import fr.Maxime3399.ShinobiLobby.utils.DataUtils;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

public class NPCManager {
	
	public static void setVisibility(Player p){
		
		int lvl = DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "lvl");
		
		if(lvl < 1){
			
			for(Entity es : Bukkit.getWorld("world").getEntities()){
				
				if(CitizensAPI.getNPCRegistry().isNPC(es)){
					
					NPC npc = CitizensAPI.getNPCRegistry().getNPC(es);
					if(npc.getName().equalsIgnoreCase("vs")){
						
						EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
						eh.hideEntity(p, es);
						
					}
					
				}
				
			}
			
		}
		
		if(lvl < 10){
			
			for(Entity es : Bukkit.getWorld("world").getEntities()){
				
				if(CitizensAPI.getNPCRegistry().isNPC(es)){
					
					NPC npc = CitizensAPI.getNPCRegistry().getNPC(es);
					if(npc.getName().equalsIgnoreCase("ranked")){
						
						EntityHider eh = new EntityHider(MainClass.getInstance(), Policy.BLACKLIST);
						eh.hideEntity(p, es);
						
					}
					
				}
				
			}
			
		}
		
	}

}
