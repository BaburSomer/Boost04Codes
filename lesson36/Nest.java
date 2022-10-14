package com.bilgeadam.course04.lesson36;

import java.util.StringTokenizer;

public class Nest extends Furniture {

	public Nest(IFurnitureStyle style) {
		super(style);
	}
	
	public Nest(String color, int price) {
		super(color, price);
	}
	
	@Override
	public void construct(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Yeşil;140;;;;
		 */
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		String color = tokenizer.nextToken();
		int price = Integer.parseInt(tokenizer.nextToken());
		
		Nest nest = new Nest(color, price);
		nest.setStyle(this.getStyle());
		FurnitureShopProperties.getInstance().getFurnitures().add(nest);
	}

	@Override
	public String toString() {
		return super.toString() +  "]";
	}

	@Override
	public String getName() {
		return "Zigon";
	}

}
