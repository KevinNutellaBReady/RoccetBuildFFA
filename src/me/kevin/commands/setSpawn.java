/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.commands;

import me.kevin.buildffa.BuildFFA;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class setSpawn implements CommandExecutor {
    private BuildFFA plugin;

    public setSpawn(BuildFFA plugin) {
        this.plugin = plugin;
    }
    public static double spawn = 0;
    
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("setspawn")) {
            Player p = (Player)cs; 
            if(p.hasPermission("bffa.setspawn")) {
                double y = p.getLocation().getY();
                spawn = y;
                plugin.getConfig().set("spawn", spawn);
                plugin.saveConfig();
                p.sendMessage(BuildFFA.getPrefix() + "§7Die Spawn protection wurde gesetzt");
            }
        }
        return false;
    }
    
    
}
