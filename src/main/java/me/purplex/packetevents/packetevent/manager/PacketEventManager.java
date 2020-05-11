package me.purplex.packetevents.packetevent.manager;

import me.purplex.packetevents.packetevent.PacketEvent;
import me.purplex.packetevents.packetevent.listener.PacketListener;
import me.purplex.packetevents.packetwrappers.api.WrappedPacket;
import org.bukkit.entity.Player;

import java.util.LinkedList;

public interface PacketEventManager {
    public LinkedList<PacketListener> packetListeners = new LinkedList<>();
    public void callEvent(PacketEvent e);

    public void registerListener(PacketListener e);
    public void unregisterListener(PacketListener e);

    public void unregisterAllListeners(PacketListener e);

    //public void sendPacket(Player player, WrappedPacket packet);

}