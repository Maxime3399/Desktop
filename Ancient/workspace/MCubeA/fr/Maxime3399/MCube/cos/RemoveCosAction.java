package fr.Maxime3399.MCube.cos;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class RemoveCosAction{
  
  public static void removeParticle(Player p, boolean mess){
	  
    if (MCubeAPI.getActiveCos(p).contains("angryVillager")){
      MCubeAPI.removeActiveCos(p, "angryVillager");
      if(mess){
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("barrier")){
      MCubeAPI.removeActiveCos(p, "barrier");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("blockcrack")){
      MCubeAPI.removeActiveCos(p, "blockcrack");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("bubble")){
      MCubeAPI.removeActiveCos(p, "bubble");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("cloud")){
      MCubeAPI.removeActiveCos(p, "cloud");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("crit")){
      MCubeAPI.removeActiveCos(p, "crit");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("damageIndicator")){
      MCubeAPI.removeActiveCos(p, "damageIndicator");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("depthsuspend")){
      MCubeAPI.removeActiveCos(p, "depthsuspend");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("dragonbreath")){
      MCubeAPI.removeActiveCos(p, "dragonbreath");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("dripLava")){
      MCubeAPI.removeActiveCos(p, "dripLava");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("dripWater")){
      MCubeAPI.removeActiveCos(p, "dripWater");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("droplet")){
      MCubeAPI.removeActiveCos(p, "droplet");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }
    else if (MCubeAPI.getActiveCos(p).contains("enchantmenttable")){
      MCubeAPI.removeActiveCos(p, "enchantmenttable");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("endRod")){
      MCubeAPI.removeActiveCos(p, "endRod");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("fallingDust")){
      MCubeAPI.removeActiveCos(p, "fallingDust");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("fireworksSpark")){
      MCubeAPI.removeActiveCos(p, "fireworksSpark");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("flame")){
      MCubeAPI.removeActiveCos(p, "flame");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("happyVillager")){
      MCubeAPI.removeActiveCos(p, "happyVillager");
      if (mess) {
        p.sendMessage("§eTes particules ont étés retirés !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (mess) {
      p.sendMessage("§cTu n'as pas de particules activés !");
      p.playSound(p.getLocation(), Sound.ENTITY_SHULKER_HURT, 100, 2);
    }
  }

  public static void removeDeathEffect(Player p, boolean mess){
	  
    if(MCubeAPI.getActiveCos(p).contains("lightDeath")){
      MCubeAPI.removeActiveCos(p, "lightDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("bloodDeath")){
      MCubeAPI.removeActiveCos(p, "bloodDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("boneDeath")){
      MCubeAPI.removeActiveCos(p, "boneDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("boneDeath")){
      MCubeAPI.removeActiveCos(p, "boneDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("textDeath")){
      MCubeAPI.removeActiveCos(p, "textDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("explodeDeath")){
      MCubeAPI.removeActiveCos(p, "explodeDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("corpseDeath")){
      MCubeAPI.removeActiveCos(p, "corpseDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("cielDeath")){
      MCubeAPI.removeActiveCos(p, "cielDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("enferDeath")){
      MCubeAPI.removeActiveCos(p, "enferDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("baliseDeath")){
      MCubeAPI.removeActiveCos(p, "baliseDeath");
      if (mess) {
        p.sendMessage("§eTon effet de mort a été retiré !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (mess){
      p.sendMessage("§cTu n'as pas d'effet de mort activé !");
      p.playSound(p.getLocation(), Sound.ENTITY_SHULKER_HURT, 100, 1);
    }
  }

  public static void removeMorph(Player p, boolean mess){
    if (MCubeAPI.getActiveCos(p).contains("chicken")){
      MCubeAPI.removeActiveCos(p, "chicken");
      MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("pig")){
      MCubeAPI.removeActiveCos(p, "pig");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("sheep")){
      MCubeAPI.removeActiveCos(p, "sheep");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }
    else if (MCubeAPI.getActiveCos(p).contains("cow")){
      MCubeAPI.removeActiveCos(p, "cow");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("horse")){
      MCubeAPI.removeActiveCos(p, "horse");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("villager")){
      MCubeAPI.removeActiveCos(p, "villager");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("bunny")){
      MCubeAPI.removeActiveCos(p, "bunny");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("ocelot")){
      MCubeAPI.removeActiveCos(p, "ocelot");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (MCubeAPI.getActiveCos(p).contains("wolf")){
      MCubeAPI.removeActiveCos(p, "wolf");
      fr.Maxime3399.MCube.MainClass.disguise().undisguise(p);
      if (mess) {
        p.sendMessage("§eTa transormation a été retirée !");
        p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 100, 2);
      }
    }else if (mess) {
      p.sendMessage("§cTu n'as de transformation active !");
      p.playSound(p.getLocation(), Sound.ENTITY_SHULKER_HURT, 100, 1);
    }
    
  }
  
}
