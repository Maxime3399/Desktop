package fr.Maxime3399.MCube.homes;

import fr.Maxime3399.MCube.MCubeAPI;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

public class DeleteHomes
{
  public DeleteHomes() {}
  
  public static void del(Player p, String home)
  {
    HashMap<String, Location> hm = new HashMap();
    
    if (MCubeAPI.isHome(p, 1).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 1), MCubeAPI.getHomeLocation(p, 1));
    }
    if (MCubeAPI.isHome(p, 2).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 2), MCubeAPI.getHomeLocation(p, 2));
    }
    if (MCubeAPI.isHome(p, 3).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 3), MCubeAPI.getHomeLocation(p, 3));
    }
    if (MCubeAPI.isHome(p, 4).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 4), MCubeAPI.getHomeLocation(p, 4));
    }
    if (MCubeAPI.isHome(p, 5).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 5), MCubeAPI.getHomeLocation(p, 5));
    }
    if (MCubeAPI.isHome(p, 6).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 6), MCubeAPI.getHomeLocation(p, 6));
    }
    if (MCubeAPI.isHome(p, 7).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 7), MCubeAPI.getHomeLocation(p, 7));
    }
    if (MCubeAPI.isHome(p, 8).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 8), MCubeAPI.getHomeLocation(p, 8));
    }
    if (MCubeAPI.isHome(p, 9).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 9), MCubeAPI.getHomeLocation(p, 9));
    }
    if (MCubeAPI.isHome(p, 10).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 10), MCubeAPI.getHomeLocation(p, 10));
    }
    if (MCubeAPI.isHome(p, 11).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 11), MCubeAPI.getHomeLocation(p, 11));
    }
    if (MCubeAPI.isHome(p, 12).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 12), MCubeAPI.getHomeLocation(p, 12));
    }
    if (MCubeAPI.isHome(p, 13).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 13), MCubeAPI.getHomeLocation(p, 13));
    }
    if (MCubeAPI.isHome(p, 14).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 14), MCubeAPI.getHomeLocation(p, 14));
    }
    if (MCubeAPI.isHome(p, 15).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 15), MCubeAPI.getHomeLocation(p, 15));
    }
    if (MCubeAPI.isHome(p, 16).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 16), MCubeAPI.getHomeLocation(p, 16));
    }
    if (MCubeAPI.isHome(p, 17).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 17), MCubeAPI.getHomeLocation(p, 17));
    }
    if (MCubeAPI.isHome(p, 18).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 18), MCubeAPI.getHomeLocation(p, 18));
    }
    if (MCubeAPI.isHome(p, 19).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 19), MCubeAPI.getHomeLocation(p, 19));
    }
    if (MCubeAPI.isHome(p, 20).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 20), MCubeAPI.getHomeLocation(p, 20));
    }
    if (MCubeAPI.isHome(p, 21).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 21), MCubeAPI.getHomeLocation(p, 21));
    }
    if (MCubeAPI.isHome(p, 22).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 22), MCubeAPI.getHomeLocation(p, 22));
    }
    if (MCubeAPI.isHome(p, 23).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 23), MCubeAPI.getHomeLocation(p, 23));
    }
    if (MCubeAPI.isHome(p, 24).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 24), MCubeAPI.getHomeLocation(p, 24));
    }
    if (MCubeAPI.isHome(p, 25).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 25), MCubeAPI.getHomeLocation(p, 25));
    }
    if (MCubeAPI.isHome(p, 26).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 26), MCubeAPI.getHomeLocation(p, 26));
    }
    if (MCubeAPI.isHome(p, 27).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 27), MCubeAPI.getHomeLocation(p, 27));
    }
    if (MCubeAPI.isHome(p, 28).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 28), MCubeAPI.getHomeLocation(p, 28));
    }
    if (MCubeAPI.isHome(p, 29).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 29), MCubeAPI.getHomeLocation(p, 29));
    }
    if (MCubeAPI.isHome(p, 30).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 30), MCubeAPI.getHomeLocation(p, 30));
    }
    if (MCubeAPI.isHome(p, 31).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 31), MCubeAPI.getHomeLocation(p, 31));
    }
    if (MCubeAPI.isHome(p, 32).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 32), MCubeAPI.getHomeLocation(p, 32));
    }
    if (MCubeAPI.isHome(p, 33).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 33), MCubeAPI.getHomeLocation(p, 33));
    }
    if (MCubeAPI.isHome(p, 34).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 34), MCubeAPI.getHomeLocation(p, 34));
    }
    if (MCubeAPI.isHome(p, 35).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 35), MCubeAPI.getHomeLocation(p, 35));
    }
    if (MCubeAPI.isHome(p, 36).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 36), MCubeAPI.getHomeLocation(p, 36));
    }
    if (MCubeAPI.isHome(p, 37).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 37), MCubeAPI.getHomeLocation(p, 37));
    }
    if (MCubeAPI.isHome(p, 38).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 38), MCubeAPI.getHomeLocation(p, 38));
    }
    if (MCubeAPI.isHome(p, 39).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 39), MCubeAPI.getHomeLocation(p, 39));
    }
    if (MCubeAPI.isHome(p, 40).equalsIgnoreCase("true")) {
      hm.put(MCubeAPI.getHomeName(p, 40), MCubeAPI.getHomeLocation(p, 40));
    }
    
    if (hm.containsKey(home))
    {
      int c = 0;
      
      if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 1))) {
        c = 1;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 2))) {
        c = 2;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 3))) {
        c = 3;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 4))) {
        c = 4;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 5))) {
        c = 5;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 6))) {
        c = 6;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 7))) {
        c = 7;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 8))) {
        c = 8;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 9))) {
        c = 9;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 10))) {
        c = 10;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 11))) {
        c = 11;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 12))) {
        c = 12;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 13))) {
        c = 13;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 14))) {
        c = 14;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 15))) {
        c = 15;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 16))) {
        c = 16;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 17))) {
        c = 17;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 18))) {
        c = 18;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 19))) {
        c = 19;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 20))) {
        c = 20;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 21))) {
        c = 21;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 22))) {
        c = 22;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 23))) {
        c = 23;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 24))) {
        c = 24;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 25))) {
        c = 25;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 26))) {
        c = 26;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 27))) {
        c = 27;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 28))) {
        c = 28;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 29))) {
        c = 29;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 30))) {
        c = 30;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 31))) {
        c = 31;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 32))) {
        c = 32;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 33))) {
        c = 33;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 34))) {
        c = 34;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 35))) {
        c = 35;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 36))) {
        c = 36;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 37))) {
        c = 37;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 38))) {
        c = 38;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 39))) {
        c = 39;
      } else if (((Location)hm.get(home)).equals(MCubeAPI.getHomeLocation(p, 40))) {
        c = 40;
      }
      
      MCubeAPI.deleteHome(p, c);
      p.sendMessage("§eHome supprimé !");
      p.playSound(p.getLocation(), org.bukkit.Sound.BLOCK_CHEST_CLOSE, 100.0F, 2.0F);
      DecalHomes.set(p);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 1L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 2L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 3L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 4L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 5L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 6L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 7L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 8L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 9L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 10L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 11L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 12L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 13L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 14L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 15L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 16L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 17L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 18L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 19L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 20L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 21L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 22L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 23L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 24L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 25L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 26L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 27L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 28L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 29L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 30L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 31L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 32L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 33L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 34L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 35L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 36L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 37L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 38L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 39L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("M-Cube"), new Runnable()
      {
        public void run() {
          DecalHomes.set(DeleteHomes.this);
        }
      }, 40L);
    }
    else
    {
      p.sendMessage("§cCe home n'héxiste pas !");
      p.playSound(p.getLocation(), org.bukkit.Sound.ENTITY_CREEPER_HURT, 100.0F, 2.0F);
    }
  }
}
