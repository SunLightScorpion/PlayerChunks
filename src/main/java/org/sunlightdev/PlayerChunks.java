package org.sunlightdev;

/*

Lukas - 12:26
11.06.2023
https://github.com/NightDev701

© SunLightScorpion 2020 - 2023

*/

import org.bukkit.plugin.java.JavaPlugin;
import org.sunlightdev.command.CommandChunk;
import org.sunlightdev.listener.PlayerChunkListener;

import java.util.Objects;

public class PlayerChunks extends JavaPlugin {

    private static PlayerChunks plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getServer().getPluginManager().registerEvents(new PlayerChunkListener(), this);
        Objects.requireNonNull(getCommand("chunk")).setExecutor(new CommandChunk());
    }

    public static PlayerChunks getPlugin() {
        return plugin;
    }

}
