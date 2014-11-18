package com.CoreSkySystem.Commands;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.CoreSkySystem.Main.Main;

public class COMMAND_friede implements CommandExecutor {
	// Variablen
	public static HashMap<String, String> friede = new HashMap<>();
	public static File file = new File("plugins//" + Main.path + "//friede.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
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
					// player2
					if(friede.containsValue(player.getName())) {
						String target = getKey(player.getName());
						ArrayList<String> player_frieden = getFriedenListe(player.getName());
						ArrayList<String> target_frieden = getFriedenListe(target);
						target_frieden.add(player.getName());
						player_frieden.add(target);
						// Set Array
						cfg.set(player.getName(), player_frieden);
						cfg.set(target, target_frieden);
						try {
							cfg.save(file);
						} catch (IOException e) {
							System.out.println("Datei konnte nicht gefunden werden");
						}
						
						player.sendMessage(Main.name + " §7Du hast mit " + target + " frieden geschlossen");
						Bukkit.getPlayer(target).sendMessage(Main.name + "§7Du hast mit " + player.getName() + " frieden geschlossen");
						
						friede.remove(target);
					} else {
						player.sendMessage(Main.name + " §7Keine ausstehenden Friedens Angebote");
					}
					break;
				case "ablehnen":
					if(friede.containsValue(player.getName())) {
						String target = getKey(player.getName());
						
						player.sendMessage(Main.name + " §7Du hast " + target + "'s Friedensangebot abgelehnt");
						Bukkit.getPlayer(target).sendMessage(Main.name + "§c" + player.getName() + " hat dein Friedensangebot abgelehnt");
						
						friede.remove(target);
					} else {
						player.sendMessage(Main.name + "§7Keine ausstehenden Friedens Angebote");
					}
					break;
				case "list": 
					try {
						showList(player, player);
					} catch(NullPointerException exception) {
						player.sendMessage(Main.name + "§4Dieser Spieler ist nicht Online");
					}
					break;
				default:
					try { 
						Player target = Bukkit.getPlayer(args[0]);
						// Prüfen ob die Person mit sich selbst frieden schließen möchte
						if(target.getName().equals(player.getName())) {
							player.sendMessage(Main.name + "§7Du kannst nicht mit dir selbst frieden schliessen");
							return true;
						}
						// Prüfen ob man bereits mit der Person frieden hat
						if(cfg.getList(player.getName()) != null) {
							List<?> list = cfg.getList(player.getName());
							for(int i = 0; i < list.size(); i++) {
								if(list.get(i).equals(target.getName())) {
									player.sendMessage(Main.name + "§7Du hast bereits mit dieser Person frieden");
									return true;
								}
							}
						}
						
						if(!friede.containsKey(player.getName())) {
							friede.put(player.getName(), target.getName());
							// Messages
							player.sendMessage(Main.name + " §7Du hast §c" + target.getName() + " §7 ein Friedens-Angebot gestellt");
							target.sendMessage(Main.name + " §c" + player.getName() + " §7 hat dir Friedens-Angebot gestellt");
						} else {
							player.sendMessage(Main.name + " §7Es gibt noch ein austehendes Friedensangebot von dir");
						}

					} catch (NullPointerException exception) { 
						player.sendMessage(Main.name + " §4Dieser Spieler ist offline");
					}
					
				} // player1 player2
			} else {
				player.sendMessage(Main.name + " §7/friede (player)");
			}
			
		} else {
			sender.sendMessage(Main.name + " §4Du kannst diesen Command nicht verwenden!");
		}
		
		return true;
	}
	 // player1 player2
	private ArrayList<String> getFriedenListe(String player) {
		ArrayList<String> players = new ArrayList<>();
		if(cfg.getList(player) == null) return players;
		List<?> list = (List<?>) cfg.getList(player);
		for(int i = 0; i < list.size(); i++) {
			players.add((String) list.get(i));
		}
		return players;
	}
	
	private String getKey(String value) {
		Iterator<Entry<String, String>> iterator = friede.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, String> str = iterator.next();
			if(str.getValue() == value) return str.getKey();
		}
		return null;
	}
	
	private void showList(Player to, Player from) {
		try {
		List<?> list = cfg.getList(from.getName());
		to.sendMessage(Main.name + "§7Du hast mit folgenden Spielern friede:");
		String str = "";
		for(int i = 0; i < list.size(); i++) {
			str = str + list.get(i) + ", ";
		}
		to.sendMessage("§c"+str);
		} catch (NullPointerException exception) {
			to.sendMessage(Main.name + "§7Du hast mit niemandem frieden");
		}
	}

}
