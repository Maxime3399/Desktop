package fr.Maxime3399.MCube.utils;

import fr.Maxime3399.MCube.MCubeAPI;

public class selectStaff
{
  public selectStaff() {}
  
  public static boolean isStaff(org.bukkit.entity.Player p)
  {
    if ((MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")) || (MCubeAPI.getStaffRank(p).equalsIgnoreCase("mod")) || (MCubeAPI.getStaffRank(p).equalsIgnoreCase("help")))
    {
      return true;
    }
    

    return false;
  }
}
