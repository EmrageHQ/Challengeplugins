package me.gamerpvg.challenges;

import me.gamerpvg.challenges.listeners.ChestChecker;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    Player player;


    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§4Welt online");
        getServer().getPluginManager().registerEvents(new KillPlayersPlugin(), this);
        World world = player.getWorld();
        swapStructures(world);


    }


    @Override
    public void onDisable() {
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ChestChecker(), this);
        if (!(sender instanceof Player)) {
            sender.sendMessage("Nur ein Spieler kann das auführen");
        } else {
            Player player = (Player) sender;
            World world = player.getWorld();
            swapStructures(world);
            player.sendMessage("Alle Strukturen wurden vertauscht!");
            Bukkit.getConsoleSender().sendMessage("§8Strukturen vertauscht!");
        }
        return true;
    }

    private void swapStructures(World world) {
        Bukkit.getConsoleSender().sendMessage("$9Alles fertig!");
    }
}
