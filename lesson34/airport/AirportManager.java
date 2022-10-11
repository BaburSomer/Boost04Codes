package com.bilgeadam.course04.lesson34.airport;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bilgeadam.course04.lesson34.airport.controller.VehicleDataImport;
import com.bilgeadam.course04.lesson34.airport.model.airport.Airport;
import com.bilgeadam.course04.lesson34.airport.model.common.Commons;
import com.bilgeadam.course04.lesson34.airport.model.vehicle.Airplane;
import com.bilgeadam.course04.lesson34.airport.model.vehicle.Vehicle;

public class AirportManager {

	public static void main(String[] args) {
		AirportManager manager = new AirportManager();
		manager.menu();
		System.out.println("Havaalanımızı ziyaret ettiğiniz için teşekkürler");
		System.exit(0);
	}

	private void menu() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("==========================");
			System.out.println(" Havaalanı Yönetim Sistemi");
			System.out.println("==========================");
			while (true) {
				System.out.println(" (1) - Araç Bilgilerini içe aktar");
				System.out.println(" (2) - Araç Bilgilerini listele");
				System.out.println(" (3) - Simulasyona başla");
				System.out.println("(99) - Programı sonlandır");
				System.out.print("Lütfen seçiminiz yapınız: ");
				int selection = sc.nextInt();
				sc.nextLine(); // string harici scanner okumalarda satır sonunu okumak için
				System.out.println();
				boolean exit = false;
				switch (selection) {
				case 1:
					this.importVehicles();
					break;
				case 2:
					this.listVehicles();
					break;
				case 3:
					this.simulate();
					break;
				case 99:
					exit = true;
					break;
				default:
					System.err.println("Hatalı seçim. Lütfen tekrarlayınız!");
					continue;
				}
				if (exit) {
					break;
				}
			}
		}
	}

	private void simulate() {
		Airport airport = new Airport("BilgeAdam");
		HashSet<Vehicle> vehicles = Commons.getInstance().getVehicles();
		List<Airplane> airplanes = vehicles.stream()
										   .filter(vehicle -> vehicle instanceof Airplane)
										   .map(vehicle -> (Airplane)vehicle)
										   .collect(Collectors.toList());
		airplanes.forEach(airplane -> {airplane.setAirport(airport); airplane.start();}); 																
	}

	private void listVehicles() {
		HashSet<Vehicle> vehicles = Commons.getInstance().getVehicles();
		if (vehicles.size() == 0) {
			System.err.println("Araç bilgileri tanımsız. Lütfen araç bilgilerini okuyun");
		}
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}

	private void importVehicles() {
		try {
			VehicleDataImport.read();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
