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
		
		// Ts
		if (cmd.getName().equalsIgnoreCase("ts"))  {
			cs.sendMessage(Main.a +"TeamSpeak"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e» "+ Main.text +"Unseren TeamSpeak³: §cSkyFight.ch"+ Main.text +"!");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"TeamSpeak"+ Main.b);
			
		// CopyRight
		} else if (cmd.getName().equalsIgnoreCase("copyright"))  {
		   cs.sendMessage(Main.a +"Copyright"+ Main.b);
		   cs.sendMessage(Main.leer);
		   cs.sendMessage("§e» "+ Main.text +"Copyright by §cSkyFight.ch"+ Main.text +"!");
		   cs.sendMessage("§e» "+ Main.text +"Verstöße werden je nach Art bestraft");
		   cs.sendMessage(Main.leer);
		   cs.sendMessage(Main.a +"Copyright"+ Main.b);
	
   		// Hilfe	
		} else if (cmd.getName().equalsIgnoreCase("hilfe"))  {
		   cs.sendMessage(Main.a +"Hilfe"+ Main.b);
		   cs.sendMessage(Main.leer);
		   cs.sendMessage("§e» "+ Main.text +"/spenden ");
		   cs.sendMessage("§e» "+ Main.text +"/regeln ");
		   cs.sendMessage("§e» "+ Main.text +""+ Main.text +"skype ");
		   cs.sendMessage("§e» "+ Main.text +"/ts §c");
		   cs.sendMessage("§e» "+ Main.text +"/ranglist §c");
		   cs.sendMessage("§e» "+ Main.text +"/copyright §c");
		   cs.sendMessage("§e» "+ Main.text +"/is §c");
		   cs.sendMessage("§e» "+ Main.text +"/friede <name> §c");
		   cs.sendMessage("§e» "+ Main.text +"/system §c");
		   cs.sendMessage("§e» "+ Main.text +"/report <Spieler> <Grund> §c");
		   cs.sendMessage("§e» "+ Main.text +"/vote §c");
		   cs.sendMessage("§e» "+ Main.text +"/warp §c");
		   cs.sendMessage("§e» "+ Main.text +"/kit §c");
		   cs.sendMessage("§e» "+ Main.text +"/YouTuber §c");
		   cs.sendMessage("§e»"+ Main.text +" /Bewerben §c");
		   cs.sendMessage(Main.leer);
		   cs.sendMessage(Main.a +"Hilfe"+ Main.b);
			   
		// Spenden-Info
		} else if (cmd.getName().equalsIgnoreCase("qwertzuiopü"))  {
			cs.sendMessage(Main.a +"Spenden"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e» "+ Main.text +"Spenden gehen nur an die "+ Main.bt +"Inhaber"+ Main.text +"! ");
			cs.sendMessage("§e» "+ Main.text +"Die Inhaber findest du unter "+ Main.bt +"/skype"+ Main.text +". ");
			cs.sendMessage("§e» "+ Main.text +"Spenden kannst du per "+ Main.bt +"PaySafeCard "+ Main.text +"oder §cPayPal");
			cs.sendMessage("§e» "+ Main.text +"Infos zu den Spenden-Rängen: ");
			cs.sendMessage("§e» "+ Main.bt +"/ranglist ");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Spenden"+ Main.b);
				
		// Skype		
		} else if (cmd.getName().equalsIgnoreCase("skype"))  {
		    cs.sendMessage(Main.a +"Skype"+ Main.b);
		    cs.sendMessage(Main.leer);
			cs.sendMessage("§e» §4Inhaber§7: §4SphexPvP§7: §eSphexPvP§7");
			cs.sendMessage("§e» §4Inhaber§7: §4SeroxPlays§7: §ederdickeeins§7");
			cs.sendMessage("§e» §4Developer§7: §4TGM_Nick§7: §eTGM_Nick§7");
			cs.sendMessage("§e» §cAdmin§7: §cSayZo§7: §eSayZo_§7");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Skype"+ Main.b);
		
		// Regeln		
		} else if (cmd.getName().equalsIgnoreCase("regeln"))  {
			cs.sendMessage(Main.a +"Regeln"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e» "+ Main.bt +"Keine Hacks! §c");
			cs.sendMessage("§e» "+ Main.bt +"Nicht Beleidigen! §c");
			cs.sendMessage("§e» "+ Main.bt +"Keine Werbung! §c");
			cs.sendMessage("§e» "+ Main.bt +"Nicht Betteln! §c");
			cs.sendMessage("§e» "+ Main.bt +"Fragen direkt stellen! §c");
			cs.sendMessage("§e» "+ Main.bt +"Kein CAPSLOCK! §c");
			cs.sendMessage("§e» "+ Main.bt +"Kein /fly im PvP!§c");
			cs.sendMessage("§e» "+ Main.bt +"Kein Campen§c");
			cs.sendMessage("§e» "+ Main.bt +"Keine Grossen Teams!§c");
			cs.sendMessage("§e» "+ Main.bt +"Respektvolles Verhalten!!§c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Regeln"+ Main.b);
		
		// Iron	
		} else if (cmd.getName().equalsIgnoreCase("iron"))  {
			cs.sendMessage(Main.a +"Iron"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("   "+ Main.bt +"Rang | Kosten §8");
			cs.sendMessage("        "+ Main.bt +" 10 Euro       ");
			cs.sendMessage("");
			cs.sendMessage("    "+ Main.bt +"Rang | Rechte §8");
			cs.sendMessage("");
			cs.sendMessage("§e» "+ Main.text +"/kit Iron §c«");
			cs.sendMessage("§e» "+ Main.text +"/tpahere §c");
			cs.sendMessage("§e» "+ Main.text +"/near §c");
			cs.sendMessage("§e» "+ Main.text +"/recipe §c");
			cs.sendMessage("§e» "+ Main.text +"/repair §c");
			cs.sendMessage("§e» "+ Main.text +"/clearinventory §c");
			cs.sendMessage("§e» "+ Main.text +"/enderchest §c");
			cs.sendMessage("§e» "+ Main.text +"/workbench §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Iron"+ Main.b);
	
		// Gold	
		} else if (cmd.getName().equalsIgnoreCase("gold"))  {
			cs.sendMessage(Main.a +"Gold"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("   "+ Main.bt +"Rang | Kosten §8");
			cs.sendMessage("        "+ Main.bt +" 20 Euro       ");
			cs.sendMessage("");
			cs.sendMessage("    "+ Main.bt +"Rang | Rechte §8");
			cs.sendMessage("");
			cs.sendMessage("§e» "+ Main.text +"/kit Gold §c");
			cs.sendMessage("§e» "+ Main.text +"/repiar all §c");
			cs.sendMessage("§e» "+ Main.text +"/heal §c");
			cs.sendMessage("§e» "+ Main.text +"/feed §c");
			cs.sendMessage("§e» "+ Main.text +"/ping §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Gold"+ Main.b);
		
		// Diamond	
		} else if (cmd.getName().equalsIgnoreCase("diamond"))  {
			cs.sendMessage(Main.a +"Diamond"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("    "+ Main.bt +"Rang | Kosten §8");
			cs.sendMessage("        "+ Main.bt +" 30 Euro       ");
			cs.sendMessage("");
			cs.sendMessage("    "+ Main.bt +"Rang | Rechte ");
			cs.sendMessage("");
			cs.sendMessage("§e» "+ Main.text +"/kit Diamond §c");
			cs.sendMessage("§e» "+ Main.text +"/top §c");
			cs.sendMessage("§e» "+ Main.text +"/hat §c");
			cs.sendMessage("§e» "+ Main.text +"/invsee §c");
			cs.sendMessage("§e» "+ Main.text +"/tpaall §c");
			cs.sendMessage("§e» "+ Main.text +"/back §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Diamond"+ Main.b);

		// Emerald	
		} else if (cmd.getName().equalsIgnoreCase("emerald"))  {
			cs.sendMessage(Main.a +"Emerald"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("    "+ Main.bt +"Rang | Kosten §8");
			cs.sendMessage("        "+ Main.bt +" 40 Euro       ");
			cs.sendMessage("");
			cs.sendMessage("    "+ Main.bt +"Rang | Rechte §8");
			cs.sendMessage("");
			cs.sendMessage("§» "+ Main.text +"/kit Emerald §c");
			cs.sendMessage("§e» "+ Main.text +"/rename §c");
			cs.sendMessage("§e» "+ Main.text +"/god §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Emerald"+ Main.b);
			
		// Obsidian	
		} else if (cmd.getName().equalsIgnoreCase("obsidian")) {
			cs.sendMessage(Main.a +"Obsidian"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("    "+ Main.bt +"Rang | Kosten §8");
			cs.sendMessage("        "+ Main.bt +" 50 Euro       ");
			cs.sendMessage("");
			cs.sendMessage("    "+ Main.bt +"Rang | Rechte §8");
			cs.sendMessage("");
			cs.sendMessage("§e» "+ Main.text +"/kit Obsidian §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Obsidian"+ Main.b);	
		
		// System	
		}else if (cmd.getName().equalsIgnoreCase("system"))  {
			cs.sendMessage(Main.a +"System"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage(""+ Main.text +"            Server-System by");
			cs.sendMessage(""+ Main.text +"          TGM_Nick & razorblur ");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"System"+ Main.b);
	
		// Team	
		} else if (cmd.getName().equalsIgnoreCase("team"))  {
			cs.sendMessage(Main.a +"Team"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e» §4Inhaber§7: §7SphexPvP, SeroxPlays");
			cs.sendMessage("§e» §4Developer§7: §7TGM_Nick, razorblur");
			cs.sendMessage("§e» §cAdmin's§7: SayZo");
			cs.sendMessage("§e» §5Moderatoren§7:§7");
			cs.sendMessage("§e» §eSupporter§7:§7 Manga, Sracher_");
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e»"+ Main.text +" Du willst auch ins Team? §e/Bewerben §c«");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Team"+ Main.b);
			
		// Vote	
		} else if (cmd.getName().equalsIgnoreCase("vote"))  {
			cs.sendMessage(Main.a +"Vote"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e»"+ Main.text +" Um zu Voten bitte auf den Link klicken §c");
			cs.sendMessage("§e»"+ Main.text +" http://serverliste.org/?s=server&id=6385 §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"Vote"+ Main.b);
			
		// YouTuber	
		} else if (cmd.getName().equalsIgnoreCase("youtuber"))  {
			cs.sendMessage(Main.a +"YouTuber"+ Main.b);
			cs.sendMessage(Main.leer);
			cs.sendMessage("§e»"+ Main.text +" Um Youtuber zu werden,, musst du §c");
			cs.sendMessage("§e»"+ Main.text +" 1. Mindestens 200 Abbonenten haben!  §");
			cs.sendMessage("§e»"+ Main.text +" 2. Eine Gute Server-Vorstellung machen  §c");
			cs.sendMessage(Main.leer);
			cs.sendMessage(Main.a +"YouTuber"+ Main.b);
			
		// Bewerben	
		} else if (cmd.getName().equalsIgnoreCase("bewerben")) {
			if(cs.hasPermission(Permission.bewerben)) {
				cs.sendMessage(Main.a +"Bewerben"+ Main.b);
				cs.sendMessage(Main.leer);
				cs.sendMessage("§e»"+ Main.text +" Du möchtest dich Bewerben? §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Bewerben an die Owner unter /skype §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Bewerbungen sind nur als Supporter möglich. §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Die Bewerbung muss Professionell sein. §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Keine Rechtschreibfehler §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Etwas über dich und deine Karriere erzählen! §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Kleinere Bewerbungen werden erst nicht gelesen. §c");
				cs.sendMessage("§e»"+ Main.bt +" ➥ "+ Main.text +"Nicht hinterfragen, ob du angenommen wirst. §c ");
				cs.sendMessage(Main.leer);
				cs.sendMessage(Main.a +"Bewerben"+ Main.b);
			} else {
				cs.sendMessage(Main.name +" §cEs werden momentan keine Bewerbungen angenommen!");
			}
			
		// etc.	
		} 
		
			return true;
		
	
	 }
}
