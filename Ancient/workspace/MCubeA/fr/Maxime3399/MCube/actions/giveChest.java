package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.manager.FakePlayers;
import fr.Maxime3399.MCube.quests.TestEndQuest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class giveChest{
  
  public static void setup(Player p){
	  
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    String date = df.format(new Date());
    
    if (!MCubeAPI.getDay(p).equalsIgnoreCase(date)){
    	
      if (MCubeAPI.getCurrentQuest(p) == 22) {
    	  
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
        
      }
      
      if (chestsCount.get(p) >= 53){
    	  
        p.sendMessage("§cTu as trop de coffres, tu dois en ouvrir pour pouvoir en gagner d'autres !");
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 100, 2);
      }else{
    	  
        int trophies = MCubeAPI.getPlayerTrophies(p);
        
        int ult = 0;
        int leg = 0;
        int epic = 0;
        int rare = 0;
        
        if (trophies >= 20000) {
          rare = 5;
          epic = 25;
          leg = 50;
          ult = 85;
        } else if (trophies >= 15000) {
          rare = 10;
          epic = 38;
          leg = 80;
          ult = 150;
        } else if (trophies >= 11500) {
          rare = 22;
          epic = 45;
          leg = 120;
          ult = 200;
        } else if (trophies >= 8500) {
          rare = 35;
          epic = 90;
          leg = 220;
          ult = 250;
        } else if (trophies >= 6000) {
          rare = 48;
          epic = 120;
          leg = 290;
          ult = 330;
        } else if (trophies >= 4000) {
          rare = 65;
          epic = 200;
          leg = 370;
          ult = 450;
        } else if (trophies >= 2500) {
          rare = 80;
          epic = 250;
          leg = 370;
          ult = 450;
        } else if (trophies >= 1500) {
          rare = 110;
          epic = 280;
          leg = 400;
          ult = 500;
        } else {
          rare = 150;
          epic = 330;
          leg = 460;
          ult = 600;
        }
        
        Random r1 = new Random();
        int t1 = r1.nextInt(ult);
        if (t1 == 5) {
        	
          MCubeAPI.setChests(p, "ultimate", MCubeAPI.getChests(p, "ultimate") + 1);
          
          if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
        	  
            Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + FakePlayers.name + " §r§a§la trouvé un §r§9Coffre Ultime§r   §2§k|||");
          } else {
        	  
            Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + p.getName() + " §r§a§la trouvé un §r§9Coffre Ultime§r   §2§k|||");
            
          }
          
          for (Player pls : Bukkit.getOnlinePlayers()) {
        	  
            pls.playSound(pls.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 100, 2);
            
          }
          
        } else {
        	
          Random r2 = new Random();
          int t2 = r2.nextInt(leg);
          
          if (t2 == 5) {
        	  
            MCubeAPI.setChests(p, "legendary", MCubeAPI.getChests(p, "legendary") + 1);
            
            if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
            	
              Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + FakePlayers.name + " §r§a§la trouvé un §r§bCoffre légendaire§r   §2§k|||");
              
            } else {
            	
              Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + p.getName() + " §r§a§la trouvé un §r§bCoffre légendaire§r   §2§k|||");
              
            }
            
            for (Player pls : Bukkit.getOnlinePlayers()) {
            	
              pls.playSound(pls.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 100, 2);
              
            }
            
          } else {
        	  
            Random r3 = new Random();
            int t3 = r3.nextInt(epic);
            
            if (t3 == 5) {
            	
              MCubeAPI.setChests(p, "epic", MCubeAPI.getChests(p, "epic") + 1);
              
              if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
            	  
                Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + FakePlayers.name + " §r§a§la trouvé un §r§5Coffre epic§r   §2§k|||");
                
              } else {
            	  
                Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + p.getName() + " §r§a§la trouvé un §r§5Coffre epic§r   §2§k|||");
                
              }
              
              for (Player pls : Bukkit.getOnlinePlayers()) {
            	  
                pls.playSound(pls.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 100, 2);
                
              }
              
            } else {
            	
              Random r4 = new Random();
              int t4 = r4.nextInt(rare);
              
              if (t4 == 5) {
            	  
                MCubeAPI.setChests(p, "rare", MCubeAPI.getChests(p, "rare") + 1);
                
                if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
                	
                  Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + FakePlayers.name + " §r§a§la trouvé un §r§6Coffre rare§r   §2§k|||");
                  
                } else {
                	
                  Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + p.getName() + " §r§a§la trouvé un §r§6Coffre rare§r   §2§k|||");
                  
                }
                
                for (Player pls : Bukkit.getOnlinePlayers()) {
                	
                  pls.playSound(pls.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 100, 2);
                  
                }
                
              } else {
            	  
                MCubeAPI.setChests(p, "basic", MCubeAPI.getChests(p, "basic") + 1);
                
                if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
                	
                  Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + FakePlayers.name + " §r§a§la trouvé un §r§eCoffre basique§r   §2§k|||");
                  
                } else {
                	
                  Bukkit.broadcastMessage("  §2§k|||§r   §9§o" + p.getName() + " §r§a§la trouvé un §r§eCoffre basique§r   §2§k|||");
                }
                
                for (Player pls : Bukkit.getOnlinePlayers()) {
                	
                  pls.playSound(pls.getLocation(), Sound.BLOCK_ENCHANTMENT_TABLE_USE, 100, 2);
                  
                }
                
              }
              
            }
            
          }
          
        }
        
        MCubeAPI.setDay(p);
        
      }
      
    }
    
  }
  
}
