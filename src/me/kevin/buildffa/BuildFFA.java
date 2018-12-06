/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.buildffa;

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.api.player.PermissionProvider;
import de.dytanic.cloudnet.bridge.CloudServer;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author haral
 */
public class BuildFFA extends JavaPlugin implements Listener {
    
     public static String prefix = "§6§lBuildFFA §7● ";
     public static CloudAPI cloud;
     public static CloudServer cloudServer;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("RoccetBuildFFA aktiviert");
        cloud = CloudAPI.getInstance();
        cloudServer = CloudServer.getInstance();
        
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("RoccetBuildFFA deaktiviert");
    }
    public void registerCommands() {
        
    }
    public void registerEvents() {
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    
    }

    public static CloudAPI getCloud() {
        return cloud;
    }

    public static CloudServer getCloudServer() {
        return cloudServer;
    }

    public static String getPrefix() {
        return prefix;
    }
    
    
    
}
