package com.CoreSkySystem.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
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
	
	//private Main Plugin;
	public JoinQuitListener(Main instance)  {
		
	}
	
	/* This class block the join and leave messages.*/
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent e)  {
		final Player p = e.getPlayer();
		if (p.hasPermission(Permission.team_Join))  {
			e.setJoinMessage(Main.name + " §bDas Team-Mitglied: §3"+ p.getName() + "§b, hat den Server betreten.");
			for(int i = 0; i != 150; i++) {
				p.sendMessage("");
			}
			p.sendMessage(Main.a+ "§6§lＳｋｙＦｉｇｈｔ" + Main.b);
			p.sendMessage("§c»           §7/Vote §8- §cFür bessere Items!");
			p.sendMessage("§c»      §7/spenden §8- §cUm uns zu unterstützen!");
			p.sendMessage("§c»        §7/Regeln §8- §cBeachte die Regeln!");
			p.sendMessage("§c»     §7/team §8- §cSieh dir das Server-Team an!");
			p.sendMessage("§c»    §7/Hilfe §8- §cZeigt dir die wichtigsten Befehle!");
			p.sendMessage(Main.a+ "§6§lＳｋｙＦｉｇｈｔ" + Main.b);
			} else  {  
				e.setJoinMessage("");
			} 
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
			e.setQuitMessage(Main.name + " §cDas Team-Mitglied: §4"+ p.getName() + "§c, hat den Server verlassen.");
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