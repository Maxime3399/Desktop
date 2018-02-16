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
import fr.Maxime3399.MCube.menus.CosParticlesMenu;
import fr.Maxime3399.MCube.menus.CosParticlesWingsMenu;

public class CosParticlesWingsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}if(e.getInventory().getName().equalsIgnoreCase("§8Particules>Ailes")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				CustomPlayer cp = new CustomPlayer(p);
				
				if(name.equalsIgnoreCase("§8§oRetour")){
					
					CosParticlesMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100, 1);
					
				}else if(name.equalsIgnoreCase("§9Ailes de feu")){
					
					if(cp.getRank().equalsIgnoreCase("default")){
						p.sendMessage("§cTu dois au moins être §f§lMiniVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("firewings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("firewings");
							p.sendMessage("§eEffet §9Ailes de feu§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes magiques")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip")){
						p.sendMessage("§cTu dois au moins être §e§lVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("magicwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("magicwings");
							p.sendMessage("§eEffet §9Ailes magiques§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes de neige")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip")){
						p.sendMessage("§cTu dois au moins être §b§lVIP+§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("snowwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("snowwings");
							p.sendMessage("§eEffet §9Ailes de neige§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes multicolores")){
					
					if(cp.getRank().equalsIgnoreCase("default") || cp.getRank().equalsIgnoreCase("minivip") || cp.getRank().equalsIgnoreCase("vip") || cp.getRank().equalsIgnoreCase("vip+")){
						p.sendMessage("§cTu dois au moins être §a§lUltraVIP§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("multicolorwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("multicolorwings");
							p.sendMessage("§eEffet §9Ailes multicolores§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes de la mort")){
					
					if(!cp.getRank().equalsIgnoreCase("ultravip+")){
						p.sendMessage("§cTu dois au moins être §2§lUltraVIP+§r §c!");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("deathwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("deathwings");
							p.sendMessage("§eEffet §9Ailes de la mort§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes du nether")){
					
					if(!cp.HasCosmetic("netherwings")){
						p.sendMessage("§cTu ne possèdes pas cet effet, mais il est achetable sur la boutique !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("netherwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("netherwings");
							p.sendMessage("§eEffet §9Ailes du nether§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes de l'ender")){
					
					if(!cp.HasCosmetic("enderwings")){
						p.sendMessage("§cTu ne possèdes pas cet effet, mais il est obtenable en participant a des events !");
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
					}else{
						if(cp.getEnabledCosmetics().contains("enderwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("enderwings");
							p.sendMessage("§eEffet §9Ailes de l'ender§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§aAiles d'ange")){
					
					if(!cp.HasCosmetic("angelwings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosangelwings");
					}else{
						if(cp.getEnabledCosmetics().contains("angelwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("angelwings");
							p.sendMessage("§eEffet §aAiles d'ange§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§2Ailes enchantées")){
					
					if(!cp.HasCosmetic("enchwings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosenchwings");
					}else{
						if(cp.getEnabledCosmetics().contains("enchwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("enchwings");
							p.sendMessage("§eEffet §2Ailes enchantées§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§dAiles de dragon")){
					
					if(!cp.HasCosmetic("dragwings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosdragwings");
					}else{
						if(cp.getEnabledCosmetics().contains("dragwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("dragwings");
							p.sendMessage("§eEffet §dAiles de dragon§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§5Ailes blanches")){
					
					if(!cp.HasCosmetic("whitewings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "coswhitewings");
					}else{
						if(cp.getEnabledCosmetics().contains("whitewings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("whitewings");
							p.sendMessage("§eEffet §5Ailes blanches§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§bAiles brillantes")){
					
					if(!cp.HasCosmetic("fwwings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosfwwings");
					}else{
						if(cp.getEnabledCosmetics().contains("fwwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("fwwings");
							p.sendMessage("§eEffet §bAiles brillantes§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§3Ailes de fumée")){
					
					if(!cp.HasCosmetic("smokewings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cossmokewings");
					}else{
						if(cp.getEnabledCosmetics().contains("smokewings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("smokewings");
							p.sendMessage("§eEffet §3Ailes de fumée§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}else if(name.equalsIgnoreCase("§9Ailes de dieu")){
					
					if(!cp.HasCosmetic("godwings")){
						p.playSound(p.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 100, 1);
						ConfirmMenu.openMenu(p, "cosgodwings");
					}else{
						if(cp.getEnabledCosmetics().contains("godwings")){
							p.sendMessage("§cCet effet est déjà activé !");
							p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 100, 1);
						}else{
							CosRemovers.removeParticleEffect(p);
							cp.addEnableCosmetic("godwings");
							p.sendMessage("§eEffet §9Ailes de dieu§e activé !");
							p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 100, 1);
							CosParticlesWingsMenu.openMenu(p);
						}
					}
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
