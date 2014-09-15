package com.CoreSkySystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		     if (cmd.getName().equalsIgnoreCase("ts"))  {
				cs.sendMessage("§7[]-------------[§6TeamSpeak§7]-------------[]");
				cs.sendMessage("§8» §7Wir haben bislang noch keinen §cTeamSpeak³-Server§7!");
				cs.sendMessage("§7[]-------------[§6TeamSpeak§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("copyright"))  {
				   cs.sendMessage("§7[]-------------[§6Copyright§7]-------------[]");
				   cs.sendMessage("§8» §cCopyright §7by §cCoreSky.De§7!");
				   cs.sendMessage("§8» §7Verstöße werden je nach Art §cbestraft");
			       cs.sendMessage("§7[]-------------[§6Copyright§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("hilfe"))  {
				   cs.sendMessage("§7[]-------------[§6Hilfe§7]-------------[]");
				   cs.sendMessage("§8» §c/spenden §8«");
				   cs.sendMessage("§8» §c/regeln §8«");
				   cs.sendMessage("§8» §c/skype §8«");
				   cs.sendMessage("§8» §c/ts §8«");
				   cs.sendMessage("§8» §c/premium §8«");
				   cs.sendMessage("§8» §c/epic §8«");
				   cs.sendMessage("§8» §c/ultimate §8«");
				   cs.sendMessage("§8» §c/copyright §8«");
				   cs.sendMessage("§8» §c/is §8«");
				   cs.sendMessage("§8» §c/friede <name> §8«");
				   cs.sendMessage("§8» §c/report <Spieler> <Grund> §8«");
				   cs.sendMessage("§7[]-------------[§6Hilfe§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("spenden"))  {
					cs.sendMessage("§7[]-------------[§6Spenden§7]-------------[]");
					cs.sendMessage("§8» §cSpenden §7gehen nur an die §cOwner§7!");
					cs.sendMessage("§8» §7Die §cOwner §7findest du unter §c/skype§7.");
					cs.sendMessage("§8» §cSpenden §7kannst du nur per §cPaySafeCard§7!");
					cs.sendMessage("§8» §cInfos §7zu den §cSpenden-Rängen§7:");
					cs.sendMessage("§8» §c/premium §7, §c/epic §7oder §c/ultimate");
					cs.sendMessage("§7[]-------------[§6Spenden§7]-------------[]");
			
							
			} else if (cmd.getName().equalsIgnoreCase("skype"))  {
				cs.sendMessage("§7[]--------[§6Skype§7]--------[]");
				cs.sendMessage("§8> §4Owner §7 * §4byBambus§7: §eprimeewolf§7");
				cs.sendMessage("§8> §4Owner §7 * §4DerDickeEins§7: §eiSnoopHDx§7");
				cs.sendMessage("§7[]-------------[§6Skype§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("regeln"))  {
				cs.sendMessage("§7[]-------------[§6Regelwerk§7]-------------[]");
				cs.sendMessage("§8> §cKeine Hacks! §8«");
				cs.sendMessage("§8> §cNicht Beleidigen! §8«");
				cs.sendMessage("§8> §cKeine Werbung! §8«");
				cs.sendMessage("§8> §cNicht Betteln! §8«");
				cs.sendMessage("§8> §cKein CAPSLOCK! §8«");
		        cs.sendMessage("§7[]-------------[§6Regelwerk§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("premium"))  {
				cs.sendMessage("§7[]-------------[§6Premium§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 10 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit premium");
				cs.sendMessage("§4/tpahere");
				cs.sendMessage("§4/near");
				cs.sendMessage("§4/recipe");
				cs.sendMessage("§4/repair");
				cs.sendMessage("§4/ci");
				cs.sendMessage("§4/meta");
				cs.sendMessage("§4/enderchest");
				cs.sendMessage("§4/workbench");
			    cs.sendMessage("§7[]-------------[§6Premium§7]-------------[]");
		
			} else if (cmd.getName().equalsIgnoreCase("epic"))  {
				cs.sendMessage("§7[]-------------[§6Epic§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 20 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Epic");
				cs.sendMessage("§4/repiar all");
				cs.sendMessage("§4/heal");
				cs.sendMessage("§4/feed");
				cs.sendMessage("§4/ping");
				cs.sendMessage("§7[]-------------[§6Epic§7]-------------[]");
				
			} else if (cmd.getName().equalsIgnoreCase("ultimate"))  {
				cs.sendMessage("§7[]-------------[§6Ultimate§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 30 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Ultimate");
				cs.sendMessage("§4/top");
				cs.sendMessage("§4/hat");
				cs.sendMessage("§4/invsee");
				cs.sendMessage("§4/tpaall");
				cs.sendMessage("§4/back");
				cs.sendMessage("§4/god");
				cs.sendMessage("§7[]-------------[§6Ultimate§7]-------------[]");
		
			} else if (cmd.getName().equalsIgnoreCase("team"))  {
				cs.sendMessage("§7[]-------------[§6Team§7]-------------[]");
				cs.sendMessage("§4§lOwner:");
				cs.sendMessage("§7byBambus, DerDickeEins");
				cs.sendMessage("");
				cs.sendMessage("§c§lAdmin's:");
				cs.sendMessage("§7TGM_Nick, Killerahz, Darrek2503");
				cs.sendMessage("");
				cs.sendMessage("§a§lDeveloper:");
				cs.sendMessage("§7razorblur, (TGM_Nick)");
				cs.sendMessage("§7[]-------------[§6Team§7]-------------[]");
			}


		
			return true;
		
	
	 }
}
