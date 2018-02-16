package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MCubeAPI;
import fr.Maxime3399.MCube.actions.giveMoney;
import fr.Maxime3399.MCube.quests.TestEndQuest;
import fr.Maxime3399.MCube.quests.resetQuest;
import fr.Maxime3399.MCube.scoreboards.ScoreboardGame;
import fr.Maxime3399.MCube.utils.DisplayNameUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;

public class QuestsEvents implements org.bukkit.event.Listener
{
  public QuestsEvents() {}
  
  @org.bukkit.event.EventHandler
  public void onBreak(BlockBreakEvent e)
  {
    Player p = e.getPlayer();
    
    if (e.getBlock().getType() == Material.COAL_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 1)
      {
        p.sendMessage("§aTu as terminé la quête 1 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.IRON_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 2)
      {
        p.sendMessage("§aTu as terminé la quête 2 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if ((e.getBlock().getType() == Material.REDSTONE_ORE) || (e.getBlock().getType() == Material.GLOWING_REDSTONE_ORE))
    {
      if (MCubeAPI.getCurrentQuest(p) == 3)
      {
        p.sendMessage("§aTu as terminé la quête 3 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.GOLD_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 4)
      {
        p.sendMessage("§aTu as terminé la quête 4 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.LAPIS_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 5)
      {
        p.sendMessage("§aTu as terminé la quête 5 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.DIAMOND_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 6)
      {
        p.sendMessage("§aTu as terminé la quête 6 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.EMERALD_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 7)
      {
        p.sendMessage("§aTu as terminé la quête 7 !");
        MCubeAPI.setTrophies(e.getPlayer(), MCubeAPI.getPlayerTrophies(e.getPlayer()) + 30);
        e.getPlayer().sendMessage("§aTu as obtenus §e30 trophés §r§a!");
        giveMoney.give(p, 5);
        for (Player pls : Bukkit.getOnlinePlayers()) {
          ScoreboardGame.loadScoreboard(pls);
          DisplayNameUtils.setDisplayName(pls);
        }
        resetQuest.reset(p);
      }
      
    }
    else if (e.getBlock().getType() == Material.OBSIDIAN)
    {
      if (MCubeAPI.getCurrentQuest(p) == 8) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.QUARTZ_ORE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 9) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.GLOWSTONE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 10) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.NETHERRACK)
    {
      if (MCubeAPI.getCurrentQuest(p) == 11) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.NETHER_BRICK)
    {
      if (MCubeAPI.getCurrentQuest(p) == 11) {
        MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.ENDER_STONE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 16) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if ((e.getBlock().getType() == Material.CHORUS_FLOWER) || (e.getBlock().getType() == Material.CHORUS_FRUIT) || (e.getBlock().getType() == Material.CHORUS_FRUIT_POPPED) || (e.getBlock().getType() == Material.CHORUS_PLANT))
    {
      if (MCubeAPI.getCurrentQuest(p) == 20) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.SKULL)
    {
      if (MCubeAPI.getCurrentQuest(p) == 21) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.PRISMARINE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 32) {
        MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.GOLD_BLOCK)
    {
      if (MCubeAPI.getCurrentQuest(p) == 32) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.MOSSY_COBBLESTONE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 34) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.CLAY)
    {
      if (MCubeAPI.getCurrentQuest(p) == 35) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.SNOW)
    {
      if (MCubeAPI.getCurrentQuest(p) == 36) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.PACKED_ICE)
    {
      if (MCubeAPI.getCurrentQuest(p) == 41) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.MYCEL)
    {
      if (MCubeAPI.getCurrentQuest(p) == 44) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
  }
  


  @org.bukkit.event.EventHandler
  public void onEntityDeath(EntityDeathEvent e)
  {
    if (e.getEntity().getKiller() == null)
    {
      return;
    }
    if (e.getEntity().getKiller().getType() == EntityType.PLAYER)
    {
      Player p = e.getEntity().getKiller();
      
      if (e.getEntity().getType() == EntityType.BLAZE)
      {
        if (MCubeAPI.getCurrentQuest(p) == 12) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.WITHER_SKELETON)
      {
        if (MCubeAPI.getCurrentQuest(p) == 13) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.WITHER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 14) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.ENDERMAN)
      {
        if (MCubeAPI.getCurrentQuest(p) == 17) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.ENDER_DRAGON)
      {
        if (MCubeAPI.getCurrentQuest(p) == 18) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SHULKER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 19) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.PIG)
      {
        if (MCubeAPI.getCurrentQuest(p) == 23) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.COW)
      {
        if (MCubeAPI.getCurrentQuest(p) == 23) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SHEEP)
      {
        if (MCubeAPI.getCurrentQuest(p) == 23) {
          MCubeAPI.setQuest(p, 3, MCubeAPI.getQuest(p, 3) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.CHICKEN)
      {
        if (MCubeAPI.getCurrentQuest(p) == 24) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.HORSE)
      {
        if (MCubeAPI.getCurrentQuest(p) == 24) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.ZOMBIE)
      {
        if (MCubeAPI.getCurrentQuest(p) == 25) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SKELETON)
      {
        if (MCubeAPI.getCurrentQuest(p) == 25) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.CREEPER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 26) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SPIDER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 26) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.CAVE_SPIDER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 27) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SQUID)
      {
        if (MCubeAPI.getCurrentQuest(p) == 27) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.PIG_ZOMBIE)
      {
        if (MCubeAPI.getCurrentQuest(p) == 28) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.GHAST)
      {
        if (MCubeAPI.getCurrentQuest(p) == 28) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SLIME)
      {
        if (MCubeAPI.getCurrentQuest(p) == 29) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.WITCH)
      {
        if (MCubeAPI.getCurrentQuest(p) == 29) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.SILVERFISH)
      {
        if (MCubeAPI.getCurrentQuest(p) == 30) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.GUARDIAN)
      {
        if (MCubeAPI.getCurrentQuest(p) == 31) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.ELDER_GUARDIAN)
      {
        if (MCubeAPI.getCurrentQuest(p) == 31) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.ENDERMITE)
      {
        if (MCubeAPI.getCurrentQuest(p) == 33) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.MUSHROOM_COW)
      {
        if (MCubeAPI.getCurrentQuest(p) == 37) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.POLAR_BEAR)
      {
        if (MCubeAPI.getCurrentQuest(p) == 38) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.VILLAGER)
      {
        if (MCubeAPI.getCurrentQuest(p) == 39) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.VINDICATOR)
      {
        if (MCubeAPI.getCurrentQuest(p) == 40) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.LLAMA)
      {
        if (MCubeAPI.getCurrentQuest(p) == 42) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.RABBIT)
      {
        if (MCubeAPI.getCurrentQuest(p) == 42) {
          MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
          TestEndQuest.test(p);
        }
      }
      else if (e.getEntity().getType() == EntityType.WOLF)
      {
        if (MCubeAPI.getCurrentQuest(p) == 43) {
          MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
          TestEndQuest.test(p);
        }
      }
    }
  }
  



  @org.bukkit.event.EventHandler
  public void onPlace(org.bukkit.event.block.BlockPlaceEvent e)
  {
    Player p = e.getPlayer();
    
    if (e.getBlock().getType() == Material.BEACON)
    {
      if (MCubeAPI.getCurrentQuest(p) == 15) {
        MCubeAPI.setQuest(p, 1, MCubeAPI.getQuest(p, 1) + 1);
        TestEndQuest.test(p);
      }
    }
    else if (e.getBlock().getType() == Material.IRON_BLOCK)
    {
      if (MCubeAPI.getCurrentQuest(p) == 15) {
        MCubeAPI.setQuest(p, 2, MCubeAPI.getQuest(p, 2) + 1);
        TestEndQuest.test(p);
      }
    }
  }
}
