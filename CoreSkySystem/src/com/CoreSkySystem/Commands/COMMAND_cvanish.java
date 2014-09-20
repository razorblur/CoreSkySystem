package com.CoreSkySystem.Commands;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_cvanish implements CommandExecutor {
	
	public static ArrayList<String> vanished = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.cvanish)) {
				player.sendMessage(Main.name + " §4Dir fehlt die Permission.");
				return true;
			}
			
			if(args.length == 0) {
				changeVanishStatus(player);
			} else if(args.length == 1) {
				try {
					Player target = Bukkit.getPlayer(args[0]);
					changeVanishStatus(target);
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + " §c"+args[0] + " §7ist nicht online");
				}
			} else {
				player.sendMessage(Main.name + " §7/cvanish");
			}
		} else {
			if(args.length == 1) {
				try {
					Player target = Bukkit.getPlayer(args[0]);
					changeVanishStatus(target);
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.name + " §c"+args[0] + " §7ist nicht online");
				}
			} else {
				sender.sendMessage(Main.name + " §7/cvanish (player)");
			}
		}
		return true;
	}
	
	private void changeVanishStatus(Player player) {
		if(vanished.contains(player.getName())) {
			showPlayerOfServer(player);
			vanished.remove(player.getName());
			player.sendMessage(Main.name + " §7Du bist nun für alle §4Sichtbar");
		} else {
			vanished.add(player.getName());
			hidePlayerOfServer(player);
			player.sendMessage(Main.name + " §7Du bist nun für alle §4Unsichtbar");
		}
	}
	
	private void hidePlayerOfServer(Player player) {
		Player[] players = Bukkit.getOnlinePlayers();
		for(int i = 0; i < players.length; i++) {
			Player z = players[i];
			z.hidePlayer(z);
		}
	}
	
	private void showPlayerOfServer(Player player) {
		Player[] players = Bukkit.getOnlinePlayers();
		for(int i = 0; i < players.length; i++) {
			Player z = players[i];
			z.showPlayer(z);
		}
	}

}
