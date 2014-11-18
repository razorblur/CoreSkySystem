package com.CoreSkySystem.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DeathDrop implements Listener  {
	
	/* Everytime when a player dies this Listener gets
	 * called. Then the player drops a nether star if the
	 * kill was a other player.
	 * */
	
	@EventHandler(priority=EventPriority.NORMAL)
	public void onDeath(PlayerDeathEvent event)  {
		if(event.getEntity().getKiller() instanceof Player)  {
			ItemStack star = new ItemStack(Material.NETHER_STAR, 1);
			event.getDrops().add(star);
			
			
		}
	}
}
