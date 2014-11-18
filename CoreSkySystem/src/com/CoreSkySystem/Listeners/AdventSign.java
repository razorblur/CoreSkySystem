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

public class AdventSign implements Listener {
	
	@EventHandler
	public void onSignCreate(SignChangeEvent evt)  {
		Player p = evt.getPlayer();
		if(evt.getLine(0).equalsIgnoreCase("[Advent]"))  {
			if(!p.hasPermission(Permission.kostenlos_create))  {
				p.sendMessage(Main.name +" §7Du kannst kein §c[Kostenlos] §7Schild erstellen!");
				evt.getBlock().setType(Material.AIR);
				return;
			}
			if(evt.getLine(1).equals(""))  {
				p.sendMessage(Main.name +" §cUngültiges Schild!");
				evt.getBlock().setType(Material.AIR);
				return;
			}
			evt.setLine(0, "§c§l[Advent]");
			Sign s = (Sign) evt.getBlock().getState();
			s.update(true);
		}
			
	
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInteract(PlayerInteractEvent evt)  {
		if(evt.getAction() == Action.RIGHT_CLICK_BLOCK)  {
			if(evt.getClickedBlock().getState() instanceof Sign)  {
				Sign s = (Sign)  evt.getClickedBlock().getState();
				if(s.getLine(0).equalsIgnoreCase("§c§l[Advent]"))  {
					try {
						String zeile2 = s.getLine(1);
						int itemId = Integer.parseInt(zeile2.split(":")[0]);
						int sho_id = Integer.parseInt(zeile2.split(":")[1]);
						
						int item_count = Integer.parseInt(s.getLine(2));
						
						Inventory inventory = Bukkit.createInventory(null, 9, "§4§lAdvents Item! :3");
						for(int i = 0; i < inventory.getSize(); i++) {
							inventory.setItem(i, new ItemStack(Material.getMaterial(itemId), item_count, (short) sho_id));
						}
						evt.getPlayer().openInventory(inventory);
							
					} catch (NumberFormatException exception) {
						s.setLine(0, "§c§l[FEHLER]");
						evt.getPlayer().sendMessage(Main.name +" §7Ungültiges Schild");
					}
					
					
					
					
				}
			}
		}
	}

}
