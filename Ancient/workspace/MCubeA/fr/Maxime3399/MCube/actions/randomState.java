package fr.Maxime3399.MCube.actions;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.start.AntiSpawnStart;
import fr.Maxime3399.MCube.start.AntiWeatherStart;
import fr.Maxime3399.MCube.start.ChestFinderStart;
import fr.Maxime3399.MCube.start.DoubleLifeStart;
import fr.Maxime3399.MCube.start.EternalDayStart;
import fr.Maxime3399.MCube.start.EternalNightStart;
import fr.Maxime3399.MCube.start.HalfLifeStart;
import fr.Maxime3399.MCube.start.HasteStart;
import fr.Maxime3399.MCube.start.KeepInventoryStart;
import fr.Maxime3399.MCube.start.MobMoneyStart;
import fr.Maxime3399.MCube.start.MobTrophiesStart;
import fr.Maxime3399.MCube.start.MoneyTimeStart;
import fr.Maxime3399.MCube.start.NoFoodStart;
import fr.Maxime3399.MCube.start.NoRegenStart;
import fr.Maxime3399.MCube.start.PvPStart;
import fr.Maxime3399.MCube.start.TrophiesTimeStart;
import fr.Maxime3399.MCube.start.UselessEventStart;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class randomState{
  
  public static void start(){
	  
    if (GameState.isState(GameState.ETERNALDAY)) {
      EternalDayStart.stop();
    } else if (GameState.isState(GameState.ETERNALNIGHT)) {
      EternalNightStart.stop();
    } else if (GameState.isState(GameState.PVP)) {
      PvPStart.stop();
    } else if (GameState.isState(GameState.KEEPINVENTORY)) {
      KeepInventoryStart.stop();
    } else if (GameState.isState(GameState.MOBMONEY)) {
      MobMoneyStart.stop();
    } else if (GameState.isState(GameState.MOBTROPHIES)) {
      MobTrophiesStart.stop();
    } else if (GameState.isState(GameState.DOUBLELIFE)) {
      DoubleLifeStart.stop();
    } else if (GameState.isState(GameState.MONEYTIME)) {
      MoneyTimeStart.stop();
    } else if (GameState.isState(GameState.TROPHIESTIME)) {
      TrophiesTimeStart.stop();
    } else if (GameState.isState(GameState.ANTIWEATHER)) {
      AntiWeatherStart.stop();
    } else if (GameState.isState(GameState.NOFOOD)) {
      NoFoodStart.stop();
    } else if (GameState.isState(GameState.NOREGEN)) {
      NoRegenStart.stop();
    } else if (GameState.isState(GameState.USELESSEVNT)) {
      UselessEventStart.stop();
    } else if (GameState.isState(GameState.HASTE)) {
      HasteStart.stop();
    } else if (GameState.isState(GameState.ANTISPAWN)) {
      AntiSpawnStart.stop();
    } else if (GameState.isState(GameState.CHESTFINDER)) {
      ChestFinderStart.stop();
    } else if (GameState.isState(GameState.HALFLIFE)) {
      fr.Maxime3399.MCube.start.HalfLifeStart.stop();
    }
    
    for (Player pls : Bukkit.getOnlinePlayers()) {
      ScoreboardGame.loadScoreboard(pls);
    }
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){
    	
      public void run() {
        Bukkit.broadcastMessage("§3Tirage du nouvel évènement dans 3 secondes !");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);
        }
      }
    }, 20);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        Bukkit.broadcastMessage("§3Tirage du nouvel évènement dans 2 secondes !");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);
        }
      }
    }, 40);
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
    {
      public void run() {
        Bukkit.broadcastMessage("§3Tirage du nouvel évènement dans 1 seconde !");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);
        }
      }
    }, 60);
    
    Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable(){

      public void run(){
    	  
        Random r = new Random();
        int state = r.nextInt(17);
        
        if (state == 0) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bEternal Day §r§3!");
          EternalDayStart.start();
        } else if (state == 1) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bEternal Night §r§3!");
          EternalNightStart.start();
        } else if (state == 2) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bPvP §r§3!");
          PvPStart.start();
        } else if (state == 3) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bKeep Inventory §r§3!");
          KeepInventoryStart.start();
        } else if (state == 4) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bMob Money §r§3!");
          MobMoneyStart.start();
        } else if (state == 5) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bMob Trophies §r§3!");
          MobTrophiesStart.start();
        } else if (state == 6) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bDouble Life §r§3!");
          DoubleLifeStart.start();
        } else if (state == 7) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bMoney Time §r§3!");
          MoneyTimeStart.start();
        } else if (state == 8) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bTrophies Time §r§3!");
          TrophiesTimeStart.start();
        } else if (state == 9) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bAnti Weather §r§3!");
          AntiWeatherStart.start();
        } else if (state == 10) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bNo Food §r§3!");
          NoFoodStart.start();
        } else if (state == 11) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bNo Regen §r§3!");
          NoRegenStart.start();
        } else if (state == 12) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bUseless Event §r§3!");
          UselessEventStart.start();
        } else if (state == 13) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bHaste §r§3!");
          HasteStart.start();
        } else if (state == 14) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bAnti Spawn §r§3!");
          AntiSpawnStart.start();
        } else if (state == 15) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bChest Finder §r§3!");
          ChestFinderStart.start();
        } else if (state == 16) {
          Bukkit.broadcastMessage("§3Le nouvel évènement est §bHalf Life §r§3!");
          HalfLifeStart.start();
        }
        
        for (Player pls : Bukkit.getOnlinePlayers()) {
          pls.playSound(pls.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 2);
          fr.Maxime3399.MCube.scoreboards.ScoreboardGame.loadScoreboard(pls);
        }
        
      }
      
    }, 80);
    
  }
  
}
