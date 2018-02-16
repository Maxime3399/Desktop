package fr.Maxime3399.MCube.homes;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.HashMap;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SetHomes
{
  public SetHomes() {}
  
  public static void set(Player p, String home)
  {
    int mh = 0;
    
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))
    {
      mh = 20;
    }
    else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+"))
    {
      mh = 15;
    }
    else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip"))
    {
      mh = 10;
    }
    else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip"))
    {
      mh = 5;
    }
    else
    {
      mh = 2;
    }
    

    if (HomesCount.get(p) >= mh)
    {

      if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip"))
      {
        p.sendMessage("§cTu ne peux pas avoir plus de homes !");
        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_AMBIENT, 100.0F, 2.0F);
      }
      else
      {
        p.sendMessage("§cTu ne peux pas avoir plus de homes, si tu souhaites en avoir plus, il te faut un grade supérieur !");
        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_AMBIENT, 100.0F, 1.0F);
      }
      
    }
    else
    {
      HashMap<String, Location> hm = new HashMap();
      
      if (MCubeAPI.isHome(p, 1).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 1), MCubeAPI.getHomeLocation(p, 1));
      }
      if (MCubeAPI.isHome(p, 2).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 2), MCubeAPI.getHomeLocation(p, 2));
      }
      if (MCubeAPI.isHome(p, 3).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 3), MCubeAPI.getHomeLocation(p, 3));
      }
      if (MCubeAPI.isHome(p, 4).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 4), MCubeAPI.getHomeLocation(p, 4));
      }
      if (MCubeAPI.isHome(p, 5).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 5), MCubeAPI.getHomeLocation(p, 5));
      }
      if (MCubeAPI.isHome(p, 6).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 6), MCubeAPI.getHomeLocation(p, 6));
      }
      if (MCubeAPI.isHome(p, 7).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 7), MCubeAPI.getHomeLocation(p, 7));
      }
      if (MCubeAPI.isHome(p, 8).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 8), MCubeAPI.getHomeLocation(p, 8));
      }
      if (MCubeAPI.isHome(p, 9).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 9), MCubeAPI.getHomeLocation(p, 9));
      }
      if (MCubeAPI.isHome(p, 10).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 10), MCubeAPI.getHomeLocation(p, 10));
      }
      if (MCubeAPI.isHome(p, 11).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 11), MCubeAPI.getHomeLocation(p, 11));
      }
      if (MCubeAPI.isHome(p, 12).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 12), MCubeAPI.getHomeLocation(p, 12));
      }
      if (MCubeAPI.isHome(p, 13).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 13), MCubeAPI.getHomeLocation(p, 13));
      }
      if (MCubeAPI.isHome(p, 14).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 14), MCubeAPI.getHomeLocation(p, 14));
      }
      if (MCubeAPI.isHome(p, 15).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 15), MCubeAPI.getHomeLocation(p, 15));
      }
      if (MCubeAPI.isHome(p, 16).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 16), MCubeAPI.getHomeLocation(p, 16));
      }
      if (MCubeAPI.isHome(p, 17).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 17), MCubeAPI.getHomeLocation(p, 17));
      }
      if (MCubeAPI.isHome(p, 18).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 18), MCubeAPI.getHomeLocation(p, 18));
      }
      if (MCubeAPI.isHome(p, 19).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 19), MCubeAPI.getHomeLocation(p, 19));
      }
      if (MCubeAPI.isHome(p, 20).equalsIgnoreCase("true")) {
        hm.put(MCubeAPI.getHomeName(p, 20), MCubeAPI.getHomeLocation(p, 20));
      }
      
      if (hm.containsKey(home))
      {
        p.sendMessage("§cCe home éxiste déjà !");
        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_AMBIENT, 100.0F, 2.0F);
      }
      else
      {
        MCubeAPI.setHome(p, hm.size() + 1, home);
        p.sendMessage("§aHome ajouté !");
        p.playSound(p.getLocation(), Sound.ENTITY_EGG_THROW, 100.0F, 2.0F);
      }
    }
  }
}
