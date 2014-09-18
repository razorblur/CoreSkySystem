package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_hban implements CommandExecutor {
	String msg = "";

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.hban)) {
				player.sendMessage(Main.name + " §4Dir fehlt die Permission.");
				return true;
			}
			
			if(args.length >= 1) {
				for(int i = 1; i < args.length; i++) msg = msg + args[i] + " ";
				try {
					Player target = Bukkit.getPlayer(args[0]);
					target.kickPlayer(Main.name + msg);
					target.setBanned(true);
					player.sendMessage(Main.name + " §7Du hast §c" + target.getName() + " §7gebannt");
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + " §c" +args[0] + " §7ist nicht online");
				}
			} else {
				player.sendMessage(Main.name + " §7/hban (player)");
			}
			
		} else {
			if(args.length >= 1) {
				for(int i = 1; i < args.length; i++) msg = msg + args[i] + " ";
				try {
					Player target = Bukkit.getPlayer(args[0]);
					target.kickPlayer(Main.name + msg);
					sender.sendMessage(Main.name + " §7Du hast §c" + target.getName() + " §7gekickt");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + " §c" +args[0] + " §4ist nicht online");
				}
			} else {
				sender.sendMessage(Main.name + " §7/hban (player)");
			}
		}
		msg = "";
		return true;
	}

}
