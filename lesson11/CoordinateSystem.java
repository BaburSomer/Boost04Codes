package com.bilgeadam.course04.lesson11;

public class CoordinateSystem {

	public static void main(String[] args) {
		Point p1;
		p1 = new Point();
		p1.name = "P1";
		p1.xCoord = 1;
		p1.yCoord = 1;
		p1.zCoord = 1;
		System.out.println(p1); // stack'te bulunan adres bilgisini yazdırıyoruz
		System.out.println(p1.name + " " + p1.xCoord + "/" + p1.yCoord + "/" + p1.zCoord); // nesnenin öznitelik değerlerini
																					// yazdırıyoruz

		Point p2 = p1;
		
		System.out.println(p2.name + " " + p2.xCoord + "/" + p2.yCoord + "/" + p2.zCoord); // nesnenin öznitelik değerlerini
																					// yazdırıyoruz
		p2.name = "P2";
		p2.yCoord = 5;
		System.out.println(p1.name + " " + p1.xCoord + "/" + p1.yCoord + "/" + p1.zCoord); // nesnenin öznitelik değerlerini
																					// yazdırıyoruz
		System.out.println(p2.name + " " + p2.xCoord + "/" + p2.yCoord + "/" + p2.zCoord); // nesnenin öznitelik değerlerini
																					// yazdırıyoruz

		if (p1 == p2) {
			System.out.println("p1 ve p2 özdeşlerdir");
			System.out.println(p1);
			System.out.println(p2);
		} else {
			System.out.println("p1 ve p2 özdeş değillerdir");
		}

		Point p3;
		p3 = new Point();
		p3.name = "P3";
		p3.xCoord = 1;
		p3.yCoord = 5;
		p3.zCoord = 1;
		System.out.println(p3.name + " " + p3.xCoord + "/" + p3.yCoord + "/" + p3.zCoord); // nesnenin öznitelik değerlerini
																					// yazdırıyoruz

		if (p1 == p3) {
			System.out.println("p1 ve p3 özdeşlerdir");
		} else {
			System.out.println("p1 ve p3 özdeş değilleridir");
			System.out.println(p1);
			System.out.println(p3);
		}
		
		if (p1.xCoord == p3.xCoord && p1.yCoord == p3.yCoord && p1.zCoord == p3.zCoord) {
			System.out.println("p1 ve p3 eştir");
		}
		else {
			System.out.println("p1 ve p3 eş değiller");
		}
		
		if (p1.name == p3.name && p1.xCoord == p3.xCoord && p1.yCoord == p3.yCoord && p1.zCoord == p3.zCoord) {
			System.out.println("p1 ve p3 eştir");
		}
		else {
			System.out.println("p1 ve p3 eş değiller");
		}
		
		p3 = p2;
		if (p1 == p3) {
			System.out.println("p1 ve p3 özdeşlerdir");
			System.out.println(p1);
			System.out.println(p3);
		} else {
			System.out.println("p1 ve p3 özdeş değilleridir");
		}

		
	}

}
