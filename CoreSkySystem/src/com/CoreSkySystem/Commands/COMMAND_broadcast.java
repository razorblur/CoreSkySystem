package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.ColorFormatter;
import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_broadcast implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(!player.hasPermission(Permission.sk_broadcast)) {
				player.sendMessage(Main.name + "§4Keine Permission: " + Permission.sk_broadcast);
				return true;
			}
		}
		
		
		if(args.length == 0){
			sender.sendMessage(Main.name +" §7/sfb <Nachricht>");
			return true;
		}
		String msg = "";
		for (int i = 0; i < args.length; i++){
			msg = msg + args[i] + " ";
		}
		msg = ColorFormatter.getColoredString(msg);
		Bukkit.broadcastMessage(Main.name + "§a§l " + msg);
		
		return true;
	}
   
}
