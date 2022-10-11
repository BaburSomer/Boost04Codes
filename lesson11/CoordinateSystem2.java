package com.bilgeadam.course04.lesson11;

public class CoordinateSystem2 {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point();
		p1.name = "P1";
		p1.xCoord = 1;
		p1.yCoord = 1;
		p1.zCoord = 1;
		Point p2 = p1;
		System.out.println(p2.name + " " + p2.xCoord + "/" + p2.yCoord + "/" + p2.zCoord); 
		
		System.out.println("P1 == P2\t" + (p1 == p2));
		System.out.println("P1 eşit mi P2\t" + (p1.equals(p2)));
		
		Point p3;
		p3 = new Point();
		p3.name = "P3";
		p3.xCoord = 1;
		p3.yCoord = 1;
		p3.zCoord = 1;
		System.out.println("P1 == P3\t" + (p1 == p3));
		System.out.println("P1 eşit mi P3\t" + (p1.equals(p3)));

		
		String str1 = "Merhaba Dünya";
		String str2 = "Merhaba Dünya";
		
		System.out.println("str1 == str2\t\t" + (str1 == str2));
		System.out.println("str1 eşit mi str2\t" + (str1.equals(str2)));
		
	}																				
}
