package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.GameState;
import fr.Maxime3399.MCube.MCubeAPI;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.SpawnEggMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class OtherEvents implements org.bukkit.event.Listener
{
  public OtherEvents() {}
  
  @EventHandler
  public void onPickup(PlayerPickupItemEvent e)
  {
    if (fr.Maxime3399.MCube.cos.bloodDeathEffect.al.contains(e.getItem())) {
      e.setCancelled(true);
    }
    if (fr.Maxime3399.MCube.cos.boneDeathEffect.al.contains(e.getItem())) {
      e.setCancelled(true);
    }
  }
  

  @EventHandler
  public void playerRespaw(PlayerRespawnEvent e)
  {
    Player p = e.getPlayer();
    
    PotionEffect pf = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 10);
    p.addPotionEffect(pf);
  }
  

  @EventHandler
  public static void onBreak(BlockBreakEvent e)
  {
    Player p = e.getPlayer();
    
    if ((MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip")) || (MCubeAPI.getPlayerRank(p).equalsIgnoreCase("ultravip+")))
    {
      if (e.getBlock().getType() == Material.MOB_SPAWNER)
      {
        e.setExpToDrop(0);
        
        BlockState state = e.getBlock().getState();
        CreatureSpawner spawner = (CreatureSpawner)state;
        EntityType et = spawner.getSpawnedType();
        
        ItemStack IS = new ItemStack(Material.MOB_SPAWNER);
        
        if ((et != null) && (et != EntityType.EXPERIENCE_ORB))
        {
          ItemStack IS2 = new ItemStack(Material.MONSTER_EGG);
          SpawnEggMeta IM = (SpawnEggMeta)IS2.getItemMeta();
          IM.setSpawnedType(et);
          IS2.setItemMeta(IM);
          p.getInventory().addItem(new ItemStack[] { IS2 });
        }
        

        p.getInventory().addItem(new ItemStack[] { IS });
      }
    }
  }
  



  @EventHandler
  public void onPlace(BlockPlaceEvent e)
  {
    if (e.getBlock().getType() == Material.MOB_SPAWNER)
    {
      BlockState state = e.getBlock().getState();
      CreatureSpawner spawner = (CreatureSpawner)state;
      spawner.setSpawnedType(EntityType.EXPERIENCE_ORB);
      spawner.update();
    }
  }
  


  @EventHandler
  public void onInteract(PlayerInteractEvent e)
  {
    Player p = e.getPlayer();
    
    if (GameState.isState(GameState.HASTE))
    {
      if (e.getAction() == null)
      {
        return;
      }
      if (e.getAction() == Action.LEFT_CLICK_BLOCK)
      {
        if ((e.getClickedBlock() == null) || (e.getClickedBlock().getType() == Material.AIR))
        {
          return;
        }
        

        PotionEffect pe = new PotionEffect(PotionEffectType.FAST_DIGGING, 80, 3);
        p.addPotionEffect(pe);
      }
    }
  }
  





  @EventHandler
  public void onDamage(EntityDamageByEntityEvent e)
  {
    if (!GameState.isState(GameState.PVP))
    {
      if (e.getEntity().getType() == EntityType.PLAYER)
      {
        if (e.getCause() == org.bukkit.event.entity.EntityDamageEvent.DamageCause.PROJECTILE)
        {
          Projectile pro = (Projectile)e.getDamager();
          String r = "false";
          
          for (Player pls : Bukkit.getOnlinePlayers())
          {
            if (pro.getShooter() == pls)
            {
              r = "true";
            }
          }
          


          if (r.equalsIgnoreCase("true"))
          {
            e.setCancelled(true);
            e.getEntity().setFireTicks(0);
          }
        }
      }
    }
    




    if (e.getEntity().getLocation().getWorld().getName().equalsIgnoreCase("spawn"))
    {
      e.setCancelled(true);
    }
  }
  


  @EventHandler
  public void onFood(FoodLevelChangeEvent e)
  {
    if (e.getEntity().getLocation().getWorld().getName().equalsIgnoreCase("spawn"))
    {
      e.setCancelled(true);
    }
  }
  


  @EventHandler
  public void onDrop(PlayerDropItemEvent e)
  {
    if (e.getPlayer().getLocation().getWorld().getName().equalsIgnoreCase("spawn"))
    {
      e.setCancelled(true);
    }
  }
  


  @EventHandler
  public void inventoryClick(InventoryClickEvent e)
  {
    if (e.getWhoClicked().getLocation().getWorld().getName().equalsIgnoreCase("spawn"))
    {
      e.setCancelled(true);
    }
  }
  


  @EventHandler
  public void onFire(BlockBurnEvent e)
  {
    e.setCancelled(true);
  }
  

  @EventHandler
  public void onPlaceCancel(BlockPlaceEvent e)
  {
    if (!GameState.isState(GameState.PVP))
    {
      Block b = e.getBlock();
      
      if (b.getType() == Material.FIRE)
      {
        Location l = b.getLocation();
        
        for (Player pls : Bukkit.getOnlinePlayers())
        {
          if (pls != e.getPlayer())
          {
            Location pl = pls.getLocation();
            
            if (pl.distance(l) <= 3.0D)
            {
              e.setCancelled(true);
              e.getPlayer().sendMessage("§cTu ne peux pas placer de feu trop prêt d'un autre joueur, le PvP n'est pas actif !");
              e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_LAVA_POP, 100.0F, 2.0F);
            }
          }
        }
      }
    }
  }
  






  @EventHandler
  public void onInteractCancelF(PlayerInteractEvent e)
  {
    if ((e.getItem() == null) || (e.getAction() == null))
    {
      return;
    }
    if (e.getItem().getType() == Material.LAVA_BUCKET)
    {
      if (e.getAction() == Action.RIGHT_CLICK_BLOCK)
      {
        Location l = e.getPlayer().getTargetBlock(null, 9999).getLocation();
        
        for (Player pls : Bukkit.getOnlinePlayers())
        {
          if (pls != e.getPlayer())
          {
            Location pl = pls.getLocation();
            
            if (pl.distance(l) <= 3.0D)
            {
              e.setCancelled(true);
              e.getPlayer().sendMessage("§cTu ne peux pas placer de lave trop prêt d'un autre joueur, le PvP n'est pas actif !");
              e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_LAVA_POP, 100.0F, 2.0F);
            }
          }
        }
      }
    }
    




    if (GameState.isState(GameState.HASTE))
    {
      if (e.getAction() == null)
      {
        return;
      }
      if (e.getAction() == Action.LEFT_CLICK_BLOCK)
      {
        if ((e.getClickedBlock() == null) || (e.getClickedBlock().getType() == Material.AIR))
        {
          return;
        }
        

        PotionEffect pe = new PotionEffect(PotionEffectType.FAST_DIGGING, 80, 3);
        e.getPlayer().addPotionEffect(pe);
      }
    }
  }
  





  @EventHandler
  public void inventoryDebug(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    
    if (p.getOpenInventory().getBottomInventory().getName().contains("§"))
    {
      e.setCancelled(true);
    }
  }
}
