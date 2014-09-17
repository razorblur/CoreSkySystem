package com.CoreSkySystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_rename implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.rename)) {
				player.sendMessage(Main.name + "§4Dir fehlt die Permission " + Permission.rename);
				return true;
			}
			
			if(args.length == 1) {
				String name = args[0];
				name = name.replaceAll("&", "§");
				ItemStack item = player.getItemInHand();
				ItemMeta meta = item.getItemMeta();
				meta.setDisplayName(name);
				item.setItemMeta(meta);
				player.sendMessage(Main.name + "§6Du hast dein Item erfolgreich umbenannt: " + "§c'" + name + "§c'");
			} else {
				player.sendMessage(Main.name + "§8/rename (name)");
			}
			
		} else {
			System.out.println(Main.name + "§6Du hast kein Inventar wie soll ich das Item umbenennen?");
		}
		return true;
	}

}
