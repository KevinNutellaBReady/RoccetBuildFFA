/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import de.dytanic.cloudnet.lib.server.ServerState;
import me.kevin.buildffa.BuildFFA;

/**
 *
 * @author haral
 */
public class ServerManager {
    public static void ManageServer() {
        BuildFFA.getCloudServer().setServerStateAndUpdate(ServerState.INGAME);
        BuildFFA.getCloudServer().setMaxPlayers(50);
    }
}
