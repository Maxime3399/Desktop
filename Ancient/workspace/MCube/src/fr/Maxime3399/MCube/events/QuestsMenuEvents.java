package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MCube.actions.RewardsActions;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.menus.ConfirmMenu;
import fr.Maxime3399.MCube.menus.MainMenu;
import fr.Maxime3399.MCube.menus.QuestsMenu;

public class QuestsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Quêtes")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§8§oRetour")){
					
					MainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§cPass :")){
					
					if(cp.getPass() > 0){
						
						if(cp.getQuest() > 3){
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							p.sendMessage("§cTu as déjà terminé toute les quêtes !");
						}else{
							p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
							ConfirmMenu.openMenu(p, "usep");
						}
						
					}else{
						
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "qpass");
						
					}
					
				}else if(name.contains("1")){
					if(cp.getQuestCounter1() >= 5){
						cp.setQuest(2);
						cp.setQuestCounter1(0);
						cp.setQuestCounter2(0);
						cp.setQuestCounter3(0);
						cp.update();
						RewardsActions.giveTrophies(p, 10);
						RewardsActions.giveCoins(p, 5);
						p.sendMessage("§aQuête numéro 1 terminée !");
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
						QuestsMenu.openMenu(p);
					}else{
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						p.sendMessage("§cCette quête n'est pas terminée, tu peux la passer en utilisant un pass !");
					}
				}else if(name.contains("2")){
					if(cp.getQuestCounter1() >= 10){
						cp.setQuest(3);
						cp.setQuestCounter1(0);
						cp.setQuestCounter2(0);
						cp.setQuestCounter3(0);
						cp.update();
						RewardsActions.giveTrophies(p, 10);
						RewardsActions.giveCoins(p, 5);
						p.sendMessage("§a§lQuête numéro 2 terminée !");
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
						QuestsMenu.openMenu(p);
					}else{
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						p.sendMessage("§cCette quête n'est pas terminée, tu peux la passer en utilisant un pass !");
					}
				}else if(name.contains("3")){
					if(cp.getQuestCounter1() >= 8){
						cp.setQuest(4);
						cp.setQuestCounter1(0);
						cp.setQuestCounter2(0);
						cp.setQuestCounter3(0);
						cp.update();
						RewardsActions.giveTrophies(p, 10);
						RewardsActions.giveCoins(p, 5);
						p.sendMessage("§a§lQuête numéro 3 terminée !");
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 100, 1);
						QuestsMenu.openMenu(p);
					}else{
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						p.sendMessage("§cCette quête n'est pas terminée, tu peux la passer en utilisant un pass !");
					}
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
