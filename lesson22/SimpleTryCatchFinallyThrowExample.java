package com.bilgeadam.course04.lesson22;

import java.io.IOException;
import java.io.Writer;

public class SimpleTryCatchFinallyThrowExample {
	static Integer aVariable;
	
	public static void main(String[] args) {
		methodA();
		System.out.println("Main method ended");
				
	}

	private static void methodA() {
		methodB();
		System.out.println("Method A ended");
	}

	private static void methodB() {
		methodC();
		System.out.println("Method B ended");
	}

	private static void methodC() {
		try {
			aVariable = 1;
			int result = 3 / aVariable.intValue();
			System.out.println("Bölme işlemi tamamlandı");
			System.out.println("Bölme işleminin sonucu:" + result);
			if (result == 3) {
				throw new ResultMustNotBe3Exception("Bölme işleminin sonucu 3 olmamalıydı");
			}
		}
		catch (ArithmeticException e) {
			System.err.println("Sıfıra bölme hatası oluştu");
		}
		catch (NullPointerException e) {
			System.err.println("Null referans hatası oluştu");
		}
		catch (Exception e) {
			System.err.println("Bir hata oluştu: " + e.getMessage() + " - " + e.getClass());
		}
		finally {
			System.out.println("Nihayet işlemin sonuna vardık");
		}
		System.out.println("Method C ended");
	}

}
