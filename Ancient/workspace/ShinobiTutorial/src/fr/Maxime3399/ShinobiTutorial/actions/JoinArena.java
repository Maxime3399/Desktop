package fr.Maxime3399.ShinobiTutorial.actions;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import fr.Maxime3399.ShinobiTutorial.MainClass;
import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;

public class JoinArena {
	
	public static void join(Player p){
		
		Arena a1 = ArenasManager.list.get(0);
		
		if(a1.getCount() < 1){
			
			p.teleport(a1.getSpawn1());
			a1.addPlayer(p);
			
		}else{
			
			p.sendMessage("§cUne erreur est survenue ! Vous allez êtres de nouveau téléporté au lobby.");
			p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_AMBIENT, 100, 1);
			p.teleport(p.getLocation().clone().add(0, 300, 0));
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					MainClass.teleportToServer(p, "Lobby1");
					
				}
				
			}, 60);
			
		}
		
	}

}
