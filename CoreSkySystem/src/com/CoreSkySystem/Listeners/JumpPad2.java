package com.CoreSkySystem.Listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import api.ParticleEffect;

public class JumpPad2 implements Listener{
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		
		Player p = e.getPlayer();
		
		if(p.getLocation().getBlock().getType() == Material.STONE_PLATE) {
			
			Vector v = p.getLocation().getDirection().multiply(4.0D).setY(2.0D);
			p.setVelocity(v);
			
			ParticleEffect.PORTAL.display(p.getLocation(), 1, 1, 1, 1, 1, 50);
			ParticleEffect.PORTAL.display(p.getEyeLocation(), 1, 1, 1, 1, 1, 50);
			
			p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1.0F, 1.0F);
		}
	}

}
