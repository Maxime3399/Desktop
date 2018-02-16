package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class TpHere{
	
  public static HashMap<Player, Player> hm = new HashMap<>();
  
  public static void tpTo(final Player p, String name) {
	  
	  if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip"))){
	  
      p.sendMessage("§cIl faut au moins être §r§c§lVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
      p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);

    }else if (Bukkit.getPlayer(name) == null){
    	
      p.sendMessage("§cCe joueur n'est pas connecté !");
      p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
      
    }else{
    	
      Player tp = Bukkit.getPlayer(name);
      
      if (MCubeAPI.getPlayerRank(tp).equalsIgnoreCase("joueur")){
    	  
        p.sendMessage("§cCe joueur doit au moins être Mini-VIP pour faire ceci !");
        p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
        
      }else{
    	  
        hm.put(tp, p);
        p.sendMessage("§aDemande envoyée ! Ce joueur a 60 secondes pour accepter la demande.");
        tp.sendMessage("§e§l" + p.getName() + " §r§evous a envoyé un demande de téléportation, utilise §r§e§l/tpyes §r§epour accepter, tu as 60 secondes.");
        p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_LAUNCH, 100, 1);
        tp.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_LAUNCH, 100, 1);
        
        Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

          public void run(){
        	  
            if(TpHere.hm.containsKey(p)){
            	
              p.sendMessage("§6La demande de téléportation a expirée.");
              p.sendMessage("§6La demande de téléportation a expirée.");
              p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 1);
              p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 1);
              TpHere.hm.remove(p);
              
            }
            
          }
          
        }, 1200);
        
      }
      
    }
	  
  }

  public static void acceptTp(Player p){
	  
    if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("joueur")){
    	
      p.sendMessage("§cIl faut au moins être §r§c§lMini-VIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
      p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 100);

    }else if (hm.containsKey(p)){
    	
      if (hm.get(p) == null){
    	  
        p.sendMessage("§cLe joueur qui t'a fait le demande n'est plus connecté !");
        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 100);
        
      }else{
    	  
        Location loc = ((Player)hm.get(p)).getLocation();
        
        if (hm.get(p) != null) {
        	
        	hm.get(p).sendMessage("§a§l" + p.getName() + " §r§aa accepté ta demande de téléportation !");
        	hm.get(p).playSound(hm.get(p).getLocation(), Sound.ENTITY_VILLAGER_YES, 2, 100);
        	
        }
        
        hm.remove(p);
        
        if(MCubeAPI.getPlayerRank(p).equalsIgnoreCase("UltraVIP")){
        	
          p.sendMessage("§dTéléportation en cours...");
          p.teleport(loc);
          p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 100);
          
        }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip+")){
        	
          p.sendMessage("§dTéléportation dans 2 secondes...");
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        	  
            public void run() {
            	
              p.sendMessage("§dTéléportation en cours...");
              p.teleport(loc);
              p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 100);
              
            }
            
          }, 40);
          
        }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("vip")){
        	
          p.sendMessage("§dTéléportation dans 3 secondes...");
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        	  
            public void run() {
            	
              p.sendMessage("§dTéléportation en cours...");
              p.teleport(loc);
              p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 100);
              
            }
            
          }, 60);
          
        }else if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("minivip")){
        	
          p.sendMessage("§dTéléportation dans 4 secondes...");
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        	  
            public void run() {
              p.sendMessage("§dTéléportation en cours...");
              p.teleport(loc);
              
              p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 100);
            }
            
          }, 80);
          
        }else{
        	
          p.sendMessage("§dTéléportation dans 5 secondes...");
          Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
        	  
            public void run() {
              p.sendMessage("§dTéléportation en cours...");
              p.teleport(loc);
              p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1, 100);
              
            }
            
          }, 100);
          
        }
        
      }
      
    }else{
    	
      p.sendMessage("§cPersonne ne t'a fait de damande de téléportation !");
      p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_ATTACK_NODAMAGE, 2, 100);
      
    }
    
  }
  
}
