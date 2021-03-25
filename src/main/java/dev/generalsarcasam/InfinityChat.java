package dev.generalsarcasam;

import dev.generalsarcasam.Listeners.ChatSendListener;
import org.bukkit.plugin.java.JavaPlugin;

public class InfinityChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatSendListener(), this);
    }

}
