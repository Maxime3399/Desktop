package fr.Maxime3399.MCube.cos;

import org.bukkit.entity.Player;

import de.robingrether.idisguise.disguise.Disguise;
import de.robingrether.idisguise.disguise.DisguiseType;
import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;

public class morphingPlayer{
  
  public static void morph(Player p){
	  
    if (MCubeAPI.getActiveCos(p).contains("chicken")){
    	
      Disguise d = DisguiseType.CHICKEN.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("pig")){
      Disguise d = DisguiseType.PIG.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("sheep")){
      Disguise d = DisguiseType.SHEEP.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("cow")){
      Disguise d = DisguiseType.COW.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("horse")){
      Disguise d = DisguiseType.HORSE.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("villager")){
      Disguise d = DisguiseType.VILLAGER.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("bunny")){
      Disguise d = DisguiseType.RABBIT.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("ocelot")){
      Disguise d = DisguiseType.OCELOT.newInstance();
      MainClass.disguise().disguise(p, d);
    }else if (MCubeAPI.getActiveCos(p).contains("wolf")){
      Disguise d = DisguiseType.WOLF.newInstance();
      MainClass.disguise().disguise(p, d);
    }
    
  }
  
}
