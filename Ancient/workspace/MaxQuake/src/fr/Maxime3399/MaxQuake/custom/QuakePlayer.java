package fr.Maxime3399.MaxQuake.custom;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.utils.DataUtils;

public class QuakePlayer{
	
	private Player player;
	private UUID uuid;
	private String name;
	private String display_name;
	
	private int coins;
	private String items;
	private String enable;
	
	private int kills;
	private int death;
	private int booster_speed;
	private int booster_shoot;
	private int wins;
	private int plays;
	private int total_coins;
	
	private int current_kills;
	private int current_death;
	private int current_booster_speed;
	private int current_booster_shoot;
	
	private int win_coins;
	
	private int shootDelay;
	private boolean activeSpeedBooster = false;
	private boolean activeShootBooster = false;
	
	private String role;
	
	public QuakePlayer(Player p){
		
		this.setPlayer(p);
		this.uuid = p.getUniqueId();
		this.name = DataUtils.getPlayerStringInfo(uuid.toString(), "name");
		this.display_name = p.getDisplayName();
		this.coins = DataUtils.getPlayerIntInfo(uuid.toString(), "coins");
		this.items = DataUtils.getPlayerStringInfo(uuid.toString(), "items");
		this.enable = DataUtils.getPlayerStringInfo(uuid.toString(), "enable");
		this.kills = DataUtils.getPlayerIntInfo(uuid.toString(), "kills");
		this.death = DataUtils.getPlayerIntInfo(uuid.toString(), "death");
		this.booster_speed = DataUtils.getPlayerIntInfo(uuid.toString(), "booster_speed");
		this.booster_shoot = DataUtils.getPlayerIntInfo(uuid.toString(), "booster_shoot");
		this.wins = DataUtils.getPlayerIntInfo(uuid.toString(), "win");
		this.plays = DataUtils.getPlayerIntInfo(uuid.toString(), "play");
		this.total_coins = DataUtils.getPlayerIntInfo(uuid.toString(), "totalCoins");
		
	}
	
	public void update(){
		
		DataUtils.setPlayerStringInfo(uuid.toString(), "name", name);
		DataUtils.setPlayerIntInfo(uuid.toString(), "coins", coins);
		DataUtils.setPlayerStringInfo(uuid.toString(), "items", items);
		DataUtils.setPlayerStringInfo(uuid.toString(), "enable", enable);
		DataUtils.setPlayerIntInfo(uuid.toString(), "kills", kills);
		DataUtils.setPlayerIntInfo(uuid.toString(), "death", death);
		DataUtils.setPlayerIntInfo(uuid.toString(), "booster_speed", booster_speed);
		DataUtils.setPlayerIntInfo(uuid.toString(), "booster_shoot", booster_shoot);
		DataUtils.setPlayerIntInfo(uuid.toString(), "win", wins);
		DataUtils.setPlayerIntInfo(uuid.toString(), "play", plays);
		DataUtils.setPlayerIntInfo(uuid.toString(), "totalCoins", total_coins);
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeath() {
		return death;
	}

	public void setDeath(int death) {
		this.death = death;
	}

	public int getBooster_speed() {
		return booster_speed;
	}

	public void setBooster_speed(int booster_speed) {
		this.booster_speed = booster_speed;
	}

	public int getBooster_shoot() {
		return booster_shoot;
	}

	public void setBooster_shoot(int booster_shoot) {
		this.booster_shoot = booster_shoot;
	}

	public int getCurrent_kills() {
		return current_kills;
	}

	public void setCurrent_kills(int current_kills) {
		this.current_kills = current_kills;
	}

	public int getCurrent_death() {
		return current_death;
	}

	public void setCurrent_death(int current_death) {
		this.current_death = current_death;
	}

	public int getCurrent_booster_speed() {
		return current_booster_speed;
	}

	public void setCurrent_booster_speed(int current_booster_speed) {
		this.current_booster_speed = current_booster_speed;
	}

	public int getCurrent_booster_shoot() {
		return current_booster_shoot;
	}

	public void setCurrent_booster_shoot(int current_booster_shoot) {
		this.current_booster_shoot = current_booster_shoot;
	}

	public int getWin_coins() {
		return win_coins;
	}

	public void setWin_coins(int win_coins) {
		this.win_coins = win_coins;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getShootDelay() {
		return shootDelay;
	}

	public void setShootDelay(int shootDelay) {
		this.shootDelay = shootDelay;
	}

	public boolean isActiveSpeedBooster() {
		return activeSpeedBooster;
	}

	public void setActiveSpeedBooster(boolean activeSpeedBooster) {
		this.activeSpeedBooster = activeSpeedBooster;
	}

	public boolean isActiveShootBooster() {
		return activeShootBooster;
	}

	public void setActiveShootBooster(boolean activeShootBooster) {
		this.activeShootBooster = activeShootBooster;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}

	public int getTotal_coins() {
		return total_coins;
	}

	public void setTotal_coins(int total_coins) {
		this.total_coins = total_coins;
	}

}
