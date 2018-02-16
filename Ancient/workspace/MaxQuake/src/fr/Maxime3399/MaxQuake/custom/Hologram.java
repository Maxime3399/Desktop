package fr.Maxime3399.MaxQuake.custom;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

import fr.Maxime3399.MaxQuake.MainClass;

public class Hologram{
	
	private String text;
	private Location location;
	private ArmorStand armorStand;
	
	public Hologram(String text, Location location){
		
		this.text = text.replaceAll("&", "§");
		this.location = location;
		
		ArmorStand armorstand = (ArmorStand) location.getWorld().spawn(location, ArmorStand.class);
		armorstand.setGravity(false);
		armorstand.setSmall(true);
		armorstand.setCustomName(text);
		armorstand.setVisible(false);
		armorstand.setBasePlate(true);
		this.armorStand = armorstand;
		Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				armorstand.setCustomNameVisible(true);
				
			}
			
		}, 1);
		
	}
	
	public void remove(){
		
		text = null;
		location = null;
		armorStand.remove();
		
	}
	
	public void setText(String text){
		
		text = text.replaceAll("&", "§");
		armorStand.setCustomName(text);
		this.text = text;
		
	}
	
	public String getText(){
		
		return text;
		
	}
	
	public void setLocation(Location location){
		
		armorStand.teleport(location);
		this.location = location;
		
	}
	
	public Location getLocation(){
		
		return location;
		
	}
	
	public void setArmorStand(ArmorStand armorstand){
		
		this.armorStand.remove();
		this.armorStand = armorstand;
		armorstand.setGravity(false);
		armorstand.setSmall(true);
		armorstand.setCustomName(text);
		armorstand.setCustomNameVisible(true);
		armorstand.setVisible(false);
		armorstand.setBasePlate(true);
		
	}
	
	public ArmorStand getArmorStand(){
		
		return armorStand;
		
	}

}
