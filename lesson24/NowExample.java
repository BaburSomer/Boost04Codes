package com.bilgeadam.course04.lesson24;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NowExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("Local Time     : " + localTime);
		System.out.println("Local Date     : " + localDate);
		System.out.println("Local Date Time: " + localDateTime);
		System.out.println("Zoned Date Time: " + zonedDateTime);

		localDate = LocalDate.parse("2022-12-22");
		System.out.println(localDate);

		localDateTime = LocalDateTime.parse("2022-12-22T15:34");
		System.out.println(localDateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
		localDate = LocalDate.parse("22.12.2022", formatter);
		System.out.println(localDate.format(formatter));

		int year = 2022;
		int month = 11;
		int day = 14;

		System.out.println(LocalDate.of(year, month, day).format(formatter));

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm.ss");
		System.out.println(LocalDateTime.of(year, month, day, 13, 34, 45).format(formatter2));

		String msg = localDate.toString() + " tarihi " + LocalDate.now() + " tarihinden " + (localDate.isAfter(LocalDate.now()) ? "sonradır" : "öncedir");
		System.out.println(msg);

		System.out.println("Gün tarih arası      : " + LocalDate.now().until(localDate, ChronoUnit.DAYS));
//		System.out.println("Yarım gün tarih arası: " + LocalDate.now().until(localDate, ChronoUnit.HALF_DAYS));
		System.out.println("hafta tarih arası    : " + LocalDate.now().until(localDate, ChronoUnit.WEEKS));
		System.out.println("Ay tarih arası       : " + LocalDate.now().until(localDate, ChronoUnit.MONTHS));
	}

}
