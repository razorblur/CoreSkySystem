package com.CoreSkySystem.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class AntiWerbung implements Listener {
	
	 @EventHandler
	  public void onPlayerChat(AsyncPlayerChatEvent e)
	  {
	    String msg = e.getMessage().toLowerCase();
	    Player p = e.getPlayer();
	    if(!p.hasPermission(Permission.allow_werbung))  {
	    	 if ((msg.contains("lag")) || 
	    		      (msg.contains("hurensohn")) ||
	    		      (msg.contains("hure")) ||
	    		      (msg.contains("ficken")) ||
	    		      (msg.contains("sex")) ||
	    		      (msg.contains("fick dich")) ||
	    		      (msg.contains("hure")) ||
	    		      (msg.contains("nutte")) ||
	    		      (msg.contains("arsch")) ||
	    		      (msg.contains("noob")) ||
	    		      (msg.contains("pussy")) ||
	    		      (msg.contains("lagg")) || 
	    		      (msg.contains(".minecraft.to")) || 
	    		      (msg.contains(".minectaft.net")) || 
	    		      (msg.contains("Hax")) || 
	    		      (msg.contains(".de")) || 
	    		      (msg.contains(".eu")) || 
	    		      (msg.contains(".net")) || 
	    		      (msg.contains(".org")) || 
	    		      (msg.contains(".tk")) || 
	    		      (msg.contains("meinpvp")) || 
	    		      (msg.contains(".4minecraft.de")) ||  
	    		      (msg.contains("server.")) || 
	    		      (msg.contains(".de")) || 
	    		      (msg.contains(". ch")) || 
	    		      (msg.contains(".ch")) || 
	    		      (msg.contains(".us")) ||  
	    		      (msg.contains(".me")) || 
	    		      (msg.contains(".nitrado.net")) || 
	    		      (msg.contains("Nitrado")) || 
	    		      (msg.contains("kommt auf")) || 
	    		      (msg.contains("ist besser")) || 
	    		      (msg.toLowerCase().contains("der server ist scheisse")) || 
	    		      (msg.contains("mc.")) || 
	    		      (msg.contains("Joint alle")) || 
	    		      (msg.contains("join alle")) || 
	    		      (msg.contains("SkyPvP.")) || 
	    		      (msg.contains("Free Op")) ||
	    		      (msg.contains("Craft.de")) || 
	    		      (msg.contains(".to")) || 
	    		      (msg.toLowerCase().contains("scheiss server")) || 
	    		      (msg.contains("muxcraft"))) {
	    		 e.setCancelled(true);
			     e.getPlayer().sendMessage(Main.name +" §4Das ist nicht erlaubt!");
	    	 } 
	    	
	    } else {
	    	e.setCancelled(false);
	    }
	    if (e.getPlayer().getName().equalsIgnoreCase(""))
	    {
	      e.setCancelled(true);
	      e.getPlayer().sendMessage(Main.name +"§4Das ist nicht erlaubt!");
	    }
	  }

}
