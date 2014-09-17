package com.CoreSkySystem.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.CoreSkySystem.Commands.COMMAND_globalmute;
import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class PlayerListeners implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		if(COMMAND_globalmute.globalmute) {
			if(!event.getPlayer().hasPermission(Permission.globalmute_chat)) {
				event.setCancelled(true);
				event.getPlayer().sendMessage(Main.name + "§6Der GlobalMute ist aktiviert. Du darfst nicht chatten.");
			}
		}
	}

}
