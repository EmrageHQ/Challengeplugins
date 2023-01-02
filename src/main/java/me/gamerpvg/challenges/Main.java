package me.gamerpvg.challenges;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new KillPlayersPlugin(), this);


    }


    @Override
    public void onDisable() {
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Nur ein Spieler kann das auführen");
        } else {
            Player player = (Player) sender;
            World world = player.getWorld();
            swapStructures(world);
            player.sendMessage("Alle Strukturen wurden vertauscht!");
        }
        return true;
    }

    private void swapStructures(World world) {
    }
}
