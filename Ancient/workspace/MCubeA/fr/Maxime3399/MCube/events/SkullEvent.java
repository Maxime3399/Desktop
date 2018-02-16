package fr.Maxime3399.MCube.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.SkullMeta;

public class SkullEvent implements org.bukkit.event.Listener
{
  public SkullEvent() {}
  
  @org.bukkit.event.EventHandler
  public void entityDeath(EntityDeathEvent e)
  {
    if (e.getEntity().getKiller() == null)
    {
      return;
    }
    if (e.getEntity().getKiller().getType() == EntityType.PLAYER)
    {
      Player p = e.getEntity().getKiller();
      
      java.util.Random r = new java.util.Random();
      int ri = r.nextInt(1001);
      
      if (ri == 0)
      {
        if (e.getEntity().getType() == EntityType.MUSHROOM_COW)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_MushroomCow");
          SM.setDisplayName("§3§lTête de Vache Champignon");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.BAT)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Bat");
          SM.setDisplayName("§3§lTête de Chauve Sourie");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.PIG)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Pig");
          SM.setDisplayName("§3§lTête de Cochon");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.RABBIT)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Bunny");
          SM.setDisplayName("§3§lTête de Lapin");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SHEEP)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Sheep");
          SM.setDisplayName("§3§lTête de Mouton");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SQUID)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Squid");
          SM.setDisplayName("§3§lTête de Poulpe");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.CHICKEN)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Chicken");
          SM.setDisplayName("§3§lTête de Poulet");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.COW)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Cow");
          SM.setDisplayName("§3§lTête de Vache");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.VILLAGER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Villager");
          SM.setDisplayName("§3§lTête de Villageois");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SPIDER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Spider");
          SM.setDisplayName("§3§lTête d'Araignée");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.CAVE_SPIDER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_CaveSpider");
          SM.setDisplayName("§3§lTête d'Araignée bleue");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.PIG_ZOMBIE)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_PigZombie");
          SM.setDisplayName("§3§lTête de Cochon zombie");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.ENDERMAN)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Enderman");
          SM.setDisplayName("§3§lTête d'Enderman");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.POLAR_BEAR)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("PolarBears");
          SM.setDisplayName("§3§lTête d'Ours polaire");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.ELDER_GUARDIAN)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_EGuardian");
          SM.setDisplayName("§3§lTête de Boss guardien");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.BLAZE)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Blaze");
          SM.setDisplayName("§3§lTête de Blaze");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.CREEPER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Creeper");
          SM.setDisplayName("§3§lTête de Creeper");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.MAGMA_CUBE)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_LavaSlime");
          SM.setDisplayName("§3§lTête de Cube de magma");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.ENDERMITE)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Endermite");
          SM.setDisplayName("§3§lTête d'Endermite");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.GUARDIAN)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Guardian");
          SM.setDisplayName("§3§lTête de Guardien");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.GHAST)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Ghast");
          SM.setDisplayName("§3§lTête de Ghast");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SILVERFISH)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Silverfish");
          SM.setDisplayName("§3§lTête de Poisson d'argent");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SHULKER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Shulker");
          SM.setDisplayName("§3§lTête de Shulker");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.SLIME)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Slime");
          SM.setDisplayName("§3§lTête de Slime");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.WITCH)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Witch");
          SM.setDisplayName("§3§lTête de Sorcière");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.ZOMBIE)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Zombie");
          SM.setDisplayName("§3§lTête de Zombie");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.ZOMBIE_VILLAGER)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("VillagerZombie");
          SM.setDisplayName("§3§lTête de Zombie villageois");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.WOLF)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Wolf");
          SM.setDisplayName("§3§lTête de Loup");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.OCELOT)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Ocelot");
          SM.setDisplayName("§3§lTête d'Ocelot");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.IRON_GOLEM)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Golem");
          SM.setDisplayName("§3§lTête de Golem de fer");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
        else if (e.getEntity().getType() == EntityType.IRON_GOLEM)
        {
          ItemStack IS = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
          SkullMeta SM = (SkullMeta)IS.getItemMeta();
          SM.setOwner("MHF_Golem");
          SM.setDisplayName("§3§lTête de Golem de fer");
          IS.setItemMeta(SM);
          p.getInventory().addItem(new ItemStack[] { IS });
          p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100.0F, 2.0F);
        }
      }
    }
  }
}
