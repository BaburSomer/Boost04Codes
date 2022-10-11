package com.bilgeadam.course04.lesson22;

public class SimpleTryCatchFinallyExample {
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
			if (1 == 2/2) {
				return;
			}
			System.out.println(3 / 1);
			System.out.println("Bölme işlemi tamamlandı");
			aVariable.intValue();
		}
//		catch (ArithmeticException e) {
//			System.err.println("Sıfıra bölme hatası oluştu");
//		}
//		catch (NullPointerException e) {
//			System.err.println("Null referans hatası oluştu");
//		}
		catch (Exception e) {
			System.err.println("Bir hata oluştu: " + e.getMessage() + " - " + e.getClass());
			System.out.println("\n" + e.toString());
		}
		finally {
			System.out.println("Nihayet işlemin sonuna vardık");
		}
		System.out.println("Method C ended");
	}

}
