/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.commands.setHigh;
import me.kevin.commands.setSpawn;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 *
 * @author haral
 */
public class Highlistener implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        
        double deathhigh = p.getLocation().getY();
        
        if(deathhigh < setHigh.high) {
            p.damage(20);
        }
        
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        Player p = (Player) e.getEntity();
        
        double protection = p.getLocation().getY();
        
        if(protection < setSpawn.spawn) {
            e.setCancelled(false);
        } else if(setSpawn.spawn < protection) {
            e.setCancelled(true);
        }
        
    }
    
}
