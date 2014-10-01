package com.CoreSkySystem.Main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.CoreSkySystem.Commands.COMMAND_Kit;
import com.CoreSkySystem.Commands.COMMAND_Warp;
import com.CoreSkySystem.Commands.COMMAND_armor;
import com.CoreSkySystem.Commands.COMMAND_broadcast;
import com.CoreSkySystem.Commands.COMMAND_broadcast2;
import com.CoreSkySystem.Commands.COMMAND_cenchant;
import com.CoreSkySystem.Commands.COMMAND_chat;
import com.CoreSkySystem.Commands.COMMAND_clearwarn;
import com.CoreSkySystem.Commands.COMMAND_crash;
import com.CoreSkySystem.Commands.COMMAND_cvanish;
import com.CoreSkySystem.Commands.COMMAND_friede;
import com.CoreSkySystem.Commands.COMMAND_giveall;
import com.CoreSkySystem.Commands.COMMAND_globalmute;
import com.CoreSkySystem.Commands.COMMAND_gm;
import com.CoreSkySystem.Commands.COMMAND_hban;
import com.CoreSkySystem.Commands.COMMAND_hkick;
import com.CoreSkySystem.Commands.COMMAND_noarmor;
import com.CoreSkySystem.Commands.COMMAND_random;
import com.CoreSkySystem.Commands.COMMAND_rename;
import com.CoreSkySystem.Commands.COMMAND_skyfight;
import com.CoreSkySystem.Commands.ChatClear;
import com.CoreSkySystem.Commands.COMMAND_Report;
import com.CoreSkySystem.Commands.COMMAND_setmotd;
import com.CoreSkySystem.Commands.COMMAND_Warn;
import com.CoreSkySystem.Commands.Commands;
import com.CoreSkySystem.Commands.Umfrage;
import com.CoreSkySystem.Listeners.DeathDrop;
import com.CoreSkySystem.Listeners.JoinQuitListener;
import com.CoreSkySystem.Listeners.KostenlosSign;
import com.CoreSkySystem.Listeners.MOTDListener;
import com.CoreSkySystem.Listeners.PlayerListeners;
import com.CoreSkySystem.Listeners.UmweltSign;

public class Main extends JavaPlugin {
	
	public static String name = "§6§lSkyFight §8§l|"; //§8§l[§6§lCf§8§l]
	public static String normal_name = "[SkyFight]";
	public static String path;
	

	@Override
	public void onDisable()  {
		info();
	}
	
	
	@Override
	public void onEnable()  {
		path = this.getName();
		PluginManager pm = this.getServer().getPluginManager();
		// Create Files
		loadConfig();
		loadtFiles();
		// Useless Info :D
		info();
		

		this.getCommand("hilfe").setExecutor(new Commands());
		this.getCommand("regeln").setExecutor(new Commands());
		this.getCommand("spenden").setExecutor(new Commands());
		this.getCommand("iron").setExecutor(new Commands());
		this.getCommand("gold").setExecutor(new Commands());
		this.getCommand("skype").setExecutor(new Commands());
		this.getCommand("ts").setExecutor(new Commands());
		this.getCommand("ja").setExecutor(new Umfrage(this));
		this.getCommand("nein").setExecutor(new Umfrage(this));
		this.getCommand("umfrage").setExecutor(new Umfrage(this));
		this.getCommand("copyright").setExecutor(new Commands());
		this.getCommand("diamond").setExecutor(new Commands());
		this.getCommand("setmotd").setExecutor(new COMMAND_setmotd(this));
		this.getCommand("report").setExecutor(new COMMAND_Report());
		this.getCommand("team").setExecutor(new Commands());
		this.getCommand("warn").setExecutor(new COMMAND_Warn());
		this.getCommand("clearwarn").setExecutor(new COMMAND_clearwarn());
		this.getCommand("sfbroadcast").setExecutor(new COMMAND_broadcast());
		this.getCommand("friede").setExecutor(new COMMAND_friede());
		this.getCommand("leer").setExecutor(new COMMAND_broadcast2());
		this.getCommand("crash").setExecutor(new COMMAND_crash());
		this.getCommand("emerald").setExecutor(new Commands());
		this.getCommand("random").setExecutor(new COMMAND_random());
		this.getCommand("kit").setExecutor(new COMMAND_Kit());
		this.getCommand("warp").setExecutor(new COMMAND_Warp());
		this.getCommand("system").setExecutor(new Commands());
		
		// Command skyfight
		this.getCommand("skyfight").setExecutor(new COMMAND_skyfight(this));

		// Command Kit COmmands
		this.getCommand("clearchat").setExecutor(new ChatClear(this));
		this.getCommand("gamemode").setExecutor(new COMMAND_gm());
		this.getCommand("chat").setExecutor(new COMMAND_chat());
		this.getCommand("giveall").setExecutor(new COMMAND_giveall());
		this.getCommand("noarmor").setExecutor(new COMMAND_noarmor());
		this.getCommand("cenchant").setExecutor(new COMMAND_cenchant());
		this.getCommand("globalmute").setExecutor(new COMMAND_globalmute());
		this.getCommand("rename").setExecutor(new COMMAND_rename());
		this.getCommand("hkick").setExecutor(new COMMAND_hkick());
		this.getCommand("hban").setExecutor(new COMMAND_hban());
		this.getCommand("cvanish").setExecutor(new COMMAND_cvanish());
		this.getCommand("armor").setExecutor(new COMMAND_armor());
		
		pm.registerEvents(new KostenlosSign(), this);
		pm.registerEvents(new DeathDrop(), this);
		pm.registerEvents(new MOTDListener(), this);
		pm.registerEvents(new JoinQuitListener(), this);
		pm.registerEvents(new PlayerListeners(), this);
		pm.registerEvents(new UmweltSign(), this);
		pm.registerEvents(new COMMAND_Kit(), this);
		pm.registerEvents(new COMMAND_Warp(), this);
		
        }
        	
        
	
	
	private void info() {
	    System.out.println("<======================================================>");
	    System.out.println("|                                                     |");
	    System.out.println("|SkyFightSystem 2.0 (c)2014 by TGM_Nick and razorblur |");
	    System.out.println("|                                                     |");
	    System.out.println("|        This program is not free software!           |");
	    System.out.println("|    You are not allowed to use, modify or spread     |");
	    System.out.println("|  it without the agreement of the copyright holder.  |");
	    System.out.println("|                                                     |");
	    System.out.println("| Contact: nickdietrich.minecraft@gmail.com           |");
	    System.out.println("| Skype: TGM_Nick / nicolai.helldorff                 |");
	    System.out.println("<======================================================>");
	}
	
	private void loadConfig() {
		FileConfiguration cfg = this.getConfig();
		

		
		cfg.addDefault("server.motd", "§6§lSkyFight §8>> §cEUER SKYPVP SERVER!");
		
		cfg.options().copyDefaults();
	}
	
	private void loadtFiles() {
		// Warn Files
		{ 
			File file = new File("plugins/" + this.getDescription().getName() +"/warns.yml");
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.out.println(normal_name + " Die warns.yml konnte nicht erstellt werden");
				}
			}
		}
		//////////Friede Files////////////
		{
			File file = new File("plugins/" + this.getDescription().getName() + "/friede.yml");
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.out.println(normal_name + " Die friede.yml konnte nicht erstellt werden");
				}
			}
		}
	}

}