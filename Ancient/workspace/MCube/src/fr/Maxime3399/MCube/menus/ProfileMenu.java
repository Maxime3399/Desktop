package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.utils.CalculUtils;
import fr.Maxime3399.MCube.utils.DisplayerUtils;

public class ProfileMenu {
	
	public static void openMenu(Player p){
		
		CustomPlayer cp = new CustomPlayer(p);
		Inventory i = Bukkit.createInventory(null, 36, "§8Profile");
		
		ItemStack IScoal = new ItemStack(Material.COAL);
		ItemMeta IMcoal = IScoal.getItemMeta();
		ArrayList<String> ALcoal = new ArrayList<>();
		IMcoal.setDisplayName("§7Charbon");
		ALcoal.add("§rTrophés requis : 0");
		ALcoal.add("§rCouleur : Gris");
		ALcoal.add("§rPerte de trophés : 20");
		if(cp.getTrophies() >= 1000){
			ALcoal.add("§rStatus : Dépassé");
		}else{
			ALcoal.add("§rStatus : Actif");
			IMcoal.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMcoal.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMcoal.setLore(ALcoal);
		IScoal.setItemMeta(IMcoal);
		i.setItem(0, IScoal);
		
		ItemStack ISbronze = new ItemStack(Material.CLAY_BRICK);
		ItemMeta IMbronze = ISbronze.getItemMeta();
		ArrayList<String> ALbronze = new ArrayList<>();
		IMbronze.setDisplayName("§6Bronze");
		ALbronze.add("§rTrohpés requis : 1000");
		ALbronze.add("§rCouleur : Orange");
		ALbronze.add("§rPerte de trophés : 30");
		if(cp.getTrophies() >= 3000){
			ALbronze.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 1000){
			int stat = 1000-cp.getTrophies();
			ALbronze.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALbronze.add("§rStatus : Actif");
			IMbronze.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMbronze.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMbronze.setLore(ALbronze);
		ISbronze.setItemMeta(IMbronze);
		i.setItem(1, ISbronze);
		
		ItemStack ISiron = new ItemStack(Material.IRON_INGOT);
		ItemMeta IMiron = ISiron.getItemMeta();
		ArrayList<String> ALiron = new ArrayList<>();
		IMiron.setDisplayName("§rFer");
		ALiron.add("§rTrophés requis : 3000");
		ALiron.add("§rCouleur : Blanc");
		ALiron.add("§rPerte de trophés : 40");
		if(cp.getTrophies() >= 6000){
			ALiron.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 3000){
			int stat = 3000-cp.getTrophies();
			ALiron.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALiron.add("§rStatus : Actif");
			IMiron.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMiron.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMiron.setLore(ALiron);
		ISiron.setItemMeta(IMiron);
		i.setItem(2, ISiron);
		
		ItemStack ISred = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta IMred = ISred.getItemMeta();
		ArrayList<String> ALred = new ArrayList<>();
		IMred.setDisplayName("§cRedstone");
		ALred.add("§rTrophés requis : 6000");
		ALred.add("§rCouleur : Blanc");
		ALred.add("§rPerte de trophés : 50");
		if(cp.getTrophies() >= 10000){
			ALred.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 6000){
			int stat = 6000-cp.getTrophies();
			ALred.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALred.add("§rStatus : Actif");
			IMred.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMred.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMred.setLore(ALred);
		ISred.setItemMeta(IMred);
		i.setItem(3, ISred);
		
		ItemStack ISlap = new ItemStack(Material.LAPIS_BLOCK);
		ItemMeta IMlap = ISlap.getItemMeta();
		ArrayList<String> ALlap = new ArrayList<>();
		IMlap.setDisplayName("§9Lapis");
		ALlap.add("§rTrophés requis : 10000");
		ALlap.add("§rCouleur : Bleu foncé");
		ALlap.add("§rPerte de trophés : 60");
		if(cp.getTrophies() >= 15000){
			ALlap.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 10000){
			int stat = 10000-cp.getTrophies();
			ALlap.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALlap.add("§rStatus : Actif");
			IMlap.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMlap.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMlap.setLore(ALlap);
		ISlap.setItemMeta(IMlap);
		i.setItem(4, ISlap);
		
		ItemStack ISgold = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMgold = ISgold.getItemMeta();
		ArrayList<String> ALgold = new ArrayList<>();
		IMgold.setDisplayName("§eOr");
		ALgold.add("§rTrophés requis : 15000");
		ALgold.add("§rCouleur : Jaune");
		ALgold.add("§rPerte de trophés : 70");
		if(cp.getTrophies() >= 21000){
			ALgold.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 15000){
			int stat = 15000-cp.getTrophies();
			ALgold.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALgold.add("§rStatus : Actif");
			IMgold.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMgold.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMgold.setLore(ALgold);
		ISgold.setItemMeta(IMgold);
		i.setItem(5, ISgold);
		
		ItemStack ISdiam = new ItemStack(Material.DIAMOND);
		ItemMeta IMdiam = ISdiam.getItemMeta();
		ArrayList<String> ALdiam = new ArrayList<>();
		IMdiam.setDisplayName("§bDiamant");
		ALdiam.add("§rTrophés requis : 21000");
		ALdiam.add("§rCouleur : Bleu clair");
		ALdiam.add("§rPerte de trophés : 80");
		if(cp.getTrophies() >= 28000){
			ALdiam.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 21000){
			int stat = 21000-cp.getTrophies();
			ALdiam.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALdiam.add("§rStatus : Actif");
			IMdiam.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMdiam.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMdiam.setLore(ALdiam);
		ISdiam.setItemMeta(IMdiam);
		i.setItem(6, ISdiam);
		
		ItemStack ISeme = new ItemStack(Material.EMERALD);
		ItemMeta IMeme = ISeme.getItemMeta();
		ArrayList<String> ALeme = new ArrayList<>();
		IMeme.setDisplayName("§aEmeraude");
		ALeme.add("§rTrophés requis : 28000");
		ALeme.add("§rCouleur : Vert clair");
		ALeme.add("§rPerte de trophés : 90");
		if(cp.getTrophies() >= 36000){
			ALeme.add("§rStatus : Dépassé");
		}else if(cp.getTrophies() < 28000){
			int stat = 28000-cp.getTrophies();
			ALeme.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALeme.add("§rStatus : Actif");
			IMeme.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMeme.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMeme.setLore(ALeme);
		ISeme.setItemMeta(IMeme);
		i.setItem(7, ISeme);
		
		ItemStack ISleg = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta IMleg = ISleg.getItemMeta();
		ArrayList<String> ALleg = new ArrayList<>();
		IMleg.setDisplayName("§3Légende");
		ALleg.add("§rTrophés requis : 36000");
		ALleg.add("§rCouleur : Bleu");
		ALleg.add("§rPerte de trophés : 100");
		if(cp.getTrophies() < 36000){
			int stat = 36000-cp.getTrophies();
			ALleg.add("§rStatus : "+stat+" trophés manquants");
		}else{
			ALleg.add("§rStatus : Actif");
			IMleg.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMleg.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMleg.setLore(ALleg);
		ISleg.setItemMeta(IMleg);
		i.setItem(8, ISleg);
		
		ItemStack ISrank = new ItemStack(Material.CHEST);
		ItemMeta IMrank = ISrank.getItemMeta();
		ArrayList<String> ALrank = new ArrayList<>();
		IMrank.setDisplayName("§eGrade :");
		if(cp.getRank().equalsIgnoreCase("default")){
			ALrank.add("§7§oAucun");
		}else{
			ALrank.add(p.getDisplayName().replaceAll(p.getName(), ""));
		}
		if(!cp.getRank().equalsIgnoreCase("ultravip+")){
			ALrank.add(" ");
			ALrank.add("§dVisite la boutique pour obtenir");
			ALrank.add("§dun meilleur grade !");
		}
		IMrank.setLore(ALrank);
		ISrank.setItemMeta(IMrank);
		i.setItem(19, ISrank);
		
		ItemStack ISligue = new ItemStack(Material.ENDER_CHEST);
		ItemMeta IMligue = ISligue.getItemMeta();
		ArrayList<String> ALligue = new ArrayList<>();
		IMligue.setDisplayName("§eLigue :");
		ALligue.add(DisplayerUtils.getCalculedLigueDisplay(CalculUtils.calculTrophiesRank(p)));
		IMligue.setLore(ALligue);
		ISligue.setItemMeta(IMligue);
		i.setItem(20, ISligue);
		
		ItemStack IScoins = new ItemStack(Material.GOLD_NUGGET);
		if(cp.getCoins() > 64){
			IScoins.setAmount(64);
		}else if(cp.getCoins() < 1){
			IScoins.setAmount(1);
		}else{
			IScoins.setAmount(cp.getCoins());
		}
		ItemMeta IMcoins = IScoins.getItemMeta();
		ArrayList<String> ALcoins = new ArrayList<>();
		IMcoins.setDisplayName("§eCoins :");
		ALcoins.add("§e"+cp.getCoins());
		IMcoins.setLore(ALcoins);
		IScoins.setItemMeta(IMcoins);
		i.setItem(21, IScoins);
		
		ItemStack IStro = new ItemStack(Material.IRON_NUGGET);
		if(cp.getTrophies() > 64){
			IStro.setAmount(64);
		}else if(cp.getTrophies() < 1){
			IStro.setAmount(1);
		}else{
			IStro.setAmount(cp.getTrophies());
		}
		ItemMeta IMtro = IStro.getItemMeta();
		ArrayList<String> ALtro = new ArrayList<>();
		IMtro.setDisplayName("§eTrophés :");
		ALtro.add("§6"+cp.getTrophies());
		IMtro.setLore(ALtro);
		IStro.setItemMeta(IMtro);
		i.setItem(22, IStro);
		
		ItemStack IScry = new ItemStack(Material.PRISMARINE_CRYSTALS);
		if(cp.getCrystals() > 64){
			IScry.setAmount(64);
		}else if(cp.getCrystals() < 1){
			IScry.setAmount(1);
		}else{
			IScry.setAmount(cp.getCrystals());
		}
		ItemMeta IMcry = IScry.getItemMeta();
		ArrayList<String> ALcry = new ArrayList<>();
		IMcry.setDisplayName("§eCrystals :");
		ALcry.add("§2"+cp.getCrystals());
		IMcry.setLore(ALcry);
		IScry.setItemMeta(IMcry);
		i.setItem(23, IScry);
		
		ItemStack ISquest = new ItemStack(Material.WORKBENCH);
		if(cp.getQuest() > 64){
			ISquest.setAmount(64);
		}else if(cp.getQuest() < 1){
			ISquest.setAmount(1);
		}else{
			ISquest.setAmount(cp.getQuest());
		}
		ItemMeta IMquest = ISquest.getItemMeta();
		ArrayList<String> ALquest = new ArrayList<>();
		if(cp.getQuest() > 3){
			IMquest.setDisplayName("§eTu as terminé toutes les");
			ALquest.add("§equêtes disponibles !");
			IMquest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMquest.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}else{
			IMquest.setDisplayName("§eQuête :");
			ALquest.add("§c"+cp.getQuest());
		}
		IMquest.setLore(ALquest);
		ISquest.setItemMeta(IMquest);
		i.setItem(24, ISquest);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(35, ISba);
		
		p.openInventory(i);
		
	}

}
