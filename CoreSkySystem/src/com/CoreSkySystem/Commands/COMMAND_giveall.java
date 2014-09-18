package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_giveall implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;

			if(!player.hasPermission(Permission.giveall)) {
				player.sendMessage(Main.name + " §4Dir fehlt die Permission.");
				return true;
			}
			if(args.length == 2) {
				giveAllItems(player, args[0], args[1]);
			} else {
				player.sendMessage(Main.name + " §7/giveall (itemid) (anzahl)");
			}
		} else {
			ConsoleCommandSender ccs = (ConsoleCommandSender) sender;
			
			if(args.length == 2) {
				giveAllItems(ccs, args[0], args[1]);
			} else {
				ccs.sendMessage(Main.name + " §7/giveall (itemid) (anzahl)");
			}
		}
		
		return true;
	}
	
	@SuppressWarnings("deprecation")
	private void giveAllItems(CommandSender executor, String arg0, String arg1) {
		try {
			int itemid = Integer.parseInt(arg0.split(":")[0]);
			int item_sho = 0;
			int anz = Integer.parseInt(arg1);
			if(arg0.contains(":")) item_sho = Integer.parseInt(arg0.split(":")[1]);
			
			Player[] players = Bukkit.getOnlinePlayers();
			for(int i = 0; i < players.length; i++) {
				Player target = players[i];
				target.getInventory().addItem(new ItemStack(itemid, anz, (short) item_sho));
				target.updateInventory();
				target.sendMessage(Main.name + " §7Du hast §c" + anz + " §7Mal das Item §c" + Material.getMaterial(itemid).name() + " §7erhalten");
			}
			if(executor instanceof ConsoleCommandSender) executor.sendMessage(Main.name + "§6Du hast §c" + anz + " §6Mal das Item §c" + Material.getMaterial(itemid).name() + " §6allen Spieler "
					+ "gegeben");
		} catch(NumberFormatException exception) {
			executor.sendMessage(Main.name + " §4Fehler: §cFalsches Format");
		}
	}

}
