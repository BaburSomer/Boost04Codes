package com.bilgeadam.course04.lesson26;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String   BUNDLE_NAME = Messages.class.getPackageName() + ".messages";  // com.bilgeadam.course04.lesson26.messagesXXXXXX.properties
	private static Locale         locale;				// XXXXXX eğer bir locale tanımlı ise ona bağlı olarak tr_TR veya de_AT gibi bir değer alacak. 
																	// aksi takdirde sadece com.bilgeadam.course04.lesson26.messages.properties şeklinde olacak
	private static ResourceBundle RESOURCE_BUNDLE;  

	private Messages() {
	}

	public static void init(String language, String country) {
		Messages.locale          = new Locale(language, country);
		Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Messages.locale);
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
