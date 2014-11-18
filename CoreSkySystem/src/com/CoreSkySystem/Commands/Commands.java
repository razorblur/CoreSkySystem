package com.CoreSkySystem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import com.CoreSkySystem.Functions.Permission;
//import com.CoreSkySystem.Functions.Permission;
import com.CoreSkySystem.Main.Main;
public class Commands implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		     if (cmd.getName().equalsIgnoreCase("ts"))  {
				cs.sendMessage(Main.a +"§6§lTeamSpeak"+ Main.b);
				cs.sendMessage("§c» §7Unseren TeamSpeak³: §cSkyFight.ch§7! §c«");
				cs.sendMessage(Main.a +"§6§lTeamSpeak"+ Main.b);
			
			} else if (cmd.getName().equalsIgnoreCase("copyright"))  {
				   cs.sendMessage(Main.a +"§6§lCopyright"+ Main.b);
				   cs.sendMessage("§c» §7Copyright by §cSkyFight.ch§7! §c«");
				   cs.sendMessage("§c» §7Verstöße werden je nach Art bestraft §c«");
				   cs.sendMessage(Main.a +"§6§lCopyright"+ Main.b);
			
			} else if (cmd.getName().equalsIgnoreCase("hilfe"))  {
				   cs.sendMessage(Main.a +"§6§lHilfe"+ Main.b);
				   cs.sendMessage("§c» §7/spenden §c«");
				   cs.sendMessage("§c» §7/regeln §c«");
				   cs.sendMessage("§c» §7/skype §c«");
				   cs.sendMessage("§c» §7/ts §c«");
				   cs.sendMessage("§c» §7/ranglist §c«");
				   cs.sendMessage("§c» §7/copyright §c«");
				   cs.sendMessage("§c» §7/is §c«");
				   cs.sendMessage("§c» §7/friede <name> §c«");
				   cs.sendMessage("§c» §7/system §c«");
				   cs.sendMessage("§c» §7/report <Spieler> <Grund> §c«");
				   cs.sendMessage("§c» §7/vote §c«");
				   cs.sendMessage("§c» §7/warp §c«");
				   cs.sendMessage("§c» §7/kit §c«");
				   cs.sendMessage("§c» §7/YouTuber §c«");
				   cs.sendMessage("§c»§7 /Bewerben §c«");
				   cs.sendMessage(Main.a +"§6§lHilfe"+ Main.b);
			
			} else if (cmd.getName().equalsIgnoreCase("qwertzuiopü"))  {
					cs.sendMessage(Main.a +"§6§lSpenden"+ Main.b);
					cs.sendMessage("§c» §7Spenden gehen nur an die §cOwner§7! ");
					cs.sendMessage("§c» §7Die Owner findest du unter §c/skype§7. ");
					cs.sendMessage("§c» §7Spenden kannst du per §cPaySafeCard §7oder §cPayPal");
					cs.sendMessage("§c» §7Infos zu den Spenden-Rängen§7: ");
					cs.sendMessage("§c» §c/ranglist ");
					cs.sendMessage(Main.a +"§6§lSpenden"+ Main.b);
			
							
			} else if (cmd.getName().equalsIgnoreCase("skype"))  {
				    cs.sendMessage(Main.a +"§6§lSkype"+ Main.b);
					cs.sendMessage("§c» §4Owner§7: §4SphexPvP§7: §eprimeewolf§7");
					cs.sendMessage("§c» §4Owner§7: §4SeroxPlays§7: §ederdickeeins§7");
					cs.sendMessage("§c» §4Developer§7: §4TGM_Nick§7: §eTGM_Nick§7");
					cs.sendMessage("§c» §cAdmin§7: §cSayZo§7: §eSayZo_§7");
					cs.sendMessage(Main.a +"§6§lSkype"+ Main.b);
			} else if (cmd.getName().equalsIgnoreCase("regeln"))  {
				cs.sendMessage(Main.a +"§6§lRegeln"+ Main.b);
				cs.sendMessage("§c» §7Keine Hacks! §c«");
				cs.sendMessage("§c» §7Nicht Beleidigen! §c«");
				cs.sendMessage("§c» §7Keine Werbung! §c«");
				cs.sendMessage("§c» §7Nicht Betteln! §c«");
				cs.sendMessage("§c» §7Fragen direkt stellen! §c«");
				cs.sendMessage("§c» §7Kein CAPSLOCK! §c«");
				cs.sendMessage("§c» §7Kein /fly im PvP!§c«");
				cs.sendMessage("§c» §7Kein Campen§c«");
				cs.sendMessage("§c» §7Keine Grossen Teams!§c«");
				cs.sendMessage("§c» §7Respektvolles Verhalten!!§c«");
				
				cs.sendMessage(Main.a +"§6§lRegeln"+ Main.b);
			
			} else if (cmd.getName().equalsIgnoreCase("iron"))  {
				cs.sendMessage(Main.a +"§f§lIron"+ Main.b);
				cs.sendMessage("   §cRang | Kosten §8«");
				cs.sendMessage("        §c 10 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("    §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§c» §7/kit Iron §c«");
				cs.sendMessage("§c» §7/tpahere §c«");
				cs.sendMessage("§c» §7/near §c«");
				cs.sendMessage("§c» §7/recipe §c«");
				cs.sendMessage("§c» §7/repair §c«");
				cs.sendMessage("§c» §7/clearinventory §c«");
				cs.sendMessage("§c» §7/enderchest §c«");
				cs.sendMessage("§c» §7/workbench §c«");
				cs.sendMessage(Main.a +"§f§lIron"+ Main.b);
		
			} else if (cmd.getName().equalsIgnoreCase("gold"))  {
				cs.sendMessage(Main.a +"§6§lGold"+ Main.b);
				cs.sendMessage("   §cRang | Kosten §8«");
				cs.sendMessage("        §c 20 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("    §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§c» §7/kit Gold §c«");
				cs.sendMessage("§c» §7/repiar all §c«");
				cs.sendMessage("§c» §7/heal §c«");
				cs.sendMessage("§c» §7/feed §c«");
				cs.sendMessage("§c» §7/ping §c«");
				cs.sendMessage(Main.a +"§6§lGold"+ Main.b);
				
			} else if (cmd.getName().equalsIgnoreCase("diamond"))  {
				cs.sendMessage(Main.a +"§b§lDiamond"+ Main.b);
				cs.sendMessage("    §cRang | Kosten §8«");
				cs.sendMessage("        §c 30 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("    §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§c» §7/kit Diamond §c«");
				cs.sendMessage("§c» §7/top §c«");
				cs.sendMessage("§c» §7/hat §c«");
				cs.sendMessage("§c» §7/invsee §c«");
				cs.sendMessage("§c» §7/tpaall §c«");
				cs.sendMessage("§c» §7/back §c«");
				cs.sendMessage(Main.a +"§b§lDiamond"+ Main.b);

			} else if (cmd.getName().equalsIgnoreCase("emerald"))  {
				cs.sendMessage(Main.a +"§a§lEmerald"+ Main.b);
				cs.sendMessage("    §cRang | Kosten §8«");
				cs.sendMessage("        §c 40 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("    §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§c» §7/kit Emerald §c«");
				cs.sendMessage("§c» §7/rename §c«");
				cs.sendMessage("§c» §7/god §c«");
				cs.sendMessage(Main.a +"§a§lEmerald"+ Main.b);
			
			}else if (cmd.getName().equalsIgnoreCase("system"))  {
				cs.sendMessage(Main.a +"§9§lSystem"+ Main.b);
				cs.sendMessage("§7            Server-System by");
				cs.sendMessage("§7          TGM_Nick & razorblur ");
				cs.sendMessage(Main.a +"§9§lSystem"+ Main.b);
		
			} else if (cmd.getName().equalsIgnoreCase("team"))  {
				cs.sendMessage(Main.a +"Team"+ Main.b);
				cs.sendMessage("§c» §4Owner§7: §7SphexPvP, SeroxPlays");
				cs.sendMessage("§c» §4Developer§7: §7TGM_Nick, razorblur");
				cs.sendMessage("§c» §cAdmin's§7: SayZo");
				cs.sendMessage("§c» §5Moderator§7:§7 Burakcrafter168");
				cs.sendMessage("§c» §eSupporter§7:§7");
				cs.sendMessage("");
				cs.sendMessage("§c» §7Du willst auch ins Team? §e/Bewerben §c«");
				cs.sendMessage(Main.a +"Team"+ Main.b);
			} else if (cmd.getName().equalsIgnoreCase("vote"))  {
				cs.sendMessage(Main.a +"§b§lVote"+ Main.b);
				cs.sendMessage("§c»§7 Um zu Voten bitte auf den Link klicken §c«");
				cs.sendMessage("§c»§7§n http://serverliste.org/?s=server&id=6385 §c«");
				cs.sendMessage(Main.a +"§b§lVote"+ Main.b);
			} else if (cmd.getName().equalsIgnoreCase("youtuber"))  {
				cs.sendMessage(Main.a +"§d§lYouTuber"+ Main.b);
				cs.sendMessage("§c»§7 Um Youtuber zu werden,, musst du §c«");
				cs.sendMessage("§c»§7 1. Mindestens 200 Abbonenten haben!  §c«");
				cs.sendMessage("§c»§7 2. Eine Gute Server-Vorstellung machen  §c«");
				cs.sendMessage(Main.a +"§d§lYouTuber"+ Main.b);
			} else if (cmd.getName().equalsIgnoreCase("obsidian")) {
				cs.sendMessage(Main.a +"§0§lObsidian"+ Main.b);
				cs.sendMessage("    §cRang | Kosten §8«");
				cs.sendMessage("        §c 50 Euro       ");
				cs.sendMessage("");
				cs.sendMessage("    §cRang | Rechte §8«");
				cs.sendMessage("");
				cs.sendMessage("§c» §7/kit Obsidian §c«");
				cs.sendMessage(Main.a +"§0§lObsidian"+ Main.b);
			} else if (cmd.getName().equalsIgnoreCase("bewerben")) {
				if(cs.hasPermission(Permission.bewerben)) {
					cs.sendMessage(Main.a +"§4§lBewerben"+ Main.b);
					cs.sendMessage("§c»§7 Du möchtest dich Bewerben? §c«");
					cs.sendMessage("§c»§7 - Bewerben an die Owner unter /skype §c«");
					cs.sendMessage("§c»§7 - Bewerbungen sind nur als Supporter möglich. §c«");
					cs.sendMessage("§c»§7 - Die Bewerbung muss Professionell sein. §c«");
					cs.sendMessage("§c»§7 - Keine Rechtschreibfehler §c«");
					cs.sendMessage("§c»§7 - Etwas über dich und deine Karriere erzählen! §c«");
					cs.sendMessage("§c»§7 - Kleinere Bewerbungen werden erst nicht gelesen. §c«");
					cs.sendMessage("§c»§7 - Nicht hinterfragen, ob du angenommen wirst. §c«");
					cs.sendMessage(Main.a +"§4§lBewerben"+ Main.b);
				} else {
					cs.sendMessage(Main.name +" §cEs werden momentan keine Bewerbungen angenommen!");
				}
					
			} 
		
			return true;
		
	
	 }
}
