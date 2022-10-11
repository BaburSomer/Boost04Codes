package com.bilgeadam.course04.lesson34.airport.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.bilgeadam.course04.lesson34.airport.model.vehicle.VehicleFactory;

public class VehicleDataImport {
	private static final String            DATA_FILE_NAME = "C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Documents\\BA - Academy\\THY\\THY - Kurum İçi - Java\\vehicles.csv";

	public static void read() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Importing vehicles");

		try (BufferedReader br = new BufferedReader(new FileReader(VehicleDataImport.DATA_FILE_NAME))) {
			String line = br.readLine(); // first line contains header data and is ignored.
			while ((line = br.readLine()) != null) {
				VehicleFactory.create(line);
			}
		}
		catch (FileNotFoundException ex) {
			System.err.println(DATA_FILE_NAME + " --> " + ex.getMessage());
			System.exit(100);
		}
		catch (IOException ex) {
			System.err.println(DATA_FILE_NAME + " --> " + ex.getMessage());
			System.exit(100);
		}
		System.out.println("Importing vehicles ended");
	}
}
