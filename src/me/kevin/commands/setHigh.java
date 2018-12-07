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
public class setHigh implements CommandExecutor {
    private BuildFFA plugin;

    public setHigh(BuildFFA plugin) {
        this.plugin = plugin;
    }
    
    
    
    public static double high = 0;

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("sethigh")) {
            Player p = (Player)cs;
            if(p.hasPermission("bffa.sethigh")) {
                double y = p.getLocation().getY();
                
                high = y;
                
                plugin.getConfig().addDefault("sethigh", y);
                plugin.saveConfig();
                p.sendMessage("Höhe gesetzt");
                
                
            }
        }
        
        return false;
    }
    
}
