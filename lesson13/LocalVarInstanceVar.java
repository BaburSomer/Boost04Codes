package com.bilgeadam.course04.lesson13;

public class LocalVarInstanceVar {
	private int price;
	private double subTotal;
	private String article;
	private boolean taxFree;
	
	public static void main(String[] args) {
		double tax = 0;
		double taxRate = 0;
		
		LocalVarInstanceVar var = new LocalVarInstanceVar();
		var.price = 10;
		var.taxFree = false;
		tax = var.calculateEndPrice();
		
		System.out.println(var);
		System.out.println(tax);
	}

	private double calculateEndPrice() {
		double taxRate = 0;
		double tax = 0;
		
		if (!taxFree) {
			int price = 0;
//		double taxRate = 1.2;
			taxRate = 0.45;
			tax = this.price * taxRate;
			subTotal = this.price + tax;
		}
		return tax;
	}

	@Override
	public String toString() {
		return "LocalVarInstanceVar [subTotal=" + subTotal + ", price=" + price + ", taxFree=" + taxFree + "]";
	}

}
