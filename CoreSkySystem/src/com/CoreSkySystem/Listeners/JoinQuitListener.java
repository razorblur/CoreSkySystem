package com.CoreSkySystem.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerQuitEvent;

import com.CoreSkySystem.Commands.COMMAND_Warn;
import com.CoreSkySystem.Commands.COMMAND_cvanish;

public class JoinQuitListener implements Listener{
	
	/* This class block the join and leave messages.*/
	@EventHandler
	public void onJoin(PlayerJoinEvent evt)  {
		evt.setJoinMessage("");
		// Vanish the PLayer
		for(int i = 0; i < COMMAND_cvanish.vanished.size(); i++) {
			Player player = Bukkit.getPlayer(COMMAND_cvanish.vanished.get(i));
			player.hidePlayer(evt.getPlayer());
		}
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent evt)  {
		evt.setQuitMessage("");
	}
	@EventHandler
	public void onLogin(PlayerLoginEvent evt) {
		if(COMMAND_Warn.getWarnNumber(evt.getPlayer()) >= COMMAND_Warn.limit) {
			evt.disallow(Result.KICK_BANNED, COMMAND_Warn.kickMessage);
		}
	}
	
}