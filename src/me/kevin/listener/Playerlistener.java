/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

/**
 *
 * @author haral
 */
public class Playerlistener implements Listener {
    @EventHandler
    public void onFood(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        Player p = (Player) e.getEntity();
      if (e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
      e.setCancelled(true);
    } else {
      e.setCancelled(false);
    }
        
    }
    
}
