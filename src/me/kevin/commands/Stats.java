/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.commands;

import me.BukkitPVP.PointsAPI.PointsAPI;
import me.kevin.buildffa.BuildFFA;
import me.kevin.managers.StatsManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class Stats implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("stats")) {
            Player p = (Player)cs;
            p.sendMessage(BuildFFA.getPrefix() + "§7========== " + BuildFFA.getPrefix() + " §7==========");
            p.sendMessage(BuildFFA.getPrefix() + "§6Kills§7: §b" + StatsManager.getKills(p));
            p.sendMessage(BuildFFA.getPrefix() + "§6Tode§7: §b" + StatsManager.getDeaths(p));
            p.sendMessage(BuildFFA.getPrefix() + "§6Tokens§7: §b" + PointsAPI.getPoints(p));
            p.sendMessage(BuildFFA.getPrefix() + "§7========== " + BuildFFA.getPrefix() + " §7==========");
        }
        
        return false;
    }
    
}
