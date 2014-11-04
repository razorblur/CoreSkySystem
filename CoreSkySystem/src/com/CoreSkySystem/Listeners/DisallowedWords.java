package com.CoreSkySystem.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class DisallowedWords implements Listener {
	
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
	    		      (msg.contains("scheisse")) || 
	    		      (msg.contains("asozial")) ||	
	    		      (msg.contains("schwul")) ||	
	    		      (msg.contains("schwul")) ||	
	    		      (msg.contains("gay")) ||		
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
	    		      (msg.contains("DreaxMC")) || 
	    		      (msg.contains("DreaxMC.de")) || 
	    		      (msg.contains("Dreax MC")) || 
	    		      (msg.toLowerCase().contains("scheiss server")) || 
	    		      (msg.contains("muxcraft"))) {
	    		 e.setCancelled(true);
			     e.getPlayer().sendMessage(Main.name +" §4Das ist nicht erlaubt!");
	    	 } 
	    	
	    } else {
	    	e.setCancelled(false);
	    }
	    if(!p.hasPermission(Permission.allow_hacks))  {
	    	 if ((msg.contains("Hacks")) ||
	    			 (msg.contains("hax")) ||
	    			 (msg.contains("hackt")) ||
	    			 (msg.contains("hacker")) ||
	    			 (msg.contains("hack")) ||
	    			 (msg.contains("Hacks")) ||
	    			 (msg.contains("noknockback")) ||
	    			 (msg.contains("fastbow")) ||
	    			 (msg.contains("fast bow")) ||
	    			 (msg.contains("flyhack")) ||
	    			 (msg.contains("aimbot")) ||
	    			 (msg.contains("kill aura")) ||				 
	    		      (msg.contains("killaura"))) {
	    		 e.setCancelled(true);
			     e.getPlayer().sendMessage(Main.name +" §7Reporte diesen Player doch!");
			     p.performCommand("report");
	    	 } 
	    	
	    } else {
	    	e.setCancelled(false);
	    }
	    if(!p.hasPermission(Permission.allow_name))  {
	    	if ((msg.contains("TGM_Nick")) ||
	    			 (msg.contains("SeroxPlays")) ||	
	    			 (msg.contains("SayZo")) ||		
	    			 (msg.contains("SphexPvP"))) {
		    	e.setCancelled(true);
		    	p.sendMessage(Main.name + " &4Stelle deine Frage direkt!");
		    } 
	    } else {
	    	e.setCancelled(false);
	    }
	  }

}
