package fr.Maxime3399.ShinobiUtil.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import fr.Maxime3399.ShinobiUtil.MainClass;
import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;
import fr.Maxime3399.ShinobiUtil.managers.LifeManager;
import fr.Maxime3399.ShinobiUtil.scoreboards.MainScoreboard;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand.EnumClientCommand;

public class DeathEvents implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		
		if(e.getEntity().getType() == EntityType.PLAYER){
			
			Player p = (Player) e.getEntity();
			
			if(e.getDamage() >= p.getHealth()){
				
				int lifes = LifeManager.list.get(p);
				Arena arena = null;
				for(Arena a : ArenasManager.list){
					if(a.isIn(p)){
						arena = a;
					}
				}
				
				if(lifes == 1){
					
					p.setGameMode(GameMode.SPECTATOR);
					for(Player pls : arena.getPlayers()){
						MainScoreboard.load(pls);
						pls.sendMessage("§e"+p.getName()+" §cest mort !");
						pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_DEATH, 100, 1);
					}
					
				}else{
					
					lifes--;
					LifeManager.list.put(p, lifes);
					for(Player pls : arena.getPlayers()){
						MainScoreboard.load(pls);
						pls.sendMessage("§e"+p.getName()+" §cest mort ( "+lifes+" vies restantes ) !");
						pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_DEATH, 100, 2);
					}
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onDeath(PlayerDeathEvent e){
		
		Player p = e.getEntity();
		e.setKeepInventory(true);
		e.setKeepLevel(true);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				((CraftPlayer) p).getHandle().playerConnection.a(new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN));
				
			}
			
		}, 2);
		
	}
	
	@EventHandler
	public void onENDeath(EntityDeathEvent e){
		
		e.setDroppedExp(0);
		
	}

}
