package fr.Maxime3399.MCube.schedulers;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.custom.Particles;
import fr.Maxime3399.MCube.utils.UtilParticles;

public class CosHatsScheduler {
	
	private static double ts = 0;
	private static double r = 0.48;
	
	public static void start(){
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			
			double t = ts;
			
			@Override
			public void run() {
				
				t = t+Math.PI/8;
				ts = t;
				
				for(Player pls : Bukkit.getOnlinePlayers()){
					CustomPlayer cp = new CustomPlayer(pls);
					if(cp.getEnabledCosmetics().contains("angryvhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.VILLAGER_ANGRY);
					}else if(cp.getEnabledCosmetics().contains("bubblehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.WATER_BUBBLE);
					}else if(cp.getEnabledCosmetics().contains("nuagehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.CLOUD);
					}else if(cp.getEnabledCosmetics().contains("crithat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.CRIT);
					}else if(cp.getEnabledCosmetics().contains("damageindichat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.DAMAGE_INDICATOR);
					}else if(cp.getEnabledCosmetics().contains("deathhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.SUSPENDED_DEPTH);
					}else if(cp.getEnabledCosmetics().contains("draghat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.DRAGON_BREATH);
					}else if(cp.getEnabledCosmetics().contains("dlavahat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.DRIP_LAVA);
					}else if(cp.getEnabledCosmetics().contains("dwaterhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.DRIP_WATER);
					}else if(cp.getEnabledCosmetics().contains("enchhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.ENCHANTMENT_TABLE);
					}else if(cp.getEnabledCosmetics().contains("whitehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.END_ROD);
					}else if(cp.getEnabledCosmetics().contains("sandhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.FALLING_DUST);
					}else if(cp.getEnabledCosmetics().contains("fwhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.FIREWORKS_SPARK);
					}else if(cp.getEnabledCosmetics().contains("flamehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.FLAME);
					}else if(cp.getEnabledCosmetics().contains("magichat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.VILLAGER_HAPPY);
					}else if(cp.getEnabledCosmetics().contains("lovehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.HEART);
					}else if(cp.getEnabledCosmetics().contains("lavahat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.LAVA);
					}else if(cp.getEnabledCosmetics().contains("combathat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.CRIT_MAGIC);
					}else if(cp.getEnabledCosmetics().contains("notehat")){
						drawParticleAncient(pls.getLocation().add(0, 2.1, 0), Particles.NOTE);
					}else if(cp.getEnabledCosmetics().contains("enderhat")){
						drawParticle(pls.getLocation().add(0, 1.1, 0), Particle.PORTAL);
					}else if(cp.getEnabledCosmetics().contains("netherhat")){
						drawParticleColored(pls.getLocation().add(0, 2.1, 0), 0, 0, 0);
					}else if(cp.getEnabledCosmetics().contains("multhat")){
						Random r1 = new Random();
						Random r2 = new Random();
						Random r3 = new Random();
						drawParticleColored(pls.getLocation().add(0, 2.1, 0), r1.nextInt(256), r2.nextInt(256), r3.nextInt(256));
					}else if(cp.getEnabledCosmetics().contains("slimehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.SLIME);
					}else if(cp.getEnabledCosmetics().contains("smokehat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.SMOKE_NORMAL);
					}else if(cp.getEnabledCosmetics().contains("snowhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.SNOWBALL);
					}else if(cp.getEnabledCosmetics().contains("angelhat")){
						Random r = new Random();
						if(r.nextInt(2) == 0){
							drawParticleAncient(pls.getLocation().add(0, 2.1, 0), Particles.SPELL);
						}else{
							drawParticleAncient(pls.getLocation().add(0, 2.1, 0), Particles.SPELL_INSTANT);
						}
					}else if(cp.getEnabledCosmetics().contains("totemhat")){
						drawParticle(pls.getLocation().add(0, 2.1, 0), Particle.TOTEM);
					}
				}
				
				if(t > 6){
					
					t = 0;
					ts = t;
					
				}
				
			}
			
		}, 1, 1);
		
	}
	
	public static void drawParticle(Location loc, Particle particle){
		
		double x = r*Math.cos(ts);
		double z = r*Math.sin(ts);
		loc.add(x, 0, z);
		
		loc.getWorld().spawnParticle(particle, loc, 0, 0, 0, 0, 1);
		
	}
	
	public static void drawParticleAncient(Location loc, Particles particles){
		
		double x = r*Math.cos(ts);
		double z = r*Math.sin(ts);
		loc.add(x, 0, z);
		
		UtilParticles.display(particles, loc);
		
	}
	
	public static void drawParticleColored(Location loc, int c1, int c2, int c3){
		
		double x = r*Math.cos(ts);
		double z = r*Math.sin(ts);
		loc.add(x, 0, z);
		
		UtilParticles.display(c1, c2, c3, loc);
		
	}

}
