package com.CoreSkySystem.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import com.CoreSkySystem.Commands.COMMAND_setmotd;

public class MOTDListener implements Listener {
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onPacketSend(ServerListPingEvent event) {
		event.setMotd(COMMAND_setmotd.motd);
	}

}
