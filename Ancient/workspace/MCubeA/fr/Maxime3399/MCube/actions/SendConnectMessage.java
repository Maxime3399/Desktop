package fr.Maxime3399.MCube.actions;

import org.bukkit.entity.Player;

public class SendConnectMessage{
  
  public static void send(Player p) {
	  
    String l1 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line1").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l2 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line2").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l3 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line3").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l4 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line4").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l5 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line5").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l6 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line6").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l7 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line7").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l8 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line8").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l9 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line9").replaceAll("&", "§").replaceAll("%player%", p.getName());
    String l10 = org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("Line10").replaceAll("&", "§").replaceAll("%player%", p.getName());
    
    p.sendMessage("§r §r\n" + l1 + "§r\n" + l2 + "§r\n" + l3 + "§r\n" + l4 + "§r\n" + l5 + "§r\n" + l6 + "§r\n" + l7 + "§r\n" + l8 + "§r\n" + l9 + "§r\n" + l10 + "§r");
    
  }
}
