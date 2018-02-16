package fr.Maxime3399.MCube.schedulers;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.custom.Particles;
import fr.Maxime3399.MCube.utils.UtilParticles;

public class CosWingsScheduler {
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					CustomPlayer cp = new CustomPlayer(pls);
					if(cp.getEnabledCosmetics().contains("firewings")){
						drawParticlesClassic(pls.getLocation(), Particles.FLAME);
					}else if(cp.getEnabledCosmetics().contains("enderwings")){
						drawParticlesClassic(pls.getLocation().add(0, -0.32, 0), Particles.PORTAL);
					}else if(cp.getEnabledCosmetics().contains("magicwings")){
						drawParticlesClassic(pls.getLocation(), Particles.VILLAGER_HAPPY);
					}else if(cp.getEnabledCosmetics().contains("enchwings")){
						drawParticlesClassic(pls.getLocation().add(0, 0.4, 0), Particles.ENCHANTMENT_TABLE);
					}else if(cp.getEnabledCosmetics().contains("angelwings")){
						Random r = new Random();
						if(r.nextInt(2) == 0){
							drawParticlesClassic(pls.getLocation(), Particles.SPELL);
						}else{
							drawParticlesClassic(pls.getLocation(), Particles.SPELL_INSTANT);
						}
					}else if(cp.getEnabledCosmetics().contains("dragwings")){
						drawParticlesNewer(pls.getLocation(), Particle.DRAGON_BREATH);
					}else if(cp.getEnabledCosmetics().contains("whitewings")){
						drawParticlesNewer(pls.getLocation(), Particle.END_ROD);
					}else if(cp.getEnabledCosmetics().contains("fwwings")){
						drawParticlesClassic(pls.getLocation().add(0, 0.34, 0), Particles.FIREWORKS_SPARK);
					}
					
				}
				
			}
			
		}, 7, 7);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			@Override
			public void run() {
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					
					CustomPlayer cp = new CustomPlayer(pls);
					if(cp.getEnabledCosmetics().contains("snowwings")){
						drawParticlesColored(pls.getLocation(), 255, 255, 255);
					}else if(cp.getEnabledCosmetics().contains("multicolorwings")){
						Random r1 = new Random();
						Random r2 = new Random();
						Random r3 = new Random();
						drawParticlesColored(pls.getLocation(), r1.nextInt(256), r2.nextInt(256), r3.nextInt(256));
					}else if(cp.getEnabledCosmetics().contains("deathwings")){
						drawParticlesClassic(pls.getLocation(), Particles.SUSPENDED_DEPTH);
					}else if(cp.getEnabledCosmetics().contains("netherwings")){
						drawParticlesColored(pls.getLocation(), 0, 0, 0);
					}else if(cp.getEnabledCosmetics().contains("smokewings")){
						drawParticlesClassic(pls.getLocation(), Particles.SMOKE_NORMAL);
					}else if(cp.getEnabledCosmetics().contains("godwings")){
						drawParticlesNewer(pls.getLocation(), Particle.CRIT_MAGIC);
					}
					
				}
				
			}
			
		}, 4, 4);
		
	}
	
	private static boolean x = true;
	private static boolean o = false;
	
	private static boolean[][] shape = {
			{ o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o },
			{ o, x, x, x, x, o, o, o, o, o, o, o, x, x, x, x, o, o },
			{ o, o, x, x, x, x, x, o, o, o, x, x, x, x, x, o, o, o },
			{ o, o, o, x, x, x, x, x, x, x, x, x, x, x, o, o, o, o },
			{ o, o, o, o, x, x, x, x, x, x, x, x, x, o, o, o, o, o },
			{ o, o, o, o, x, x, x, x, o, x, x, x, x, o, o, o, o, o },
			{ o, o, o, o, o, x, x, x, o, x, x, x, o, o, o, o, o, o },
			{ o, o, o, o, o, x, x, o, o, o, x, x, o, o, o, o, o, o },
			{ o, o, o, o, x, x, o, o, o, o, o, x, x, o, o, o, o, o }
	};
	

	private static Vector rotateAroundAxisY(Vector v, double angle) {
		double x, z, cos, sin;
		cos = Math.cos(angle);
		sin = Math.sin(angle);
		x = v.getX() * cos + v.getZ() * sin;
		z = v.getX() * -sin + v.getZ() * cos;
		return v.setX(x).setZ(z);
	}

	private static Vector getBackVector(Location loc) {
		final float newZ = (float) (loc.getZ() + (1 * Math.sin(Math.toRadians(loc.getYaw() + 90))));
		final float newX = (float) (loc.getX() + (1 * Math.cos(Math.toRadians(loc.getYaw() + 90))));
		return new Vector(newX - loc.getX(), 0, newZ - loc.getZ());
	}
	
	public static void drawParticlesNewer(Location location, Particle particles) {
		double space = 0.2;
		double defX = location.getX() - (space * shape[0].length / 2) + space;
		double x = defX;
		double y = location.clone().getY() + 2;
		double angle = -((location.getYaw() + 180) / 60);
		angle += (location.getYaw() < -180 ? 3.25 : 2.985);

		for (boolean[] aShape : shape) {
			for (boolean anAShape : aShape) {
				if (anAShape) {

					Location target = location.clone();
					target.setX(x);
					target.setY(y);

					Vector v = target.toVector().subtract(location.toVector());
					Vector v2 = getBackVector(location);
					v = rotateAroundAxisY(v, angle);
					v2.setY(0).multiply(-0.2);

					location.add(v);
					location.add(v2);
					for (int k = 0; k < 3; k++)
						location.getWorld().spawnParticle(particles, location, 0, 0, 0, 0, 1);
					location.subtract(v2);
					location.subtract(v);
				}
				x += space;
			}
			y -= space;
			x = defX;
		}
	}
	
	public static void drawParticlesClassic(Location location, Particles particles) {
		double space = 0.2;
		double defX = location.getX() - (space * shape[0].length / 2) + space;
		double x = defX;
		double y = location.clone().getY() + 2;
		double angle = -((location.getYaw() + 180) / 60);
		angle += (location.getYaw() < -180 ? 3.25 : 2.985);

		for (boolean[] aShape : shape) {
			for (boolean anAShape : aShape) {
				if (anAShape) {

					Location target = location.clone();
					target.setX(x);
					target.setY(y);

					Vector v = target.toVector().subtract(location.toVector());
					Vector v2 = getBackVector(location);
					v = rotateAroundAxisY(v, angle);
					v2.setY(0).multiply(-0.2);

					location.add(v);
					location.add(v2);
					for (int k = 0; k < 3; k++)
						UtilParticles.display(particles, location);
					location.subtract(v2);
					location.subtract(v);
				}
				x += space;
			}
			y -= space;
			x = defX;
		}
	}
	
	public static void drawParticlesColored(Location location, int c1, int c2, int c3) {
		double space = 0.2;
		double defX = location.getX() - (space * shape[0].length / 2) + space;
		double x = defX;
		double y = location.clone().getY() + 2;
		double angle = -((location.getYaw() + 180) / 60);
		angle += (location.getYaw() < -180 ? 3.25 : 2.985);

		for (boolean[] aShape : shape) {
			for (boolean anAShape : aShape) {
				if (anAShape) {

					Location target = location.clone();
					target.setX(x);
					target.setY(y);

					Vector v = target.toVector().subtract(location.toVector());
					Vector v2 = getBackVector(location);
					v = rotateAroundAxisY(v, angle);
					v2.setY(0).multiply(-0.2);

					location.add(v);
					location.add(v2);
					for (int k = 0; k < 3; k++)
						UtilParticles.display(c1, c2, c3, location);
					location.subtract(v2);
					location.subtract(v);
				}
				x += space;
			}
			y -= space;
			x = defX;
		}
	}

}
