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
				   cs.sendMessage("§8» §cCopyright §7by §cSkyFight.ch§7!");
				   cs.sendMessage("§8» §7Verstöße werden je nach Art §cbestraft");
			       cs.sendMessage("§7[]-------------[§6Copyright§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("hilfe"))  {
				   cs.sendMessage("§7[]-------------[§6Hilfe§7]-------------[]");
				   cs.sendMessage("§8» §c/spenden §8«");
				   cs.sendMessage("§8» §c/regeln §8«");
				   cs.sendMessage("§8» §c/skype §8«");
				   cs.sendMessage("§8» §c/ts §8«");
				   cs.sendMessage("§8» §c/ranglist §8«");
				   cs.sendMessage("§8» §c/copyright §8«");
				   cs.sendMessage("§8» §c/is §8«");
				   cs.sendMessage("§8» §c/friede <name> §8«");
				   cs.sendMessage("§8» §c/system §8«");
				   cs.sendMessage("§8» §c/report <Spieler> <Grund> §8«");
				   cs.sendMessage("§7[]-------------[§6Hilfe§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("qwertzuiopü"))  {
					cs.sendMessage("§7[]-------------[§6Spenden§7]-------------[]");
					cs.sendMessage("§8» §cSpenden §7gehen nur an die §cOwner§7!");
					cs.sendMessage("§8» §7Die §cOwner §7findest du unter §c/skype§7.");
					cs.sendMessage("§8» §cSpenden §7kannst du nur per §cPaySafeCard§7!");
					cs.sendMessage("§8» §cInfos §7zu den §cSpenden-Rängen§7:");
					cs.sendMessage("§8» §c/ranglist");
					cs.sendMessage("§7[]-------------[§6Spenden§7]-------------[]");
			
							
			} else if (cmd.getName().equalsIgnoreCase("skype"))  {
					cs.sendMessage("§7[]--------[§6Skype§7]--------[]");
					cs.sendMessage("§8> §4Owner §7 * §4 _iTzVace§7: §eprimeewolf§7");
					cs.sendMessage("§8> §4Owner §7 * §4DerDickeEins§7: §eiSnoopHDx§7");
					cs.sendMessage("§7-----------------------------------------------");
					cs.sendMessage("§8> §cAdmin §7 * §cTGM_Nick§7: §eTGM_Nick§7");
					cs.sendMessage("§8> §cAdmin §7 * §cDarrek2503§7: §ealbanien1999§7");
					cs.sendMessage("§8> §cAdmin §7 * §cKillerahz§7: §efurkan4670§7");
				cs.sendMessage("§7[]-------------[§6Skype§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("regeln"))  {
				cs.sendMessage("§7[]-------------[§6Regelwerk§7]-------------[]");
				cs.sendMessage("§8> §cKeine Hacks! §8«");
				cs.sendMessage("§8> §cNicht Beleidigen! §8«");
				cs.sendMessage("§8> §cKeine Werbung! §8«");
				cs.sendMessage("§8> §cNicht Betteln! §8«");
				cs.sendMessage("§8> §cFragen direkt stellen! §8«");
				cs.sendMessage("§8> §cKein CAPSLOCK! §8«");
				cs.sendMessage("§8> §cZuerst bei /hilfe nachschauen! §8«");
				cs.sendMessage("§8> §cKein /fly im PvP!§8«");
		        cs.sendMessage("§7[]-------------[§6Regelwerk§7]-------------[]");
			
			} else if (cmd.getName().equalsIgnoreCase("iron"))  {
				cs.sendMessage("§7[]-------------[§f§lIron§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 10 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Iron");
				cs.sendMessage("§4/tpahere");
				cs.sendMessage("§4/near");
				cs.sendMessage("§4/recipe");
				cs.sendMessage("§4/repair");
				cs.sendMessage("§4/ci");
				cs.sendMessage("§4/enderchest");
				cs.sendMessage("§4/workbench");
			    cs.sendMessage("§7[]-------------[§f§lIron§7]-------------[]");
		
			} else if (cmd.getName().equalsIgnoreCase("gold"))  {
				cs.sendMessage("§7[]-------------[§6§lGold§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 20 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Gold");
				cs.sendMessage("§4/repiar all");
				cs.sendMessage("§4/heal");
				cs.sendMessage("§4/feed");
				cs.sendMessage("§4/ping");
				cs.sendMessage("§7[]-------------[§6§lGold§7]-------------[]");
				
			} else if (cmd.getName().equalsIgnoreCase("diamond"))  {
				cs.sendMessage("§7[]-------------[§b§lDiamond§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 30 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Diamond");
				cs.sendMessage("§4/top");
				cs.sendMessage("§4/hat");
				cs.sendMessage("§4/invsee");
				cs.sendMessage("§4/tpaall");
				cs.sendMessage("§4/back");
				cs.sendMessage("§7[]-------------[§b§lDiamond§7]-------------[]");

			} else if (cmd.getName().equalsIgnoreCase("emerald"))  {
				cs.sendMessage("§7[]-------------[§e§lEmerald§7]-------------[]");
				cs.sendMessage("§8» §cRang | Kosten §8«");
				cs.sendMessage("        §c 40 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("§8» §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§4/kit Emerald");
				cs.sendMessage("§4/rename");
				cs.sendMessage("§4/god");
				cs.sendMessage("§4/fly §6§l-FLY IM PVP IST VERBOTEN UND WIRD BESTRAFT!");
				cs.sendMessage("§7[]-------------[§e§lEmerald§7]-------------[]");
			
			}else if (cmd.getName().equalsIgnoreCase("system"))  {
				cs.sendMessage("§7[]-------------[§4§lSystem§7]-------------[]");
				cs.sendMessage("§9             Server-System by");
				cs.sendMessage("§c           TGM_Nick & razorblur ");
				cs.sendMessage("§7[]-------------[§4§lSystem§7]-------------[]");
		
			} else if (cmd.getName().equalsIgnoreCase("team"))  {
				cs.sendMessage("§7[]-------------[§6Team§7]-------------[]");
				cs.sendMessage("§4§lOwner:");
				cs.sendMessage("§a _iTzVace, DerDickeEins");
				cs.sendMessage("§7-----------------------------");
				cs.sendMessage("§4§lDeveloper:");
				cs.sendMessage("§arazorblur, TGM_Nick");
				cs.sendMessage("§7-----------------------------");
				cs.sendMessage("§c§lAdmin's:");
				cs.sendMessage("§aTGM_Nick, Killerahz, Darrek2503");
				cs.sendMessage("§7[]-------------[§6Team§7]-------------[]");
			}


		
			return true;
		
	
	 }
}
