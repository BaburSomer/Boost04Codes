package com.bilgeadam.course04.lesson36;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BasicStyleFurnitureFactory extends StyleFactory {

	
	public BasicStyleFurnitureFactory() {
		super();
	}

	@Override
	public void create(String type, String info) {
		ReflectionData reflectedType = FurnitureShopProperties.getInstance().retrieveReflectionDataForTypes(type);
		BasicStyle style = new BasicStyle();
		
		if (reflectedType == null) {
			System.err.println("İstenilen sınıf bulunamadı: " + type);
		} else {
			try {
				Method createMethod = reflectedType.getCreateMethod();
				createMethod.invoke(reflectedType.getDefaultConstructor(style), info);
			} catch (NoSuchMethodException | SecurityException e) {
				System.err.println("İstenilen sınıf bulunamadı: " + type);
			} catch (IllegalAccessException e) {
				System.err.println("İşlem sırasında bir hata oluştu: " + e.getMessage());
			} catch (IllegalArgumentException e) {
				System.err.println("İşlem sırasında bir hata oluştu: " + e.getMessage());
			} catch (InvocationTargetException e) {
				System.err.println("İşlem sırasında bir hata oluştu: " + e.getMessage());
			}
		}
	}
}
