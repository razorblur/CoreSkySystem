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
				player.sendMessage(Main.name + "§4Dir fehlt die Permission §c" + Permission.globalmute);
				return true;
			}
			
			if(globalmute) {
				Bukkit.getServer().broadcastMessage(Main.name + "§6GlobalMute wurde §4Deaktiviert");
				globalmute = false;
			} else {
				Bukkit.getServer().broadcastMessage(Main.name + "§6GlobalMute wurde §4Aktiviert");
				globalmute = true;
			}
			
			
			
		}
		
		return true;
	}

}
