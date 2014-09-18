package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_globalmute implements CommandExecutor {
	
	public static boolean globalmute = false;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			// Check Permission
			if(!player.hasPermission(Permission.globalmute)) {
				player.sendMessage(Main.name + " §4Dir fehlt die Permission.");
				return true;
			}
			
			if(globalmute) {
				ChatClear.ChatClearPlayers(100, "");
				Bukkit.getServer().broadcastMessage(Main.name + " §7GlobalMute wurde §bDeaktiviert");
				globalmute = false;
			} else {
				ChatClear.ChatClearPlayers(100, "");
				Bukkit.getServer().broadcastMessage(Main.name + " §7GlobalMute wurde §bAktiviert");
				globalmute = true;
			}
			
			
			
		}
		
		return true;
	}

}
