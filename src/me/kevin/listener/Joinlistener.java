/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.managers.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author haral
 */
public class Joinlistener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null);
        Player p = e.getPlayer();
        
        Items.ingameItems(p);
        p.chat("/warp spawn");
        
    }
    
}
