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

public class KostenlosSign implements Listener  {
	
	// [Kostenlos]  
	//    	37:3
	//       1
	@EventHandler
	public void onSignCreate(SignChangeEvent evt)  {
		Player p = evt.getPlayer();
		if(evt.getLine(0).equalsIgnoreCase("[Kostenlos]"))  {
			if(!p.hasPermission(Permission.kostenlos_create))  {
				p.sendMessage(Main.name +" §6Du kannst kein §2[Kostenlos] §6Schild erstellen!");
				evt.getBlock().setType(Material.AIR);
				return;
			}
			if(evt.getLine(1).equals(""))  {
				p.sendMessage(Main.name +" §cUngültiges Schild!");
				evt.getBlock().setType(Material.AIR);
				return;
			}
			evt.setLine(0, "§2[Kostenlos]");
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
				if(s.getLine(0).equalsIgnoreCase("§2[Kostenlos]"))  {
					try {
						String zeile2 = s.getLine(1);
						int itemId = Integer.parseInt(zeile2.split(":")[0]);
						int sho_id = Integer.parseInt(zeile2.split(":")[1]);
						
						int item_count = Integer.parseInt(s.getLine(2));
						
						Inventory inventory = Bukkit.createInventory(null, 9, "§a§lKostenlose Items");
						for(int i = 0; i < inventory.getSize(); i++) {
							inventory.setItem(i, new ItemStack(Material.getMaterial(itemId), item_count, (short) sho_id));
						}
						evt.getPlayer().openInventory(inventory);
							
					} catch (NumberFormatException exception) {
						s.setLine(0, "§c[Kostenlos]");
						evt.getPlayer().sendMessage(Main.name +" §7Ungültiges Schild");
					}
					
					
					
					
				}
			}
		}
	}

}
