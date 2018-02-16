package fr.Maxime3399.MCube.events;

import fr.Maxime3399.MCube.MainClass;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class EventsManager
{
  public EventsManager() {}
  
  public static void registerEvents(Plugin p)
  {
    PluginManager pm = org.bukkit.Bukkit.getPluginManager();
    
    pm.registerEvents(new PlayerJoin(), p);
    pm.registerEvents(new PlayerQuit(), p);
    pm.registerEvents(new MainMenuEvents(), p);
    pm.registerEvents(new PlayerMenuEvents(), p);
    pm.registerEvents(new ShopMenuEvents(), p);
    pm.registerEvents(new GRevents(), p);
    pm.registerEvents(new UtilsEvents(), p);
    pm.registerEvents(new XPBank(), p);
    pm.registerEvents(new AntiCreeper(), p);
    pm.registerEvents(new ChestMenuEvents(), p);
    pm.registerEvents(new OtherEvents(), p);
    pm.registerEvents(new TagMenuEvents(), p);
    pm.registerEvents(new CosParticleMenuEvents(), p);
    pm.registerEvents(new SkullEvent(), p);
    pm.registerEvents(new QuestsEvents(), p);
    pm.registerEvents(new QuestsMenuEvents(), p);
    if (MainClass.specialevent.equalsIgnoreCase("pâques")) {
      pm.registerEvents(new PaquesEvents(), p);
    }
    pm.registerEvents(new CosMainMenuEvents(), p);
    pm.registerEvents(new CosDeathMenuEvents(), p);
    pm.registerEvents(new PlayerDeath(), p);
    pm.registerEvents(new SentinelMenuEvents(), p);
    pm.registerEvents(new PlayerKick(), p);
    pm.registerEvents(new CosMorphMenuEvents(), p);
  }
}
