package com.CoreSkySystem.Listeners;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;

import com.CoreSkySystem.Main.Main;

public class broadcaster {

	
	
	int msgcount = 1;
	Main plugin;

	
	
	public broadcaster(Main m) {
		plugin = m;
				
//		m.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
//			
//			@Override
//			public void run() {
//				String message = loadMsg();
//				plugin.getServer().broadcastMessage(message);
//				
//			}
//		}, 0, 20 * 60 * 2); 
		
		
	}

	
	public String loadMsg() {
		File file = new File("plugins//SkyFightSystem//broadmsg.yml");
		 // Prüfen ob die Datei existiert falls nicht neue erstellen
		if(!file.exists()) {
			try {
			file.createNewFile();
			} catch (IOException e) {
				System.out.println(Main.name +" Die Datei Pfad existiert nicht");
			}
		}
		
		    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
			String msg = cfg.getString(msgcount+".msg");
			
			// Checken ob die Message null ist
			if(msg == null) {
				msgcount = 1;
				msg = cfg.getString(msgcount+".msg");
			}
			
			msgcount++;
			return msg;
		
		

	}
}
