package fr.Maxime3399.MCube.actions;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.custom.GameEvent;
import fr.Maxime3399.MCube.events.RewardsEvents;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class EventsActions {
	
	public static void setlectRandomEvent(){
		
		StopEvent();
		
		ArrayList<GameEvent> list = new ArrayList<>();
		for(GameEvent event : GameEvent.values()){
			if(event != GameEvent.NONE){
				list.add(event);
			}
		}
		
		Random r = new Random();
		GameEvent event = list.get(r.nextInt(list.size()));
		GameEvent.setEvent(event);
		for(Player pls : Bukkit.getOnlinePlayers()){
			pls.playSound(pls.getLocation(), Sound.ENTITY_WITHER_SPAWN, 100, 2);
			pls.sendMessage("§aLe nouvel event est §b§l"+DisplayerUtils.getEventName()+"§r §a!");
			MainScoreboard.loadScoreboard(pls);
		}
		if(GameEvent.isEvent(GameEvent.ETERNALDAY)){
			StartEternalDay();
		}else if(GameEvent.isEvent(GameEvent.ETERNALNIGHT)){
			StartEternalNight();
		}else if(GameEvent.isEvent(GameEvent.SPEEDTIME)){
			StartSpeedTime();
		}else if(GameEvent.isEvent(GameEvent.ANTIWEATHER)){
			StartAntiWeather();
		}else if(GameEvent.isEvent(GameEvent.DOUBLELIFE)){
			StartDoubleLife();
		}else if(GameEvent.isEvent(GameEvent.HALFLIFE)){
			StartHalfLife();
		}else if(GameEvent.isEvent(GameEvent.NOFOOD)){
			StartNoFood();
		}else if(GameEvent.isEvent(GameEvent.NOREGEN)){
			StartNoRegen();
		}else if(GameEvent.isEvent(GameEvent.MONEYTIME)){
			StartMoneyTime();
		}else if(GameEvent.isEvent(GameEvent.TROPHIESTIME)){
			StartTrophiesTime();
		}else if(GameEvent.isEvent(GameEvent.HASTE)){
			StartHaste();
		}else if(GameEvent.isEvent(GameEvent.RESISTANCE)){
			StartResistance();
		}else if(GameEvent.isEvent(GameEvent.FORCE)){
			StartForce();
		}else if(GameEvent.isEvent(GameEvent.SPEED)){
			StartSpeed();
		}else if(GameEvent.isEvent(GameEvent.SLOWNESS)){
			StartSlowness();
		}else if(GameEvent.isEvent(GameEvent.CRYSTALSFINDER)){
			StartCrystalsFinder();
		}else if(GameEvent.isEvent(GameEvent.CHESTFINDER)){
			StartChestFinder();
		}
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static void StopEvent(){
		
		if(GameEvent.isEvent(GameEvent.ETERNALDAY) || GameEvent.isEvent(GameEvent.ETERNALNIGHT)){
			for(World w : Bukkit.getWorlds()){
				w.setGameRuleValue("doDaylightCycle", "true");
			}
		}else if(GameEvent.isEvent(GameEvent.SPEEDTIME)){
			Bukkit.getScheduler().cancelTask(TaskSpeedTime);
			for(World w : Bukkit.getWorlds()){
				w.setGameRuleValue("randomTickSpeed", "3");
			}
		}else if(GameEvent.isEvent(GameEvent.ANTIWEATHER)){
			for(World w : Bukkit.getWorlds()){
				w.setGameRuleValue("doWeatherCycle", "false");
			}
		}else if(GameEvent.isEvent(GameEvent.DOUBLELIFE)){
			for(Player pls : Bukkit.getOnlinePlayers()){
				if(pls.getHealth() > 20){
					pls.setHealth(20);
				}
				pls.setMaxHealth(20);
			}
		}else if(GameEvent.isEvent(GameEvent.HALFLIFE)){
			for(Player pls : Bukkit.getOnlinePlayers()){
				pls.setMaxHealth(20);
			}
		}else if(GameEvent.isEvent(GameEvent.NOFOOD)){
			for(Player pls : Bukkit.getOnlinePlayers()){
				if(pls.getFoodLevel() > 20){
					pls.setFoodLevel(20);
				}
			}
		}else if(GameEvent.isEvent(GameEvent.NOREGEN)){
			for(World w : Bukkit.getWorlds()){
				w.setGameRuleValue("naturalRegeneration", "true");
			}
		}else if(GameEvent.isEvent(GameEvent.MONEYTIME)){
			Bukkit.getScheduler().cancelTask(TaskMoneyTime);
		}else if(GameEvent.isEvent(GameEvent.TROPHIESTIME)){
			Bukkit.getScheduler().cancelTask(TaskTrophiesTime);
		}else if(GameEvent.isEvent(GameEvent.EXPLOREMONEY) || GameEvent.isEvent(GameEvent.EXPLORETROPHIES)){
			RewardsEvents.StopExploreEvent();
		}else if(GameEvent.isEvent(GameEvent.HASTE)){
			Bukkit.getScheduler().cancelTask(TaskHaste);
		}else if(GameEvent.isEvent(GameEvent.RESISTANCE)){
			Bukkit.getScheduler().cancelTask(TaskResistance);
		}else if(GameEvent.isEvent(GameEvent.FORCE)){
			Bukkit.getScheduler().cancelTask(TaskForce);
		}else if(GameEvent.isEvent(GameEvent.SPEED)){
			Bukkit.getScheduler().cancelTask(TaskSpeed);
		}else if(GameEvent.isEvent(GameEvent.SLOWNESS)){
			Bukkit.getScheduler().cancelTask(TaskSlowness);
		}else if(GameEvent.isEvent(GameEvent.CRYSTALSFINDER)){
			Bukkit.getScheduler().cancelTask(TaskCrystalsFinder);
		}else if(GameEvent.isEvent(GameEvent.CHESTFINDER)){
			Bukkit.getScheduler().cancelTask(TaskChestFinder);
		}
		
		GameEvent.setEvent(GameEvent.NONE);
		
	}
	
	private static void StartEternalDay(){
		for(World w : Bukkit.getWorlds()){
			w.setGameRuleValue("doDaylightCycle", "false");
		}
		Bukkit.getWorld("world").setTime(1000);
	}
	
	private static void StartEternalNight(){
		for(World w : Bukkit.getWorlds()){
			w.setGameRuleValue("doDaylightCycle", "false");
		}
		Bukkit.getWorld("world").setTime(18000);
	}
	
	private static int TaskSpeedTime;
	private static void StartSpeedTime(){
		for(World w : Bukkit.getWorlds()){
			w.setGameRuleValue("randomTickSpeed", "500");
		}
		TaskSpeedTime = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				Bukkit.getWorld("world").setTime(Bukkit.getWorld("world").getFullTime()+30);
			}
		}, 1, 1);
	}
	
	private static void StartAntiWeather(){
		for(World w : Bukkit.getWorlds()){
			w.setGameRuleValue("doWeatherCycle", "false");
		}
	}
	
	@SuppressWarnings("deprecation")
	private static void StartDoubleLife(){
		for(Player pls : Bukkit.getOnlinePlayers()){
			pls.setMaxHealth(40);
		}
	}
	
	@SuppressWarnings("deprecation")
	private static void StartHalfLife(){
		for(Player pls : Bukkit.getOnlinePlayers()){
			if(pls.getHealth() > 10){
				pls.setHealth(10);
			}
			pls.setMaxHealth(10);
		}
	}
	
	private static void StartNoFood(){
		for(Player pls : Bukkit.getOnlinePlayers()){
			pls.setFoodLevel(21);
		}
	}
	
	private static void StartNoRegen(){
		for(World w : Bukkit.getWorlds()){
			w.setGameRuleValue("naturalRegeneration", "false");
		}
	}
	
	private static int TaskMoneyTime;
	private static void StartMoneyTime(){
		TaskMoneyTime = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					Random r = new Random();
					if(r.nextInt(3) == 0){
						RewardsActions.giveCoins(pls, 1);
					}
				}
			}
		}, 600, 600);
	}
	
	private static int TaskTrophiesTime;
	private static void StartTrophiesTime(){
		TaskTrophiesTime = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					Random r = new Random();
					if(r.nextInt(3) == 0){
						RewardsActions.giveTrophies(pls, 1);
					}
				}
			}
		}, 600, 600);
	}
	
	private static int TaskHaste;
	private static void StartHaste(){
		TaskHaste = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 30, 3));
				}
			}
		}, 5, 5);
	}
	
	private static int TaskResistance;
	private static void StartResistance(){
		TaskResistance = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 30, 1));
				}
			}
		}, 5, 5);
	}
	
	private static int TaskForce;
	private static void StartForce(){
		TaskForce = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 30, 1));
				}
			}
		}, 5, 5);
	}
	
	private static int TaskSpeed;
	private static void StartSpeed(){
		TaskSpeed = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 30, 1));
				}
			}
		}, 5, 5);
	}
	
	private static int TaskSlowness;
	private static void StartSlowness(){
		TaskSlowness = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					pls.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30, 0));
				}
			}
		}, 5, 5);
	}
	
	private static int TaskCrystalsFinder;
	private static void StartCrystalsFinder(){
		TaskCrystalsFinder = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					Random r = new Random();
					if(r.nextInt(35) == 0){
						RewardsActions.giveCrystals(pls, 1);
					}
				}
			}
		}, 1100, 1100);
	}
	
	private static int TaskChestFinder;
	private static void StartChestFinder(){
		TaskChestFinder = Bukkit.getScheduler().scheduleSyncRepeatingTask(MainClass.getInstance(), new Runnable() {
			@Override
			public void run() {
				for(Player pls : Bukkit.getOnlinePlayers()){
					Random r = new Random();
					if(r.nextInt(60) == 0){
						ChestActions.giveRandomChest(pls);
					}
				}
			}
		}, 2000, 2000);
	}

}
