package com.bilgeadam.course04.lesson13;

import com.bilgeadam.course04.lesson13.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.toString());
		p1.firstName = "Ali";
		p1.initialPassword("abc");
		
		p1.setAge(12);
		System.out.println(p1.getAge());
		System.out.println(p1);
		
		String msg = p1.isPasswordCorrect("cde") ? "doğrudur" : "yanlıştır";
		/* Yukarıdaki kodun if-else şeklinde yazılımı
		 String msg;
		 if (p1.isPasswordCorrect("cde")) {
		 	msg = "doğrudur";
		 }
		 else {
		 	msg = "yanlıştır";
		 }
		  
		 */
		System.out.println("Verilen şifre " + msg);
		System.out.println("Şifre değişti: " + p1.setPassword("abc", "edf"));
		
	}

}
