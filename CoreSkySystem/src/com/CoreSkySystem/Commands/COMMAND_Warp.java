package com.CoreSkySystem.Commands;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

@SuppressWarnings("unused")
public class COMMAND_Warp implements CommandExecutor, Listener {
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory warps = Bukkit.createInventory(null, 9, "§cWarps" );
	    
	 	ItemStack skypvp = new ItemStack(Material.DIAMOND_SWORD);
	 	ItemMeta skypvpMeta = skypvp.getItemMeta();
	 	skypvpMeta.setDisplayName("§4SkyPvP");
	 	skypvp.setItemMeta(skypvpMeta);
	 	warps.setItem(0, skypvp);
	    // Iron
	 	ItemStack Shop = new ItemStack(Material.APPLE);
	 	ItemMeta ShopMeta = Shop.getItemMeta();
	 	ShopMeta.setDisplayName("§6Shop");
	 	Shop.setItemMeta(ShopMeta);
	 	warps.setItem(2, Shop);
	 	// Gold
	 	ItemStack fb = new ItemStack(Material.WOOD_SPADE);
	 	ItemMeta fbMeta = fb.getItemMeta();
	 	fbMeta.setDisplayName("§6FreeBuild");
	 	fb.setItemMeta(fbMeta);
	 	warps.setItem(4, fb);
	 	// Diamond
	 	ItemStack pvp = new ItemStack(Material.GOLD_SWORD);
	 	ItemMeta pvpMeta = pvp.getItemMeta();
	 	pvpMeta.setDisplayName("§4PvP");
	 	pvp.setItemMeta(pvpMeta);
	 	warps.setItem(6, pvp);
	 	// Emerald
	 	ItemStack event = new ItemStack(Material.EMERALD_BLOCK);
	 	ItemMeta eventMeta = event.getItemMeta();
	 	eventMeta.setDisplayName("§cEVENT");
	 	event.setItemMeta(eventMeta);
	 	warps.setItem(8, event);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			p.openInventory(warps);
			
		}else {
			p.openInventory(warps);
			
			
		}
		
		
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§cWarps")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
				p.closeInventory();	
				p.performCommand("spawn");

			}else if(e.getCurrentItem().getType() == Material.APPLE)  {
				p.closeInventory();
				p.performCommand("warps shop");
				
				
			}else if(e.getCurrentItem().getType() == Material.WOOD_SPADE)  {
				p.closeInventory();
				p.performCommand("warps FB");
				
			}else if(e.getCurrentItem().getType() == Material.EMERALD_BLOCK)  {
				p.closeInventory();
				p.performCommand("warps event");
				
			} else if(e.getCurrentItem().getType() == Material.GOLD_SWORD)  {
				p.closeInventory();
				p.performCommand("warps pvp");
			
			}
		}
		
		
	}
}
