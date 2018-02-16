package fr.Maxime3399.MaxQuake.utils;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.PacketPlayOutNamedEntitySpawn;

public class TagUtils {
	
	public static void setTag(Player p, String tag){
		
		try{
			
			Field name = EntityHuman.class.getDeclaredField("name");
			name.setAccessible(true);
			name.set(((CraftPlayer) p).getHandle(), tag);
			
			for(Player pls : Bukkit.getOnlinePlayers()){
				
				if(p != pls){
					
					((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedEntitySpawn(((CraftPlayer) p).getHandle()));
					
				}
				
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}