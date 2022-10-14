package com.bilgeadam.course04.lesson36;

import java.util.StringTokenizer;

public class Seat extends Furniture {
	private String fabric;
	
	public Seat(IFurnitureStyle style) {
		super(style);
	}
	
	public Seat(String color, int price, String fabric) {
		super(color, price);
		this.fabric = fabric;
	}
	
	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	@Override
	public void construct(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Kahverengi;155;;Deri;;
		 */
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		String color = tokenizer.nextToken();
		int price = Integer.parseInt(tokenizer.nextToken());
		String fabric = tokenizer.nextToken();
		
		Seat seat = new Seat(color, price, fabric);
		seat.setStyle(this.getStyle());
		FurnitureShopProperties.getInstance().getFurnitures().add(seat);
	}

	@Override
	public String toString() {
		return super.toString() + ", Kumaş=" + fabric + "]";
	}
	
	@Override
	public String getName() {
		return "Koltuk";
	}

}
