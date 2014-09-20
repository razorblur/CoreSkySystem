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
		
		if (cmd.getName().equalsIgnoreCase("sk")){
			if(args.length == 0){
				Player p = (Player) sender;
				p.sendMessage(Main.name +" §7/sk <Nachricht>");
				return true;
			}
		Player p = (Player) sender;
		if (!p.hasPermission(Permission.sk_broadcast))  {
			String msg = "";
			for (int i = 0; i < args.length; i++){
				msg = msg + args[i] + " ";
			}
			msg = ColorFormatter.getColoredString(msg);
			Bukkit.broadcastMessage(Main.name + "§a§l " + msg);
		}
	}
		
		return true;
	}
   
}
