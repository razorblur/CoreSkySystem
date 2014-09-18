package com.CoreSkySystem.Commands;

import java.util.ArrayList;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class COMMAND_skyfight implements CommandExecutor {

	ArrayList<Command> commands = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String arg2, String[] args) {
		
		if(sender instanceof Player) {
			
		}
		
		return true;
	}


}

class Command {
	String command;
	String description;
	public Command(String cmd, String desc) {
		command = cmd;
		description = desc;
	}
	
	
	public static void sort(ArrayList<Command> list) {
		for(int i = 0; i < list.size(); i++) {
			
		}
	}
}