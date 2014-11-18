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

public class COMMAND_Ranglist implements CommandExecutor, Listener {
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory ranglist = Bukkit.createInventory(null, 9, "§cServer-Ränge" );
	    // Iron
	 	ItemStack iron = new ItemStack(Material.IRON_INGOT);
	 	ItemMeta ironMeta = iron.getItemMeta();
	 	ironMeta.setDisplayName("§f§lIron-Rang");
	 	iron.setItemMeta(ironMeta);
	 	ranglist.setItem(0, iron);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.GOLD_INGOT);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§6§lGold-Rang");
	 	gold.setItemMeta(goldMeta);
	 	ranglist.setItem(2, gold);
	 	// Diamond
	 	ItemStack Diamond = new ItemStack(Material.DIAMOND);
	 	ItemMeta diamondMeta = Diamond.getItemMeta();
	 	diamondMeta.setDisplayName("§b§lDiamond-Rang");
	 	Diamond.setItemMeta(diamondMeta);
	 	ranglist.setItem(4, Diamond);
	 	// Emerald
	 	ItemStack emerald = new ItemStack(Material.EMERALD);
	 	ItemMeta emeraldMeta = iron.getItemMeta();
	 	emeraldMeta.setDisplayName("§a§lEmerald-Rang");
	 	emerald.setItemMeta(emeraldMeta);
	 	ranglist.setItem(6, emerald);
	 	// Obsidian
	 	ItemStack ob = new ItemStack(Material.OBSIDIAN);
	 	ItemMeta obmeta = ob.getItemMeta();
	 	obmeta.setDisplayName("§0§lObsidian Kit");
	 	ob.setItemMeta(obmeta);
	 	ranglist.setItem(8, ob);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			p.openInventory(ranglist);
			
		}else {
			p.openInventory(ranglist);
			
		}
		
		
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§cServer-Ränge")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.IRON_INGOT) {
				p.closeInventory();	
				p.performCommand("iron");

			}else if(e.getCurrentItem().getType() == Material.GOLD_INGOT)  {
				p.closeInventory();
				p.performCommand("gold");
				
				
			}else if(e.getCurrentItem().getType() == Material.DIAMOND)  {
				p.closeInventory();
				p.performCommand("diamond");
				
			}else if(e.getCurrentItem().getType() == Material.EMERALD)  {
				p.closeInventory();
				p.performCommand("emerald");
				
			} else if(e.getCurrentItem().getType() == Material.OBSIDIAN)  {
				p.closeInventory();
				p.performCommand("obsidian");
			
			}
		}
		
		
	}
}
