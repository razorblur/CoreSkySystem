package com.CoreSkySystem.Listeners;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.CoreSkySystem.Commands.COMMAND_friede;
import com.CoreSkySystem.Commands.COMMAND_globalmute;
import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;

public class PlayerListeners implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		if(COMMAND_globalmute.globalmute) {
			if(!event.getPlayer().hasPermission(Permission.globalmute_chat)) {
				event.setCancelled(true);
				event.getPlayer().sendMessage(Main.name + "§7Der Chat ist momentan §cDeaktiviert§7!");
			}
		}
	}
	
	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		if(player.getKiller() instanceof Player) {
			player.sendMessage(Main.name + " §8Du wurdest getötet von §6§l"+player.getKiller().getName());
			player.getKiller().sendMessage(Main.name + " §8Du hast §6§l" + player.getName() + " §8getötet");
			player.getKiller().setHealth(20.0);
			player.getKiller().sendMessage(Main.name + " §7Du wurdest §cgeheilt §7weil du jemanden §cgetötet §7hast");
		}
	}
	
	////// Friede Listener ////////
	@EventHandler
	public void onDmg(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
			try {
				Player player = (Player) event.getEntity();
				Player damager = (Player) event.getDamager();
				
				List<?> list = COMMAND_friede.cfg.getList(damager.getName());
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).equals(player.getName())) {
						event.setCancelled(true);
						return;
					}
				}
			} catch(NullPointerException exception) {}
		}
	}

}
