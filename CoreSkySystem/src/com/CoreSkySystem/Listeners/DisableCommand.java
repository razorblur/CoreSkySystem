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
		/** 
		 *  geblockte Commands
		 */
		if(p.hasPermission("*")){
			event.setCancelled(false);
		} else {
			 if(msg.startsWith("/pl"))  { 
					event.setCancelled(true);
					p.sendMessage("Plugins (7); �aSkyFightAntiHack-System�f, �aWorldEdit�f, �aWorldGuard�f, �aNoCheatPlus�f, �aGroupManager�f, �aMultivers-Core�f, �aEssentials");
					
				}
		}
		if(p.hasPermission("*")){
			event.setCancelled(false); 
		} else {
			if(msg.startsWith("/?"))  { 
				event.setCancelled(true);
				p.sendMessage(Main.name + " �cAlle wichtigen Befehle findest du unter �c/Hilfe");
			}
		}
		
		if(p.hasPermission("*")){
			event.setCancelled(false); 
		} else {
			if(msg.startsWith("/Bukkit:me"))  { 
				event.setCancelled(true);
				p.sendMessage(Main.name +" �cAha, Ban?");
			}
		}	
	}

}
