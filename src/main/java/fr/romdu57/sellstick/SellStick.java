package fr.romdu57.sellstick;

import fr.romdu57.sellstick.commands.sellstick;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    @Override
    public void onEnable(){
        instance = this;
        getServer().getPluginManager().registerEvents(new MyEventStick(), this);
        getCommand("sellstick").setExecutor(new sellstick());
        System.out.println("[sellstick] Plugins ON");
    }

    @Override
    public void onDisable(){
        System.out.println("[sellstick] Plugins OFF");
    }

    public static Main getInstance(){
        return instance;
    }

}
