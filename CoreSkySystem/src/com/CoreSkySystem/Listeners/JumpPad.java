package com.CoreSkySystem.Listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class JumpPad implements Listener{
	
	  @EventHandler
	  public void onPiston(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();

	    Location loc = new Location(p.getWorld(), e.getTo().getX(), e.getTo().getY() - 1.0D, e.getTo().getZ());

	    if (loc.getBlock().getType() == Material.SPONGE) {
	      p.setVelocity(p.getVelocity().setY(1.2D));
	      p.playSound(p.getEyeLocation(), Sound.FIREWORK_BLAST, 1.0F, 1.0F);
	    }
	  }

}
