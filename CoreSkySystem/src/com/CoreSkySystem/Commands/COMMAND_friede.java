package com.CoreSkySystem.Commands;

import java.io.File;
import java.util.HashMap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Main.Main;

public class COMMAND_friede implements CommandExecutor {
	// Variablen
	public static HashMap<String, String> friede = new HashMap<>();
	private File file = new File("plugins//" + Main.path + "//friede.yml");
	private YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
                 //spieler angebot  Spieler angebot
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {
		

		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			/*if(!player.hasPermission(Permission.friede)) {
				player.sendMessage(Main.name + "§4Keine Permission " + Permission.friede);
				return true;
			}*/
			if(args.length == 1) {
				switch(args[0].toLowerCase()) {
				case "annehmen":
					break;
				case "ablehnen": 
					break;
				case "list": 
				default:
					
				} // tester razorblur
			}
			
		} else {
			sender.sendMessage(Main.name + "§4Du kannst diesen Command nicht verwenden!");
		}
		
		return true;
	}

}
