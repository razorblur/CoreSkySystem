package com.CoreSkySystem.Functions;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

import com.CoreSkySystem.Main.Main;

public class DelayedSchedueler {
	
	private int interval;
	private int id;
	private BukkitScheduler scheduler;
	private Plugin plugin;
	private boolean running;
	
	
	public DelayedSchedueler(int val) {
		interval = val;
		plugin.getServer().getPluginManager().getPlugin("CoreSkySystem"); 

	}
	
	public void setIntveral(int val) {
		interval = val;
	}
	
	public int getInterval() {
		return interval;
	}

	public void start() {
		if(running) {
			System.out.print("Fehler: Timer läuft bereits");
			return;
		} else {
			running = true;
		}
		id = scheduler.scheduleSyncRepeatingTask(plugin, new Runnable() {
			@Override
			public void run() {
				
				Bukkit.broadcastMessage(Main.a +"§6§lSkyFight.ch"+ Main.b);
				Bukkit.broadcastMessage(Main.a +"§6§lSkyFight.ch"+ Main.b);
				
			}
		}, 0, interval*20); // interval * 20 = interval Sekunden in Minecraft, 1 Sekunde = 20 Ticks
	}
	
	public void stop() {
		if(!running) {
			System.out.println("Fehler: Timer läuft nicht");
			return;
		}
		scheduler.cancelTask(id);
	}
}
