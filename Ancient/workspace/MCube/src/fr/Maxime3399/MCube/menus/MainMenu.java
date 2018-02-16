package fr.Maxime3399.MCube.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.Maxime3399.MCube.cosmetics.CosCounters;
import fr.Maxime3399.MCube.custom.CustomPlayer;

public class MainMenu {

	@SuppressWarnings("deprecation")
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 9, "§8Menu Principal");
		
		CustomPlayer cp = new CustomPlayer(p);
		
		ItemStack ISprofile = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta SMprofile = (SkullMeta) ISprofile.getItemMeta();
		ArrayList<String> ALprofile = new ArrayList<>();
		SMprofile.setDisplayName("§eProfile");
		SMprofile.setOwner(p.getName());
		ALprofile.add("§9§l>§r §7Clique pour ouvrir ton");
		ALprofile.add("§7profile");
		SMprofile.setLore(ALprofile);
		ISprofile.setItemMeta(SMprofile);
		i.addItem(ISprofile);
		
		ItemStack ISquest = new ItemStack(Material.WORKBENCH);
		ItemMeta IMquest = ISquest.getItemMeta();
		ArrayList<String> ALquest = new ArrayList<>();
		IMquest.setDisplayName("§eQuêtes");
		ALquest.add("§9§l>§r §7Clique ouvrir le menu");
		ALquest.add("§7des quêtes");
		IMquest.setLore(ALquest);
		ISquest.setItemMeta(IMquest);
		i.addItem(ISquest);
		
		ItemStack ISchest = new ItemStack(Material.CHEST);
		ItemMeta IMchest = ISchest.getItemMeta();
		ArrayList<String> ALchest = new ArrayList<>();
		IMchest.setDisplayName("§eCoffres");
		ALchest.add("§9§l>§r §7Clique pour ouvrir le");
		ALchest.add("§7menu des coffres");
		IMchest.setLore(ALchest);
		ISchest.setItemMeta(IMchest);
		i.addItem(ISchest);
		
		ItemStack IScos = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMcos = IScos.getItemMeta();
		ArrayList<String> ALcos = new ArrayList<>();
		IMcos.setDisplayName("§eCosmétiques");
		ALcos.add("§9§l>§r §7Clique pour ouvrir le");
		ALcos.add("§7menu de cosmétiques");
		ALcos.add(" ");
		ALcos.add("  §e"+CosCounters.getAllEffects(p)+"§d§l/§r§641");
		IMcos.setLore(ALcos);
		IScos.setItemMeta(IMcos);
		i.addItem(IScos);
		
		ItemStack ISpre = new ItemStack(Material.REDSTONE);
		ItemMeta IMpre = ISpre.getItemMeta();
		ArrayList<String> ALpre = new ArrayList<>();
		IMpre.setDisplayName("§ePréfixe");
		if(cp.getRank().equalsIgnoreCase("ultravip+")){
			ALpre.add("§9§l>§r §7Clique pour ouvrir le menu de");
			ALpre.add("§7customisation du préfixe");
		}else{
			ALpre.add("§cRéservé aux UltraVIP+");
		}
		IMpre.setLore(ALpre);
		ISpre.setItemMeta(IMpre);
		i.addItem(ISpre);
		
		p.openInventory(i);
		
	}
	
}
