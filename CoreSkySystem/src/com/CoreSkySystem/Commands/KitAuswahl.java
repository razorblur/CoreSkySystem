package com.CoreSkySystem.Commands

import com.CoreSkySystem.Functions.Permission;

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

public class KitAuswahl implements CommandExecutor, Listener {

	
	
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
	Inventory kits = Bukkit.createInventory(null, 9, "§cKit Auswahl" );
		// Iron
	 	ItemStack iron = new ItemStack(Material.IRON_INGOT);
	 	ItemMeta ironMeta = iron.getItemMeta();
	 	ironMeta.setDisplayName("§fIron Kit");
	 	iron.setItemMeta(ironMeta);
	 	iron.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	 	kits.setItem(0, iron);
	 	// Gold
	 	ItemStack gold = new ItemStack(Material.GOLD_INGOT);
	 	ItemMeta goldMeta = gold.getItemMeta();
	 	goldMeta.setDisplayName("§6Gold Kit");
	 	gold.setItemMeta(goldMeta);
	 	gold.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	 	kits.setItem(2, gold);
	 	// Diamond
	 	ItemStack Diamond = new ItemStack(Material.DIAMOND);
	 	ItemMeta diamondMeta = Diamond.getItemMeta();
	 	diamondMeta.setDisplayName("§bDiamond Kit");
	 	Diamond.setItemMeta(diamondMeta);
	 	gold.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	 	kits.setItem(5, Diamond);
	 	// Emerald
	 	ItemStack emerald = new ItemStack(Material.EMERALD);
	 	ItemMeta emeraldMeta = iron.getItemMeta();
	 	emeraldMeta.setDisplayName("§aEmerald Kit");
	 	emerald.setItemMeta(ironMeta);
	 	emerald.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	 	kits.setItem(8, emerald);
		
	 	Player p = (Player)cs;
	
		if(args.length == 0) {
			if(p.hasPermission(Permission.NoRangKit)) {
				p.openInventory(kits);
				
			}else {
				p.performCommand("kit sky");
			}
			
			
			
		}else {
			
			
		}
		
		
		
		return true;
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player)e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§cKit Auswahl")) {
			if(e.getCurrentItem().getType() == Material.IRON_INGOT) {
		
				
			
					p.performCommand("kit iron");
			}else if(e.getCurrentItem().getType() == Material.GOLD_INGOT)  {
				p.performCommand("kit gold");
				
				
			}else if(e.getCurrentItem().getType() == Material.DIAMOND)  {
				p.performCommand("kit diamond");
				
				
			}else if(e.getCurrentItem().getType() == Material.EMERALD)  {
				p.performCommand("kit emerald");
				
				
			}
			
			
		}
		
		
	}
}
