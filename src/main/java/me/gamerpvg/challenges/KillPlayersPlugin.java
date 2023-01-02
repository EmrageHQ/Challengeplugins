package me.gamerpvg.challenges;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class KillPlayersPlugin implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();

        if (message.equalsIgnoreCase("BastiGHG")) {
            Player[] players = Bukkit.getOnlinePlayers().toArray(new Player[0]);

            for (Player player : players) {
                player.setHealth(0);
            }
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        event.getPlayer().setHealth(event.getPlayer().getHealth() + 2);
        player.sendMessage(ChatColor.GOLD + "Du hast ein Herz gewonnen!");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        event.getPlayer().setHealth(event.getPlayer().getHealth() - 2);
        player.sendMessage(ChatColor.GOLD + "Du hast ein Herz verloren!");
    }
}
