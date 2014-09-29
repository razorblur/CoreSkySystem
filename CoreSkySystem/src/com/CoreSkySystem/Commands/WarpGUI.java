package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WarpGUI implements CommandExecutor, Listener {

	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory kits = Bukkit.createInventory(null, 9, "§cServer-Warps" );
	    // Normal
		ItemStack skypvp = new ItemStack(Material.DIAMOND_SWORD);
	 	ItemMeta skypvpMeta = skypvp.getItemMeta();
	 	skypvpMeta.setDisplayName("§4SkyPvP \\ Spawn");
	 	skypvp.setItemMeta(skypvpMeta);
	 	kits.setItem(0, skypvp);
		
		//iron
	 	ItemStack freebuild = new ItemStack(Material.WOOD_SPADE);
	 	ItemMeta freebuildMeta = freebuild.getItemMeta();
	 	freebuildMeta.setDisplayName("§6FreeBuild");
	 	freebuild.setItemMeta(freebuildMeta);
	 	kits.setItem(2, freebuild);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.GOLD_SWORD);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§4PvP");
	 	gold.setItemMeta(goldMeta);
	 	kits.setItem(4, gold);
	 	// Diamond
	 	ItemStack shop = new ItemStack(Material.APPLE);
	 	ItemMeta shopMeta = shop.getItemMeta();
	 	shopMeta.setDisplayName("§bDiamond Kit");
	 	shop.setItemMeta(shopMeta);
	 	kits.setItem(6, shop);
	 	// Emerald
	 	ItemStack event = new ItemStack(Material.DIAMOND);
	 	ItemMeta eventMeta = event.getItemMeta();
	 	eventMeta.setDisplayName("§aEmerald Kit");
	 	event.setItemMeta(eventMeta);
	 	kits.setItem(8, event);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			p.openInventory(kits);
			
			
			
		}else {
			
			
		}
		
		
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§cKit Auswahl")) {
			if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
		       p.performCommand("spawn");
		       p.closeInventory();
			}else if(e.getCurrentItem().getType() == Material.WOOD_SPADE)  {
				p.performCommand("warp freebuild");
				p.closeInventory();
				
				
			}else if(e.getCurrentItem().getType() == Material.GOLD_SWORD)  {
				p.performCommand("warp pvp");
				p.closeInventory();
				
			}else if(e.getCurrentItem().getType() == Material.APPLE)  {
				p.performCommand("warp shop");
				p.closeInventory();
				
			}else if(e.getCurrentItem().getType() == Material.DIAMOND)  {
				p.performCommand("warp event");
				p.closeInventory();
			}
			
		}
		
		
	}
}
