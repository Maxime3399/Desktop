package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipLast;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.utils.CostUtils;

public class ShopTriggerMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "�8Rechargement");
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack IS01 = new ItemStack(Material.STONE_BUTTON, 20);
		ItemMeta IM01 = IS01.getItemMeta();
		ArrayList<String> AL01 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 1){
			AL01.add(" �3�l>>�r �92 s �3�l<<");
			AL01.add("�aD�bloqu� !");
			AL01.add(" ");
			if(qp.getEnable().contains("trigger01")){
				IM01.setDisplayName("�bRechargement 1");
				AL01.add("�2El�ment �quip�");
			}else{
				IM01.setDisplayName("�aRechargement 1");
				AL01.add("�eClique pour �quiper");
			}
		}
		IM01.setLore(AL01);
		IS01.setItemMeta(IM01);
		i.addItem(IS01);
		
		ItemStack IS02 = new ItemStack(Material.STONE_BUTTON, 18);
		ItemMeta IM02 = IS02.getItemMeta();
		ArrayList<String> AL02 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 2){
			AL02.add(" �3�l>>�r �91,8 s �3�l<<");
			AL02.add("�aD�bloqu� !");
			AL02.add(" ");
			if(qp.getEnable().contains("trigger02")){
				IM02.setDisplayName("�bRechargement 2");
				AL02.add("�2El�ment �quip�");
			}else{
				IM02.setDisplayName("�aRechargement 2");
				AL02.add("�eClique pour �quiper");
			}
		}else{
			AL02.add("�cBloqu� !");
			AL02.add(" ");
			if(qp.getCoins() >= CostUtils.getTriggerCost(2)){
				IM02.setDisplayName("�6Rechargement 2");
				AL02.add("�6Co�t : "+CostUtils.getTriggerCost(2));
				AL02.add(" ");
				AL02.add("�eClique pour acheter");
			}else{
				IM02.setDisplayName("�cRechargement 2");
				AL02.add("�cCo�t : "+CostUtils.getTriggerCost(2));
			}
		}
		IM02.setLore(AL02);
		IS02.setItemMeta(IM02);
		i.addItem(IS02);
		
		ItemStack IS03 = new ItemStack(Material.STONE_BUTTON, 16);
		ItemMeta IM03 = IS03.getItemMeta();
		ArrayList<String> AL03 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 3){
			AL03.add(" �3�l>>�r �91,6 s �3�l<<");
			AL03.add("�aD�bloqu� !");
			AL03.add(" ");
			if(qp.getEnable().contains("trigger03")){
				IM03.setDisplayName("�bRechargement 3");
				AL03.add("�2El�ment �quip�");
			}else{
				IM03.setDisplayName("�aRechargement 3");
				AL03.add("�eClique pour �quiper");
			}
		}else{
			AL03.add("�cBloqu� !");
			AL03.add(" ");
			if(EquipLast.getTrigger(qp) == 2){
				if(qp.getCoins() >= CostUtils.getTriggerCost(3)){
					IM03.setDisplayName("�6Rechargement 3");
					AL03.add("�6Co�t : "+CostUtils.getTriggerCost(3));
					AL03.add(" ");
					AL03.add("�eClique pour acheter");
				}else{
					IM03.setDisplayName("�cRechargement 3");
					AL03.add("�cCo�t : "+CostUtils.getTriggerCost(3));
				}
			}else{
				IM03.setDisplayName("�4Rechargement 3");
				AL03.add("�cRechargement 2 requis");
			}
		}
		IM03.setLore(AL03);
		IS03.setItemMeta(IM03);
		i.addItem(IS03);
		
		ItemStack IS04 = new ItemStack(Material.STONE_BUTTON, 14);
		ItemMeta IM04 = IS04.getItemMeta();
		ArrayList<String> AL04 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 4){
			AL04.add(" �3�l>>�r �91,4 s �3�l<<");
			AL04.add("�aD�bloqu� !");
			AL04.add(" ");
			if(qp.getEnable().contains("trigger04")){
				IM04.setDisplayName("�bRechargement 4");
				AL04.add("�2El�ment �quip�");
			}else{
				IM04.setDisplayName("�aRechargement 4");
				AL04.add("�eClique pour �quiper");
			}
		}else{
			AL04.add("�cBloqu� !");
			AL04.add(" ");
			if(EquipLast.getTrigger(qp) == 3){
				if(qp.getCoins() >= CostUtils.getTriggerCost(4)){
					IM04.setDisplayName("�6Rechargement 4");
					AL04.add("�6Co�t : "+CostUtils.getTriggerCost(4));
					AL04.add(" ");
					AL04.add("�eClique pour acheter");
				}else{
					IM04.setDisplayName("�cRechargement 4");
					AL04.add("�cCo�t : "+CostUtils.getTriggerCost(4));
				}
			}else{
				IM04.setDisplayName("�4Rechargement 4");
				AL04.add("�cRechargement 3 requis");
			}
		}
		IM04.setLore(AL04);
		IS04.setItemMeta(IM04);
		i.addItem(IS04);
		
		ItemStack IS05 = new ItemStack(Material.STONE_BUTTON, 12);
		ItemMeta IM05 = IS05.getItemMeta();
		ArrayList<String> AL05 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 5){
			AL05.add(" �3�l>>�r �91,2 s �3�l<<");
			AL05.add("�aD�bloqu� !");
			AL05.add(" ");
			if(qp.getEnable().contains("trigger05")){
				IM05.setDisplayName("�bRechargement 5");
				AL05.add("�2El�ment �quip�");
			}else{
				IM05.setDisplayName("�aRechargement 5");
				AL05.add("�eClique pour �quiper");
			}
		}else{
			AL05.add("�cBloqu� !");
			AL05.add(" ");
			if(EquipLast.getTrigger(qp) == 4){
				if(qp.getCoins() >= CostUtils.getTriggerCost(5)){
					IM05.setDisplayName("�6Rechargement 5");
					AL05.add("�6Co�t : "+CostUtils.getTriggerCost(5));
					AL05.add(" ");
					AL05.add("�eClique pour acheter");
				}else{
					IM05.setDisplayName("�cRechargement 5");
					AL05.add("�cCo�t : "+CostUtils.getTriggerCost(5));
				}
			}else{
				IM05.setDisplayName("�4Rechargement 5");
				AL05.add("�cRechargement 4 requis");
			}
		}
		IM05.setLore(AL05);
		IS05.setItemMeta(IM05);
		i.addItem(IS05);
		
		ItemStack IS06 = new ItemStack(Material.STONE_BUTTON, 10);
		ItemMeta IM06 = IS06.getItemMeta();
		ArrayList<String> AL06 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 6){
			AL06.add(" �3�l>>�r �91 s �3�l<<");
			AL06.add("�aD�bloqu� !");
			AL06.add(" ");
			if(qp.getEnable().contains("trigger06")){
				IM06.setDisplayName("�bRechargement 6");
				AL06.add("�2El�ment �quip�");
			}else{
				IM06.setDisplayName("�aRechargement 6");
				AL06.add("�eClique pour �quiper");
			}
		}else{
			AL06.add("�cBloqu� !");
			AL06.add(" ");
			if(EquipLast.getTrigger(qp) == 5){
				if(qp.getCoins() >= CostUtils.getTriggerCost(6)){
					IM06.setDisplayName("�6Rechargement 6");
					AL06.add("�6Co�t : "+CostUtils.getTriggerCost(6));
					AL06.add(" ");
					AL06.add("�eClique pour acheter");
				}else{
					IM06.setDisplayName("�cRechargement 6");
					AL06.add("�cCo�t : "+CostUtils.getTriggerCost(6));
				}
			}else{
				IM06.setDisplayName("�4Rechargement 6");
				AL06.add("�cRechargement 5 requis");
			}
		}
		IM06.setLore(AL06);
		IS06.setItemMeta(IM06);
		i.addItem(IS06);
		
		ItemStack IS07 = new ItemStack(Material.STONE_BUTTON, 8);
		ItemMeta IM07 = IS07.getItemMeta();
		ArrayList<String> AL07 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 7){
			AL07.add(" �3�l>>�r �90,8 s �3�l<<");
			AL07.add("�aD�bloqu� !");
			AL07.add(" ");
			if(qp.getEnable().contains("trigger07")){
				IM07.setDisplayName("�bRechargement 7");
				AL07.add("�2El�ment �quip�");
			}else{
				IM07.setDisplayName("�aRechargement 7");
				AL07.add("�eClique pour �quiper");
			}
		}else{
			AL07.add("�cBloqu� !");
			AL07.add(" ");
			if(EquipLast.getTrigger(qp) == 6){
				if(qp.getCoins() >= CostUtils.getTriggerCost(7)){
					IM07.setDisplayName("�6Rechargement 7");
					AL07.add("�6Co�t : "+CostUtils.getTriggerCost(7));
					AL07.add(" ");
					AL07.add("�eClique pour acheter");
				}else{
					IM07.setDisplayName("�cRechargement 7");
					AL07.add("�cCo�t : "+CostUtils.getTriggerCost(7));
				}
			}else{
				IM07.setDisplayName("�4Rechargement 7");
				AL07.add("�cRechargement 6 requis");
			}
		}
		IM07.setLore(AL07);
		IS07.setItemMeta(IM07);
		i.addItem(IS07);
		
		ItemStack IS08 = new ItemStack(Material.STONE_BUTTON, 6);
		ItemMeta IM08 = IS08.getItemMeta();
		ArrayList<String> AL08 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 8){
			AL08.add(" �3�l>>�r �90,6 s �3�l<<");
			AL08.add("�aD�bloqu� !");
			AL08.add(" ");
			if(qp.getEnable().contains("trigger08")){
				IM08.setDisplayName("�bRechargement 8");
				AL08.add("�2El�ment �quip�");
			}else{
				IM08.setDisplayName("�aRechargement 8");
				AL08.add("�eClique pour �quiper");
			}
		}else{
			AL08.add("�cBloqu� !");
			AL08.add(" ");
			if(EquipLast.getTrigger(qp) == 7){
				if(qp.getCoins() >= CostUtils.getTriggerCost(8)){
					IM08.setDisplayName("�6Rechargement 8");
					AL08.add("�6Co�t : "+CostUtils.getTriggerCost(8));
					AL08.add(" ");
					AL08.add("�eClique pour acheter");
				}else{
					IM08.setDisplayName("�cRechargement 8");
					AL08.add("�cCo�t : "+CostUtils.getTriggerCost(8));
				}
			}else{
				IM08.setDisplayName("�4Rechargement 8");
				AL08.add("�cRechargement 7 requis");
			}
		}
		IM08.setLore(AL08);
		IS08.setItemMeta(IM08);
		i.addItem(IS08);
		
		ItemStack IS09 = new ItemStack(Material.STONE_BUTTON, 4);
		ItemMeta IM09 = IS09.getItemMeta();
		ArrayList<String> AL09 = new ArrayList<>();
		if(EquipLast.getTrigger(qp) >= 9){
			AL09.add(" �3�l>>�r �90,4 s �3�l<<");
			AL09.add("�aD�bloqu� !");
			AL09.add(" ");
			if(qp.getEnable().contains("trigger09")){
				IM09.setDisplayName("�bRechargement 9");
				AL09.add("�2El�ment �quip�");
			}else{
				IM09.setDisplayName("�aRechargement 9");
				AL09.add("�eClique pour �quiper");
			}
		}else{
			AL09.add("�cBloqu� !");
			AL09.add(" ");
			if(EquipLast.getTrigger(qp) == 8){
				if(qp.getCoins() >= CostUtils.getTriggerCost(9)){
					IM09.setDisplayName("�6Rechargement 9");
					AL09.add("�6Co�t : "+CostUtils.getTriggerCost(9));
					AL09.add(" ");
					AL09.add("�eClique pour acheter");
				}else{
					IM09.setDisplayName("�cRechargement 9");
					AL09.add("�cCo�t : "+CostUtils.getTriggerCost(9));
				}
			}else{
				IM09.setDisplayName("�4Rechargement 9");
				AL09.add("�cRechargement 8 requis");
			}
		}
		IM09.setLore(AL09);
		IS09.setItemMeta(IM09);
		i.addItem(IS09);
		
		ItemStack ISc = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMc = ISc.getItemMeta();
		IMc.setDisplayName("�6Coins : "+qp.getCoins());
		ISc.setItemMeta(IMc);
		i.setItem(13, ISc);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("�8�oRetour");
		ALba.add("�9�l>�r �7Clique pour retourner au");
		ALba.add("�7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(17, ISba);
		
		p.openInventory(i);
		
	}

}
