package es.outlook.liluch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandos implements CommandExecutor {
    public Main redc2;
    public Comandos(Main redc2) {
        this.redc2 = redc2;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "No puedes ejecutar el comando desde la consola.");
            return true;
        }
        Player p = (Player)sender;
        if(!(p.hasPermission("redcrafting"))){
            p.sendMessage(ChatColor.RED + "No tienes permiso para hacer esto.");
            return true;
        }
        
        if((args.length == 1) && (args[0].equalsIgnoreCase("on"))){
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage(ChatColor.GREEN + "" + ChatColor.BOLD + p.getName() + ChatColor.RED + "Esta administrando, puedes contactorlo por /helpop.");
            Bukkit.broadcastMessage("");
            return true;
        }
        return false;
    }
    
}
