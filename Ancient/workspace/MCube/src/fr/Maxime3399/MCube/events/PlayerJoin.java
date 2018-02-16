package fr.Maxime3399.MCube.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.actions.ChestActions;
import fr.Maxime3399.MCube.custom.CustomPlayer;
import fr.Maxime3399.MCube.custom.GameEvent;
import fr.Maxime3399.MCube.scoreboards.MainScoreboard;
import fr.Maxime3399.MCube.utils.DataUtils;

public class PlayerJoin implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		DataUtils.registerPlayer(p);
		CustomPlayer cp = new CustomPlayer(p);
		
		String phase = DataUtils.getServerStringInfo("phase");
		Boolean connected = true;
		Boolean connectedPermissionStaff = false;
		Boolean connectedPermission = false;
		int playersCount = Bukkit.getOnlinePlayers().size()-1;
		int maxPlayers = DataUtils.getServerIntInfo("maxplayers");
		int maxVIP = DataUtils.getServerIntInfo("maxvip");
		if(cp.getStaffRank().equalsIgnoreCase("admin") || cp.getStaffRank().equalsIgnoreCase("respdev") || cp.getStaffRank().equalsIgnoreCase("dev")){
			connectedPermissionStaff = true;
		}
		if(!cp.getRank().equalsIgnoreCase("default")){
			connectedPermission = true;
		}
		if(phase.equalsIgnoreCase("maintenance")){
			
			if(!connectedPermissionStaff){
				
				p.kickPlayer("§b§oLe serveur est en maintenance !");
				connected = false;
				
			}
			
		}else if(phase.equalsIgnoreCase("close")){
			
			if(!connectedPermissionStaff){
				
				p.kickPlayer("§eLe serveur ouvre le §l10/05§r §ea §b16h§r §e!");
				connected = false;
				
			}
			
		}else{
			
			if(playersCount >= maxPlayers){
				
				if(playersCount >= maxVIP+maxPlayers){
					
					p.kickPlayer("§cLe serveur est entièrement pleins !");
					connected = false;
					
				}else{
					
					if(!connectedPermission){
						
						p.kickPlayer("§cServeur pleins, accès réservé aux §f§lMini-VIP§r §cet plus !");
						connected = false;
						
					}
					
				}
				
			}
			
		}
		
		if(connected){
			
			p.setDisplayName(cp.getCalculedDisplayName());
			e.setJoinMessage("§a§l+§r "+p.getDisplayName());
			p.setPlayerListName(p.getDisplayName());
			
			p.setGameMode(GameMode.SURVIVAL);
			p.setWalkSpeed((float) 0.2);
			
			if(cp.getRank().equalsIgnoreCase("ultravip+") || cp.getRank().equalsIgnoreCase("yt")){
				p.setAllowFlight(true);
				if(!p.isOnGround()){
					p.setFlying(true);
				}
			}
			
			if(GameEvent.isEvent(GameEvent.DOUBLELIFE)){
				p.setMaxHealth(40);
			}else if(GameEvent.isEvent(GameEvent.HALFLIFE)){
				if(p.getHealth() > 10){
					p.setHealth(10);
				}
				p.setMaxHealth(10);
			}else{
				if(p.getHealth() > 20){
					p.setHealth(20);
				}
				p.setMaxHealth(20);
			}
			if(GameEvent.isEvent(GameEvent.NOFOOD)){
				p.setFoodLevel(21);
			}
			
			MainScoreboard.loadScoreboard(p);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 40, 10));
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					
					String txt1 = " §b§l============================================§r\n";
					String txt2 = " \n";
					String txt3 = " "+DataUtils.getServerStringInfo("connect1")+"§r\n";
					String txt4 = " "+DataUtils.getServerStringInfo("connect2")+"§r\n";
					String txt5 = " "+DataUtils.getServerStringInfo("connect3")+"§r\n";
					String txt6 = " "+DataUtils.getServerStringInfo("connect4")+"§r\n";
					String txt7 = " "+DataUtils.getServerStringInfo("connect5")+"§r\n";
					String txt8 = " "+DataUtils.getServerStringInfo("connect6")+"§r\n";
					String txt9 = " \n";
					String txt10 = " §b§l============================================";
					p.sendMessage(txt1+txt2+txt3+txt4+txt5+txt6+txt7+txt8+txt9+txt10);
					
				}
				
			}, 	1);
			
		    DateFormat df2 = new SimpleDateFormat("yyyy/MM");
		    String date2 = df2.format(new Date());
		    if(!cp.getExpireChestDate().equalsIgnoreCase(date2)){
		    	cp.setChests1(0);
		    	cp.setChests2(0);
		    	cp.setChests3(0);
		    	cp.setChests4(0);
		    	cp.setChests5(0);
		    	cp.setChests6(0);
		    	cp.setChests7(0);
		    	cp.setChests8(0);
		    	cp.setChests9(0);
		    	cp.setChests10(0);
		    	cp.executeExpireChestDate();
		    	cp.update();
		    }
			
		    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		    String date = df.format(new Date());
			if(!cp.getLastConnexion().equalsIgnoreCase(date)){
				Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
					@Override
					public void run() {
						ChestActions.giveRandomChest(p);
					}
				}, 20);
				cp.executeLastConnexion();
				cp.update();
			}
			
		}else{
			
			e.setJoinMessage(null);
			
		}
		
	}

}
