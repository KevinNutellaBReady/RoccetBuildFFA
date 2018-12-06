/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import de.dytanic.cloudnet.lib.server.ServerState;
import me.kevin.buildffa.BuildFFA;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class Items {
    
    public static void ingameItems(Player p) {
        p.getInventory().clear();
        if(BuildFFA.getCloudServer().getServerState() == ServerState.INGAME) {
        p.getInventory().setItem(0, new ItemManager("§bSchwert", Material.GOLD_SWORD, (byte)0, 1, Enchantment.DURABILITY).build());
        p.getInventory().setItem(2, new ItemManager("§bAngel", Material.FISHING_ROD, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§bKnüppel", Material.STICK, (byte)0, 1, Enchantment.ARROW_KNOCKBACK).build());
        p.getInventory().setItem(3, new ItemManager("§bEnderpearl", Material.ENDER_PEARL, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(5, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(6, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(7, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(8, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
       } else {
            p.getInventory().setItem(0, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(1, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(2, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(3, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(4, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(5, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(6, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(7, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
            p.getInventory().setItem(8, new ItemManager("§4DAS SPIEL HAT NOCH NICHT GESTARTET", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
        }
    }
    
}
