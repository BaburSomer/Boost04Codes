package com.bilgeadam.course04.lesson36;

public abstract class Furniture {
	private IFurnitureStyle style;
	private String color;
	private int price;
	
	public abstract String getName();
	public abstract void construct(String line);
	
	public Furniture(IFurnitureStyle style) {
		super();
		this.style = style;
	}
	
	public Furniture(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public IFurnitureStyle getStyle() {
		return style;
	}

	public String getStyleInfo() {
		return style.giveSomeInformation();
	}
	
	@Override
	public String toString() {
		return this.getStyle().getStyleName() + " bir " + this.getName() + " [Renk=" + color + ", Fiyat=" + price  + ", Stil Bilgisi=" + this.getStyleInfo();
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public void setStyle(IFurnitureStyle style) {
		this.style = style;
	}
}
