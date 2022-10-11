package com.bilgeadam.course04.lesson26;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Properties {
	private static final String   BUNDLE_NAME = Properties.class.getPackageName() + ".zoo";  
	private static Locale         locale;				 
	private static ResourceBundle RESOURCE_BUNDLE;  

	private Properties() {
		Properties.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
	}

	public static void init(String language) {
		Properties.locale          = new Locale(language);
		Properties.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Properties.locale);
	}

	public static String getString(String key) {
		try {
			return Properties.getResourceBundle().getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	/* EASY INITIALIZATION" */
	private static ResourceBundle getResourceBundle() {
		if (Properties.RESOURCE_BUNDLE == null) {
			Properties.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
		}
		return Properties.RESOURCE_BUNDLE;
	}
}
