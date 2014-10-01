package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_crash implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			if(args.length == 1) {
				try {
					Player target = Bukkit.getPlayer(args[0]);
					crashMinecraft(target);
				} catch (NullPointerException exception) {
					sender.sendMessage(Main.name + " §4Dieser Spieler ist nicht Online");
				}
			} else sender.sendMessage(Main.name + "§ 8/crash (player)");
		} else {
			Player player = (Player) sender;
			if(!player.hasPermission(Permission.crash)) {
				player.sendMessage(Main.name + " §4Keine Permission " + Permission.crash);
				return true;
			}
			if(args.length == 1) {
				try {
					Player target = Bukkit.getPlayer(args[0]);
					crashMinecraft(target);
				} catch (NullPointerException exception) {
					sender.sendMessage(Main.name + " §4Dieser Spieler ist nicht Online");
				}
			} else sender.sendMessage(Main.name + " §8/crash (player)");
		}
		
		return true;
	}
	
	private void crashMinecraft(Player player) { 
		Inventory inv = Bukkit.createInventory(null, 9*100);
		player.openInventory(inv);
	}

	
}
