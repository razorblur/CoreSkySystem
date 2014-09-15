package com.CoreSkySystem.Main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.CoreSkySystem.Commands.COMMAND_clearwarn;
import com.CoreSkySystem.Commands.ChatClear;
import com.CoreSkySystem.Commands.COMMAND_Report;
import com.CoreSkySystem.Commands.COMMAND_setmotd;
import com.CoreSkySystem.Commands.COMMAND_Warn;
import com.CoreSkySystem.Commands.Commands;
import com.CoreSkySystem.Commands.Umfrage;
import com.CoreSkySystem.Listeners.CoreSkySign;
import com.CoreSkySystem.Listeners.DeathDrop;
import com.CoreSkySystem.Listeners.JoinQuitListener;
import com.CoreSkySystem.Listeners.KostenlosSign;
import com.CoreSkySystem.Listeners.MOTDListener;

public class Main extends JavaPlugin {
	
	public static String name = "�8�l[�6�lCS�8�l]"; //�8�l[�6�lCS�8�l]
	public static String normal_name = "[CoreSky]";
	

	@Override
	public void onDisable()  {
		info();
	}
	
	
	@Override
	public void onEnable()  {
		PluginManager pm = this.getServer().getPluginManager();
		// Create Files
		loadConfig();
		loadReportFile();
		// Useless Info :D
		info();

		this.getCommand("hilfe").setExecutor(new Commands());
		this.getCommand("regeln").setExecutor(new Commands());
		this.getCommand("spenden").setExecutor(new Commands());
		this.getCommand("premium").setExecutor(new Commands());
		this.getCommand("epic").setExecutor(new Commands());
		this.getCommand("skype").setExecutor(new Commands());
		this.getCommand("ts").setExecutor(new Commands());
		this.getCommand("ja").setExecutor(new Umfrage(this));
		this.getCommand("nein").setExecutor(new Umfrage(this));
		this.getCommand("umfrage").setExecutor(new Umfrage(this));
		this.getCommand("copyright").setExecutor(new Commands());
		this.getCommand("ultimate").setExecutor(new Commands());
		this.getCommand("setmotd").setExecutor(new COMMAND_setmotd(this));
		this.getCommand("report").setExecutor(new COMMAND_Report());
		this.getCommand("team").setExecutor(new Commands());
		this.getCommand("warn").setExecutor(new COMMAND_Warn());
		this.getCommand("clearwarn").setExecutor(new COMMAND_clearwarn());
		this.getCommand("cc").setExecutor(new ChatClear(this));
		
		
		pm.registerEvents(new KostenlosSign(), this);
		pm.registerEvents(new DeathDrop(), this);
		pm.registerEvents(new MOTDListener(), this);
		pm.registerEvents(new JoinQuitListener(), this);
		pm.registerEvents(new CoreSkySign(), this);
		
	}
	
	private void info() {
	    System.out.println("<======================================================>");
	    System.out.println("|                                                     |");
	    System.out.println("| CoreSkySystem 1.1 (c)2014 by TGM_Nick and razorblur |");
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
		
		cfg.addDefault("server.motd", "�6Setzt das MOTD mit: �c/setmotd (motd)");
		
		cfg.options().copyDefaults();
	}
	
	private void loadReportFile() {
		File file = new File("plugins//CoreSkySystem//warns.yml");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(normal_name + "Die warns.yml konnte nicht erstellt werden");
			}
		}
	}

}