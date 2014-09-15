package com.CoreSkySystem.Functions;

public class ColorFormatter {
	
	public static String getColoredString(String message) {
		return message.replaceAll("&", "§");
	}
	
	public static String getIngameCode(String message) {
		return message.replaceAll("§", "&");
	}

}
