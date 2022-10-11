package com.bilgeadam.course04.lesson26;

import java.util.Locale;

public class InternationalHelloWorld {

	public static void main(String[] args) {
		parseProgramArguments(args);
		doConversation(); 
	}

	private static void parseProgramArguments(String[] args) {
		
		if (args.length != 1) {
			System.err.println("Beklenen argüman sayısı 1. Sunulan argüman sayısı " + args.length);
			System.exit(100); // 0 her zaman sorunsuz bir bitiş demektir. 0 harici her değer bir hata anlamına gelir
		}
		
		if (args[0].equalsIgnoreCase("AVUSTURYACA")) {
			Messages.init("de", "AT");
		}
		else if (args[0].equalsIgnoreCase("ALMANCA")) {
			Messages.init("de", "DE");
		}
		else if (args[0].equalsIgnoreCase("amerikanca")) {
			Messages.init("en", "US");
		}
		else if (args[0].equalsIgnoreCase("ingilizce")) {
			Messages.init("en", "EN");
		}
		else if (args[0].equalsIgnoreCase("türkçe")) {
			Messages.init("tr", "TR");
		}
		else if (args[0].equalsIgnoreCase("rusça")) {
			Messages.init("ru", "RU");
		}
		else if (args[0].equalsIgnoreCase("arapça")) {
			Messages.init("ar", "DZ");
		}
	}

	private static void doConversation() {
		System.out.println(Messages.getString("InternationalHelloWorld.HELLO")); 
		System.out.println(Messages.getString("InternationalHelloWorld.HOW_ARE_YOU")); 
		System.out.println(Messages.getString("InternationalHelloWorld.SPLITTER")); 
		System.out.println(Messages.getString("InternationalHelloWorld.THANK_YOU")); 
		System.out.println(Messages.getString("InternationalHelloWorld.SPLITTER")); 
		System.out.println(Messages.getString("InternationalHelloWorld.SEE_YOU_AGAIN"));
	}
}
