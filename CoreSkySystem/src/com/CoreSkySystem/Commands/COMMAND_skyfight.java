package com.CoreSkySystem.Commands;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Main.Main;

public class COMMAND_skyfight implements CommandExecutor {

	public static ArrayList<String> commands = new ArrayList<>();
	
	public COMMAND_skyfight(Main plugin) {
		Map<String, Map<String, Object>> conf_cmds = plugin.getDescription().getCommands();
		Set<Entry<String, Map<String,Object>>> s = conf_cmds.entrySet();
		
		Iterator<Entry<String, Map<String, Object>>> iterator = s.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next().getKey();
			commands.add(key);
		}
		Collections.sort(commands);
	}

	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String arg2, String[] args) {
		
		if(sender instanceof Player) {
			
			for(int i = 0; i < commands.size(); i++) {
				String command = commands.get(i);

			}
			
		}
		
		return true;
	}


}
