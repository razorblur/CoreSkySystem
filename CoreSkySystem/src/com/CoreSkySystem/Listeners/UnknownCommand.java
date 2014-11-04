package com.CoreSkySystem.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

import com.CoreSkySystem.Main.Main;

public class UnknownCommand implements Listener{
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onUnknown(PlayerCommandPreprocessEvent event){
		if(!(event.isCancelled())) {
			Player p = event.getPlayer();
			String msg = event.getMessage().split(" ")[0];
			HelpTopic tpic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
			
			if(tpic == null)  {
				p.sendMessage(Main.name +" §7Dieser Befehl existiert nicht. §e[" + msg + "§e] §7Tippe: §c/Hilfe");
				event.setCancelled(true);
			}
		}
		
	}

}