package com.bilgeadam.course04.lesson34.airport.model.vehicle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// FACTORY PATTERN
public class VehicleFactory {
	private static final String BASE_PACKAGE = "com.bilgeadam.course04.lesson34.airport.model.vehicle";

	@SuppressWarnings("rawtypes")
	public static void create(String line) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		System.out.println("Creating vehicle started");
		
		Class   clazz   = null;
		
		if (line.toUpperCase().startsWith("AIRPLANE")) {
			clazz = Class.forName(BASE_PACKAGE + ".Airplane");  // REFLECTION
		}
		else if (line.toUpperCase().startsWith("FIRECAR")) {
			clazz = Class.forName(BASE_PACKAGE + ".FireCar");
		}
		else if (line.toUpperCase().startsWith("SERVICECAR")) {
			clazz = Class.forName(BASE_PACKAGE + ".ServiceCar");
		}
		else if (line.toUpperCase().startsWith("CATERING")) {
			clazz = Class.forName(BASE_PACKAGE + ".CateringCar");
		}
		else {
			System.out.println("Unrecognized vehicle type");
		}
		
		if (clazz != null) {
			@SuppressWarnings("unchecked")
			Method parseMethod = clazz.getMethod("parse", String.class);
			parseMethod.invoke(null, line);
		}
		System.out.println("Creating vehicle ended");
	}
}
