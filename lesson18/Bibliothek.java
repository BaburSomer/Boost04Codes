package com.bilgeadam.course04.lesson18;

import java.time.LocalDate;

import com.bilgeadam.course04.lesson18.model.Magazine;
import com.bilgeadam.course04.lesson18.model.Period;

public class Bibliothek {

	public static void main(String[] args) {
		System.out.println("KÜTÜPHANE");
		
		Magazine m1 = new Magazine("GırGır", LocalDate.of(1978, 12, 12), 5, 15.75, "Oğuz Aral", "GIRGIR", "5576576", 45);
		m1.rent(10, Period.DAILY, 15);
		System.out.println("bye...");
		
	}
}
