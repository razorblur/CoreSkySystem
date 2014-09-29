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

public class KitAuswahl implements CommandExecutor, Listener {

	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory kits = Bukkit.createInventory(null, 9, "§cKit Auswahl" );
	    // Normal
		ItemStack sky = new ItemStack(Material.NETHER_STAR);
	 	ItemMeta skyMeta = sky.getItemMeta();
	 	skyMeta.setDisplayName("§7Standart Kit");
	 	sky.setItemMeta(skyMeta);
	 	kits.setItem(0, sky);
		
		//iron
	 	ItemStack iron = new ItemStack(Material.IRON_INGOT);
	 	ItemMeta ironMeta = iron.getItemMeta();
	 	ironMeta.setDisplayName("§fIron Kit");
	 	iron.setItemMeta(ironMeta);
	 	kits.setItem(2, iron);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.GOLD_INGOT);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§6Gold Kit");
	 	gold.setItemMeta(goldMeta);
	 	kits.setItem(4, gold);
	 	// Diamond
	 	ItemStack Diamond = new ItemStack(Material.DIAMOND);
	 	ItemMeta diamondMeta = Diamond.getItemMeta();
	 	diamondMeta.setDisplayName("§bDiamond Kit");
	 	Diamond.setItemMeta(diamondMeta);
	 	kits.setItem(6, Diamond);
	 	// Emerald
	 	ItemStack emerald = new ItemStack(Material.EMERALD);
	 	ItemMeta emeraldMeta = iron.getItemMeta();
	 	emeraldMeta.setDisplayName("§aEmerald Kit");
	 	emerald.setItemMeta(emeraldMeta);
	 	kits.setItem(8, emerald);
		
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
			if(e.getCurrentItem().getType() == Material.IRON_INGOT) {
		       p.performCommand("kits iron");
		       p.closeInventory();
			}else if(e.getCurrentItem().getType() == Material.GOLD_INGOT)  {
				p.performCommand("kits gold");
				p.closeInventory();
				
				
			}else if(e.getCurrentItem().getType() == Material.DIAMOND)  {
				p.performCommand("kits diamond");
				p.closeInventory();
				
			}else if(e.getCurrentItem().getType() == Material.EMERALD)  {
				p.performCommand("kits emerald");
				p.closeInventory();
				
			}else if(e.getCurrentItem().getType() == Material.NETHER_STAR)  {
				p.performCommand("kits sky");
				p.closeInventory();
			}
			
		}
		
		
	}
}
