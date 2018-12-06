/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.buildffa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.bridge.CloudServer;
import de.dytanic.cloudnet.lib.server.ServerState;
import java.io.FileWriter;
import java.io.IOException;
import me.kevin.listener.DeathListener;
import me.kevin.listener.Joinlistener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
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
        getCloudServer().setServerStateAndUpdate(ServerState.LOBBY);
        getCloudServer().setMaxPlayers(50);
       
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    Bukkit.getPluginManager().registerEvents(new Joinlistener(), this);
    Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
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
     
    
    
   }
