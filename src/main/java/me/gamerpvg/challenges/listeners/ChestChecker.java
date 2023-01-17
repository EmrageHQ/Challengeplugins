package me.gamerpvg.challenges.listeners;

import org.bukkit.block.Block;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChestChecker extends JavaPlugin implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block blockUnderPlayer = player.getLocation().subtract(0, 1, 0).getBlock();

        if (blockUnderPlayer.getType() != Material.CHEST) {
            blockUnderPlayer.setType(Material.CAKE);
        }
    }
}