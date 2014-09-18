package com.CoreSkySystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_armor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.armor)) {
				player.sendMessage(Main.name + "§4Dir fehlt die Permission " + Permission.armor);
				return true;
			}
			
			if(args.length == 1) {
				try {
					ItemStack[] armor = getArmorByString(args[0]);
					player.getInventory().setArmorContents(armor);
					player.sendMessage(Main.name + " §7Du hast eine §c" + args[0] + " §7Ruestung erhalten.");
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + " §c" + args[0] + " §4ist nicht online");
				}
			} else if(args.length == 2) {
				try {
					Player target = Bukkit.getPlayer(args[0]);
					ItemStack[] armor = getArmorByString(args[1]);
					target.getInventory().setArmorContents(armor);
					target.sendMessage(Main.name + " §7Du hast eine §c" + args[1] + " §7Ruestung erhalten.");
				} catch(NullPointerException exception) {
					player.sendMessage(Main.name + " §c" + args[0] + " §4ist nicht online");
				}
			}
			
		}
		
		return true;
	}
	
	private ItemStack[] getArmorByString(String item) {
		ItemStack[] armoritems = new ItemStack[4];
		switch (item.toLowerCase()) {
		case "leder": 
			armoritems[3] = new ItemStack(Material.LEATHER_HELMET);
			armoritems[2] = new ItemStack(Material.LEATHER_CHESTPLATE);
			armoritems[1] = new ItemStack(Material.LEATHER_LEGGINGS);
			armoritems[0] = new ItemStack(Material.LEATHER_BOOTS);
			break;
		case "eisen": 
			armoritems[3] = new ItemStack(Material.IRON_HELMET);
			armoritems[2] = new ItemStack(Material.IRON_CHESTPLATE);
			armoritems[1] = new ItemStack(Material.IRON_LEGGINGS);
			armoritems[0] = new ItemStack(Material.IRON_BOOTS);
			break;
		case "gold": 
			armoritems[3] = new ItemStack(Material.GOLD_HELMET);
			armoritems[2] = new ItemStack(Material.GOLD_CHESTPLATE);
			armoritems[1] = new ItemStack(Material.GOLD_LEGGINGS);
			armoritems[0] = new ItemStack(Material.GOLD_BOOTS);
			break;
		case "diamant": 
			armoritems[3] = new ItemStack(Material.DIAMOND_HELMET);
			armoritems[2] = new ItemStack(Material.DIAMOND_CHESTPLATE);
			armoritems[1] = new ItemStack(Material.DIAMOND_LEGGINGS);
			armoritems[0] = new ItemStack(Material.DIAMOND_BOOTS);
			break;

		}
		return armoritems;
	}

}
