package fr.Maxime3399.MCube.actions;

import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import fr.Maxime3399.MCube.MCubeAPI;

public class setPermissions{
  
  public static void set(Player p){
	  
    if (MCubeAPI.getStaffRank(p).equalsIgnoreCase("mod")){
    	
      PermissionAttachment attachment = p.addAttachment(org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube"));
      attachment.setPermission("logblock.*", true);
      attachment.setPermission("bukkit.command.say", true);
      attachment.setPermission("minecraft.command.say", true);
      attachment.setPermission("bukkit.command.ban.*", true);
      attachment.setPermission("minecraft.command.ban", true);
      attachment.setPermission("minecraft.command.ban-ip", true);
      attachment.setPermission("minecraft.command.banlist", true);
      attachment.setPermission("bukkit.command.kick", true);
      attachment.setPermission("minecraft.command.kick", true);
      attachment.setPermission("ab.kick.use", true);
      attachment.setPermission("ab.kick.notify", true);
      attachment.setPermission("ab.ban.perma", true);
      attachment.setPermission("ab.mute.perma", true);
      attachment.setPermission("ab.warn.perma", true);
      attachment.setPermission("ab.ban.notify", true);
      attachment.setPermission("ab.mute.notify", true);
      attachment.setPermission("ab.warn.notify", true);
      attachment.setPermission("ab.ban.ip", true);
      attachment.setPermission("ab.ipban.notify", true);
      attachment.setPermission("ab.ban.undo", true);
      attachment.setPermission("ab.mute.undo", true);
      attachment.setPermission("ab.warn.undo", true);
      attachment.setPermission("ab.all.undo", true);
      attachment.setPermission("ab.warns.own", true);
      attachment.setPermission("ab.warns.other", true);
      attachment.setPermission("ab.check", true);
      attachment.setPermission("ab.check.ip", true);
      attachment.setPermission("ab.banlist", true);
      attachment.setPermission("ab.history", true);
      attachment.setPermission("ab.help", true);
      attachment.setPermission("ab.mute.temp", true);
      attachment.setPermission("ab.tempmute.notify", true);
      attachment.setPermission("ab.ban.temp", true);
      attachment.setPermission("ab.tempban.notify", true);
      attachment.setPermission("lockette.user.*", true);
      attachment.setPermission("lockette.*", true);
      
    }else if (MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")){
    	
      PermissionAttachment attachment = p.addAttachment(org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube"));
      attachment.setPermission("logblock.*", true);
      attachment.setPermission("bukkit.command.say", true);
      attachment.setPermission("minecraft.command.say", true);
      attachment.setPermission("bukkit.command.stop", true);
      attachment.setPermission("minecraft.command.stop", true);
      attachment.setPermission("bukkit.command.whitelist.*", true);
      attachment.setPermission("minecraft.command.whitelist", true);
      attachment.setPermission("bukkit.command.ban.*", true);
      attachment.setPermission("minecraft.command.ban", true);
      attachment.setPermission("minecraft.command.ban-ip", true);
      attachment.setPermission("minecraft.command.banlist", true);
      attachment.setPermission("bukkit.command.kick", true);
      attachment.setPermission("minecraft.command.kick", true);
      attachment.setPermission("ab.kick.use", true);
      attachment.setPermission("ab.kick.exempt", true);
      attachment.setPermission("ab.kick.notify", true);
      attachment.setPermission("ab.ban.perma", true);
      attachment.setPermission("ab.mute.perma", true);
      attachment.setPermission("ab.warn.perma", true);
      attachment.setPermission("ab.ban.exempt", true);
      attachment.setPermission("ab.mute.exempt", true);
      attachment.setPermission("ab.warn.exempt", true);
      attachment.setPermission("ab.ban.notify", true);
      attachment.setPermission("ab.mute.notify", true);
      attachment.setPermission("ab.warn.notify", true);
      attachment.setPermission("ab.ban.ip", true);
      attachment.setPermission("ab.ipban.exempt", true);
      attachment.setPermission("ab.ipban.notify", true);
      attachment.setPermission("ab.ban.undo", true);
      attachment.setPermission("ab.mute.undo", true);
      attachment.setPermission("ab.warn.undo", true);
      attachment.setPermission("ab.all.undo", true);
      attachment.setPermission("ab.warns.own", true);
      attachment.setPermission("ab.warns.other", true);
      attachment.setPermission("ab.check", true);
      attachment.setPermission("ab.check.ip", true);
      attachment.setPermission("ab.banlist", true);
      attachment.setPermission("ab.history", true);
      attachment.setPermission("ab.reload", true);
      attachment.setPermission("ab.help", true);
      attachment.setPermission("ab.systemprefs", true);
      attachment.setPermission("ab.mute.temp", true);
      attachment.setPermission("ab.tempmute.exempt", true);
      attachment.setPermission("ab.tempmute.notify", true);
      attachment.setPermission("ab.ban.temp", true);
      attachment.setPermission("ab.tempban.notify", true);
      attachment.setPermission("ab.tempban.exempt", true);
      attachment.setPermission("lockette.user.*", true);
      attachment.setPermission("lockette.*", true);
      
    }else{
    	
      PermissionAttachment attachment = p.addAttachment(org.bukkit.Bukkit.getPluginManager().getPlugin("M-Cube"));
      attachment.setPermission("lockette.user.*", true);
      
    }
    
  }
  
}
