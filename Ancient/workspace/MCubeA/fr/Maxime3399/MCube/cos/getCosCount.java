package fr.Maxime3399.MCube.cos;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;

public class getCosCount{
  
  public static int getParticles(Player p) {
    int i = 0;
    
    if (MCubeAPI.getCos(p, "angryVillager").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "barrier").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "blockcrack").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "bubble").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "cloud").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "crit").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "damageIndicator").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "depthsuspend").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "dragonbreath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "dripLava").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "dripWater").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "droplet").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "enchantmenttable").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "endRod").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "fallingDust").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "fireworksSpark").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "flame").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "happyVillager").equalsIgnoreCase("true")) {
      i++;
    }
    
    return i;
    
  }
  

  public static int getDeathEffects(Player p){
    int i = 0;
    
    if (MCubeAPI.getCos(p, "lightDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "bloodDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "boneDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "textDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "explodeDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "corpseDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "cielDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "enferDeath").equalsIgnoreCase("true")) {
      i++;
    }
    if (MCubeAPI.getCos(p, "baliseDeath").equalsIgnoreCase("true")) {
      i++;
    }
    
    return i;
    
  }
  

  public static int getMorphs(Player p){
	  
    int i = 0;
    
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")){
      i = 1;
    }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")){
      i = 2;
    }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")){
      i = 3;
    }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")){
      i = 4;
    }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+")){
      i = 5;
    }
    
    if (MCubeAPI.getCurrentQuest(p) >= 46){
      i++;
    }
    if (MCubeAPI.isDonator(p).equalsIgnoreCase("true")){
      i++;
    }
    if (MCubeAPI.getCos(p, "ocelot").equalsIgnoreCase("true")){
      i = 2;
    }
    if (MCubeAPI.getCos(p, "wolf").equalsIgnoreCase("true")){
      i++;
    }

    return i;
    
  }
  
}
