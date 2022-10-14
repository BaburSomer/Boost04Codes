package com.bilgeadam.course04.lesson36;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FurnitureShop {

	public static void main(String[] args) {
		System.out.println("Hoşgeldiniz");
		if (args.length == 1) {
			FurnitureShopProperties.getInstance().setFileName(args[0]);
		} else {
			System.err.println("Arguman eksik");
		}
		
		FurnitureShopProperties.getInstance().getFurnitureTypes();
		FurnitureShop shop = new FurnitureShop();
		shop.loadFurnitures();
		shop.listFurnitures();
		System.out.println("Hoş gittiniz");
	}

	private void listFurnitures() {
		List<Furniture> furnitures = FurnitureShopProperties.getInstance().getFurnitures();
		for (Furniture furniture : furnitures) {
			System.out.println(furniture);
		}
	}

	private void loadFurnitures() {
		try (BufferedReader br = new BufferedReader(new FileReader(FurnitureShopProperties.getInstance().getDataFile()))) {

			String line = br.readLine(); // first line contains header data and is ignored.
			while ((line = br.readLine()) != null) {
				FurnitureFactory.create(line);
			}
		} catch (FileNotFoundException ex) {
			System.err.println(FurnitureShopProperties.getInstance().getDataFile() + " --> " + ex.getMessage());
			System.exit(100);
		} catch (IOException ex) {
			System.err.println(FurnitureShopProperties.getInstance().getDataFile() + " --> " + ex.getMessage());
			System.exit(100);
		}
		
		
	}

}
