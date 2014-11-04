package com.CoreSkySystem.Commands;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Functions.Functions;
import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_Report implements CommandExecutor {
	
	//TODO Command /report ignore command programmieren
	
	private static ArrayList<String> report_player = new ArrayList<>();
	private static ArrayList<String> report_reason = new ArrayList<>();
	private static ArrayList<String> ignore_message = new ArrayList<>();
	private static int id = 0;
	private static HashMap<String, Long> cooldown = new HashMap<>();
	private static int COOLDOWN = 1000 * 60 * 10 ; // = 1000 Für Sekunden * 60 Für Minuten * 15 Für 15 Minuten
	String message = "";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			System.out.println(Main.name + " §7Du kannst keine Spieler reported aber du kannst sie verwarnen mit /warn (player) (reason)");
		} else {
			Player player = (Player) sender;
			if(args.length == 0) {
				if(player.hasPermission(Permission.report_show_list)) {
					player.sendMessage(Main.name + " §c/report list (nr)");
				}
				player.sendMessage(Main.name + " §c/report (player) (reason)");
			} else if(args.length == 2 && args[0].equalsIgnoreCase("list") && player.hasPermission(Permission.report_show_list)) {
				try {
					int page = Integer.parseInt(args[1]);
					int entry = page * 5 + 5;
					
					player.sendMessage("§6§l-----------[§cSeite " + page + "§6§l]-----------");
					for(int i = page *5; i < entry; i++) {
						try {
							String player_name = report_player.get(i);
							String reason = report_reason.get(i);
							/* Send the message*/
							player.sendMessage(Main.name + " §c" + player_name + " §7wurde gemeldet. Grund: §b" + reason);
						} catch(IndexOutOfBoundsException exception) {
							break;
						}
					}
					player.sendMessage("§6§l-------[§cEnde der Seite " + page + "§6§l]-------");

					
				} catch(NumberFormatException exception) {
					player.sendMessage(Main.name + " §6/report list (nr)");
				}
			} else if(args.length > 1){
					/* Prüfen ob der CoolDown des CommandSenders noch aktiv ist*/
				if(cooldown.containsKey(player.getName()) && cooldown.get(player.getName()) + COOLDOWN > System.currentTimeMillis()) {
					DateFormat df = new SimpleDateFormat("mm:ss");
					Date date = new Date(cooldown.get(player.getName()) + COOLDOWN - System.currentTimeMillis());
					String formatted = df.format(date);
					player.sendMessage(Main.name + " §7Du kannst diesen Command erst in §c" + formatted + " §7Minuten verwenden");
					return true;
				}
				try {
					// Spieler vom Server bekommen
					Player target = Bukkit.getPlayer(args[0]);
					/* Message zusammen bauen */
					message = "";
					for(int i = 1; i < args.length; i++) message = message + args[i] + " ";
					/* Report in die Report liste eintragen*/
					report_player.add(id, player.getName());
					report_reason.add(id, message);
					id++;
					/* Cooldown aktivieren*/
					cooldown.put(player.getName(), System.currentTimeMillis());
					/* Messages senden*/
					target.sendMessage(Main.name + " §4Du wurdest von einem Spieler gemeldet");
					player.sendMessage(Main.name + " §7Du hast §c" + target.getName() + "§7 gemeldet");
					Functions.sendMessageAllPlayerWithPermission(Permission.report_admin_alert, Main.name + "§c" + target.getName() + " §6wurde von §c" + player.getName() + " §6gemeldet, Grund: §b" + message);
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + " §c" + args[0] + "§4 ist nicht online");
				}
			} else if(args.length == 1 && args[0].equalsIgnoreCase("ignore") && player.hasPermission(Permission.ignore_report)) {
				if(ignore_message.contains(player.getName())) {
					player.sendMessage(Main.name + " §7Du erhältst nun wieder Meldungen von Spielern");
					ignore_message.remove(player.getName());
				} else {
					player.sendMessage(Main.name + " §7Du erhältst nun keine Meldungen von Spielern mehr");
					ignore_message.add(player.getName());
				}
			} else {
				player.sendMessage(Main.name + " §c/report (player) (reason)");
			}
		}
		
		return true;
	}
	

}
