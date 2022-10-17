package me.mitasiek.joinleaveplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }

}
