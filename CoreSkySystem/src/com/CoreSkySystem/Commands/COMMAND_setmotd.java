package com.CoreSkySystem.Commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

import com.CoreSkySystem.Functions.ColorFormatter;
import com.CoreSkySystem.Main.Main;



public class COMMAND_setmotd implements CommandExecutor {
	private File file = new File("plugins//CoreSkySystem//config.yml");
	private YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	public static String motd = "";
	
	
	public COMMAND_setmotd(Main m) {
		motd = m.getConfig().getString("server.motd");
	}
	
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(args.length == 0) {
			sender.sendMessage(Main.name + " §6/setmotd (motd)");
		}
		motd = "";
		for(int i = 0; i < args.length; i++) {
			motd = motd + args[i] + " ";
		}
		motd = ColorFormatter.getColoredString(motd);
		sender.sendMessage(Main.name + " §6Du hast das MOTD zu §c'"+ motd+"§c'§6 geändert.");
		
		cfg.set("server.motd", motd);
		try {
			cfg.save(file);
		} catch (IOException e) {
			sender.sendMessage(Main.name + " §4Das MOTD konnte nicht gespeichert werden!");
		}
		
		return true;
	}
	
	

}
