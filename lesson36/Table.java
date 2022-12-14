package com.bilgeadam.course04.lesson36;

import java.util.StringTokenizer;

public class Table extends Furniture {
	private String polish;
	
	public Table(IFurnitureStyle style) {
		super(style);
	}
	
	public Table(String color, int price, String polish) {
		super(color, price);
		this.polish = polish;
	}
	
	public String getPolish() {
		return polish;
	}

	public void setPolish(String polish) {
		this.polish = polish;
	}

	@Override
	public void construct(String line) {
		/*
		 * Line bilgisi aşağıdaki şek,il ve örneklerde geliyor
		 * Renk;Fiyat;Materyal;Kumaş;Cila;Ayak Adedi
		 * Kırmızı;165;;;Yarı Parlık;
		 */
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		String color = tokenizer.nextToken();
		int price = Integer.parseInt(tokenizer.nextToken());
		String polish = tokenizer.nextToken();
		
		Table table = new Table(color, price, polish);
		table.setStyle(this.getStyle());
		FurnitureShopProperties.getInstance().getFurnitures().add(table);
	}

	@Override
	public String toString() {
		return super.toString() + ", Cila=" + polish + "]";
	}

	@Override
	public String getName() {
		return "Masa";
	}

}
