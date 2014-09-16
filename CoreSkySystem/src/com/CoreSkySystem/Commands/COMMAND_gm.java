package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Main.Main;

public class COMMAND_gm implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			ConsoleCommandSender ccs = (ConsoleCommandSender) sender;
			if(args.length == 1) {
				Player target = Bukkit.getServer().getPlayer(args[0]);
				try {
					if(target.getGameMode() == GameMode.CREATIVE) {
						target.setGameMode(GameMode.SURVIVAL);
						target.sendMessage(Main.name + "§6Dein GameMode ist nun auf §cSurvival");
						ccs.sendMessage(args[0] + "'s GameMode ist nun auf Survivial");
					} else if(target.getGameMode() == GameMode.SURVIVAL) {
						target.setGameMode(GameMode.CREATIVE);
						target.sendMessage(Main.name + "§6Dein GameMode ist nun auf §cCreative");
					}
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.normal_name + args[0] + " ist nicht online");
				}
			} else {
				ccs.sendMessage(Main.name + "§8/gm (player)");
			}
			// Test
			// Bye
		}
		
		return true;
	}

}
