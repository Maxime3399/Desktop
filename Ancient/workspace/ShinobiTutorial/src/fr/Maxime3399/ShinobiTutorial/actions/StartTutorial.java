package fr.Maxime3399.ShinobiTutorial.actions;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

import fr.Maxime3399.ShinobiTutorial.MainClass;
import fr.Maxime3399.ShinobiTutorial.menus.TypeMenu;
import fr.Maxime3399.ShinobiTutorial.utils.DataUtils;
import fr.Maxime3399.ShinobiUtil.actions.EquipAction;
import fr.Maxime3399.ShinobiUtil.custom.Arena;
import fr.Maxime3399.ShinobiUtil.managers.ArenasManager;

public class StartTutorial {
	
	public static void part2(Player p){
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aLors d'un combat le but est de vaincre ton adversaire.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 40);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aPour cela vous disposez tous les deux de points de vies et de capacitées.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 130);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aIl est possible d'utiliser les différentes capacitées en faisant clique droit sur l'item qui correspond a celle que tu souhaites utiliser.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 240);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aPar défaut, tu as 2 capacités ( une arme et une technique ninja ).");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 350);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aIl est possible de débloquer d'autres capacitées, et d'en utiliser jusqu'a 9 différentes durant un combat.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 460);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aLe menu accessible lorsque tu es dans le lobby permet d'obtenir ou d'acheter de nouvelles capacitées.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 570);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§aCependant, celui-ci permet aussi d'équiper les différentes techniques que vous possèdez.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 680);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				p.sendMessage(" ");
				p.sendMessage("§ePour vous entrainer, essayez de tuer le zombie avec vos capacitées.");
				p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
				
			}
			
		}, 760);
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				EquipAction.equip(p);
				p.setWalkSpeed((float) 0.2);
				Arena a = null;
				for(Arena arena : ArenasManager.list){
					
					if(arena.isIn(p)){
						
						a = arena;
						
					}
					
				}
				Block b = Bukkit.getWorld("world").getBlockAt(a.getSpawn1().add(0, 2, 0));
				b.setType(Material.AIR);
				
				Entity en = Bukkit.getWorld("world").spawn(a.getSpawn2(), Zombie.class);
				en.setCustomName("tuto");
				en.setCustomNameVisible(false);
				Zombie z = (Zombie) en;
				z.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				
			}
			
		}, 790);
		
	}
	
	public static void start(Player p){
		
		
		Arena a = null;
		for(Arena arena : ArenasManager.list){
			
			if(arena.isIn(p)){
				
				a = arena;
				
			}
			
		}
		
		p.setWalkSpeed(0);
		Block b = Bukkit.getWorld("world").getBlockAt(p.getLocation().add(0, 2, 0));
		a.addBlock(b);
		b.setType(Material.BARRIER);
		
		if(DataUtils.getIntPlayerInfo(p.getUniqueId().toString(), "lvl") == -1){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					p.sendMessage("§aBienvenue dans ce tutoriel !");
					p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
					
				}
				
			}, 40);
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					p.sendMessage("§aPour commencer, §echoisis le type de ton chakra§a.");
					p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 100, 2);
					
				}
				
			}, 70);
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					TypeMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 100, 1);
					
				}
				
			}, 90);
			
		}else{
			
			part2(p);
			
		}
		
	}

}
