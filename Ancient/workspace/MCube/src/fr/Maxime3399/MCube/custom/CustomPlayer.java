package fr.Maxime3399.MCube.custom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.entity.Player;

import fr.Maxime3399.MCube.utils.DataUtils;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class CustomPlayer{
	
	private Player player;
	private String uuid;
	private String name;
	private String rank;
	private String staff;
	private int coins;
	private int trophies;
	private int crystals;
	private int data;
	private String displayName;
	private int quest;
	private int questC1;
	private int questC2;
	private int questC3;
	private int pass;
	private String lastConnexion;
	private int chest1;
	private int chest2;
	private int chest3;
	private int chest4;
	private int chest5;
	private int chest6;
	private int chest7;
	private int chest8;
	private int chest9;
	private int chest10;
	private String buyChestDate;
	private String expireChestDate;
	private String prefix;
	
	public CustomPlayer(Player p){
		
		player = p;
		uuid = p.getUniqueId().toString();
		name = p.getName();
		rank = DataUtils.getPlayerRank(p);
		staff = DataUtils.getPlayerStaff(p);
		coins = DataUtils.getPlayerCoins(p);
		trophies = DataUtils.getPlayerTrophies(p);
		crystals = DataUtils.getPlayerCrystals(p);
		data = DataUtils.getPlayerData(p);
		displayName = DisplayerUtils.getCalculedPlayerDisplayName(p);
		quest = DataUtils.getPlayerQuest(p);
		questC1 = DataUtils.getPlayerQuestCounter(p, 1);
		questC2 = DataUtils.getPlayerQuestCounter(p, 2);
		questC3 = DataUtils.getPlayerQuestCounter(p, 3);
		pass = DataUtils.getPlayerPass(p);
		lastConnexion = DataUtils.getPlayerLastConnexion(p);
		chest1 = DataUtils.getPlayerChests(p, 1);
		chest2 = DataUtils.getPlayerChests(p, 2);
		chest3 = DataUtils.getPlayerChests(p, 3);
		chest4 = DataUtils.getPlayerChests(p, 4);
		chest5 = DataUtils.getPlayerChests(p, 5);
		chest6 = DataUtils.getPlayerChests(p, 6);
		chest7 = DataUtils.getPlayerChests(p, 7);
		chest8 = DataUtils.getPlayerChests(p, 8);
		chest9 = DataUtils.getPlayerChests(p, 9);
		chest10 = DataUtils.getPlayerChests(p, 10);
		buyChestDate = DataUtils.getPlayerBuyChestDate(p);
		expireChestDate = DataUtils.getPlayerExpireChestDate(p);
		prefix = DataUtils.getPlayerPrefix(p);
		
	}
	
	public void update(){
		
		if(!rank.equalsIgnoreCase(DataUtils.getPlayerName(player))){
			DataUtils.setPlayeRank(player, rank);
		}
		if(!staff.equalsIgnoreCase(DataUtils.getPlayerStaff(player))){
			DataUtils.setPlayeStaff(player, staff);
		}
		if(coins != DataUtils.getPlayerCoins(player)){
			DataUtils.setPlayeCoins(player, coins);
		}
		if(trophies != DataUtils.getPlayerTrophies(player)){
			DataUtils.setPlayerTrophies(player, trophies);
		}
		if(crystals != DataUtils.getPlayerCrystals(player)){
			DataUtils.setPlayerCrystals(player, crystals);
		}
		if(data != DataUtils.getPlayerCrystals(player)){
			DataUtils.setPlayerCrystals(player, crystals);
		}
		if(quest != DataUtils.getPlayerQuest(player)){
			DataUtils.setPlayerQuest(player, quest);
		}
		if(questC1 != DataUtils.getPlayerQuestCounter(player, 1)){
			DataUtils.setPlayerQuestCounter(player, questC1, 1);
		}
		if(questC2 != DataUtils.getPlayerQuestCounter(player, 2)){
			DataUtils.setPlayerQuestCounter(player, questC2, 2);
		}
		if(questC3 != DataUtils.getPlayerQuestCounter(player, 3)){
			DataUtils.setPlayerQuestCounter(player, questC3, 3);
		}
		if(pass != DataUtils.getPlayerPass(player)){
			DataUtils.setPlayerPass(player, pass);
		}
		if(!lastConnexion.equalsIgnoreCase(DataUtils.getPlayerLastConnexion(player))){
			DataUtils.setPlayerLastConnexion(player, lastConnexion);
		}
		if(chest1 != DataUtils.getPlayerChests(player, 1)){
			DataUtils.setPlayerChests(player, chest1, 1);
		}
		if(chest2 != DataUtils.getPlayerChests(player, 2)){
			DataUtils.setPlayerChests(player, chest2, 2);
		}
		if(chest3 != DataUtils.getPlayerChests(player, 3)){
			DataUtils.setPlayerChests(player, chest3, 3);
		}
		if(chest4 != DataUtils.getPlayerChests(player, 4)){
			DataUtils.setPlayerChests(player, chest4, 4);
		}
		if(chest5 != DataUtils.getPlayerChests(player, 5)){
			DataUtils.setPlayerChests(player, chest5, 5);
		}
		if(chest6 != DataUtils.getPlayerChests(player, 6)){
			DataUtils.setPlayerChests(player, chest6, 6);
		}
		if(chest7 != DataUtils.getPlayerChests(player, 7)){
			DataUtils.setPlayerChests(player, chest7, 7);
		}
		if(chest8 != DataUtils.getPlayerChests(player, 8)){
			DataUtils.setPlayerChests(player, chest8, 8);
		}
		if(chest9 != DataUtils.getPlayerChests(player, 9)){
			DataUtils.setPlayerChests(player, chest9, 9);
		}
		if(chest10 != DataUtils.getPlayerChests(player, 10)){
			DataUtils.setPlayerChests(player, chest10, 10);
		}
		if(!buyChestDate.equalsIgnoreCase(DataUtils.getPlayerBuyChestDate(player))){
			DataUtils.setPlayerBuyChestDate(player, buyChestDate);
		}
		if(!expireChestDate.equalsIgnoreCase(DataUtils.getPlayerExpireChestDate(player))){
			DataUtils.setPlayerExpireChestDate(player, expireChestDate);
		}
		if(!prefix.equalsIgnoreCase(DataUtils.getPlayerPrefix(player))){
			DataUtils.setPlayerPrefix(player, prefix);
		}
		
	}
	
	public String getUniqueId(){
		return uuid;
	}
	
	public void setUniqueId(String NewUUID){
		uuid = NewUUID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String NewName){
		name = NewName;
	}
	
	public String getRank(){
		return rank;
	}
	
	public void setRank(String NewRank){
		rank = NewRank;
	}
	
	public String getStaffRank(){
		return staff;
	}
	
	public void setStaffRank(String NewStaffRank){
		staff = NewStaffRank;
	}
	
	public int getCoins(){
		return coins;
	}
	
	public void setCoins(int count){
		coins = count;
	}
	
	public void addCoins(int count){
		coins = coins+count;
	}
	
	public void removeCoins(int count){
		coins = coins-count;
	}
	
	public int getTrophies(){
		return trophies;
	}
	
	public void setTrophies(int count){
		trophies = count;
	}
	
	public void addTrophies(int count){
		trophies = trophies+count;
	}
	
	public void removeTrophies(int count){
		trophies = trophies-count;
	}
	
	public int getCrystals(){
		return crystals;
	}
	
	public void setCrystals(int count){
		crystals = count;
	}
	
	public void addCrystals(int count){
		crystals = crystals+count;
	}
	
	public void removeCrystals(int count){
		crystals = crystals-count;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int NewData){
		data = NewData;
	}
	
	public String getCalculedDisplayName(){
		return displayName;
	}
	
	public int getQuest(){
		return quest;
	}
	
	public int getQuestCounter1(){
		return questC1;
	}
	
	public int getQuestCounter2(){
		return questC2;
	}
	public int getQuestCounter3(){
		return questC3;
	}
	
	public void setQuest(int NewQuest){
		quest = NewQuest;
	}
	
	public void setQuestCounter1(int NewCounter){
		questC1 = NewCounter;
	}
	
	public void setQuestCounter2(int NewCounter){
		questC2 = NewCounter;
	}
	
	public void setQuestCounter3(int NewCounter){
		questC3 = NewCounter;
	}
	
	public void addQuestCounter1(int add){
		questC1 = questC1+add;
	}
	
	public void addQuestCounter2(int add){
		questC2 = questC2+add;
	}
	
	public void addQuestCounter3(int add){
		questC3 = questC3+add;
	}
	
	public void removeQuestCounter1(int remove){
		questC1 = questC1-remove;
	}
	
	public void removeQuestCounter2(int remove){
		questC2 = questC2-remove;
	}
	
	public void removeQuestCounter3(int remove){
		questC3 = questC3-remove;
	}
	
	public int getPass(){
		return pass;
	}
	
	public void setPass(int count){
		pass = count;
	}
	
	public void addPass(int count){
		pass = pass+count;
	}
	
	public void removePass(int count){
		pass = pass-count;
	}
	
	public String getLastConnexion(){
		return lastConnexion;
	}
	
	public void setLastConnexion(String date){
		lastConnexion = date;
	}
	
	public void executeLastConnexion(){
	    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    String date = df.format(new Date());
	    lastConnexion = date;
	}
	
	public int getChests1(){
		return chest1;
	}
	
	public int getChests2(){
		return chest2;
	}
	
	public int getChests3(){
		return chest3;
	}
	
	public int getChests4(){
		return chest4;
	}
	
	public int getChests5(){
		return chest5;
	}
	
	public int getChests6(){
		return chest6;
	}
	
	public int getChests7(){
		return chest7;
	}
	
	public int getChests8(){
		return chest8;
	}
	
	public int getChests9(){
		return chest9;
	}
	
	public int getChests10(){
		return chest10;
	}
	
	public void setChests1(int count){
		chest1 = count;
	}
	
	public void setChests2(int count){
		chest2 = count;
	}
	
	public void setChests3(int count){
		chest3 = count;
	}
	
	public void setChests4(int count){
		chest4 = count;
	}
	
	public void setChests5(int count){
		chest5 = count;
	}
	
	public void setChests6(int count){
		chest6 = count;
	}
	
	public void setChests7(int count){
		chest7 = count;
	}
	
	public void setChests8(int count){
		chest8 = count;
	}
	
	public void setChests9(int count){
		chest9 = count;
	}
	
	public void setChests10(int count){
		chest10 = count;
	}
	
	public void addChests1(int count){
		chest1 = chest1+count;
	}
	
	public void addChests2(int count){
		chest2 = chest2+count;
	}
	
	public void addChests3(int count){
		chest3 = chest3+count;
	}
	
	public void addChests4(int count){
		chest4 = chest4+count;
	}
	
	public void addChests5(int count){
		chest5 = chest5+count;
	}
	
	public void addChests6(int count){
		chest6 = chest6+count;
	}
	
	public void addChests7(int count){
		chest7 = chest7+count;
	}
	
	public void addChests8(int count){
		chest8 = chest8+count;
	}
	
	public void addChests9(int count){
		chest9 = chest9+count;
	}
	
	public void addChests10(int count){
		chest10 = chest10+count;
	}
	
	public void removeChests1(int count){
		chest1 = chest1-count;
	}
	
	public void removeChests2(int count){
		chest2 = chest2-count;
	}
	
	public void removeChests3(int count){
		chest3 = chest3-count;
	}
	
	public void removeChests4(int count){
		chest4 = chest4-count;
	}
	
	public void removeChests5(int count){
		chest5 = chest5-count;
	}
	
	public void removeChests6(int count){
		chest6 = chest6-count;
	}
	
	public void removeChests7(int count){
		chest7 = chest7-count;
	}
	
	public void removeChests8(int count){
		chest8 = chest8-count;
	}
	
	public void removeChests9(int count){
		chest9 = chest9-count;
	}
	
	public void removeChests10(int count){
		chest10 = chest10-count;
	}
	
	public String getBuyChestDate(){
		return buyChestDate;
	}
	
	public void setBuyChestDate(String date){
		buyChestDate = date;
	}
	
	public void executeBuyChestDate(){
	    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    String date = df.format(new Date());
	    buyChestDate = date;
	}
	
	public String getExpireChestDate(){
		return expireChestDate;
	}
	
	public void setExpireChestDate(String date){
		expireChestDate = date;
	}
	
	public void executeExpireChestDate(){
	    DateFormat df = new SimpleDateFormat("yyyy/MM");
	    String date = df.format(new Date());
	    expireChestDate = date;
	}
	
	public boolean HasCosmetic(String cosmetic){
		
		if(DataUtils.getPlayerCosmetic(player, cosmetic).equalsIgnoreCase("true")){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	public String getEnabledCosmetics(){
		
		return DataUtils.getPlayerCosmetic(player, "enable");
		
	}
	
	public void setEnabledCosmetics(String value){
		
		DataUtils.setPlayerCosmetic(player, "enable", value);
		
	}
	
	public void addEnableCosmetic(String cosmetic){
		
		String current = DataUtils.getPlayerCosmetic(player, "enable");
		current = current+cosmetic;
		setEnabledCosmetics(current);
		
	}
	
	public void removeEnableCosmetic(String cosmetic){
		
		String current = DataUtils.getPlayerCosmetic(player, "enable");
		current = current.replaceAll(cosmetic, "");
		setEnabledCosmetics(current);
		
	}
	
	public void setCosmetic(String cosmetic, boolean value){
		
		String pos = "false";
		if(value){
			pos = "true";
		}
		DataUtils.setPlayerCosmetic(player, cosmetic, pos);
		
	}
	
	public String getPrefix(){
		
		return prefix;
		
	}
	
	public void setPrefix(String color){
		
		prefix = color;
		
	}

}
