package com.bilgeadam.course04.lesson22;

import java.io.IOException;

public class SimpleTryCatchFinallyThrowAndThrowsExample {
	static Integer aVariable;

	public static void main(String[] args) {
		methodA();
		System.out.println("Main method ended");
		IOException ex = new IOException();
	}

	private static void methodA() {
		try {
			methodB();
			System.out.println("Method A ended");
		} catch (ProcessingCannotBeContinuedException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void methodB() throws ProcessingCannotBeContinuedException {
		methodC();
		System.out.println("Method B ended");
	}

	private static void methodC()  throws ProcessingCannotBeContinuedException  {
		try {
			aVariable = 0;
			int result = 3 / aVariable.intValue();
			System.out.println("Bölme işlemi tamamlandı");
			System.out.println("Bölme işleminin sonucu:" + result);
			if (result == 3) {
				throw new ResultMustNotBe3Exception("Bölme işleminin sonucu 3 olmamalıydı");
			}
		} catch (ArithmeticException e) {
			System.err.println("Sıfıra bölme hatası oluştu");
			throw new ProcessingCannotBeContinuedException();
		} catch (NullPointerException e) {
			System.err.println("Null referans hatası oluştu");
		} catch (Exception e) {
			System.err.println("Bir hata oluştu: " + e.getMessage() + " - " + e.getClass());
		} finally {
			System.out.println("Nihayet işlemin sonuna vardık");
		}
		System.out.println("Method C ended");
	}

}
