/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.buildffa;


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.bridge.CloudServer;
import de.dytanic.cloudnet.lib.server.ServerState;
import me.kevin.commands.setHigh;
import me.kevin.listener.Breaklistener;
import me.kevin.listener.DeathListener;
import me.kevin.listener.Joinlistener;
import me.kevin.listener.Placelistener;
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
     public static BuildFFA instance;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("RoccetBuildFFA aktiviert");
        cloud = CloudAPI.getInstance();
        cloudServer = CloudServer.getInstance();  
        getCloudServer().setServerStateAndUpdate(ServerState.LOBBY);
        getCloudServer().setMaxPlayers(50);
       
        instance = this;
        
        getCommand("sethigh").setExecutor(new setHigh(this));
        
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    Bukkit.getPluginManager().registerEvents(new Joinlistener(), this);
    Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
    Bukkit.getPluginManager().registerEvents(new Placelistener(), this);
    Bukkit.getPluginManager().registerEvents(new Breaklistener(), this);
   }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("RoccetBuildFFA deaktiviert");
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

    public static BuildFFA getInstance() {
        return instance;
    }
    public void loadConfig() {
     getConfig().options().copyDefaults(true);
        saveConfig();
     
    }
     
    
    
   }
