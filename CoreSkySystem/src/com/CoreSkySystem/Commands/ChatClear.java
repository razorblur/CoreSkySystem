package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class ChatClear implements CommandExecutor {
	
	Main plugin;

	public ChatClear(Main clearchat) {
		plugin = clearchat;
	}


	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if(cs instanceof ConsoleCommandSender){
			ChatClearPlayers(200, "Console");
		}
		
		if(cs instanceof Player) {
			Player p = (Player) cs;
			if(!p.hasPermission(Permission.chat_clear)){
			p.sendMessage("§8§l[§6§lCS§8§l] §4keine Berechtigung!");
			return true;
		}
			ChatClearPlayers(200, p.getName());
	}	
		
		
		return true;
	}
	
	/* Clears i lines of the server. If the "name" equals ""
	 * Then there wont be a clear message*/
	
	public static void ChatClearPlayers(int zeilen, String name)  {
		
		for(int i = 0; i<=zeilen; i++){
			Bukkit.getServer().broadcastMessage("");
			
		}
		if(name == "") return; 
		Bukkit.getServer().broadcastMessage("§7Der Chat wurde von §b"+ name +" §7geelert");
	}

}
