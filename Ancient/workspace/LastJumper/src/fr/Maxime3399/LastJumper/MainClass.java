package fr.Maxime3399.LastJumper;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import fr.Maxime3399.LastJumper.actions.Jumper;
import fr.Maxime3399.LastJumper.events.EventsManager;
import fr.Maxime3399.LastJumper.managers.ArenasManager;
import fr.Maxime3399.LastJumper.managers.ReturnerManager;
import fr.Maxime3399.LastJumper.menus.ArenasMenus;
import fr.Maxime3399.LastJumper.schedulers.EjectionTime;
import fr.Maxime3399.LastJumper.schedulers.PlayerDeathScheduler;
import fr.Maxime3399.LastJumper.schedulers.PlayerJumps;
import fr.Maxime3399.LastJumper.schedulers.SchedulersManager;
import fr.Maxime3399.LastJumper.schedulers.WaitingScheduler;
import fr.Maxime3399.LastJumper.utils.ArenasConfig;
import fr.Maxime3399.LastJumper.utils.ConfigManager;
import fr.Maxime3399.LastJumper.utils.MessagesUtils;

public class MainClass extends JavaPlugin{
	
	public static ConfigManager cfgm;
	
	public void onEnable(){
		
		loadConfiguration();
		
		SchedulersManager.registerSchedulers();
		EventsManager.registerEvents(this);
		
	}
	
	@SuppressWarnings("deprecation")
	public void onDisable(){
		
		if(ArenasManager.list.size() != 0){
			
			for(String name : ArenasManager.list){
				
				for(Block bs : PlayerJumps.bl.get(name)){
					
					bs.setType(Material.WATER);
					
				}
				
			}
			
		}
		
		for(Player pls : Bukkit.getOnlinePlayers()){
			
			if(ArenasManager.playerArena.containsKey(pls)){
				
				String name = ArenasManager.playerArena.get(pls);
				
				ArenasManager.playerArena.remove(pls);
				pls.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
				ArenasManager.arenaCount.put(name, ArenasManager.arenaCount.get(name)-1);
				
				ReturnerManager.returnInventory(pls);
				ReturnerManager.returnLocation(pls);
				ReturnerManager.returnGM(pls);
				pls.setMaxHealth(20);
				pls.setHealth(20);
				ReturnerManager.returnFood(pls);
				ReturnerManager.returnHealth(pls);
				
			}
			
		}
		
	}
	
	public void loadConfiguration(){
		
		File file = new File(getDataFolder(), "config.yml");
		
		if(!file.exists()){
			
			try{
				
				getConfig().options().copyDefaults();
				saveDefaultConfig();
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§bLastJumper§r§6§l] §r§aThe config.yml file has been created");
				
			}catch(Exception e){
				
				Bukkit.getConsoleSender().sendMessage("§6§l[§r§bLastJumper§r§6§l] §r§cCould not create the config.yml file");
				
			}
			
		}
		
		cfgm = new ConfigManager();
		cfgm.setup();
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("lj") || cmd.getName().equalsIgnoreCase("lastjumper")){
			
			if(args.length == 0){
				
				if(p.hasPermission("lastjumper.help") || p.hasPermission("lastjumper.admin")|| p.hasPermission("lastjumper.player")){
					
					MessagesUtils.sendMessages(p, "CmdHelp", true, "");
					
				}else{
					
					MessagesUtils.sendMessages(p, "NoPermission", true, "");
					
				}
				
			}else{
				
				String type = args[0];
				if(type.equalsIgnoreCase("help")){
					
					if(p.hasPermission("lastjumper.help") || p.hasPermission("lastjumper.admin")|| p.hasPermission("lastjumper.player")){
						
						int i = 0;
						
						if(p.hasPermission("lastjumper.create") || p.hasPermission("lastjumper.admin")){
							MessagesUtils.sendMessages(p, "CmdHelp1", false, "");
							i = 1;
						}
						if(p.hasPermission("lastjumper.setjump") || p.hasPermission("lastjumper.admin")){
							MessagesUtils.sendMessages(p, "CmdHelp2", false, "");
							i = 1;
						}
						if(p.hasPermission("lastjumper.setwait") || p.hasPermission("lastjumper.admin")){
							MessagesUtils.sendMessages(p, "CmdHelp3", false, "");
							i = 1;
						}
						if(p.hasPermission("lastjumper.delete") || p.hasPermission("lastjumper.admin")){
							MessagesUtils.sendMessages(p, "CmdHelp4", false, "");
							i = 1;
						}
						if(p.hasPermission("lastjumper.menu") || p.hasPermission("lastjumper.admin") || p.hasPermission("lastjumper.player")){
							MessagesUtils.sendMessages(p, "CmdHelp5", false, "");
							i = 1;
						}
						
						if(i == 0){
							
							MessagesUtils.sendMessages(p, "CmdNull", true, "");
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}else if(type.equalsIgnoreCase("create")){
					
					if(p.hasPermission("lastjumper.create") || p.hasPermission("lastjumper.admin")){
						
						if(args.length == 2){
							
							String name = args[1];
							
							if(ArenasConfig.exist(name)){
								
								MessagesUtils.sendMessages(p, "CreateExist", true, "");
								
							}else{
								
								ArenasConfig.addArena(name);
								MessagesUtils.sendMessages(p, "CreateSuccess", true, "");
								
							}
							
						}else{
							
							MessagesUtils.sendMessages(p, "CmdHelp1", false, "");
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}else if(type.equalsIgnoreCase("setjump")){
					
					if(p.hasPermission("lastjumper.setjump") || p.hasPermission("lastjumper.admin")){
						
						if(args.length == 2){
							
							String name = args[1];
							
							if(ArenasConfig.exist(name)){
								
								ArenasConfig.defineJump(name, p);
								MessagesUtils.sendMessages(p, "SetJumpSuccess", true, "");
								
							}else{
								
								MessagesUtils.sendMessages(p, "NotExist", true, "");
								
							}
							
						}else{
							
							MessagesUtils.sendMessages(p, "CmdHelp2", false, "");
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}else if(type.equalsIgnoreCase("setwait")){
					
					if(p.hasPermission("lastjumper.setwait") || p.hasPermission("lastjumper.admin")){
						
						if(args.length == 2){
							
							String name = args[1];
							
							if(ArenasConfig.exist(name)){
								
								ArenasConfig.defineWait(name, p);
								MessagesUtils.sendMessages(p, "SetWaitSuccess", true, "");
								
							}else{
								
								MessagesUtils.sendMessages(p, "NotExist", true, "");
								
							}
							
						}else{
							
							MessagesUtils.sendMessages(p, "CmdHelp3", false, "");
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}else if(type.equalsIgnoreCase("delete")){
					
					if(p.hasPermission("lastjumper.delete") || p.hasPermission("lastjumper.admin")){
						
						if(args.length == 2){
							
							String name = args[1];
							
							if(ArenasConfig.exist(name)){
								
								if(ArenasManager.arenaCount.get(name) != 0){
									
									MessagesUtils.sendMessages(p, "DeleteGame", true, "");
									
								}else{
									
									WaitingScheduler.stop(name);
									PlayerJumps.stop(name);
									PlayerDeathScheduler.stop(name);
									MessagesUtils.sendMessages(p, "DeleteArena", true, "");
									ArenasManager.arenasState.remove(name);
									ArenasManager.arenaCount.remove(name);
									ArenasManager.livePlayers.remove(name);
									ArenasManager.winner.remove(name);
									ArenasManager.startingTime.remove(name);
									ArenasManager.jumper.remove(name);
									PlayerJumps.bl.remove(name);
									Jumper.lister.remove(name);
									Jumper.suiver.remove(name);
									ArenasManager.list.remove(name);
									ArenasManager.livingPerson.remove(name);
									EjectionTime.stop(name);
									
									ArenasConfig.removeArena(name);
									
								}
								
							}else{
								
								MessagesUtils.sendMessages(p, "NotExist", true, "");
								
							}
							
						}else{
							
							MessagesUtils.sendMessages(p, "CmdHelp3", false, "");
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}else if(type.equalsIgnoreCase("menu")){
					
					if(p.hasPermission("lastjumper.menu") || p.hasPermission("lastjumper.admin") || p.hasPermission("lastjumper.player")){
						
						if(!ArenasManager.playerArena.containsKey(p)){
							
							ArenasMenus.openMenu(p);
							
						}
						
					}else{
						
						MessagesUtils.sendMessages(p, "NoPermission", true, "");
						
					}
					
				}
				
			}
			
		}else{
			
			if(p.hasPermission("lastjumper.help") || p.hasPermission("lastjumper.admin")|| p.hasPermission("lastjumper.player")){
				
				MessagesUtils.sendMessages(p, "CmdHelp", true, "");
				
			}else{
				
				MessagesUtils.sendMessages(p, "NoPermission", true, "");
				
			}
			
		}
		
		return true;
		
	}

}
