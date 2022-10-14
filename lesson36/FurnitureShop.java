package com.bilgeadam.course04.lesson36;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
	List<Furniture> furnitures;

	public static void main(String[] args) {
		System.out.println("Hoşgeldiniz");
		if (args.length == 1) {
			FurnitureShopProperties.getInstance().setFileName(args[0]);
		} else {
			System.err.println("Arguman eksik");
		}
		FurnitureShopProperties.getInstance().getFurnitureStyles();
		FurnitureShopProperties.getInstance().getFurnitureTypes();
		FurnitureShop shop = new FurnitureShop();
		shop.loadFurnitures();

		System.out.println("Hoş gittiniz");
	}

	private List<Furniture> getFurnitures() {
		if (this.furnitures == null) {
			this.furnitures = new ArrayList<>();
		}
		return this.furnitures;
	}
	
	private void loadFurnitures() {
		try (BufferedReader br = new BufferedReader(
				new FileReader(FurnitureShopProperties.getInstance().getDataFile()))) {
			String line = br.readLine(); // first line contains header data and is ignored.
			while ((line = br.readLine()) != null) {
				System.out.println(line);
//				this.getFurnitures().add(new Furniture());
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
