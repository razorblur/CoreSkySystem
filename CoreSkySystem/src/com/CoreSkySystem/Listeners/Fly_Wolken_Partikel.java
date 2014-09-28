package com.CoreSkySystem.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.CoreSkySystem.Functions.Permission;

import api.ParticleEffect;

public class Fly_Wolken_Partikel implements Listener {
	
	@EventHandler
	public void onFly (PlayerMoveEvent e) {
		Player p = (Player)e.getPlayer();
		
		if(p.isFlying()) {
			
			ParticleEffect.CLOUD.display(p.getLocation(), 1, 1, 1, 1, 10);
			
		}  
		
		if(!p.hasPermission(Permission.Fly_Partikel))  {
			
		}
		
	}
	
}