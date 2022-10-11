package com.bilgeadam.course04.lesson24;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UselessBirthdayInformation {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while (true) {
			System.out.println("Lütfen doğum tarihinizi dd.MM.yyyy formatında giriniz: ");
			input = sc.nextLine();
			if (input == null || input.isEmpty()) { break; }
			
			LocalDate birthDay = LocalDate.parse(input, formatter);
			displayUselessInfo(birthDay);
		} 

		System.out.println("bye...");
		sc.close();
	}

	private static void displayUselessInfo(LocalDate birthDay) {
		System.out.println("Doğduğunuz " + birthDay.getDayOfWeek() + " muhteşem bir gündü.");
		long age = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
		System.out.println("Yaşınız " + age);
		LocalDate nextBirthday = birthDay.plusYears(age+1);
		System.out.println("Bir sonraki doğum gününüz " + nextBirthday);
		System.out.println("Bir sonraki doğum gününüze " + LocalDate.now().until(nextBirthday, ChronoUnit.DAYS) + " gün kaldı. Ha gayret!");
		
		MonthDay halfBirthday = MonthDay.from(birthDay.plusMonths(6));
		System.out.println("Yarı yaş yıl dönümünüz " + halfBirthday);
		
		System.out.println("Şu ana dek " + birthDay.until(LocalDate.now(), ChronoUnit.DAYS) + " gün yaşadınız");
	}
}
