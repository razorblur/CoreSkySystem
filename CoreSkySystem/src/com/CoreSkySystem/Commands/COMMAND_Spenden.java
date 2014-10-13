package com.CoreSkySystem.Commands;


import java.util.ArrayList;
import java.util.List;

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

@SuppressWarnings("unused")
public class COMMAND_Spenden implements CommandExecutor, Listener {
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory spenden = Bukkit.createInventory(null, 9, "§4§l§oSpenden-Infos" );
	    
	 	ItemStack paper = new ItemStack(Material.PAPER);
	 	ItemMeta paperMeta = paper.getItemMeta();
	 	paperMeta.setDisplayName("§6§l§oWie Spende ich?");
	 	ArrayList<String> lore1 = new ArrayList<String>();
	 	lore1.add("§8Klick Mich");
	 	paperMeta.setLore(lore1);
	 	paper.setItemMeta(paperMeta);
	 	spenden.setItem(1, paper);
	    // Iron
	 	ItemStack rang = new ItemStack(Material.BEACON);
	 	ItemMeta rangMeta = rang.getItemMeta();
	 	rangMeta.setDisplayName("§4§lServer-Ränge");
	 	ArrayList<String> lore2 = new ArrayList<String>();
	 	lore2.add("§8Klick Mich");
	 	paperMeta.setLore(lore2);
	 	rang.setItemMeta(rangMeta);
	 	spenden.setItem(4, rang);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.SKULL_ITEM);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§9§l§oDie Owner in Skype:");
	 	gold.setItemMeta(goldMeta);
	 	ArrayList<String> lore3 = new ArrayList<String>();
	 	lore3.add("§8Klick Mich");
	 	paperMeta.setLore(lore3);
	 	spenden.setItem(7, gold);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			p.openInventory(spenden);
			
		}else {
			p.openInventory(spenden);
			
		}
		
		
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§4§l§oSpenden-Infos")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.PAPER) {
				p.closeInventory();	
				p.performCommand("qwertzuiopü");

			}else if(e.getCurrentItem().getType() == Material.BEACON)  {
				p.closeInventory();
				p.performCommand("ranglist");
				
				
			}else if(e.getCurrentItem().getType() == Material.SKULL_ITEM)  {
				p.closeInventory();
				p.performCommand("skype");
				
			}
		}
		
		
	}
}
