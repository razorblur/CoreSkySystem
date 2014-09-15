package com.CoreSkySystem.Listeners;

import org.bukkit.command.defaults.KickCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.CoreSkySystem.Commands.COMMAND_Warn;

public class JoinQuitListener implements Listener{
	
	/* This class block the join and leave messages.*/
	@EventHandler
	public void onJoin(PlayerJoinEvent evt)  {
		if(COMMAND_Warn.getWarnNumber(evt.getPlayer()) >= COMMAND_Warn.limit) {
			evt.getPlayer().kickPlayer(COMMAND_Warn.kickMessage);
		}
		evt.setJoinMessage("");
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent evt)  {
		evt.setQuitMessage("");
	}

}