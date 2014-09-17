package com.CoreSkySystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class COMMAND_cenchant implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		// Command for the Player
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(!player.hasPermission(Permission.cenchant)) {
				player.sendMessage(Main.name + "§4Dir fehlt die Permission §c" + Permission.cenchant);
				return true;
			}
			
			if(args.length == 2) {
				try {
					String enchantment_string = args[0].toUpperCase();
					int level = Integer.parseInt(args[1]);
					Enchantment enchantment = getEnchantmentByName(enchantment_string);
					ItemStack item = player.getItemInHand();
					
					// Check if the enchantment is null
					if(enchantment == null) {
						player.sendMessage(Main.name + "§6Enchantment §c" + args[0] + " §6wurde nicht gefunden");
						return true;
					}
					
					// Add the Enchantment
					item.addUnsafeEnchantment(enchantment, level);
					player.sendMessage(Main.name + "§6Du hast das Item mit §c" + enchantment.getName() + " §b" + level + " §6verzaubert");
				}  catch(NumberFormatException exception) {
					player.sendMessage(Main.name + "§4Format Fehler: §8/cenchant (enchantment) (level)");
				}
			} else {
				player.sendMessage(Main.name + "§8/cenchant (enchantment) (level)");
			}
		} else {
			// Console
			System.out.println(Main.name + "§6Du hast kein Inventar!");
		}
		
		return true;
	}
	
	private Enchantment getEnchantmentByName(String name) {
		name = name.toLowerCase();
		switch (name) {
		case "sharpness": return Enchantment.DAMAGE_ALL;
		case "arrowdamage": return Enchantment.ARROW_DAMAGE;
		case "arrowfire": return Enchantment.ARROW_FIRE;
		case "arrowinfinite": return Enchantment.ARROW_INFINITE;
		case "arrowknockback": return Enchantment.ARROW_KNOCKBACK;
		case "damageundead": return Enchantment.DAMAGE_UNDEAD;
		case "digspeed": return Enchantment.DIG_SPEED;
		case "durability": return Enchantment.DURABILITY;
		case "fireaspect": return Enchantment.FIRE_ASPECT;
		case "knockback": return Enchantment.KNOCKBACK;
		case "lootbonusblocks": return Enchantment.LOOT_BONUS_BLOCKS;
		case "lootbonusmobs": return Enchantment.LOOT_BONUS_MOBS;
		case "luck": return Enchantment.LUCK;
		case "lure": return Enchantment.LURE;
		case "oxygen": return Enchantment.OXYGEN;
		case "protection": return Enchantment.PROTECTION_ENVIRONMENTAL;
		case "silktouch": return Enchantment.SILK_TOUCH;
		case "thorns": return Enchantment.THORNS;
		case "waterworker": return Enchantment.WATER_WORKER;
		}
		return null;
	}
	

}
