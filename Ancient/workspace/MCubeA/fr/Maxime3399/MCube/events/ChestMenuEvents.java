package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.MainClass;
import fr.Maxime3399.MCube.actions.chestsCount;
import fr.Maxime3399.MCube.manager.FakePlayers;
import fr.Maxime3399.MCube.menus.ChestMenu;
import fr.Maxime3399.MCube.quests.TestEndQuest;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import java.util.ArrayList;
import java.util.Random;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChestMenuEvents implements org.bukkit.event.Listener
{
  public ChestMenuEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (e.getInventory().getName().equalsIgnoreCase("§9§lCoffres"))
    {
      if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR))
      {
        return;
      }
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eCoffre basique"))
      {
        Random r = new Random();
        int t = r.nextInt(10) + 1;
        MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + t);
        MainClass.getEcononomy().depositPlayer(p.getName(), t);
        if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
          Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé §6" + t + " coins §r§adans un §e§lCoffre basique §r§a!");
        } else {
          Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé §6" + t + " coins §r§adans un §e§lCoffre basique §r§a!");
        }
        MCubeAPI.setChests(p, "basic", MCubeAPI.getChests(p, "basic") - 1);
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
        p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
          pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
        }
        if (MCubeAPI.getCurrentQuest(p) == 45) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + t);
          TestEndQuest.test(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Coffre rare"))
      {
        Random r = new Random();
        int t = r.nextInt(30) + 10;
        MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + t);
        MainClass.getEcononomy().depositPlayer(p.getName(), t);
        if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
          Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé §6" + t + " coins §r§adans un §6§lCoffre rare §r§a!");
        } else {
          Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé §6" + t + " coins §r§adans un §6§lCoffre rare §r§a!");
        }
        MCubeAPI.setChests(p, "rare", MCubeAPI.getChests(p, "rare") - 1);
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
        p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
          pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
        }
        if (MCubeAPI.getCurrentQuest(p) == 45) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + t);
          TestEndQuest.test(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Coffre epic"))
      {
        Random r = new Random();
        int t = r.nextInt(90) + 30;
        MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + t);
        MainClass.getEcononomy().depositPlayer(p.getName(), t);
        if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
          Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé §6" + t + " coins §r§adans un §5§lCoffre epic §r§a!");
        } else {
          Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé §6" + t + " coins §r§adans un §5§lCoffre epic §r§a!");
        }
        MCubeAPI.setChests(p, "epic", MCubeAPI.getChests(p, "epic") - 1);
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
        p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
          pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
        }
        if (MCubeAPI.getCurrentQuest(p) == 45) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + t);
          TestEndQuest.test(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bCoffre légendaire"))
      {
        Random r = new Random();
        int t = r.nextInt(391) + 110;
        MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + t);
        MainClass.getEcononomy().depositPlayer(p.getName(), t);
        if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
          Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé §6" + t + " coins §r§adans un §b§lCoffre légendaire §r§a!");
        } else {
          Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé §6" + t + " coins §r§adans un §b§lCoffre légendaire §r§a!");
        }
        MCubeAPI.setChests(p, "legendary", MCubeAPI.getChests(p, "legendary") - 1);
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
        p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
          pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
        }
        if (MCubeAPI.getCurrentQuest(p) == 45) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + t);
          TestEndQuest.test(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Coffre Ultime"))
      {
        Random r = new Random();
        int t = r.nextInt(1201) + 490;
        MCubeAPI.setCoins(p, MCubeAPI.getPlayerCoins(p) + t);
        MainClass.getEcononomy().depositPlayer(p.getName(), t);
        if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
          Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé §6" + t + " coins §r§adans un §9§lCoffre Ultime §r§a!");
        } else {
          Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé §6" + t + " coins §r§adans un §9§lCoffre Ultime §r§a!");
        }
        MCubeAPI.setChests(p, "ultimate", MCubeAPI.getChests(p, "ultimate") - 1);
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
        MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
        p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
          pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
        }
        if (MCubeAPI.getCurrentQuest(p) == 45) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + t);
          TestEndQuest.test(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Coffre de cosmétiques"))
      {
        ArrayList<String> AL = new ArrayList();
        if (MCubeAPI.getCos(p, "angryVillager").equalsIgnoreCase("false")) {
          AL.add("angryVillager");
        }
        if (MCubeAPI.getCos(p, "barrier").equalsIgnoreCase("false")) {
          AL.add("barrier");
        }
        if (MCubeAPI.getCos(p, "blockcrack").equalsIgnoreCase("false")) {
          AL.add("blockcrack");
        }
        if (MCubeAPI.getCos(p, "bubble").equalsIgnoreCase("false")) {
          AL.add("bubble");
        }
        if (MCubeAPI.getCos(p, "cloud").equalsIgnoreCase("false")) {
          AL.add("cloud");
        }
        if (MCubeAPI.getCos(p, "crit").equalsIgnoreCase("false")) {
          AL.add("crit");
        }
        if (MCubeAPI.getCos(p, "damageIndicator").equalsIgnoreCase("false")) {
          AL.add("damageIndicator");
        }
        if (MCubeAPI.getCos(p, "depthsuspend").equalsIgnoreCase("false")) {
          AL.add("depthsuspend");
        }
        if (MCubeAPI.getCos(p, "dragonbreath").equalsIgnoreCase("false")) {
          AL.add("dragonbreath");
        }
        if (MCubeAPI.getCos(p, "dripLava").equalsIgnoreCase("false")) {
          AL.add("dripLava");
        }
        if (MCubeAPI.getCos(p, "dripWater").equalsIgnoreCase("false")) {
          AL.add("dripWater");
        }
        if (MCubeAPI.getCos(p, "droplet").equalsIgnoreCase("false")) {
          AL.add("droplet");
        }
        if (MCubeAPI.getCos(p, "enchantmenttable").equalsIgnoreCase("false")) {
          AL.add("enchantmenttable");
        }
        if (MCubeAPI.getCos(p, "endRod").equalsIgnoreCase("false")) {
          AL.add("endRod");
        }
        if (MCubeAPI.getCos(p, "fallingDust").equalsIgnoreCase("false")) {
          AL.add("fallingDust");
        }
        if (MCubeAPI.getCos(p, "fireworksSpark").equalsIgnoreCase("false")) {
          AL.add("fireworksSpark");
        }
        if (MCubeAPI.getCos(p, "flame").equalsIgnoreCase("false")) {
          AL.add("flame");
        }
        if (MCubeAPI.getCos(p, "happyVillager").equalsIgnoreCase("false")) {
          AL.add("happyVillager");
        }
        if (MCubeAPI.getCos(p, "lightDeath").equalsIgnoreCase("false")) {
          AL.add("lightDeath");
        }
        if (MCubeAPI.getCos(p, "bloodDeath").equalsIgnoreCase("false")) {
          AL.add("bloodDeath");
        }
        if (MCubeAPI.getCos(p, "boneDeath").equalsIgnoreCase("false")) {
          AL.add("boneDeath");
        }
        if (MCubeAPI.getCos(p, "textDeath").equalsIgnoreCase("false")) {
          AL.add("textDeath");
        }
        if (MCubeAPI.getCos(p, "explodeDeath").equalsIgnoreCase("false")) {
          AL.add("explodeDeath");
        }
        if (MCubeAPI.getCos(p, "corpseDeath").equalsIgnoreCase("false")) {
          AL.add("corpseDeath");
        }
        if (MCubeAPI.getCos(p, "cielDeath").equalsIgnoreCase("false")) {
          AL.add("cielDeath");
        }
        if (MCubeAPI.getCos(p, "enferDeath").equalsIgnoreCase("false")) {
          AL.add("enferDeath");
        }
        if (MCubeAPI.getCos(p, "baliseDeath").equalsIgnoreCase("false")) {
          AL.add("baliseDeath");
        }
        if (AL.size() > 0) {
          Random r = new Random();
          int tr = r.nextInt(AL.size());
          String cos = (String)AL.get(tr);
          MCubeAPI.setCos(p, cos, "true");
          String ccos = "none";
          if (cos.equalsIgnoreCase("angryVillager")) {
            ccos = "Angry Villager";
          } else if (cos.equalsIgnoreCase("barrier")) {
            ccos = "Barrier";
          } else if (cos.equalsIgnoreCase("blockcrack")) {
            ccos = "Block Crack";
          } else if (cos.equalsIgnoreCase("bubble")) {
            ccos = "Bubble";
          } else if (cos.equalsIgnoreCase("cloud")) {
            ccos = "Cloud";
          } else if (cos.equalsIgnoreCase("crit")) {
            ccos = "Crit";
          } else if (cos.equalsIgnoreCase("damageIndicator")) {
            ccos = "Damage Indicator";
          } else if (cos.equalsIgnoreCase("depthsuspend")) {
            ccos = "Depth Suspend";
          } else if (cos.equalsIgnoreCase("dragonbreath")) {
            ccos = "Dragon Breath";
          } else if (cos.equalsIgnoreCase("dripLava")) {
            ccos = "Drip Lava";
          } else if (cos.equalsIgnoreCase("dripWater")) {
            ccos = "Drip Water";
          } else if (cos.equalsIgnoreCase("droplet")) {
            ccos = "Droplet";
          } else if (cos.equalsIgnoreCase("enchantmenttable")) {
            ccos = "Enchantment Table";
          } else if (cos.equalsIgnoreCase("endRod")) {
            ccos = "End Rod";
          } else if (cos.equalsIgnoreCase("fallingDust")) {
            ccos = "Falling Dust";
          } else if (cos.equalsIgnoreCase("fireworksSpark")) {
            ccos = "Fireworks Spark";
          } else if (cos.equalsIgnoreCase("flame")) {
            ccos = "Flame";
          } else if (cos.equalsIgnoreCase("happyVillager")) {
            ccos = "Happy Villager";
          } else if (cos.equalsIgnoreCase("lightDeath")) {
            ccos = "Eclairs";
          } else if (cos.equalsIgnoreCase("bloodDeath")) {
            ccos = "Sang";
          } else if (cos.equalsIgnoreCase("boneDeath")) {
            ccos = "Os";
          } else if (cos.equalsIgnoreCase("textDeath")) {
            ccos = "Texte Flottant";
          } else if (cos.equalsIgnoreCase("explodeDeath")) {
            ccos = "Explode";
          } else if (cos.equalsIgnoreCase("corpseDeath")) {
            ccos = "Cadavre";
          } else if (cos.equalsIgnoreCase("cielDeath")) {
            ccos = "Ciel";
          } else if (cos.equalsIgnoreCase("enferDeath")) {
            ccos = "Enfer";
          } else if (cos.equalsIgnoreCase("baliseDeath")) {
            ccos = "Balise";
          }
          if ((p.getName().equalsIgnoreCase("Cubenderz")) && (!FakePlayers.name.equalsIgnoreCase("none"))) {
            Bukkit.broadcastMessage("§9§o" + FakePlayers.name + " §r§aa trouvé le cosmétique §6" + ccos + " §r§adans un §3Coffre de cosmétiques §r§a!");
          } else {
            Bukkit.broadcastMessage("§9§o" + p.getName() + " §r§aa trouvé le cosmétique §6" + ccos + " §r§adans un §3Coffre de cosmétiques §r§a!");
          }
          MCubeAPI.setChests(p, "cos", MCubeAPI.getChests(p, "cos") - 1);
          MCubeAPI.setTrophies(p, MCubeAPI.getPlayerTrophies(p) + 10);
          p.sendMessage("§aTu as obtenus §e10 trophés §r§a!");
          for (Player pls : Bukkit.getOnlinePlayers()) {
            ScoreboardGame.loadScoreboard(pls);
            DisplayNameUtils.setDisplayName(pls);
            pls.playSound(pls.getLocation(), Sound.BLOCK_CHEST_OPEN, 100.0F, 1.0F);
          }
          p.closeInventory();
          if (chestsCount.get(p) != 0) {
            ChestMenu.openMenu(p);
          }
        }
        else {
          p.sendMessage("§c§lTu as déjà tous les cosmétiques !");
          p.playSound(p.getLocation(), Sound.BLOCK_ENDERCHEST_CLOSE, 100.0F, 2.0F);
        }
        p.closeInventory();
        if (chestsCount.get(p) != 0) {
          ChestMenu.openMenu(p);
        }
      }
      else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§oRetour"))
      {
        p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 100.0F, 1.0F);
        p.closeInventory();
        fr.Maxime3399.MCube.menus.MainMenu.openMenu(p);
      }
      

      e.setCancelled(true);
    }
  }
}
