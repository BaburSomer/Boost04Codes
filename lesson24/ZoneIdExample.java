package com.bilgeadam.course04.lesson24;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {

	public static void main(String[] args) {
		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			System.out.println(zoneId);
		}

		ZoneId zoneTurkey = ZoneId.of("Turkey");
		ZoneId zoneIstanbul = ZoneId.of("Europe/Istanbul");
		
		System.out.println(zoneTurkey);
		System.out.println(zoneIstanbul);
		
		ZonedDateTime time = ZonedDateTime.of(2022, 2, 27, 13, 34, 45, 0, zoneTurkey);
		System.out.println(time);
		
		System.out.println(time.getMonth());
		System.out.println(time.getMonthValue());
		System.out.println(time.getDayOfYear());
		System.out.println(time.getDayOfMonth());
		System.out.println(time.getDayOfWeek());
		
		
	}

}
