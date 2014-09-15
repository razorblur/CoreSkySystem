package com.CoreSkySystem.Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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
	        p.sendMessage("§cDu hast bereits abgestimmt!");
	      } else if (umfragestart) {
	        ja += 1;
	        uspieler.add(p.getName());
	        p.sendMessage("§8§l[§6§lCS§8§l] §6Deine Stimme wurde gezählt!");
	        Bukkit.broadcastMessage("§8§l[§6§lCS§8§l] §c" + p.getName() + " §6hat für §aja §6gestimmt!");
	      } else {
	        p.sendMessage("§8§l[§6§lCS§8§l] §cDerzeit läuft keine Umfrage!");
	      }
	      return true;
	    }

	    if (cmd.getName().equalsIgnoreCase("nein")) {
	      if (uspieler.contains(p.getName())) {
	        p.sendMessage("§8§l[§6§lCS§8§l] §cDu hast bereits abgestimmt!");
	      } else if (umfragestart) {
	        nein += 1;
	        uspieler.add(p.getName());
	        p.sendMessage("§8§l[§6§lCS§8§l] §6Deine Stimme wurde gezählt!");
	        Bukkit.broadcastMessage("§8§l[§6§lCS§8§l] §c" + p.getName() + " §6hat für §4nein §6gestimmt!");
	      } else {
	        p.sendMessage("§8§l[§6§lCS§8§l] §cDerzeit läuft keine Umfrage!");
	      }
	      return true;
	    }

	    if (cmd.getName().equalsIgnoreCase("umfrage")) {
	      if (p.hasPermission("coresky.commands.umfrage")) {
	        if (args.length == 0) {
	          p.sendMessage("§cVerwende: /umfrage <frage>");
	          return true;
	        }
	        if (args.length >= 1) {
	          if (args[0].equalsIgnoreCase("stop")) {
	            if (umfragestart) {
	              umfragestart = false;
	              Bukkit.broadcastMessage("§7§l[]-----------------[§6§lCoreSky§7§l]-----------------[]");
	              Bukkit.broadcastMessage("§6Die Umfrage ist zuende!");
	              Bukkit.broadcastMessage("§6Frage: §c§o" + umfrage);
	              Bukkit.broadcastMessage("§7§l[]-----------------[§6§lCoreSky§7§l]-----------------[]");
	              if (ja > nein) {
	                Bukkit.broadcastMessage("§6Gewinner: §a§lJA §6mit §c" + ja + " §6- §c" + nein + " §6Stimmen!");
	              }
	              if (nein > ja) {
	                Bukkit.broadcastMessage("§6Gewinner: §4NEIN §6mit §c" + nein + " §6- §c" + ja + " §6Stimmen!");
	              }
	              if (ja == nein) {
	                Bukkit.broadcastMessage("§6Gewinner: §cUnentschieden §6mit §c" + ja + " §8- §c" + nein + " §6Stimmen!");
	              }
	              return true;
	            }
	            p.sendMessage("§8§l[§6§lCS§8§l] §cDerzeit läuft keine Umfrage!");
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
	          Bukkit.broadcastMessage("§7§l[]-----------------[§6§lCoreSky§7§l]-----------------[]");
	          Bukkit.broadcastMessage("§6Eine Umfrage wurde von §c§o" + p.getName() +  " §6gestartet!");
	          Bukkit.broadcastMessage("§6Frage: §c§o" + umfrage);
	          Bukkit.broadcastMessage("§6Stimme mit §c/ja §6oder §c/nein §6ab.");
	          Bukkit.broadcastMessage("§7§l[]-----------------[§6§lCoreSky§7§l]-----------------[]");
	          return true;
	        }
	      }
	      else {
	        p.sendMessage("§8§l[§6§lCS§8§l] §4Du hast keine Berechtigung für diesen Command!");
	        return true;
	      }
	    }

	    return false;
	  }

}
