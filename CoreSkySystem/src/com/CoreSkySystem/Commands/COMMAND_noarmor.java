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
				sender.sendMessage(Main.name + "§8/noarmor (player)");
			} else {
				try {
					Player target = Bukkit.getServer().getPlayer(args[0]);
					deleteArmor(target);
					sender.sendMessage(Main.name + "§6Du hast die Rüstung von §c" + args[0] + " §6gelöscht");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + "§4Spieler wurde nicht gefunden");
				}
			}
		} else { // Spieler 
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.noarmor)) {
				player.sendMessage(Main.name + "§4Du hast nicht die Permission " + Permission.noarmor);
				return true;
			}
			if(args.length == 0) {
				deleteArmor(player);
			} else if(args.length == 1){
				try {
					Player target = Bukkit.getServer().getPlayer(args[0]);
					deleteArmor(target);
					sender.sendMessage(Main.name + "§6Du hast die Rüstung von §c" + args[0] + " §6gelöscht");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + "§4Spieler wurde nicht gefunden");
				}
			}
		}
		
		return true;
	}

	private void deleteArmor(Player player) {
		player.getInventory().setArmorContents(null);
		player.sendMessage(Main.name + "§6Deine Rüstung wurde von einem Admin entfernt");
	}
	
}
