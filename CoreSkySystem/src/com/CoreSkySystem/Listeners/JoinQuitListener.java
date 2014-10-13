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
import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class JoinQuitListener implements Listener{
	
	private Main Plugin;
	public JoinQuitListener(Main instance)  {
		
	}
	
	/* This class block the join and leave messages.*/
	@EventHandler
	public void onJoin(final PlayerJoinEvent e)  {
		final Player p = e.getPlayer();
		if (p.hasPermission(Permission.team_Join))  {
			e.setJoinMessage(Main.name + " �3Das Team-Mitglied: �b"+ p.getName() + "�3, hat den Server betreten.");
			} else  {  
			  e.setJoinMessage("");
			}	
		Bukkit.getScheduler().scheduleSyncDelayedTask(this.Plugin, new Runnable() {
				
				@Override
				public void run() {
					
					for(int zeilen = 0; zeilen != 150; zeilen++){
						p.sendMessage("");
					} 
					p.sendMessage("�7�l---------------[�6�lWillkommen!�7�l]---------------");
					p.sendMessage("�a�l   Willkommen auf SkyFight" + e.getPlayer() +" �a�l!");
					p.sendMessage("�a�l            Du willst Vorteile? �c�l/spenden");
					p.sendMessage("�a�l              Unser Server-Team: /team");
					p.sendMessage("�7�l---------------[�6�lViel Spass!�7�l]---------------");
			    }
			}, 1L);
			
		/*	for(int zeilen = 0; zeilen != 150; zeilen++){
				p.sendMessage("");
			}
			p.sendMessage("�7�l---------------[�6�lWillkommen!�7�l]---------------");
			p.sendMessage("�a�l              F�r Hilfe, tippe /Hilfe");
			p.sendMessage("�a�l        oder schreib uns auf Skype an! /skype");
			p.sendMessage("�a�l             Unser Server-Team: /team");
			p.sendMessage("�7�l---------------[�6�lViel Spass!�7�l]---------------");
		} else  {  
			e.setJoinMessage("");
			for(int zeilen = 0; zeilen != 150; zeilen++){
				p.sendMessage("");
			}
			p.sendMessage("�7�l---------------[�6�lWillkommen!�7�l]---------------");
			p.sendMessage("�a�l              F�r Hilfe, tippe /Hilfe");
			p.sendMessage("�a�l        oder schreib uns auf Skype an! /skype");
			p.sendMessage("�a�l             Unser Server-Team: /team");
			p.sendMessage("�7�l---------------[�6�lViel Spass!�7�l]---------------");
		} */
		
		// Vanish the PLayer
		for(int i = 0; i < COMMAND_cvanish.vanished.size(); i++) {
			Player player = Bukkit.getPlayer(COMMAND_cvanish.vanished.get(i));
			player.hidePlayer(e.getPlayer());
		}
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e)  {
		Player p = e.getPlayer();
		if (p.hasPermission(Permission.team_Join))  {
			e.setQuitMessage(Main.name + " �cDas Team-Mitglied: �4"+ p.getName() + "�c, hat den Server verlassen.");
		} else  {  
	        e.setQuitMessage("");
		}
	
	}
	@EventHandler   
	public void onLogin(PlayerLoginEvent evt) {
		if(COMMAND_Warn.getWarnNumber(evt.getPlayer()) >= COMMAND_Warn.limit) {
			evt.disallow(Result.KICK_BANNED, COMMAND_Warn.kickMessage);
		}
	}
	
}