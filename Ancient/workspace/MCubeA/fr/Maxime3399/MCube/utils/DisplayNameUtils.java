package fr.Maxime3399.MCube.utils;

import fr.Maxime3399.MCube.MCubeAPI;
import org.bukkit.entity.Player;

public class DisplayNameUtils
{
  public DisplayNameUtils() {}
  
  public static void setDisplayName(Player p)
  {
    String serverrank = MCubeAPI.getPlayerRank(p);
    String staffrank = MCubeAPI.getStaffRank(p);
    String battlerank = "none";
    int trophies = MCubeAPI.getPlayerTrophies(p);
    
    if (staffrank.equalsIgnoreCase("admin"))
    {
      serverrank = "§c§l[§r§cAdmin§r§c§l]";
    }
    else if (staffrank.equalsIgnoreCase("mod"))
    {
      serverrank = "§6§l[§r§6Mod§r§6§l]";
    }
    else if (staffrank.equalsIgnoreCase("help"))
    {
      serverrank = "§3§l[§r§3Help§r§3§l]";


    }
    else if (serverrank.equalsIgnoreCase("minivip"))
    {
      serverrank = "§f§l[§r§fMini-VIP§r§f§l]";
    }
    else if (serverrank.equalsIgnoreCase("vip"))
    {
      serverrank = "§e§l[§r§eVIP§r§e§l]";
    }
    else if (serverrank.equalsIgnoreCase("vip+"))
    {
      serverrank = "§b§l[§r§bVIP+§r§b§l]";
    }
    else if (serverrank.equalsIgnoreCase("ultravip"))
    {
      serverrank = "§a§l[§r§aUltraVIP§r§a§l]";
    }
    else if (serverrank.equalsIgnoreCase("ultravip+"))
    {
      serverrank = "§2§l[§r§2UltraVIP+§r§2§l]";
    }
    else
    {
      serverrank = "";
    }
    



    if (trophies >= 20000)
    {
      battlerank = "§3";
    }
    else if (trophies >= 15000)
    {
      battlerank = "§a";
    }
    else if (trophies >= 11500)
    {
      battlerank = "§b";
    }
    else if (trophies >= 8500)
    {
      battlerank = "§e";
    }
    else if (trophies >= 6000)
    {
      battlerank = "§9";
    }
    else if (trophies >= 4000)
    {
      battlerank = "§c";
    }
    else if (trophies >= 2500)
    {
      battlerank = "§f";
    }
    else if (trophies >= 1500)
    {
      battlerank = "§6";
    }
    else
    {
      battlerank = "§8";
    }
    

    String donator = "";
    
    if (MCubeAPI.isDonator(p).equalsIgnoreCase("true"))
    {
      if (MCubeAPI.getDonatorSymbol(p) == 1)
      {
        donator = "✪";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 2)
      {
        donator = "✦";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 3)
      {
        donator = "✔";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 4)
      {
        donator = "✘";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 5)
      {
        donator = "❤ ";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 6)
      {
        donator = "✚";
      }
      else if (MCubeAPI.getDonatorSymbol(p) == 7)
      {

        donator = "♫";
      }
      
      if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("white"))
      {
        donator = "§f§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("orange"))
      {
        donator = "§6§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("magenta"))
      {
        donator = "§d§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("lightblue"))
      {
        donator = "§b§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("yellow"))
      {
        donator = "§e§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("lightgreen"))
      {
        donator = "§a§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("grey"))
      {
        donator = "§8§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("lightgrey"))
      {
        donator = "§7§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("cyan"))
      {
        donator = "§3§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("purple"))
      {
        donator = "§5§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("blue"))
      {
        donator = "§9§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("green"))
      {
        donator = "§2§l" + donator;
      }
      else if (MCubeAPI.getDonatorColor(p).equalsIgnoreCase("red"))
      {
        donator = "§c§l" + donator;
      }
      else
      {
        donator = "§0§l" + donator;
      }
    }
    


    if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!fr.Maxime3399.MCube.manager.FakePlayers.name.equalsIgnoreCase("none")))
    {
      if (MCubeAPI.isDonator(p).equalsIgnoreCase("true")) {
        p.setDisplayName(serverrank + "§r " + battlerank + fr.Maxime3399.MCube.manager.FakePlayers.name + "§r " + donator + "§r");
      } else {
        p.setDisplayName(serverrank + "§r " + battlerank + fr.Maxime3399.MCube.manager.FakePlayers.name + "§r");
      }
      
      if (MCubeAPI.getPlayerVanish(p).equalsIgnoreCase("true")) {
        p.setDisplayName("§f§o" + fr.Maxime3399.MCube.manager.FakePlayers.name);
      }
    }
    else
    {
      if (MCubeAPI.isDonator(p).equalsIgnoreCase("true")) {
        p.setDisplayName(serverrank + "§r " + battlerank + p.getName() + "§r " + donator + "§r");
      } else {
        p.setDisplayName(serverrank + "§r " + battlerank + p.getName() + "§r");
      }
      
      if (MCubeAPI.getPlayerVanish(p).equalsIgnoreCase("true")) {
        p.setDisplayName("§f§o" + p.getName());
      }
    }
    

    p.setPlayerListName(p.getDisplayName());
    p.setCustomName(p.getDisplayName());
    p.setCustomNameVisible(true);
  }
}
