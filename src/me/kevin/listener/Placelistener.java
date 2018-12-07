/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import com.avaje.ebean.enhance.ant.StringReplace;
import me.kevin.buildffa.BuildFFA;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 *
 * @author haral
 */
public class Placelistener implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Block block = e.getBlockPlaced();
        if(block.equals(Material.SANDSTONE)) {
            Bukkit.getScheduler().runTaskLater(BuildFFA.getInstance(), new Runnable() {

                @Override
                public void run() {
                    
                }
            }, 20*5);
        }
    }
    
}
