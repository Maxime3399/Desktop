package fr.Maxime3399.MCube;

import de.robingrether.idisguise.api.DisguiseAPI;
import fr.Maxime3399.MCube.actions.EqualsCommand;
import fr.Maxime3399.MCube.actions.OneHourStarter;
import fr.Maxime3399.MCube.actions.TpHere;
import fr.Maxime3399.MCube.actions.goSpawn;
import fr.Maxime3399.MCube.actions.randomState;
import fr.Maxime3399.MCube.actions.reloadConfig;
import fr.Maxime3399.MCube.cos.baliseDeathEffect;
import fr.Maxime3399.MCube.cos.bloodDeathEffect;
import fr.Maxime3399.MCube.cos.boneDeathEffect;
import fr.Maxime3399.MCube.cos.cielDeathEffect;
import fr.Maxime3399.MCube.cos.explodeDeathEffect;
import fr.Maxime3399.MCube.events.EventsManager;
import fr.Maxime3399.MCube.homes.DeleteHomes;
import fr.Maxime3399.MCube.homes.HomesTP;
import fr.Maxime3399.MCube.homes.SetHomes;
import fr.Maxime3399.MCube.manager.SentinelFunction;
import fr.Maxime3399.MCube.manager.VanishManager;
import fr.Maxime3399.MCube.menus.MainMenu;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.start.AntiSpawnStart;
import fr.Maxime3399.MCube.start.AntiWeatherStart;
import fr.Maxime3399.MCube.start.ChestFinderStart;
import fr.Maxime3399.MCube.start.DoubleLifeStart;
import fr.Maxime3399.MCube.start.EternalDayStart;
import fr.Maxime3399.MCube.start.EternalNightStart;
import fr.Maxime3399.MCube.start.HalfLifeStart;
import fr.Maxime3399.MCube.start.HasteStart;
import fr.Maxime3399.MCube.start.MobMoneyStart;
import fr.Maxime3399.MCube.start.MobTrophiesStart;
import fr.Maxime3399.MCube.start.MoneyTimeStart;
import fr.Maxime3399.MCube.start.NoFoodStart;
import fr.Maxime3399.MCube.start.NoRegenStart;
import fr.Maxime3399.MCube.start.PvPStart;
import fr.Maxime3399.MCube.start.TrophiesTimeStart;
import fr.Maxime3399.MCube.start.UselessEventStart;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import fr.Maxime3399.MCube.utils.MySQLUtils;
import fr.Maxime3399.MCube.utils.selectStaff;
import java.io.File;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin{
	
  public static String specialevent = "";
  private static MainClass instance;
  private static Economy economy = null;
  
  public static MainClass getInstance() { return instance; }
  
  public static DisguiseAPI disguise(){
	  
    return api;
    
  }
  
  public void onEnable(){
	  
    setupEconomy();
    
    MySQLUtils.connect();
    GameState.setState(GameState.NONE);
    EventsManager.registerEvents(this);
    randomState.start();
    OneHourStarter.start();
    
    File f = new File(getDataFolder(), "config.yml");
    if (!f.exists()) {
      getConfig().options().copyDefaults();
      saveDefaultConfig();
    }
    
    reloadConfig.start();
    fr.Maxime3399.MCube.schedulers.cancelVanishScheduler.start();
    
    getServer().createWorld(new WorldCreator("spawn"));
    
    instance = this;
    
    api = (DisguiseAPI)getServer().getServicesManager().getRegistration(DisguiseAPI.class).getProvider();
    
  }
  

  private boolean setupEconomy(){
	  
    RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(Economy.class);
    
    if (economyProvider != null){
    	
      economy = (Economy)economyProvider.getProvider();
      
    }
    
    return economy != null;
    
  }
  
  public static Economy getEcononomy(){
	  
    return economy;
    
  }
  
  public void onDisable(){
	  
    for (Player pls : Bukkit.getOnlinePlayers()) {
    	
      pls.kickPlayer("§6§lRedémarrage du serveur en cours...");
      
    }
    
    if(GameState.isState(GameState.ETERNALDAY)){
      EternalDayStart.stop();
    }else if (GameState.isState(GameState.ETERNALNIGHT)){
      EternalNightStart.stop();
    }else if (GameState.isState(GameState.PVP)){
      PvPStart.stop();
    }else if (GameState.isState(GameState.KEEPINVENTORY)){
      fr.Maxime3399.MCube.start.KeepInventoryStart.stop();
    }else if (GameState.isState(GameState.MOBMONEY)){
      MobMoneyStart.stop();
    }else if (GameState.isState(GameState.MOBTROPHIES)){
      MobTrophiesStart.stop();
    }else if (GameState.isState(GameState.DOUBLELIFE)){
      DoubleLifeStart.stop();
    }else if (GameState.isState(GameState.MONEYTIME)){
      MoneyTimeStart.stop();
    }else if (GameState.isState(GameState.TROPHIESTIME)){
      TrophiesTimeStart.stop();
    }else if (GameState.isState(GameState.ANTIWEATHER)){
      AntiWeatherStart.stop();
    }else if (GameState.isState(GameState.NOFOOD)){
      NoFoodStart.stop();
    }else if (GameState.isState(GameState.NOREGEN)){
      NoRegenStart.stop();
    }else if (GameState.isState(GameState.USELESSEVNT)){
      UselessEventStart.stop();
    }else if (GameState.isState(GameState.HASTE)){
      HasteStart.stop();
    }else if (GameState.isState(GameState.ANTISPAWN)){
      AntiSpawnStart.stop();
    }else if (GameState.isState(GameState.CHESTFINDER)){
      ChestFinderStart.stop();
    }else if (GameState.isState(GameState.HALFLIFE)){
      HalfLifeStart.stop();
    }
    
    for(Item i : bloodDeathEffect.al){
    	
      for(Player pls : Bukkit.getOnlinePlayers()){
    	  
        pls.playSound(i.getLocation(), Sound.ENTITY_CHICKEN_EGG, 40, 2);
        
      }
      
      i.remove();
      
    }
    
    for(Item i : boneDeathEffect.al){
    	
      for(Player pls : Bukkit.getOnlinePlayers()){
    	  
        pls.playSound(i.getLocation(), Sound.ENTITY_CHICKEN_EGG, 40, 2);
        
      }
      
      i.remove();
      
    }
    
    for(Entity i : fr.Maxime3399.MCube.cos.textDeathEffect.AL){
      i.remove();
    }
    for(Entity i : explodeDeathEffect.AL){
      i.remove();
    }
    for(Entity i : fr.Maxime3399.MCube.cos.corpseDeathEffect.al){
      i.remove();
    }
    for(Entity i : cielDeathEffect.al){
      i.remove();
    }
    for(Entity i : fr.Maxime3399.MCube.cos.enferDeathEffect.al){
      i.remove();
    }
    for(Entity i : baliseDeathEffect.al){
      i.remove();
    }
    for(Entity i : SentinelFunction.al){
      i.remove();
    }
    
  }
  

  private static DisguiseAPI api;
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	  
    if(cmd.getName().equalsIgnoreCase("menu")){
    	
      Player p = (Player)sender;
      MainMenu.openMenu(p);
      
    }else if (cmd.getName().equalsIgnoreCase("home")){
    	
      Player p = (Player)sender;
      
      if(args.length == 1){
      	
          HomesTP.tp(p, args[0]);
          
        }else{
        	
          p.sendMessage(fr.Maxime3399.MCube.homes.HomesList.get(p));
          
        }
      
    }else if (cmd.getName().equalsIgnoreCase("sethome")){
    	
      Player p = (Player)sender;
      
      if(args.length == 1){
      	
          SetHomes.set(p, args[0]);
          
        }else{
        	
          p.sendMessage("§eUtilisation : /sethome [NOM]");
          
        }
      
    }else if (cmd.getName().equalsIgnoreCase("delhome")){
    	
      Player p = (Player)sender;
      
      if(args.length == 1){
      	
          DeleteHomes.del(p, args[0]);
          
        }else{
        	
          p.sendMessage("§eUtilisation : /delhome [NOM]");
          
        }
      
      }else if (cmd.getName().equalsIgnoreCase("pay")){
    	  
        Player p = (Player)sender;
        
        if (args.length == 2){
        	
          String player = args[0];
          String cc = args[1];
          
          if (Bukkit.getPlayer(player) == null){
        	  
            p.sendMessage("§cCe joueur n'est pas connecté !");
            p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100.0F, 2.0F);


          }else if((cc.contains("-")) || (cc.contains(".")) || (cc.contains(","))){
        	  
            p.sendMessage("§cIl est seulement possible d'envoyer un nombre de coins positif et entié.");
            
          }else{
        	  
            int coins = 0;
            
            try{
            	
              coins = Integer.parseInt(cc);
              
            }catch (NumberFormatException e){
            	
              e.printStackTrace();
              
            }
            
            if(MCubeAPI.getPlayerCoins(p) >= coins){
            	
              MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) - coins);
              economy.withdrawPlayer(p, coins);
              MCubeAPI.setCoins(Bukkit.getPlayer(player), MCubeAPI.getPlayerCoins(Bukkit.getPlayer(player)) + coins);
              economy.depositPlayer(Bukkit.getPlayer(player).getName(), coins);
              p.sendMessage("§aTu as envoyé §6" + coins + " coins §r§a  §r§b" + Bukkit.getPlayer(player).getName() + " §r§a!");
              Bukkit.getPlayer(player).sendMessage("§aTu as reçu §6" + coins + " coins §r§ade la part de §b" + p.getName() + " §r§a!");
              for(Player pls : Bukkit.getOnlinePlayers()){
            	  ScoreboardGame.loadScoreboard(pls);
              }
              
            }else{
            	
              p.sendMessage("§cTu n'as pas assez de §r§c§lcoins§r§c, il est possible d'en acheter ici : §r§ohttp://maxime3399.fr/?page_id=17§r §c!");
              p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
              
            }
            
          }

        }else{

          p.sendMessage("§eUtilisation : /pay [PSEUDO] [MONTANT]");
          
        }
        
      }else if (cmd.getName().equalsIgnoreCase("tphere")){
    	  
        Player p = (Player)sender;
        
        if (args.length == 1){
      	  
            TpHere.tpTo(p, args[0]);
            
          }else{
        	  
            p.sendMessage("§eUtilisation : /tphere [PSEUDO]");
            
          }
        
      }else if (cmd.getName().equalsIgnoreCase("tpyes")){
    	  
        Player p = (Player)sender;
        TpHere.acceptTp(p);
        
        TpHere.acceptTp(p);
        
      }else if (cmd.getName().equalsIgnoreCase("equals")){
    	  
        Player p = (Player)sender;
        
        if (args.length == 1){
        	
          EqualsCommand.demand(p, args[0]);
          
        }else{
        	
          p.sendMessage("§eUtilisation : /equals [PSEUDO]");
          
        }
        
      }else if (cmd.getName().equalsIgnoreCase("equalsyes")){
    	  
        Player p = (Player)sender;
        EqualsCommand.accept(p);
        
      }else if (cmd.getName().equalsIgnoreCase("go")){
    	  
        Player p = (Player)sender;
        
        if(selectStaff.isStaff(p)){
      	  
            if(args.length == 1){
            	
              String name = args[0];
              
              if (Bukkit.getPlayer(name) == null){
            	  
                p.sendMessage("§cCe joueur n'est pas connecté !");
                p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100.0F, 2.0F);

              }else{
            	  
            	  p.teleport(Bukkit.getPlayer(name).getLocation());
            	  
              }

            }else{

              p.sendMessage("§eUtilisation : /go [PSEUDO]");
              
            }
            
          }else{
        	  
            p.sendMessage("§cTu n'as pas la permission !");
            p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
            
          }
        
      }else if (cmd.getName().equalsIgnoreCase("maintenance")){
    	  
        Player p = (Player)sender;
        
        if(MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")){
        	
          if(args.length == 1){
        	  
            if(args[0].equalsIgnoreCase("true")){
            	
              fr.Maxime3399.MCube.utils.MCUtilsFonction.maintenance = "true";
              
              for(Player pls : Bukkit.getOnlinePlayers()){
            	  
                pls.kickPlayer(Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("MaintenanceMessage").replaceAll("&", "Â§"));
                
              }
              
            }else{
            	
              fr.Maxime3399.MCube.utils.MCUtilsFonction.maintenance = "false";
              
            }

          }else{
        	  
            p.sendMessage("§eUtilisation : /maintenance [VALEUR]");
            
          }
          
        }else{
        	
          p.sendMessage("§cTu n'as pas la permission !");
          p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
          
        }
        
      }else if (cmd.getName().equalsIgnoreCase("close")){
    	  
        Player p = (Player)sender;
        
        if(MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")){
        	
          if(args.length == 1){
        	  
            if(args[0].equalsIgnoreCase("true")){
            	
              fr.Maxime3399.MCube.utils.MCUtilsFonction.close = "true";
              for (Player pls : Bukkit.getOnlinePlayers()) {
                pls.kickPlayer(Bukkit.getPluginManager().getPlugin("M-Cube").getConfig().getString("CloseMessage").replaceAll("&", "Â§"));
              }
              
            }else{
            	
              fr.Maxime3399.MCube.utils.MCUtilsFonction.close = "false";
              
            }

          }else{
        	  
            p.sendMessage("§eUtilisation : /close [VALEUR]");
            
          }
          
        }else{
        	
          p.sendMessage("§cTu n'as pas la permission !");
          p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
          
        }
        
      }else if (cmd.getName().equalsIgnoreCase("shop")){
    	  
        if((sender instanceof ConsoleCommandSender)){
        	
          String name = args[0];
          String type = args[1];
          
          if (type.equalsIgnoreCase("rank")){
        	  
            String rank = args[2];
            
            MCubeAPI.setRank(Bukkit.getPlayer(name), rank);
            MCubeAPI.setDonator(Bukkit.getPlayer(name), "true");
            
            for (Player pls : Bukkit.getOnlinePlayers()){
            	
              ScoreboardGame.loadScoreboard(pls);
              DisplayNameUtils.setDisplayName(pls);
              
              if(MCubeAPI.getPlayerRank(pls).equalsIgnoreCase("ultravip")){
            	  
                pls.setAllowFlight(true);
                
              }
              
              if(MCubeAPI.getPlayerRank(pls).equalsIgnoreCase("ultravip+")){
            	  
                pls.setAllowFlight(true);
                
              }
              
              pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 100, 1);
              
            }
            
            String ras = "ERROR";
            if(rank.equalsIgnoreCase("ultravip+")){
              ras = "Â§2Â§lUltraVIP+";
            }else if (rank.equalsIgnoreCase("ultravip")){
              ras = "Â§aÂ§lUltraVIP";
            }else if (rank.equalsIgnoreCase("vip+")){
              ras = "Â§bÂ§lVIP+";
            }else if (rank.equalsIgnoreCase("vip")){
              ras = "Â§eÂ§lVIP";
            }else{
              ras = "Â§fÂ§lMini-VIP";
            }
            
            Bukkit.getPlayer(name).sendMessage("   Â§aÂ§lMerci de ton achat !Â§r");
            Bukkit.broadcastMessage("Â§b" + name + " Â§rÂ§3est maintenant Â§r" + ras + " Â§rÂ§3!");

          }else if (type.equalsIgnoreCase("coins")){
        	  
            String c = args[2];
            int coins = 0;
            
            try {
            	
              coins = Integer.parseInt(c);
              
            } catch (NumberFormatException e) {
            	
              e.printStackTrace();
              
            }
            
            MCubeAPI.setCoins(Bukkit.getPlayer(name), MCubeAPI.getPlayerCoins(Bukkit.getPlayer(name)) + coins);
            economy.depositPlayer(Bukkit.getPlayer(name).getName(), coins);
            MCubeAPI.setDonator(Bukkit.getPlayer(name), "true");
            
            for (Player pls : Bukkit.getOnlinePlayers()) {
            	
              DisplayNameUtils.setDisplayName(pls);
              ScoreboardGame.loadScoreboard(pls);
              
            }
            
            Bukkit.getPlayer(name).sendMessage("   §a§lMerci de ton achat !§r");
            Bukkit.getPlayer(name).playSound(Bukkit.getPlayer(name).getLocation(), Sound.ENTITY_WITHER_SHOOT, 100, 2);
            
          }else{
        	  
            if (type.equalsIgnoreCase("chests")){
            	
              String c = args[2];
              int chests = 0;
              
              try {
            	  
                chests = Integer.parseInt(c);
                
              } catch (NumberFormatException e) {
            	  
                e.printStackTrace();
                
              }
              
              MCubeAPI.setChests(Bukkit.getPlayer(name), "cos", MCubeAPI.getChests(Bukkit.getPlayer(name), "cos") + chests);
              MCubeAPI.setDonator(Bukkit.getPlayer(name), "true");
              
              for(Player pls : Bukkit.getOnlinePlayers()){
            	  
            	  DisplayNameUtils.setDisplayName(pls);
                  ScoreboardGame.loadScoreboard(pls);
            	  
              }
              
              Bukkit.getPlayer(name).sendMessage("   §a§lMerci de ton achat !§r");
              Bukkit.getPlayer(name).playSound(Bukkit.getPlayer(name).getLocation(), Sound.ENTITY_WITHER_SHOOT, 100, 2);
              
            }else if (type.equalsIgnoreCase("morph")){
            	
              String morph = args[2];
              
              MCubeAPI.setCos(Bukkit.getPlayer(name), morph, "true");
              MCubeAPI.setDonator(Bukkit.getPlayer(name), "true");
              for (Player pls : Bukkit.getOnlinePlayers()) {
            	  
                DisplayNameUtils.setDisplayName(pls);
                ScoreboardGame.loadScoreboard(pls);
                
              }
              
              Bukkit.getPlayer(name).sendMessage("   §a§lMerci de ton achat !§r");
              Bukkit.getPlayer(name).playSound(Bukkit.getPlayer(name).getLocation(), Sound.ENTITY_WITHER_SHOOT, 100, 2);
              
            }else{
            	
              String c = args[2];
              int pass = 0;
              
              try {
            	  
                pass = Integer.parseInt(c);
                
              } catch (NumberFormatException e) {
            	  
                e.printStackTrace();
                
              }
              
              MCubeAPI.setPass(Bukkit.getPlayer(name), MCubeAPI.getPlayerPass(Bukkit.getPlayer(name)) + pass);
              MCubeAPI.setDonator(Bukkit.getPlayer(name), "true");
              for (Player pls : Bukkit.getOnlinePlayers()) {
            	  
                DisplayNameUtils.setDisplayName(pls);
                ScoreboardGame.loadScoreboard(pls);
                
              }
              
              Bukkit.getPlayer(name).sendMessage("   §a§lMerci de ton achat !§r");
              Bukkit.getPlayer(name).playSound(Bukkit.getPlayer(name).getLocation(), Sound.ENTITY_WITHER_SHOOT, 100, 2);
            }
            
          }
          
        }else{
        	
          Player p = (Player)sender;
          
          p.sendMessage("§cTu n'as pas la permission !");
          p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
          
        }
        
      }else if ((cmd.getName().equalsIgnoreCase("v")) || (cmd.getName().equalsIgnoreCase("vanish"))){
    	  
        Player p = (Player)sender;
        
        if (selectStaff.isStaff(p)){
        	
          VanishManager.setVanish(p);
          
        }else{
        	
          p.sendMessage("§cTu n'as pas la permission !");
          p.playSound(p.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 100, 2);
          
        }
        
      }else if (cmd.getName().equalsIgnoreCase("spawn")){
    	  
        Player p = (Player)sender;
        goSpawn.start(p);
        
      }else if (cmd.getName().equalsIgnoreCase("test")){
    	  
        Player p = (Player)sender;
        
        if (MCubeAPI.getStaffRank(p).equalsIgnoreCase("admin")){
        	
          fr.Maxime3399.MCube.manager.FakePlayers.name = args[0];
          p.sendMessage("OK");
          
        }
        
      }
    
    return true;
    
  }
  
}
