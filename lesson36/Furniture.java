package com.bilgeadam.course04.lesson36;

public abstract class Furniture {
	private IFurnitureStyle kind;
	private String color;
	private int price;
	
	protected abstract void construct();
	
	public Furniture(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public IFurnitureStyle getKind() {
		return kind;
	}

	@Override
	public String toString() {
		return "Furniture [color=" + color + ", price=" + price + "]";
	}

	public void setKind(IFurnitureStyle kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
}
