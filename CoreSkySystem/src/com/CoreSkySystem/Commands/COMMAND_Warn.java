package com.CoreSkySystem.Commands;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;


public class COMMAND_Warn implements CommandExecutor  {
	
	private static File file = new File("plugins//CoreSkySystem//warns.yml");
	private static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	public static int limit = 3;
	public static String kickMessage = Main.name + " §6Du wurdest gebannt weil du §c" + limit + " §6Verwarnungen erhalten hast.";
	String reason = "";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			try {
				// Ausgewählter Spieler
				Player target = Bukkit.getServer().getPlayer(args[0]);
				// Grund bauen
				reason = "";
				for(int i = 1; i < args.length; i++) {
					reason = reason + args[i] + " ";
				}
				reason = reason.substring(0, reason.length()-1);
				// Spieler verwarnen
				warnPlayer(sender, target, reason);
				Bukkit.broadcastMessage(Main.name + "§e"+target.getName() + " §8wurde verwarnt Grund: §a" + reason);
			} catch(NullPointerException exception) {
				sender.sendMessage(Main.name + ChatColor.DARK_RED + "Dieser Spieler ist nicht Online");
			}
		} else {
			Player player = (Player) sender;
			
			//Permission prüfen
			if(!player.hasPermission(Permission.warn_player)) {
				player.sendMessage(Main.name + "§4Du hast nicht die Permission " + Permission.warn_player);
				return true;
			}
			
			if(args.length > 1) {
				try {
					// Ausgewählter Spieler
					Player target = Bukkit.getServer().getPlayer(args[0]);
					// Grund bauen
					reason = "";
					for(int i = 1; i < args.length; i++) {
						reason = reason + args[i] + " ";
					}
					reason = reason.substring(0, reason.length()-1);
					// Spieler verwarnen
					warnPlayer(player, target, reason);
					Bukkit.broadcastMessage(Main.name + "§e"+target.getName() + " §7wurde verwarnt Grund: §a" + reason);
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + ChatColor.DARK_RED + " Dieser Spieler ist nicht Online");
				}
			} else {
				player.sendMessage(Main.name + " §c/warn (player) (reason)");
			}
		}
		return true;
	}
	
	/* Returns true if the Player was warned sucessful*/
	private boolean warnPlayer(CommandSender sender, Player player, String reason) {
		int warns = getWarnNumber(player);
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss - dd.MM.yyyy");
		cfg.set("warns."+player.getName()+"." + warns +".reason", reason);
		cfg.set("warns."+player.getName()+"." + warns +".executor", sender.getName());
		cfg.set("warns."+player.getName()+"." + warns +".time", format.format(date));
		if(warns+1 >= limit) {
			player.kickPlayer(kickMessage);
		}
		try {
			cfg.save(file);
			return true;
		} catch (IOException e) {
			System.out.println("Die warns.yml existiert nicht");
			return false;
		}
	}
	
	
	public static int getWarnNumber(Player player) {
		int warns = 0;
		while(cfg.getString("warns."+player.getName()+"."+warns) != null) warns++;
		return warns;
	}
	

}