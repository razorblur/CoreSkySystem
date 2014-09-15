package com.CoreSkySystem.Functions;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Functions {
	
	public static void sendMessageAllPlayerWithPermission(String permission, String message) {
		Player[] players = Bukkit.getOnlinePlayers();
		for(int i = 0; i < players.length; i++) {
			Player z = players[i];
			if(z.hasPermission(permission)) z.sendMessage(message);
		}
	}

}
