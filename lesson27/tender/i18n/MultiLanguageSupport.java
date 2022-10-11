package com.bilgeadam.course04.lesson27.tender.i18n;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MultiLanguageSupport {
	private static final String BUNDLE_NAME = MultiLanguageSupport.class.getPackageName() + ".texts"; //$NON-NLS-1$

	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en"));

	private MultiLanguageSupport() {
		// Do Nothing ==> bu şekilde MultiLanguageSupport sınıfından bir örnek
		// oluşturulması engellenmiş oluyor. Sadece static olarak kullanılabilir
	}

	public static void init(String language) {
		if (language.equalsIgnoreCase("türkçe") || language.equalsIgnoreCase("turkish")  || language.equalsIgnoreCase("türkisch")) { // enum kullanmak yerine bu da 
			// yapılabilir. Ama ya 50 dille bu programı kullanmak istersek?
			MultiLanguageSupport.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("tr"));
		} else if (language.equalsIgnoreCase("almanca") || language.equalsIgnoreCase("german")  || language.equalsIgnoreCase("deutsch")) {
			MultiLanguageSupport.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("de"));
		} else {
			MultiLanguageSupport.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, new Locale("en"));
		}
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
