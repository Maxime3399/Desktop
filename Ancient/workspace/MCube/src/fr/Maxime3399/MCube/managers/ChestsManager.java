package fr.Maxime3399.MCube.managers;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class ChestsManager {
	
	public static void giveReward(Player p, String reward, String rarity, String itemName){
		
		CustomPlayer cp = new CustomPlayer(p);
		
		if(reward.contains("coins")){
			
			String changer = reward.replaceAll("coins", "");
			int coins = 0;
            try{
                coins = Integer.parseInt(changer);
             }catch (NumberFormatException ex){
                ex.printStackTrace();
             }
            cp.addCoins(coins);
            cp.update();
            if(rarity.equalsIgnoreCase("legendaire") || rarity.equalsIgnoreCase("mythique")){
            	Bukkit.broadcastMessage(p.getDisplayName()+" §r§aa trouvé §e"+coins+" coins §1( "+DisplayerUtils.getRarityDisplay(rarity)+" §1) §adans un coffre !");
            	for(Player pls : Bukkit.getOnlinePlayers()){
            		pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 100, 1);
            	}
            }
            MainScoreboard.loadScoreboard(p);
			
		}else if(reward.contains("crystals")){
			
			String changer = reward.replaceAll("crystals", "");
			int crystals = 0;
            try{
                crystals = Integer.parseInt(changer);
             }catch (NumberFormatException ex){
                ex.printStackTrace();
             }
            cp.addCrystals(crystals);
            cp.update();
            if(rarity.equalsIgnoreCase("legendaire") || rarity.equalsIgnoreCase("mythique")){
            	Bukkit.broadcastMessage(p.getDisplayName()+" §r§aa trouvé §2"+crystals+" crystals §1( "+DisplayerUtils.getRarityDisplay(rarity)+" §1) §adans un coffre !");
            	for(Player pls : Bukkit.getOnlinePlayers()){
            		pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 100, 1);
            	}
            }
            MainScoreboard.loadScoreboard(p);
			
		}else if(reward.contains("pass")){
			
			String changer = reward.replaceAll("pass", "");
			int pass = 0;
            try{
                pass = Integer.parseInt(changer);
             }catch (NumberFormatException ex){
                ex.printStackTrace();
             }
            cp.addPass(pass);
            cp.update();
            if(rarity.equalsIgnoreCase("legendaire") || rarity.equalsIgnoreCase("mythique")){
            	Bukkit.broadcastMessage(p.getDisplayName()+" §r§aa trouvé §c"+pass+" pass §1( "+DisplayerUtils.getRarityDisplay(rarity)+" §1) §adans un coffre !");
            	for(Player pls : Bukkit.getOnlinePlayers()){
            		pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 100, 1);
            	}
            }
			
		}else if(reward.contains("cos")){
			
			String cosmetic = reward.replaceAll("cos", "");
			if(cp.HasCosmetic(cosmetic)){
				int giver = 1;
				if(rarity.equalsIgnoreCase("peucommun")){
					giver = 2;
				}else if(rarity.equalsIgnoreCase("rare")){
					giver = 3;
				}else if(rarity.equalsIgnoreCase("super")){
					giver = 4;
				}else if(rarity.equalsIgnoreCase("epique")){
					giver = 5;
				}else if(rarity.equalsIgnoreCase("legendaire")){
					giver = 6;
				}else if(rarity.equalsIgnoreCase("mythique")){
					giver = 8;
				}
				cp.addCrystals(giver);
				p.sendMessage("§cTu as déjà ce cosmétique, tu as réçus "+giver+" crystals à la place !");
			}else{
				cp.setCosmetic(cosmetic, true);
	            if(rarity.equalsIgnoreCase("legendaire") || rarity.equalsIgnoreCase("mythique")){
	            	Bukkit.broadcastMessage(p.getDisplayName()+" §r§aa trouvé le cosmétique "+itemName+"§r §1( "+DisplayerUtils.getRarityDisplay(rarity)+" §1) §adans un coffre !");
	            	for(Player pls : Bukkit.getOnlinePlayers()){
	            		pls.playSound(pls.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 100, 1);
	            	}
	            }
			}
			cp.update();
			MainScoreboard.loadScoreboard(p);
			
		}
		
	}
	
	public static ItemStack getRewardItem(String reward, String rarity){
		
		ItemStack IS = new ItemStack(Material.STONE);
		
		if(reward.contains("coins")){
			
			String changer = reward.replaceAll("coins", "");
            IS.setType(Material.GOLD_NUGGET);
            ItemMeta IM = IS.getItemMeta();
            ArrayList<String> AL = new ArrayList<>();
            IM.setDisplayName("§e"+changer+" coins");
            AL.add("§7Rareté : "+DisplayerUtils.getRarityDisplay(rarity));
            IM.setLore(AL);
            IS.setItemMeta(IM);
			
		}else if(reward.contains("crystals")){
			
			String changer = reward.replaceAll("crystals", "");
            IS.setType(Material.EMERALD);
            ItemMeta IM = IS.getItemMeta();
            ArrayList<String> AL = new ArrayList<>();
            IM.setDisplayName("§2"+changer+" crystals");
            AL.add("§7Rareté : "+DisplayerUtils.getRarityDisplay(rarity));
            IM.setLore(AL);
            IS.setItemMeta(IM);
			
		}else if(reward.contains("pass")){
			
			String changer = reward.replaceAll("pass", "");
            IS.setType(Material.TNT);
            ItemMeta IM = IS.getItemMeta();
            ArrayList<String> AL = new ArrayList<>();
            IM.setDisplayName("§c"+changer+" pass");
            AL.add("§7Rareté : "+DisplayerUtils.getRarityDisplay(rarity));
            IM.setLore(AL);
            IS.setItemMeta(IM);
			
		}else if(reward.contains("cosangelwings")){
			
			IS.setType(Material.WOOL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§aAiles d'ange");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §aCommun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosenchwings")){
			
			IS.setType(Material.ENCHANTMENT_TABLE);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§2Ailes enchantées");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §2Peu-Commun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosdragwings")){
			
			IS.setType(Material.DRAGONS_BREATH);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§dAiles de dragon");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §dRare");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("coswhitewings")){
			
			IS.setType(Material.END_ROD);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§5Ailes blanches");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §5Super");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosfwwings")){
			
			IS.setType(Material.FIREWORK);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§bAiles brillantes");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §bEpique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cossmokewings")){
			
			IS.setType(Material.FIREBALL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§3Ailes de fumée");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §3Légendaire");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosgodwings")){
			
			IS.setType(Material.TOTEM);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Ailes de dieu");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosdlavahat")){
			
			IS.setType(Material.LAVA_BUCKET);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§aChapeau de lave");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §aCommun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosdwaterhat")){
			
			IS.setType(Material.WATER_BUCKET);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§aChapeau d'eau");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §aCommun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosenchhat")){
			
			IS.setType(Material.ENCHANTMENT_TABLE);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§2Chapeau enchanté");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §2Peu-Commun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("coswhitehat")){
			
			IS.setType(Material.END_ROD);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§2Chapeau blanc");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §2Peu-Commun");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cossandhat")){
			
			IS.setType(Material.SAND);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§dChapeau de sable");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §dRare");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosfwhat")){
			
			IS.setType(Material.FIREWORK);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§dChapeau brillant");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §dRare");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosflamehat")){
			
			IS.setType(Material.FLINT_AND_STEEL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§5Chapeau de feu");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §5Super");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosmagichat")){
			
			IS.setType(Material.EMERALD);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§5Chapeau magique");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §5Super");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("coslovehat")){
			
			IS.setType(Material.PINK_GLAZED_TERRACOTTA);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§bChapeau d'amour");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §bEpique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("coslavahat")){
			
			IS.setType(Material.FLINT_AND_STEEL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§bChapeau de jets de lave");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §bEpique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("coscombathat")){
			
			IS.setType(Material.DIAMOND_SWORD);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§3Chapeau du combattant");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §3Légendaire");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosnotehat")){
			
			IS.setType(Material.NOTE_BLOCK);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§3Chapeau de musique");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §3Légendaire");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosenderhat")){
			
			IS.setType(Material.ENDER_PEARL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau de l'ender");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosnetherhat")){
			
			IS.setType(Material.NETHERRACK);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau du nether");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosmulthat")){
			
			IS.setType(Material.APPLE);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau multicolor");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosslimehat")){
			
			IS.setType(Material.SLIME_BALL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau de slime");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cossmokehat")){
			
			IS.setType(Material.FIREBALL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau de fumée");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cossnowhat")){
			
			IS.setType(Material.SNOW_BALL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau de neige");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("cosangelhat")){
			
			IS.setType(Material.WOOL);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau d'ange");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}else if(reward.contains("costotemhat")){
			
			IS.setType(Material.TOTEM);
			ItemMeta IM = IS.getItemMeta();
			IM.setDisplayName("§9Chapeau totémique");
			ArrayList<String> AL = new ArrayList<>();
			AL.add("Rareté : §9Mythique");
			IM.setLore(AL);
			IS.setItemMeta(IM);
			
		}
		
		return IS;
		
	}
	
	public static String getRandomReward(String rarity){
		
		String result = "";
		ArrayList<String> list = new ArrayList<>();
		
		if(rarity.equalsIgnoreCase("commun")){
			
			list.add("coins3");
			list.add("crystals2");
			list.add("cosangelwings");
			list.add("cosdlavahat");
			list.add("cosdwaterhat");
			
		}else if(rarity.equalsIgnoreCase("peucommun")){
			
			list.add("coins5");
			list.add("crytals4");
			list.add("cosenchwings");
			list.add("cosenchhat");
			list.add("coswhitehat");
			
		}else if(rarity.equalsIgnoreCase("rare")){
			
			list.add("coins8");
			list.add("crystals6");
			list.add("cosdragwings");
			list.add("cossandhat");
			list.add("cosfwhat");
			
		}else if(rarity.equalsIgnoreCase("super")){
			
			list.add("coins12");
			list.add("crystals8");
			list.add("coswhitewings");
			list.add("cosflamehat");
			list.add("cosmagichat");
			
		}else if(rarity.equalsIgnoreCase("epique")){
			
			list.add("coins15");
			list.add("crystals10");
			list.add("cosfwwings");
			list.add("coslovehat");
			list.add("coslavahat");
			
		}else if(rarity.equalsIgnoreCase("legendaire")){
			
			list.add("coins20");
			list.add("crystals12");
			list.add("pass1");
			list.add("cossmokewings");
			list.add("coscombathat");
			list.add("cosnotehat");
			
		}else if(rarity.equalsIgnoreCase("mythique")){
			
			list.add("coins25");
			list.add("crystals15");
			list.add("pass2");
			list.add("cosgodwings");
			list.add("cosenderhat");
			list.add("cosnetherhat");
			list.add("cosmulthat");
			list.add("cosslimehat");
			list.add("cossmokehat");
			list.add("cossnowhat");
			list.add("cosangelhat");
			list.add("costotemhat");
			
		}
		
		Random r = new Random();
		result = list.get(r.nextInt(list.size()));
		
		return result;
		
	}
	
	public static String getRandomRarity(int type){
		
		String result = null;
		
		ArrayList<String> list = new ArrayList<>();
		
		if(type == 1){
			
			for(int i = 0; i <= 90; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 8; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 2; i++){
				list.add("rare"+i);
			}
			
		}else if(type == 2){
			
			for(int i = 0; i <= 75; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 8; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 2; i++){
				list.add("super"+i);
			}
			
		}else if(type == 3){
			
			for(int i = 0; i <= 60; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 12; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 8; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 5; i++){
				list.add("epique"+i);
			}
			
		}else if(type == 4){
			
			for(int i = 0; i <= 45; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 14; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 11; i++){
				list.add("epique"+i);
			}
			
		}else if(type == 5){
			
			for(int i = 0; i <= 30; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 20; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 17; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 3; i++){
				list.add("legendaire"+i);
			}
			
		}else if(type == 6){
			
			for(int i = 0; i <= 15; i++){
				list.add("commun"+i);
			}
			for(int i = 0; i <= 10; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 20; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 25; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 20; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 10; i++){
				list.add("legendaire"+i);
			}
			
		}else if(type == 7){
			
			for(int i = 0; i <= 10; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 18; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 28; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 22; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 15; i++){
				list.add("legendaire"+i);
			}
			for(int i = 0; i <= 7; i++){
				list.add("mythique"+i);
			}
			
		}else if(type == 8){
			
			for(int i = 0; i <= 5; i++){
				list.add("peucommun"+i);
			}
			for(int i = 0; i <= 12; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 22; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 30; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 20; i++){
				list.add("legendaire"+i);
			}
			for(int i = 0; i <= 11; i++){
				list.add("mythique"+i);
			}
			
		}else if(type == 9){
			
			for(int i = 0; i <= 8; i++){
				list.add("rare"+i);
			}
			for(int i = 0; i <= 16; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 21; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 35; i++){
				list.add("legendaire"+i);
			}
			for(int i = 0; i <= 20; i++){
				list.add("mythique"+i);
			}
			
		}else if(type == 10){
			
			for(int i = 0; i <= 12; i++){
				list.add("super"+i);
			}
			for(int i = 0; i <= 14; i++){
				list.add("epique"+i);
			}
			for(int i = 0; i <= 45; i++){
				list.add("legendaire"+i);
			}
			for(int i = 0; i <= 29; i++){
				list.add("mythique"+i);
			}
			
		}
		
		Random r = new Random();
		String rs = list.get(r.nextInt(list.size()));
		if(rs.contains("peucommun")){
			result = "peucommun";
		}else if(rs.contains("commun")){
			result = "commun";
		}else if(rs.contains("rare")){
			result = "rare";
		}else if(rs.contains("super")){
			result = "super";
		}else if(rs.contains("epique")){
			result = "epique";
		}else if(rs.contains("legendaire")){
			result = "legendaire";
		}else if(rs.contains("mythique")){
			result = "mythique";
		}
		
		return result;
		
	}

}
