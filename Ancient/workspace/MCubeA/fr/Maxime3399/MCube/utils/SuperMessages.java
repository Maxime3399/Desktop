package fr.Maxime3399.MCube.utils;

import net.minecraft.server.v1_12_R1.IChatBaseComponent;
import net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_12_R1.PlayerConnection;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class SuperMessages
{
  public SuperMessages() {}
  
  public static void sendTitle(Player p, String title, String subtitle, int FadeIn, int FadeOut, int stay)
  {
    CraftPlayer craftplayer = (CraftPlayer)p;
    PlayerConnection connection = getHandleplayerConnection;
    IChatBaseComponent titleJSON = IChatBaseComponent.ChatSerializer.a("[{\"text\":\"" + title + "\"}]");
    IChatBaseComponent subtitleJSON = IChatBaseComponent.ChatSerializer.a("[{\"text\":\"" + subtitle + "\"}]");
    PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(net.minecraft.server.v1_12_R1.PacketPlayOutTitle.EnumTitleAction.TITLE, titleJSON, FadeIn, stay, FadeOut);
    PacketPlayOutTitle subtitlePacket = new PacketPlayOutTitle(net.minecraft.server.v1_12_R1.PacketPlayOutTitle.EnumTitleAction.SUBTITLE, subtitleJSON, FadeIn, stay, FadeOut);
    connection.sendPacket(titlePacket);
    connection.sendPacket(subtitlePacket);
  }
}
