package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
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
						switchGameMode(target);
						ccs.sendMessage(Main.name + "§c"+args[0] + "'s §7GameMode ist nun auf §cSurvivial");
					} else if(target.getGameMode() == GameMode.SURVIVAL) {
						switchGameMode(target);
						ccs.sendMessage(Main.name + "§c"+args[0] + "'s §7GameMode ist nun auf §cCreative");
					}
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.normal_name + args[0] + " §7ist nicht online");
				}
			} else {
				ccs.sendMessage(Main.name + " §6/gm (player)");
			}
		} else {
			Player player = (Player) sender;
			if(!player.hasPermission(Permission.gamemode)) {
				player.sendMessage(Main.name + " §4Keine Permission " + Permission.gamemode);
			}
			if(args.length == 0) {
				switchGameMode(player);
			} else if(args.length == 1) {
				// If the player wants to change the gamemode to 0 or to 1
				if(args[0].equals("1")) {
					player.setGameMode(GameMode.CREATIVE);
					player.sendMessage(Main.name + " §7Dein GameMode ist nun auf §cCreative");
					return true;
				} else if(args[0].equals("0")) {
					player.setGameMode(GameMode.SURVIVAL);
					player.sendMessage(Main.name + " §7Dein GameMode ist nun auf §cSurvival");
					return true;
				}
				// Check now if there is a player with the name of args[0]
				try {
					Player target = Bukkit.getPlayer(args[0]);
					if(target.getGameMode() == GameMode.CREATIVE) {
						switchGameMode(target);
						if(!(player.getName() == target.getName()))player.sendMessage(Main.name + "§c"+args[0] + "'s§6 GameMode ist nun auf §cSurvivial");
					} else if(target.getGameMode() == GameMode.SURVIVAL) {
						switchGameMode(target);
						if(!(player.getName() == target.getName())) player.sendMessage(Main.name + "§c"+args[0] + "'s §6GameMode ist nun auf §cCreative");
					}
				} catch (NullPointerException exception) {
					sender.sendMessage(Main.name + "§c" + args[0] + " §7ist nicht online");
				}
			}
		}
		
		return true;
	}
	
	private void switchGameMode(Player player) {
		if(player.getGameMode() == GameMode.CREATIVE) {
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(Main.name + " §7Dein GameMode ist nun auf §cSurvival");
		} else if(player.getGameMode() == GameMode.SURVIVAL) {
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage(Main.name + " §7Dein GameMode ist nun auf §cCreative");
		}
	}
	

}
