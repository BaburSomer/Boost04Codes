package com.bilgeadam.course04.lesson20;

public class Shirt {
	private String label;
	private String color;

	public Shirt(String label, String color) {
		super();
		this.label = label;
		this.color = color;
	}

	public String getLabel() {
		return label;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Shirt [label=" + label + ", color=" + color + "]";
	}
}
