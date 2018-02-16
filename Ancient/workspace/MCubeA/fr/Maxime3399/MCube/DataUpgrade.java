package fr.Maxime3399.MCube;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

	@SuppressWarnings("unused")
	public class DataUpgrade{
	
	public static int lastUpgrade = 7;
  
	@SuppressWarnings("deprecation")
	public static void upgrade(Player p){
		  
	    if(MCubeAPI.getData(p) == 0){
	    	
	      if (MCubeAPI.isDonator(p).equalsIgnoreCase("true")){
	    	  
	        MCubeAPI.setChests(p, "cos", MCubeAPI.getChests(p, "cos") + 1);
	        
	      }
	      
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 1 for player " + p.getName());
	      MCubeAPI.setData(p, 1);
	      
	    }
	    
	    if(MCubeAPI.getData(p) == 1){
	    	
	      MainClass.getEcononomy().withdrawPlayer(p.getName(), MainClass.getEcononomy().getBalance(p.getName()));
	      MainClass.getEcononomy().depositPlayer(p.getName(), MCubeAPI.getPlayerCoins(p));
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 2 for player " + p.getName());
	      MCubeAPI.setData(p, 2);
	      
	    }
	    
	    if(MCubeAPI.getData(p) == 2){
	    	
	      MCubeAPI.setChests(p, "epic", MCubeAPI.getChests(p, "epic") + 1);
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 3 for player " + p.getName());
	      MCubeAPI.setData(p, 3);
	      
	    }
	    
	    if(MCubeAPI.getData(p) == 3){
	    	
	      MCubeAPI.setChests(p, "ultimate", MCubeAPI.getChests(p, "ultimate") + 1);
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 4 for player " + p.getName());
	      MCubeAPI.setData(p, 4);
	      
	    }
	    
	    if (MCubeAPI.getData(p) == 4){
	    	
	      MCubeAPI.setVanish(p, "false");
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 5 for player " + p.getName());
	      MCubeAPI.setData(p, 5);
	      
	    }
	    
	    if(MCubeAPI.getData(p) == 5){
	    	
	      org.bukkit.Location loc = new org.bukkit.Location(Bukkit.getWorld("world"), -303.5, 66.1, 383.5);
	      p.teleport(loc);
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 6 for player " + p.getName());
	      MCubeAPI.setData(p, 6);
	      
	    }
	    
	    if(MCubeAPI.getData(p) == 6){
	    	
	      Bukkit.getConsoleSender().sendMessage("§e§lData UPGRADE to 7 for player " + p.getName());
	      MCubeAPI.setData(p, 7);
	      
	      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
	    	  
	        public void run(){
	        	
	          p.sendMessage("§e§l§k|||§r §aTu as perdu ton inventaire ? Ne t'en fait pas ! Il te suffit de contacter un membre du staff pour obtenir un remboursement !");
	          p.playSound(p.getLocation(), org.bukkit.Sound.ENTITY_ENDERDRAGON_DEATH, 100, 2);
	          p.playSound(p.getLocation(), org.bukkit.Sound.ENTITY_WITHER_SPAWN, 100, 1);
	          
	        }
	        
	      }, 100);
	      
	    }
	    
	  }
  
}