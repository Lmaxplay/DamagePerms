package lmaxplay.damageperms;

import org.bukkit.plugin.java.JavaPlugin;

public final class Damageperms extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
