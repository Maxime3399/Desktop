package fr.Maxime3399.ShinobiTutorial.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class SuperEvents implements Listener {
	
	@EventHandler
	public void onDeath(EntityDeathEvent e){
		
		Entity en = e.getEntity();
		
		if(en.getType() == EntityType.ZOMBIE){
			
			if(en.getCustomName().equalsIgnoreCase("tuto")){
				
				Location loc = en.getLocation().add(0, 5, 0);
				Entity ens = Bukkit.getWorld("world").spawn(loc, Zombie.class);
				ens.setCustomName("tuto");
				en.setCustomNameVisible(false);
				Zombie z = (Zombie) ens;
				z.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				for(ItemStack i : e.getDrops()){
					i.setType(Material.AIR);
				}
				
			}
			
		}
		
	}

}
