package com.bilgeadam.course04.lesson25;

public class FunctionArguments {
	
	public static void main(String[] args) {
		drawRectangle(5, 4, 4, 6);
		Rectangle rectangle = new Rectangle(5, 4, 4, 6);
		drawRectangle(rectangle);
	}

	private static void drawRectangle(Rectangle rectangle) {
		System.out.println("Dörtgeni çizdim");
	}

	private static void drawRectangle(int i, int j, int k, int l) {
		System.out.println("Dörtgeni çizdim");
	}
}
