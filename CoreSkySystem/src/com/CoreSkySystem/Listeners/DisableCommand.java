package com.CoreSkySystem.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.CoreSkySystem.Main.Main;

public class DisableCommand implements Listener  {
	
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onChat(PlayerCommandPreprocessEvent event)  {
		String msg = event.getMessage();
		Player p = event.getPlayer();
		if(p.hasPermission("*")){
			event.setCancelled(false);
		} else {
			 if(msg.startsWith("/pl"))  {
					event.setCancelled(true);
					p.sendMessage("Plugins (6); §aSkyFightSystem§f, §aWorldEdit§f, §aWorldGuard§f, §aNoCheatPlus§f, §aGroupManager§f, §aMultivers-Core");
					
				}
		}
		if(p.hasPermission("*")){
			event.setCancelled(false);
		} else {
			if(msg.startsWith("/?"))  {
				event.setCancelled(true);
				p.sendMessage("Plugins (6); §aSkyFightSystem§f, §aWorldEdit§f, §aWorldGuard§f, §aNoCheatPlus§f, §aGroupManager§f, §aMultivers-Core");
				p.sendMessage(Main.name + " §cAlle wichtigen Befehle findest du unter §c/Hilfe");
			}
		}
	}

}
