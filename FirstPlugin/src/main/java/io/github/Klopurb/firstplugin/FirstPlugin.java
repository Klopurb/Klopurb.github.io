package io.github.Klopurb.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
        getLogger().info(getName());
    }

    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }

}
