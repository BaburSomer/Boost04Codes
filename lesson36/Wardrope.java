package com.bilgeadam.course04.lesson36;

import java.util.StringTokenizer;

public class Wardrope extends Furniture {
	private String polish;

	public Wardrope(IFurnitureStyle style) {
		super(style);
	}
	
	public Wardrope(String color, int price, String polish) {
		super(color, price);
		this.polish = polish;
	}


	@Override
	public void construct(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Beyaz;190;;Lake;;
		 */
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		String color = tokenizer.nextToken();
		int price = Integer.parseInt(tokenizer.nextToken());
		String polish = tokenizer.nextToken();
		
		Wardrope wardrope = new Wardrope(color, price, polish);
		wardrope.setStyle(this.getStyle());
		FurnitureShopProperties.getInstance().getFurnitures().add(wardrope);
	}

	public String getPolish() {
		return polish;
	}

	public void setPolish(String polish) {
		this.polish = polish;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cila=" + polish + "]";
	}

	@Override
	public String getName() {
		return "Dolap";
	}
}
