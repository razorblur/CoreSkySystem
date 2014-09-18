package com.CoreSkySystem.Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class Umfrage implements CommandExecutor {
	
	public static int ja;
	  public static int nein;
	  public static String umfrage;
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public static ArrayList<String> uspieler = new ArrayList();
	  public static boolean umfragestart = false;
	@SuppressWarnings("unused")
	private Main plugin;

	  public Umfrage(Main plugin) {
		  this.plugin = plugin;
	  }
		
		
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args)
	  {
	    if (cmd.getName().equalsIgnoreCase("ja")) {
	      if (uspieler.contains(p.getName())) {
	        p.sendMessage(Main.name +" §cDu hast bereits abgestimmt!");
	      } else if (umfragestart) {
	        ja += 1;
	        uspieler.add(p.getName());
	        p.sendMessage(Main.name +" §7Deine Stimme wurde gezählt!");
	        Bukkit.broadcastMessage(Main.name +" §c" + p.getName() + " §7hat für §aja §7gestimmt!");
	      } else {
	        p.sendMessage(Main.name +" §cDerzeit läuft keine Umfrage!");
	      }
	      return true;
	    }

	    if (cmd.getName().equalsIgnoreCase("nein")) {
	      if (uspieler.contains(p.getName())) {
	        p.sendMessage(Main.name +" §cDu hast bereits abgestimmt!");
	      } else if (umfragestart) {
	        nein += 1;
	        uspieler.add(p.getName());
	        p.sendMessage(Main.name +" §7Deine Stimme wurde gezählt!");
	        Bukkit.broadcastMessage(Main.name +" §c" + p.getName() + " §7hat für §4nein §6gestimmt!");
	      } else {
	        p.sendMessage(Main.name +" §cDerzeit läuft keine Umfrage!");
	      }
	      return true;
	    }

	    if (cmd.getName().equalsIgnoreCase("umfrage")) {
	      if (p.hasPermission(Permission.start_umfrage)) {
	        if (args.length == 0) {
	          p.sendMessage("§cVerwende: /umfrage <frage>");
	          return true;
	        }
	        if (args.length >= 1) {
	          if (args[0].equalsIgnoreCase("stop")) {
	            if (umfragestart) {
	              umfragestart = false;
	              Bukkit.broadcastMessage("§7§l[]-----------------[§6§lSkyFight§7§l]-----------------[]");
	              Bukkit.broadcastMessage("§7Die Umfrage ist zuende!");
	              Bukkit.broadcastMessage("§7Frage: §c§o" + umfrage);
	              Bukkit.broadcastMessage("§7§l[]-----------------[§6§lSkyFight§7§l]-----------------[]");
	              if (ja > nein) {
	                Bukkit.broadcastMessage("§7Gewinner: §a§lJA §7mit §c" + ja + " §7- §c" + nein + " §7Stimmen!");
	              }
	              if (nein > ja) {
	                Bukkit.broadcastMessage("§7Gewinner: §4NEIN §7mit §c" + nein + " §7- §c" + ja + " §7Stimmen!");
	              }
	              if (ja == nein) {
	                Bukkit.broadcastMessage("§7Gewinner: §cUnentschieden §7mit §c" + ja + " §7- §c" + nein + " §7Stimmen!");
	              }
	              return true;
	            }
	            p.sendMessage(Main.name +" §cDerzeit läuft keine Umfrage!");
	            return true;
	          }

	          umfrage = "";
	          for (int i = 0; i < args.length; i++) {
	            umfrage = umfrage + args[i] + " ";
	          }
	          umfragestart = true;
	          nein = 0;
	          ja = 0;
	          uspieler.clear();
	          Bukkit.broadcastMessage("§7§l[]-----------------[§6§lSkyFight§7§l]-----------------[]");
	          Bukkit.broadcastMessage("§7Eine Umfrage wurde von §c§o" + p.getName() +  " §7gestartet!");
	          Bukkit.broadcastMessage("§7Frage: §c§o" + umfrage);
	          Bukkit.broadcastMessage("§7Stimme mit §c/ja §6oder §c/nein §6ab.");
	          Bukkit.broadcastMessage("§7§l[]-----------------[§6§lSkyFight§7§l]-----------------[]");
	          return true;
	        }
	      }
	      else {
	        p.sendMessage(Main.name +" §4Du hast keine Berechtigung für diesen Command!");
	        return true;
	      }
	    }

	    return false;
	  }

}
