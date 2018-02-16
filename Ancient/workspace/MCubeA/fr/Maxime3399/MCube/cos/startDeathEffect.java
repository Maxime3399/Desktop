package fr.Maxime3399.MCube.cos;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.MCubeAPI;

public class startDeathEffect{
  
  public static void start(Player p){
    if (MCubeAPI.getActiveCos(p).contains("lightDeath")){
      lightDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("bloodDeath")){
      bloodDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("boneDeath")){
      boneDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("textDeath")){
      textDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("explodeDeath")){
      explodeDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("corpseDeath")){
      corpseDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("cielDeath")){
      cielDeathEffect.start(p);
    }else if (MCubeAPI.getActiveCos(p).contains("enferDeath")){
      enferDeathEffect.start(p);
    }
  }
}
