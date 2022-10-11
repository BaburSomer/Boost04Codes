package com.bilgeadam.course04.lesson24;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Countdown {

	public static void main(String[] args) {

		LocalDateTime target = LocalDateTime.now();
		target = target.plusMinutes(1L);

		LocalDateTime actual = LocalDateTime.now();
		do {
			long gap = actual.until(target, ChronoUnit.SECONDS);
			System.out.printf("%2d", gap);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			actual = LocalDateTime.now();
			System.out.print("\b\b\b");
		} while (LocalDateTime.now().isBefore(target));
	}
}
