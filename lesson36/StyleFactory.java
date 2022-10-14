package com.bilgeadam.course04.lesson36;

public abstract class StyleFactory {
	abstract public void create(String type, String info);
	
	public static StyleFactory getFactory(String style) {
		if (style.equalsIgnoreCase("Klasik")) {
			return new ClassicStyleFurnitureFactory();
		}
		if (style.equalsIgnoreCase("Basit")) {
			return new BasicStyleFurnitureFactory();
		}
		if (style.equalsIgnoreCase("Art Nouveau")) {
			return new ArtNouveauStyleFurnitureFactory();
		}
		if (style.equalsIgnoreCase("Modern")) {
			return new ModernStyleFurnitureFactory();
		}
		return null;
	}
}
