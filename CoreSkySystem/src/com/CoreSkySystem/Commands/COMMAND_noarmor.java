package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_noarmor implements CommandExecutor {
	
	// TODO Register command and check if everything works

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {

		// Console
		if(sender instanceof ConsoleCommandSender) {
			
			if(args.length != 1) {
				sender.sendMessage(Main.name + " §7/noarmor (player)");
			} else {
				try {
					Player target = Bukkit.getServer().getPlayer(args[0]);
					deleteArmor(target, "der Konsole");
					sender.sendMessage(Main.name + " §7Du hast die Rüstung von §c" + args[0] + " §7gelöscht");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + " §4Spieler wurde nicht gefunden");
				}
			}
		} else { // Spieler 
			Player player = (Player) sender;
			
			if(args.length == 0) {
				if(!player.hasPermission(Permission.noarmor+".self")) {
					player.sendMessage(Main.name + " §4Du hast nicht die Permission.");
					return true;
				}
				deleteArmor(player, "dir");
			} else if(args.length == 1){
				if(!player.hasPermission(Permission.noarmor+".others")) {
					player.sendMessage(Main.name + " §4Du hast nicht die Permission.");
					return true;
				}
				try {
					Player target = Bukkit.getServer().getPlayer(args[0]);
					deleteArmor(target, "einem Admin");
					sender.sendMessage(Main.name + " §7Du hast die Rüstung von §c" + args[0] + " §7gelöscht");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + "§c"+args[0] + " §7wurde nicht gefunden");
				}
			} else {
				player.sendMessage(Main.name + " §7/noarmor (player)");
			}
		}
		
		return true;
	}

	private void deleteArmor(Player player, String name) {
		player.getInventory().setArmorContents(null);
		player.sendMessage(Main.name + " §7Deine Rüstung wurde von §c" + name + " §7entfernt");
	}
	
}
