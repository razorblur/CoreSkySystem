package com.CoreSkySystem.Commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_chat implements CommandExecutor {
	String msg = "";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			
		} else {
			Player p = (Player) sender;
			
			if(!(p.hasPermission(Permission.chat))) {
				p.sendMessage(Main.name +" §cDu darfst das nicht!");
				return true;
			}
			
			if(args.length >= 2) {
				try {
					Player z = this.getPlayerbyName(args[0]);
					for(int i = 1; i < args.length; i++) {
						msg = msg + args[i] + " ";
					}
					z.chat(msg);
				} catch (NullPointerException ex) {
					p.sendMessage(Main.name +" §c"+args[0] + " §6ist nicht online");
				}
			} else {
				p.sendMessage(Main.name +" §c/chat (Spieler) (Message)");
			}
		}
		msg = "";
		return true;
	}
	
	public Player getPlayerbyName(String playername) {
		Player[] players = Bukkit.getOnlinePlayers();
		for(int i = 0; i < players.length; i++) {
			Player z = players[i];
			if(z.getName().equals(playername)) {
				return z;
			}
		}
		return null;
	}

}
