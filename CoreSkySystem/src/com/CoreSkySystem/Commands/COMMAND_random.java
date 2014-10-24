package com.CoreSkySystem.Commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_random implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Player r = Bukkit.getOnlinePlayers()[new Random().nextInt(Bukkit.getOnlinePlayers().length)];
		if(!p.hasPermission(Permission.random))  {
			p.sendMessage(Main.name +" §cKeine Berechtigungen für diesen Befehl!");
		} else {
			Bukkit.broadcastMessage(Main.name +" §7Der Spieler: §c"+ r.getName() +" §7wurde zufällig ausgewählt!");
		}
		if(p.isOp()) {
			p.performCommand("random");
		}
		
		
		return false;
	}
	

}
