package com.bilgeadam.course04.lesson36;

import java.util.StringTokenizer;

public class Chair extends Furniture {
	private String material;
	private int numOfLegs;

	public Chair(IFurnitureStyle style) {
		super(style);
	}
	
	public Chair(String color, int price, String material, int numOfLegs) {
		super(color, price);
		this.material = material;
		this.numOfLegs = numOfLegs;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	@Override
	public void construct(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Mavi;135;Maun;;;4
		 */
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		String color = tokenizer.nextToken();
		int price = Integer.parseInt(tokenizer.nextToken());
		String material = tokenizer.nextToken();
		int legs = Integer.parseInt(tokenizer.nextToken());
		
		Chair chair = new Chair(color, price, material, legs);
		chair.setStyle(this.getStyle());
		FurnitureShopProperties.getInstance().getFurnitures().add(chair);
	}

	@Override
	public String toString() {
		return super.toString() + ", Malzeme=" + material + ", Ayak Adedi=" + numOfLegs + "]";
	}

	@Override
	public String getName() {
		return "Sandalye";
	}
}
