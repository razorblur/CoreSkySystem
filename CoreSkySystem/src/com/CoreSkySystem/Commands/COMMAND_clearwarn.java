package com.CoreSkySystem.Commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_clearwarn implements CommandExecutor {
	
	private File file = new File("plugins//CoreSkySystem//warns.yml");
	private YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			if(args.length == 1) {
				try {
					OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);
					clearWarns(target.getName());
					sender.sendMessage(Main.normal_name + "Du hast alle Warnungen für " + args[0] + " gelöscht");
				} catch(NullPointerException exception) {
					sender.sendMessage(Main.normal_name);
				}
			} else {
				sender.sendMessage(Main.normal_name + "/clearwarn (player)");
			}
		} else {
			Player player = (Player) sender;
			if(!player.hasPermission(Permission.clearwarn)){
				player.sendMessage(Main.name + "§4Du hast keine Permission");
				return true;
			}
			if(args.length == 1) {
				Player target = (Player) Bukkit.getOfflinePlayer(args[0]);
				clearWarns(target.getName());
				sender.sendMessage(Main.name + "Du hast alle Warnungen für " + args[0] + " gelöscht");
			} else {
				sender.sendMessage(Main.name + "/clearwarn (player)");
			}
		}
		
		
		
		return true;
	}
	
	private boolean clearWarns(String player) {
		cfg.set("warns."+player, null);
		try {
			cfg.save(file);
		} catch (IOException e) {
			System.out.println("Die warns.yml existiert nicht");
			return false;
		} finally {
			cfg = YamlConfiguration.loadConfiguration(file);
		}
		return true;
	}

}
