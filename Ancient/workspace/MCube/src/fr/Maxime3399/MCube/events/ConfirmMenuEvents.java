package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.menus.CosParticlesHatsMenu;
import fr.Maxime3399.MCube.menus.CosParticlesWingsMenu;
import fr.Maxime3399.MCube.menus.QuestsMenu;
import fr.Maxime3399.MCube.menus.RollMenu;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.CalculUtils;

public class ConfirmMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Confirmation")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				String type = e.getInventory().getItem(13).getItemMeta().getLore().get(0);
				type = type.replaceAll("§8ID §l>§r §8", "");
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§a§lCONFIRMER")){
					
					if(type.contains("pass")){
						
						if(cp.getCoins() >= 150){
							
							cp.removeCoins(150);
							cp.addPass(1);
							cp.update();
							if(type.contains("qpass")){
								QuestsMenu.openMenu(p);
							}else{
								p.closeInventory();
							}
							p.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 100, 1);
							p.sendMessage("§aTu as obtenus §c1 Pass §a!");
							MainScoreboard.loadScoreboard(p);
							
						}else{
							
							p.closeInventory();
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							int dif = 150-cp.getCoins();
							p.sendMessage("§cIl te manque "+dif+" coins pour acheter ceci ( coût : 150 coins ) !");
							
						}
						
					}else if(type.contains("usep")){
						
						cp.removePass(1);
						cp.setQuest(cp.getQuest()+1);
						cp.setQuestCounter1(0);
						cp.setQuestCounter2(0);
						cp.setQuestCounter3(0);
						cp.update();
						p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100, 1);
						p.sendMessage("§ePass utilisé, tu es maintenant à la quête numéro "+cp.getQuest()+" !");
						QuestsMenu.openMenu(p);
						MainScoreboard.loadScoreboard(p);
						
					}else if(type.contains("usec")){
						
						String ct = type.replaceAll("usec", "");
						int sup = 1;
			            try{
			                sup = Integer.parseInt(ct);
			              }catch (NumberFormatException ex){
			                ex.printStackTrace();
			              }
						
			            if(sup == 1){
				            cp.removeChests1(1);
			            }else if(sup == 2){
				            cp.removeChests2(1);
			            }else if(sup == 3){
				            cp.removeChests3(1);
			            }else if(sup == 4){
				            cp.removeChests4(1);
			            }else if(sup == 5){
				            cp.removeChests5(1);
			            }else if(sup == 6){
				            cp.removeChests6(1);
			            }else if(sup == 7){
				            cp.removeChests7(1);
			            }else if(sup == 8){
				            cp.removeChests8(1);
			            }else if(sup == 9){
				            cp.removeChests9(1);
			            }else{
			            	cp.removeChests10(1);
			            }
			            cp.update();
			            RollMenu.startRollTirage(p, sup, 0, 0, 1, 0);
			            
					}else if(type.contains("cos")){
						
						ItemStack IS = e.getInventory().getItem(13);
						String ISname = IS.getItemMeta().getDisplayName();
						String rarity = CalculUtils.colorToRarity(ISname);
						int price = CalculUtils.rarityToPrice(rarity);
						String cos = type.replaceAll("cos", "");
						
						if(cp.getCrystals() >= price){
							
							cp.removeCrystals(price);
							cp.setCosmetic(cos, true);
							cp.update();
							if(type.contains("wings")){
								CosParticlesWingsMenu.openMenu(p);
							}else if(type.contains("hats")){
								CosParticlesHatsMenu.openMenu(p);
							}else{
								p.closeInventory();
							}
							p.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 100, 1);
							p.sendMessage("§aTu as obtenus l'effet "+ISname+" §a!");
							MainScoreboard.loadScoreboard(p);
							
						}else{
							
							p.closeInventory();
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
							int dif = price-cp.getCrystals();
							p.sendMessage("§cIl te manque "+dif+" crystals pour acheter ceci ( coût : "+price+" crystals ) !");
							
						}
						
					}
					
				}
				
				if(name.equalsIgnoreCase("§c§lANNULER")){
					
					p.closeInventory();
					p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 100, 2);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
