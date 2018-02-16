package fr.Maxime3399.HolographicEffects.manager;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

import fr.Maxime3399.HolographicEffects.MainClass;
import fr.Maxime3399.HolographicEffects.custom.Hologram;

public class HologramsManager {
	
	private static ArrayList<Hologram> list = new ArrayList<>();
	public static int debug;
	
	public static ArrayList<Hologram> getHolograms(){
		
		return list;
		
	}
	
	public static Hologram createHologram(String text, Location location, int time, boolean animationText, boolean animationMoove){
		
		Hologram hologram = new Hologram("§1", location);
		list.add(hologram);
		
		time = time*2;
		setHologramDisplay(hologram, text, animationText);
		if(animationText){
			time = time+text.length()*2;
		}
		if(animationMoove){
			mooveAnimation(hologram);
			time = time+8;
		}
		
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				list.remove(hologram);
				hologram.remove();
				
			}
			
		}, time);
		
		return hologram;
		
	}
	
	public static void mooveAnimation(Hologram hologram){
		
		for(int i = 1; i <= 7; i++){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					Location location = hologram.getLocation().clone().add(0, 0.1, 0);
					hologram.setLocation(location);
					
				}
				
			}, i);
			
		}
		
	}
	
	public static boolean isHologram(ArmorStand armorstand){
		
		boolean result = false;
		
		for(Hologram hologram : list){
			
			if(hologram.getArmorStand() == armorstand){
				
				result = true;
				
			}
			
		}
		
		return result;
		
	}
	
	public static Hologram getCorrespondingHologram(ArmorStand armorstand){
		
		Hologram hologram = null;
		
		if(isHologram(armorstand)){
			
			for(Hologram holograms : list){
				
				if(holograms.getArmorStand() == armorstand){
					
					hologram = holograms;
					
				}
				
			}
			
		}
		
		return hologram;
		
	}
	
	public static void setHologramDisplay(Hologram hologram, String text, boolean animationText){
		
		int lenght = text.length()-1;
		ArrayList<String> list = new ArrayList<>();
		if(animationText){
			
			String alternative = "";
			
			for(int i = 0; i <= lenght; i++){
				
				int sec = i+1;
				int time = sec*2;
				alternative = alternative+text.charAt(0);
				list.add(alternative);
				text = text.substring(1);
				
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					
					@Override
					public void run() {
						
						hologram.setText(list.get(sec-1));
						
					}
					
				}, time);
				
			}
			
		}else{
			
			hologram.setText(text);
			
		}
		
	}

}
