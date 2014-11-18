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

public class COMMAND_Kit implements CommandExecutor, Listener {
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory kits = Bukkit.createInventory(null, 9, "§6§lKit Auswahl");

	    // Iron
	 	ItemStack iron = new ItemStack(Material.IRON_INGOT);
	 	ItemMeta ironMeta = iron.getItemMeta();
	 	ironMeta.setDisplayName("§fIron Kit");
	 	iron.setItemMeta(ironMeta);
	 	kits.setItem(0, iron);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.GOLD_INGOT);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§6Gold Kit");
	 	gold.setItemMeta(goldMeta);
	 	kits.setItem(2, gold);
	 	// Diamond
	 	ItemStack Diamond = new ItemStack(Material.DIAMOND);
	 	ItemMeta diamondMeta = Diamond.getItemMeta();
	 	diamondMeta.setDisplayName("§bDiamond Kit");
	 	Diamond.setItemMeta(diamondMeta);
	 	kits.setItem(4, Diamond);
	 	// Emerald
	 	ItemStack emerald = new ItemStack(Material.EMERALD);
	 	ItemMeta emeraldMeta = iron.getItemMeta();
	 	emeraldMeta.setDisplayName("§aEmerald Kit");
	 	emerald.setItemMeta(emeraldMeta);
	 	kits.setItem(6, emerald);
	 	// Obisidian
	 	ItemStack ob = new ItemStack(Material.OBSIDIAN);
	 	ItemMeta obmeta = ob.getItemMeta();
	 	obmeta.setDisplayName("§0Obsidian Kit");
	 	ob.setItemMeta(obmeta);
	 	kits.setItem(8, ob);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			p.openInventory(kits);
			
		}else {
			p.openInventory(kits);
			
		}
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§6§lKit Auswahl")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.IRON_INGOT) {
				p.closeInventory();	
				p.performCommand("kits iron");

			}else if(e.getCurrentItem().getType() == Material.GOLD_INGOT)  {
				p.closeInventory();
				p.performCommand("kits gold");
				
				
			}else if(e.getCurrentItem().getType() == Material.DIAMOND)  {
				p.closeInventory();
				p.performCommand("kits diamond");
				
			}else if(e.getCurrentItem().getType() == Material.EMERALD)  {
				p.closeInventory();
				p.performCommand("kits emerald");
				
			} else if(e.getCurrentItem().getType() == Material.OBSIDIAN)  {
				p.closeInventory();
				p.performCommand("kits obsidian");
			
			} 
		}
		
		
	}
}
