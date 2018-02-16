package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MCube.cosmetics.CosRemovers;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.menus.ConfirmMenu;
import fr.Maxime3399.MCube.menus.CosParticlesHatsMenu;
import fr.Maxime3399.MCube.menus.CosParticlesMenu;

public class CosParticlesHatsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Particules>Chapeaux")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§8§oRetour")){
					
					CosParticlesMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§9Chapeau de colère")){
					
					if(cp.getRank().equalsIgnoreCase("default")){
						p.sendMessage("§cTu dois au moins être §f§lMiniVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("angryvhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("angryvhat");
							p.sendMessage("§eEffet §9Chapeau de colère§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau bulles")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip")){
						p.sendMessage("§cTu dois au moins être §e§lVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("bubblehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("bubblehat");
							p.sendMessage("§eEffet §9Chapeau bulles§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau nuage")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip")){
						p.sendMessage("§cTu dois au moins être §b§lVIP+§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("nuagehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("nuagehat");
							p.sendMessage("§eEffet §9Chapeau nuage§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau critique")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip") || cp.getRank().equalsIgnoreCase("vip+")){
						p.sendMessage("§cTu dois au moins être §a§lUltraVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("crithat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("crithat");
							p.sendMessage("§eEffet §9Chapeau nuage§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau d'amour sombre")){
					
					if(!cp.getRank().equalsIgnoreCase("ultravip+")){
						p.sendMessage("§cTu dois au moins être §2§lUltraVIP+§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("damageindichat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("damageindichat");
							p.sendMessage("§eEffet §9Chapeau d'amour sombre§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de la mort")){
					
					if(!cp.HasCosmetic("deathhat")){
						p.sendMessage("§cTu ne possèdes pas cet effet, mais il est achetable sur la boutique !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("deathhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("deathhat");
							p.sendMessage("§eEffet §9Chapeau de la mort§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de dragon")){
					
					if(!cp.HasCosmetic("draghat")){
						p.sendMessage("§cTu ne possèdes pas cet effet, mais il est obtenable en participant a des events !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("draghat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("draghat");
							p.sendMessage("§eEffet §9Chapeau de dragon§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§aChapeau de lave")){
					
					if(!cp.HasCosmetic("dlavahat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosdlavahat");
					}else{
						if(cp.getEnabledCosmetics().contains("dlavahat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("dlavahat");
							p.sendMessage("§eEffet §aChapeau de lave§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§aChapeau d'eau")){
					
					if(!cp.HasCosmetic("dwaterhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosdwaterhat");
					}else{
						if(cp.getEnabledCosmetics().contains("dwaterhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("dwaterhat");
							p.sendMessage("§eEffet §aChapeau d'eau§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§2Chapeau enchanté")){
					
					if(!cp.HasCosmetic("enchhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosenchhat");
					}else{
						if(cp.getEnabledCosmetics().contains("enchhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("enchhat");
							p.sendMessage("§eEffet §2Chapeau enchanté§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§2Chapeau blanc")){
					
					if(!cp.HasCosmetic("whitehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "coswhitehat");
					}else{
						if(cp.getEnabledCosmetics().contains("whitehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("whitehat");
							p.sendMessage("§eEffet §2Chapeau blanc§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§dChapeau de sable")){
					
					if(!cp.HasCosmetic("sandhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cossandhat");
					}else{
						if(cp.getEnabledCosmetics().contains("sandhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("sandhat");
							p.sendMessage("§eEffet §dChapeau de sable§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§dChapeau brillant")){
					
					if(!cp.HasCosmetic("fwhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosfwhat");
					}else{
						if(cp.getEnabledCosmetics().contains("fwhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("fwhat");
							p.sendMessage("§eEffet §dChapeau brillant§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§5Chapeau de feu")){
					
					if(!cp.HasCosmetic("flamehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosflamehat");
					}else{
						if(cp.getEnabledCosmetics().contains("flamehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("flamehat");
							p.sendMessage("§eEffet §5Chapeau de feu§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§5Chapeau magique")){
					
					if(!cp.HasCosmetic("magichat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosmagichat");
					}else{
						if(cp.getEnabledCosmetics().contains("magichat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("magichat");
							p.sendMessage("§eEffet §5Chapeau magique§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§bChapeau d'amour")){
					
					if(!cp.HasCosmetic("lovehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "coslovehat");
					}else{
						if(cp.getEnabledCosmetics().contains("lovehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("lovehat");
							p.sendMessage("§eEffet §bChapeau d'amour§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§bChapeau de jets de lave")){
					
					if(!cp.HasCosmetic("lavahat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "coslavahat");
					}else{
						if(cp.getEnabledCosmetics().contains("lavahat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("lavahat");
							p.sendMessage("§eEffet §bChapeau de jets de lave§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§3Chapeau du combattant")){
					
					if(!cp.HasCosmetic("combathat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "coscombathat");
					}else{
						if(cp.getEnabledCosmetics().contains("combathat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("combathat");
							p.sendMessage("§eEffet §3Chapeau du combattant§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§3Chapeau de musique")){
					
					if(!cp.HasCosmetic("notehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosnotehat");
					}else{
						if(cp.getEnabledCosmetics().contains("notehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("notehat");
							p.sendMessage("§eEffet §3Chapeau de musique§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de l'ender")){
					
					if(!cp.HasCosmetic("enderhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosenderhat");
					}else{
						if(cp.getEnabledCosmetics().contains("enderhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("enderhat");
							p.sendMessage("§eEffet §9Chapeau de l'ender§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau du nether")){
					
					if(!cp.HasCosmetic("netherhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosnetherhat");
					}else{
						if(cp.getEnabledCosmetics().contains("netherhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("netherhat");
							p.sendMessage("§eEffet §9Chapeau du nether§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau multicolor")){
					
					if(!cp.HasCosmetic("multhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosmulthat");
					}else{
						if(cp.getEnabledCosmetics().contains("multhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("multhat");
							p.sendMessage("§eEffet §9Chapeau multicolor§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de slime")){
					
					if(!cp.HasCosmetic("slimehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosslimehat");
					}else{
						if(cp.getEnabledCosmetics().contains("slimehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("slimehat");
							p.sendMessage("§eEffet §9Chapeau de slime§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de fumée")){
					
					if(!cp.HasCosmetic("smokehat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cossmokehat");
					}else{
						if(cp.getEnabledCosmetics().contains("smokehat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("smokehat");
							p.sendMessage("§eEffet §9Chapeau de fumée§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau de neige")){
					
					if(!cp.HasCosmetic("snowhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cossnowhat");
					}else{
						if(cp.getEnabledCosmetics().contains("snowhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("snowhat");
							p.sendMessage("§eEffet §9Chapeau de neige§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau d'ange")){
					
					if(!cp.HasCosmetic("angelhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosangelhat");
					}else{
						if(cp.getEnabledCosmetics().contains("angelhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("angelhat");
							p.sendMessage("§eEffet §9Chapeau d'ange§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Chapeau totémique")){
					
					if(!cp.HasCosmetic("totemhat")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "costotemhat");
					}else{
						if(cp.getEnabledCosmetics().contains("totemhat")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("totemhat");
							p.sendMessage("§eEffet §9Chapeau totémique§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesHatsMenu.openMenu(p);
						}
					}
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
