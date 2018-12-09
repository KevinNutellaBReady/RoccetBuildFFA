/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.BukkitPVP.PointsAPI.PointsAPI;
import me.kevin.buildffa.BuildFFA;
import me.kevin.managers.ItemManager;
import me.kevin.managers.StatsManager;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author haral
 */
public class DeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = (Player) e.getEntity();
        if(p.getKiller() == null) {
             e.setDeathMessage(BuildFFA.getPrefix() + "§7Der Spieler §b " + p.getName() + " §7hat sich das leben genommen");
             StatsManager.addDeath(p);
        } else if(p.getKiller() != null) {
             e.setDeathMessage(BuildFFA.getPrefix() + "§7Der Spieler §b " + p.getName() + " §7wurde von §b " + p.getKiller().getName() + " §7getötet");
             PointsAPI.addPoints(p.getKiller(), 2);
             p.getKiller().sendMessage(BuildFFA.getPrefix() + "§7Du hast 2 Coins bekommen");
             StatsManager.addKill(p.getKiller());
             StatsManager.addDeath(p);
        }
        
        p.setHealth(20);
        p.setMaxHealth(20);
        p.setFoodLevel(20);
        p.getInventory().clear();
        p.getInventory().setArmorContents(null);
        p.getInventory().setItem(0, new ItemManager("§bSchwert", Material.GOLD_SWORD, (byte)0, 1, Enchantment.DURABILITY).build());
        p.getInventory().setItem(2, new ItemManager("§bAngel", Material.FISHING_ROD, (byte)0, 1, "").build());
        ItemStack stick = new ItemStack(Material.STICK);
        ItemMeta meta = stick.getItemMeta();
        meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
        meta.setDisplayName("§bKnüppel");
        stick.setItemMeta(meta);
        p.getInventory().setItem(1, stick);
        p.getInventory().setItem(3, new ItemManager("§bEnderpearl", Material.ENDER_PEARL, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(5, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(6, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(7, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(8, new ItemManager("§bBlöcke", Material.SANDSTONE, (byte)0, 64, "").build());
        p.getInventory().setItem(22, new ItemManager("§cZurück", Material.SLIME_BALL, (byte)0, 1, "").build());
        p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
        p.chat("/warp spawn");
    }
    
    
}
