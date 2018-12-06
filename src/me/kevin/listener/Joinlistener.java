/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.managers.ItemManager;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
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
        p.setGameMode(GameMode.SURVIVAL);
        p.setHealth(20);
        p.setMaxHealth(20);
        p.setFoodLevel(7);
        
        p.getInventory().setItem(0, new ItemManager("§bSchwert", Material.GOLD_SWORD, (byte)0, 1, Enchantment.DURABILITY).build());
        p.getInventory().setItem(2, new ItemManager("§bAngel", Material.FISHING_ROD, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§bKnüppel", Material.STICK, (byte)0, 1, Enchantment.ARROW_KNOCKBACK).build());
        p.getInventory().setItem(3, new ItemManager("§bEnderpearl", Material.ENDER_PEARL, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(5, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(6, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(7, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(8, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.chat("/warp spawn");
        p.chat("/warp spawn");
        
        
    }
   
}
