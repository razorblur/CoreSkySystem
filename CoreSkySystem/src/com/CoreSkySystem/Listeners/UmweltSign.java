package com.CoreSkySystem.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class UmweltSign implements Listener  {
	
	// [Umwelt]
	//    Nix
	//     1
	
	@EventHandler
	public void onSingCreate(SignChangeEvent event)  {
		Player p = event.getPlayer();
		if(event.getLine(0).equalsIgnoreCase("[Umwelt]"))  {
			if(!p.hasPermission(Permission.umwelt_create))  {
				p.sendMessage(Main.name +" &cdu hast keine Berechtigungen dafür!");
				event.getBlock().setType(Material.AIR);
				return;
			}
			if(event.getLine(1).equals(""))  {
				p.sendMessage(Main.name +" &cdu hast keine Berechtigungen dafür!");
				event.getBlock().setType(Material.AIR);
				return;
			}
			event.setLine(0, "§c[§4Umwelt§c]");
			Sign s = (Sign) event.getBlock().getState();
			s.update(true);
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInteract(PlayerInteractEvent evt)  {
		if(evt.getAction() == Action.RIGHT_CLICK_BLOCK)  {
			if(evt.getClickedBlock().getState() instanceof Sign)  {
				Sign s = (Sign)  evt.getClickedBlock().getState();
				if(s.getLine(0).equalsIgnoreCase("§c[§4Umwelt§c]"))  {
					try {
						String zeile2 = s.getLine(1);
						int itemId = Integer.parseInt(zeile2.split(":")[0]);
						int sho_id = Integer.parseInt(zeile2.split(":")[1]);
						
						int item_count = Integer.parseInt(s.getLine(2));
						
						Inventory inventory = Bukkit.createInventory(null, 36, "&cSchmeiss alles was du nicht brauchst hier rein!");
						for(int i = 0; i < inventory.getSize(); i++) {
							inventory.setItem(i, new ItemStack(Material.getMaterial(itemId), item_count, (short) sho_id));
						}
						evt.getPlayer().openInventory(inventory);
							
					} catch (NumberFormatException exception) {
						s.setLine(0, "§a[§aUmwelt§a]");
						evt.getPlayer().sendMessage(Main.name +" §7Ungültiges Schild");
					}
					
					
					
					
				}
			}
		}
	}

}
