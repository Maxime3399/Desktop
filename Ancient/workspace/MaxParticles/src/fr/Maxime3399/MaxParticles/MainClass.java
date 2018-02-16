package fr.Maxime3399.MaxParticles;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.MaxParticles.events.EventsManager;
import fr.Maxime3399.MaxParticles.manager.EffectManager;
import fr.Maxime3399.MaxParticles.menus.MainMenu;
import fr.Maxime3399.MaxParticles.schedulers.SchedulerManager;
import fr.Maxime3399.MaxParticles.utils.MessageUtils;

public class MainClass extends JavaPlugin{
	
	private static Plugin pl;
	
	public void onEnable(){
		
		pl = this;
		EventsManager.registerEvents();
		SchedulerManager.registerSchedulers();
		
	}
	
	public static Plugin getInstance(){
		
		return pl;
		
	}
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		
		if (!(sender instanceof Player) && !(sender instanceof ConsoleCommandSender)) {
			
			return false;
			
		}
		
		if(sender instanceof ConsoleCommandSender){
			
			sender.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cThis command can not be used by the console !");
			return false;
			
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("particles")){
			
			MainMenu.openMenu(p);
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 100, 2);
			
		}else if(cmd.getName().equalsIgnoreCase("maxparticles") || cmd.getName().equalsIgnoreCase("mp")){
			
			if(args.length <= 0){
				
				p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cUse §l/mp help§r§c to get the list of all commands");
				p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
				
			}else{
				
				String type = args[0];
				
				if(type.equalsIgnoreCase("help")){
					
					p.sendMessage(" \n §2§l==========§r  §b§l[§r§6Max§eParticles§r§b§l]§r  §2§l==========§r\n§b/mp list §d: §9Get the list of all effects\n§b/mp seteffect [EFFECT] [PLAYER] §d: §9Set an effect to a player§r\n§b/mp remove [PLAYER] §d: §9Remove the effect of a player\n ");
					
				}else if(type.equalsIgnoreCase("seteffect")){
					
					if(args.length == 3){
						
						String effect = args[1];
						String targetPlayer = args[2];
						
						boolean validEffect = false;
						
						for(String s : MessageUtils.getAllEffects()){
							if(s.equalsIgnoreCase(effect)){
								validEffect = true;
							}
						}
						
						if(validEffect){
							
							if(Bukkit.getPlayer(targetPlayer) == null){
								
								p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cThis player is offline !");
								p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
								
							}else{
								
								Player tp = Bukkit.getPlayer(targetPlayer);
								EffectManager.lister.put(tp, effect);
								if(tp != p){
									p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §a§l"+tp.getName()+"§r§a now has the §l"+effect+"§r§a effect enabled !");
									tp.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §a§l"+tp.getName()+"§r§a active the effect §l"+effect+"§r§a for you !");
									p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
									tp.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
								}else{
									p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §aYou active the effect §l"+effect+"§r§a for you !");
									p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
								}
								p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
								
							}
							
						}else{
							
							p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cThis effect doesn't exist, use §l/mp list§r§c to get the list of all effects");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
							
						}
						
					}else{
						
						p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cUse : §l/mp seteffect [EFFECT] [PLAYER]");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
						
					}
					
				}else if(type.equalsIgnoreCase("list")){
					
					String message = "";
					for(String s : MessageUtils.getAllEffects()){
						message = message+" "+s;
					}
					p.sendMessage(" \n§b§l[§r§6Max§eParticles§r§b§l]§r§3"+message+"§r\n ");
					
				}else if(type.equalsIgnoreCase("remove")){
					
					if(args.length == 2){
						
						String targetPlayer = args[1];
						
						if(Bukkit.getPlayer(targetPlayer) == null){
							
							p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cThis player is offline !");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
							
						}else{
							
							Player tp = Bukkit.getPlayer(targetPlayer);
							
							if(EffectManager.lister.containsKey(tp)){
								
								EffectManager.lister.remove(tp);
								if(tp != p){
									tp.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §aYour effect has by disabled by §l"+p.getName()+"§r§a !");
									p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §aYou've disabled the effect of §l"+tp.getName()+"§r§a !");
									p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
									tp.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
								}else{
									p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §aYour effect has been disabled !");
									p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 100, 2);
								}
								
							}else{
								
								p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cThis player has no active effect! ");
								p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
								
							}
							
						}
						
					}else{
						
						p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cUse : §l/mp remove [PLAYER]");
						p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
						
					}
					
				}else{
					
					p.sendMessage("§b§l[§r§6Max§eParticles§r§b§l]§r §cUse §l/mp help§r§c to get the list of all commands");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}
				
			}
			
		}
		
		return true;
		
	}

}
