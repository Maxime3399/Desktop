package fr.Maxime3399.ShinobiUtil.custom;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class Arena {
	
	private Location spawn1;
	private Location spawn2;
	private int count;
	private ArrayList<Player> players = new ArrayList<>();
	private HashMap<Block, Material> blocks = new HashMap<>();
	
	public Arena(Location spawn1, Location spawn2){
		
		this.spawn1 = spawn1;
		this.spawn2 = spawn2;
		
	}
	
	public boolean isIn(Player p){
		if(players.contains(p)){
			return true;
		}else{
			return false;
		}
	}
	
	public void removeBlock(Block b){
		blocks.remove(b);
	}
	
	public void addBlock(Block b){
		blocks.put(b, b.getType());
	}
	
	public HashMap<Block, Material> getBlocks(){
		return blocks;
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	public void addPlayer(Player p){
		players.add(p);
		count++;
	}
	
	public void removePlayer(Player p){
		players.remove(p);
		count--;
	}

	public Location getSpawn1() {
		return spawn1;
	}

	public void setSpawn1(Location spawn1) {
		this.spawn1 = spawn1;
	}

	public Location getSpawn2() {
		return spawn2;
	}

	public void setSpawn2(Location spawn2) {
		this.spawn2 = spawn2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
