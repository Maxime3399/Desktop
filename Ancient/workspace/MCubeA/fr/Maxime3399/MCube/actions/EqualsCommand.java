package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class EqualsCommand{
	
  static HashMap<Player, Player> dem = new HashMap<>();
  public static ArrayList<String> lim = new ArrayList<>();
  
  public static void demand(final Player p, String target) { if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")){
	  
      if (Bukkit.getPlayer(target) == null){
    	  
        p.sendMessage("§cCe joueur n'est pas connecté !");
        p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
        
      }else{
    	  
        Player tp = Bukkit.getPlayer(target);
        
        if (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")){
        	
          if (lim.contains(p.getName())){
        	  
            p.sendMessage("§cTu ne peux utilisez cette commande qu'une fois par heure !");
            p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);

          }else if (lim.contains(tp.getName())){
        	  
            p.sendMessage("§cLe joueur ne peux se mettre a égalité qu'une fois par heure !");
            p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
            
          }else{
        	  
            dem.put(tp, p);
            p.sendMessage("§eDemande envoyée, " + target + " a 60 secondes pour accepter.");
            tp.sendMessage("§e" + p.getName() + " vous propose de se mettre a égalité avec vous, utilisez §e§l/equalsyes §r§epour accepter, vous avez 60 secondes.");
            p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_LAUNCH, 100, 1);
            tp.playSound(tp.getLocation(), Sound.BLOCK_DISPENSER_LAUNCH, 100, 1);
            
            Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

              public void run(){
            	  
                if (EqualsCommand.dem.containsKey(p)){
                	
                  p.sendMessage("§6Le demande d'égalité a éxpirée.");
                  p.sendMessage("Â§6Le demande d'égalité a éxpirée.");
                  p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
                  p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
                  EqualsCommand.dem.remove(p);
                }
                
              }

            }, 1200L);
            
          }

        }else{

          p.sendMessage("§cLe joueur doit au moins être UltraVIP !");
          p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
          
        }
        
      }
      
    }else{
    	
      p.sendMessage("§cIl faut au moins être §r§c§lUltraVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
      p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
      
    }
  
  }

  @SuppressWarnings("deprecation")
public static void accept(Player tp){
	  
    if (MCubeAPI.getPlayerRank(tp).equalsIgnoreCase("ultravip")){
    	
      if (dem.containsKey(tp)){
    	  
        Player p = (Player)dem.get(tp);
        
        if (lim.contains(tp.getName())){
        	
          tp.sendMessage("§cTu ne peux utilisez cette commande qu'une fois par heure !");
          tp.playSound(tp.getLocation(), Sound.ENTITY_CREEPER_HURT, 100, 2);
          
        }else{
        	
          double coins1 = MCubeAPI.getPlayerCoins(p);
          double coins2 = MCubeAPI.getPlayerCoins(tp);
          double coins3 = coins1 + coins2;
          double coins4 = coins3 / 2.0D;
          int coins5 = (int)Math.round(coins4);
          MCubeAPI.setCoins(p, coins5);
          MainClass.getEcononomy().withdrawPlayer(p.getName(), MainClass.getEcononomy().getBalance(p.getName()));
          MainClass.getEcononomy().depositPlayer(p.getName(), coins5);
          MCubeAPI.setCoins(tp, coins5);
          MainClass.getEcononomy().withdrawPlayer(tp.getName(), MainClass.getEcononomy().getBalance(tp.getName()));
          MainClass.getEcononomy().depositPlayer(tp.getName(), coins5);
          
          double tro1 = MCubeAPI.getPlayerTrophies(p);
          double tro2 = MCubeAPI.getPlayerTrophies(tp);
          double tro3 = tro1 + tro2;
          double tro4 = tro3 / 2.0D;
          int tro5 = (int)Math.round(tro4);
          MCubeAPI.setTrophies(p, tro5);
          MCubeAPI.setTrophies(tp, tro5);
          
          for (Player pls : Bukkit.getOnlinePlayers()) {
        	  
            DisplayNameUtils.setDisplayName(pls);
            ScoreboardGame.loadScoreboard(pls);
            
          }
          
          p.sendMessage("§aVous avez été mis a égalité !");
          tp.sendMessage("Â*§aVous avez été mis a égalité !");
          p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_HIT, 100, 1);
          tp.playSound(tp.getLocation(), Sound.BLOCK_ANVIL_HIT, 100, 1);
          dem.remove(tp);
          lim.add(p.getName());
          lim.add(tp.getName());
          
        }
        
      }else{
    	  
        tp.sendMessage("§cPersonne ne vous a fait de demande d'égalité !");
        tp.playSound(tp.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
        
      }
      
    }else{
    	
      tp.sendMessage("§cIl faut au moins être §r§c§lUltraVIP§r§c, tu peux l'acheter ici : §r§c§ohttp://maxime3399.fr/?page_id=17§r §c!");
      tp.playSound(tp.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 2);
      
    }
    
  }
  
}
