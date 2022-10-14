package com.bilgeadam.course04.lesson36;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionData {
	private static final String BASE_PACKAGE = "com.bilgeadam.course04.lesson36";

	private String   name;
	private Class<?> clazz;

	public ReflectionData(String name, String className) {
		super();
		this.name = name;
		
		try {
			this.clazz = Class.forName(BASE_PACKAGE + "." + className); // forName metodu şu şekilde bir bilgi istiyor: "com.bilgeadam.course04.lesson36.Table" (fuuly qualifies class name dyoruz
		} catch (ClassNotFoundException e) {
			this.clazz = null;
			System.err.println(className + " bulunamadı");
		}
	}

	public String getName() {
		return name;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public Method getCreateMethod() throws NoSuchMethodException, SecurityException {
		if (clazz != null) {
			Method parseMethod = clazz.getMethod("construct", String.class);
			return parseMethod;
		}
		return null;
	}

	@Override
	public String toString() {
		return "ReflectionData [name=" + name + ", clazz=" + clazz.getSimpleName() + "]";
	}

	public Object getDefaultConstructor(IFurnitureStyle style) {
		Constructor<?> contructor;
		try {
			Class<?>[] constType = {IFurnitureStyle.class};
			contructor = clazz.getConstructor(constType);
			return contructor.newInstance(style);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
