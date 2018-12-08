/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.buildffa.BuildFFA;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
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
    Player p = e.getPlayer();
    final Block block = e.getBlockPlaced();
    if (block.getType().equals(Material.SANDSTONE)) {
      double Y = p.getLocation().getY();
        Bukkit.getScheduler().scheduleSyncDelayedTask(BuildFFA.getInstance(), new Runnable()
        {
          @Override
          public void run() {
            block.setType(Material.REDSTONE_BLOCK);
            Bukkit.getScheduler().scheduleSyncDelayedTask(BuildFFA.getInstance(), new Runnable()
            {

              @Override
              public void run() { 
                  block.setType(Material.AIR); 
              } 
            }, 60L); 
          } 
        }, 60L);
      
    } else if (p.getGameMode().equals(GameMode.CREATIVE)) {
      e.setCancelled(false);
    } 
  }
    
}
