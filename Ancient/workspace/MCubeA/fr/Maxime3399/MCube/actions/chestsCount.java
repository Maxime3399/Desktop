package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.MCubeAPI;

public class chestsCount{
	
  public static int get(org.bukkit.entity.Player p){
	  
    int c = 0;
    
    c += MCubeAPI.getChests(p, "cos");
    c += MCubeAPI.getChests(p, "ultimate");
    c += MCubeAPI.getChests(p, "legendary");
    c += MCubeAPI.getChests(p, "epic");
    c += MCubeAPI.getChests(p, "rare");
    c += MCubeAPI.getChests(p, "basic");
    
    return c;
    
  }
  
}
