/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

/**
 *
 * @author haral
 */
import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;





public class StatsManager
{
  public StatsManager() {}
  
  static File file = new File("plugins//BuildFFA//stats.yml");
  static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
  
  public static void addDeath(Player p) {
    int i = cfg.getInt(p.getUniqueId() + ".Deaths");
    int total = i + 1;
    cfg.set(p.getUniqueId() + ".Deaths", Integer.valueOf(total));
    try
    {
      cfg.save(file);
    } catch (IOException localIOException) {}
  }
  
  public static void addKill(Player p) { int i = cfg.getInt(p.getUniqueId() + ".Kills");
    int total = i + 1;
    cfg.set(p.getUniqueId() + ".Kills", Integer.valueOf(total));
    try
    {
      cfg.save(file);
    }
    catch (Exception localException) {}
  }
  
  public static int getKills(Player p) {
    return cfg.getInt(p.getUniqueId() + ".Kills");
  }
  
  public static int getDeaths(Player p) {
    return cfg.getInt(p.getUniqueId() + ".Deaths");
  }
}