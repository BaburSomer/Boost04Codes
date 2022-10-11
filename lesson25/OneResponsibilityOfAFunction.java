package com.bilgeadam.course04.lesson25;

public class OneResponsibilityOfAFunction {

	public static void main(String[] args) {
		if (setParameter("username", "babür") == 100	) {
			System.out.println("Parametre atandı");
		}
		else {
			System.out.println("Parametre atanamadı");
		}

	}

	private static int setParameter(String parametre, String value) {
		if (value.equalsIgnoreCase("bıdı bıdı"))
			return 404;
		else {
			// bireyler yap
		}
	    return 100;
	}

}
