package com.CoreSkySystem.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class AnitAnvilBreak implements Listener {
	
	@EventHandler
	public void onBreak(EntityDamageEvent e) {
		if(e.getEntity().equals(Material.ANVIL)) {
			e.setCancelled(true);
		}
		 
	}

}
