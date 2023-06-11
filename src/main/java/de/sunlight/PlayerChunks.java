package de.sunlight;

/*

Lukas - 12:26
11.06.2023
https://github.com/NightDev701

© SunLightScorpion 2020 - 2023

*/

import org.bukkit.plugin.java.JavaPlugin;

public class PlayerChunks extends JavaPlugin {

    private static PlayerChunks plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    public static PlayerChunks getPlugin() {
        return plugin;
    }

}
