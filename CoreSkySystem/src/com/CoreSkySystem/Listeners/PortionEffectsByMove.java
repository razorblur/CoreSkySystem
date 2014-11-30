package com.CoreSkySystem.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.CoreSkySystem.Functions.Permission;

public class PortionEffectsByMove implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		if (p.hasPermission(Permission.SPEED_by_Block)) {
			if(p.getLocation().getBlock().getType() == Material.OBSIDIAN) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,20 * 60 * 2, 1));
			}
		}
	}

}
