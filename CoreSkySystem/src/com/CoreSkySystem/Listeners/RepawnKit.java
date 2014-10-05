package com.CoreSkySystem.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class RepawnKit implements Listener  {
	
	
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player p = (Player) e.getPlayer();
		
		p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
		p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
		
		p.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));          
		p.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
		p.getInventory().addItem(new ItemStack(Material.BOW, 1));  
		
		p.getInventory().setItem(4, new ItemStack(Material.COOKED_BEEF, 5)); 
		p.getInventory().setItem(7, new ItemStack(Material.GOLDEN_APPLE , 1));
		p.getInventory().setItem(8, new ItemStack(Material.ARROW , 16));
	}

}
