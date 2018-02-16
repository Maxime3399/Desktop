package fr.Maxime3399.MCube.cos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;

public class CosStartManager{
  
  public static void registerCosmetics(){
	  
    for (Player pls : Bukkit.getOnlinePlayers()){
    	
      String co = MCubeAPI.getActiveCos(pls);
      
      if (co.contains("angryVillager")) {
        angryVillagerParticle.start();
      } else if (co.contains("barrier")) {
        barrierParticle.start();
      } else if (co.contains("blockcrack")) {
        blockcrackParticle.start();
      } else if (co.contains("bubble")) {
        bubbleParticle.start();
      } else if (co.contains("cloud")) {
        cloudParticle.start();
      } else if (co.contains("crit")) {
        critParticle.start();
      } else if (co.contains("damageIndicator")) {
        damageIndicatorParticle.start();
      } else if (co.contains("depthsuspend")) {
        depthsuspendParticle.start();
      } else if (co.contains("dragonbreath")) {
        dragonbreathParticle.start();
      } else if (co.contains("dripLava")) {
        dripLavaParticle.start();
      } else if (co.contains("dripWater")) {
        dripWaterParticle.start();
      } else if (co.contains("droplet")) {
        dropletParticle.start();
      } else if (co.contains("enchantmenttable")) {
        enchantmenttableParticle.start();
      } else if (co.contains("endRod")) {
        endRodParticle.start();
      } else if (co.contains("fallingDust")) {
        fallingDustParticle.start();
      } else if (co.contains("fireworksSpark")) {
        fireworksSparkParticle.start();
      } else if (co.contains("flame")) {
        flameParticle.start();
      } else if (co.contains("happyVillager")) {
        happyVillagerParticle.start();
      }
      
    }
    
  }
  
}
