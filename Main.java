package es.outlook.liluch;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
    public Comandos redc;
    public void onEnabled() {
         this.redc = new Comandos(this);
         getServer().getPluginManager().registerEvents(this, this);
         getCommand("rc").setExecutor(this.redc);
    }
    public void onDisabled(){
    }
}
