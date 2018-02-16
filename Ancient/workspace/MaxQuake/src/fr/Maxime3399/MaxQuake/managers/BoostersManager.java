package fr.Maxime3399.MaxQuake.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.Hologram;
import fr.Maxime3399.MaxQuake.custom.ParticleEffect;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class BoostersManager {
	
	private static int task;
	private static int stask;
	
	private static HashMap<Item, Hologram> holo = new HashMap<>();
	
	public static void remove(Item i){
		
		holo.get(i).remove();
		holo.remove(i);
		i.remove();
		
	}
	
	public static void start(){
		
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				ArrayList<Player> list = new ArrayList<>();
				for(Player pls : Bukkit.getOnlinePlayers()){
					QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
					if(qp.getRole().equalsIgnoreCase("player")){
						list.add(pls);
					}
				}
				
				Random r = new Random();
				int ri = r.nextInt(list.size()+1)-1;
				if(ri == -1){
					ri = 0;
				}
				Player rp = list.get(ri);
				Location loc = rp.getLocation().clone();
				loc.setY(256);
				
				Random r2 = new Random();
				int ri2 = r2.nextInt(3);
				
				if(ri2 == 0){
					
					Hologram h = new Hologram("§e§lBONUS§r §6TIR", loc);
					ItemStack IS = new ItemStack(Material.FIREWORK);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					Random r3 = new Random();
					AL.add(""+r3.nextInt(999999));
					IM.setLore(AL);
					IS.setItemMeta(IM);
					Item it = loc.getWorld().dropItem(loc, IS);
					holo.put(it, h);
					
				}else{
					
					Hologram h = new Hologram("§e§lBONUS§r §6VITESSE", loc);
					ItemStack IS = new ItemStack(Material.POTION);
					ItemMeta IM = IS.getItemMeta();
					ArrayList<String> AL = new ArrayList<>();
					Random r3 = new Random();
					AL.add(""+r3.nextInt(999999));
					IM.setLore(AL);
					IS.setItemMeta(IM);
					Item it = loc.getWorld().dropItem(loc, IS);
					holo.put(it, h);
					
				}
				
			}
			
		}, 600, 600);
		
		stask = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Item i : holo.keySet()){
					
					holo.get(i).getArmorStand().teleport(i.getLocation());
					for(Player pls : Bukkit.getOnlinePlayers()){
						ParticleEffect.FIREWORKS_SPARK.display(0, 0, 0, 0, 1, i.getLocation(), pls);
					}
					
				}
				
			}
			
		}, 1, 1);
		
	}
	
	public static void stop(){
		
		Bukkit.getScheduler().cancelTask(task);
		Bukkit.getScheduler().cancelTask(stask);
		
	}

}
