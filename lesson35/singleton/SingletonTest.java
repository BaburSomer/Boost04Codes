package com.bilgeadam.course04.lesson35.singleton;

public class SingletonTest {

	public static void main(String[] args) {
//		SingletonClass single = new SingletonClass(); // ikinci adım nedeni ile bunu yapamam
		SingletonClass instance = SingletonClass.getInstance(); // 3. adım sayesinde instance'a erişebiliyoruz
		
		instance.setName("Tekton");
		System.out.println(SingletonClass.getInstance().getName());
		
//		System.out.println(SingletonClass.getInstance().getAirport().getName());  // lazy kullanmadan çağrıldığında NULL-Pointer yeme ihtimali var.
		System.out.println(SingletonClass.getInstance().getAirport().getName());  // lazy kullanılıp çağrıldığında elimizde her zaman geçerli bir örnek var

		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance2.getName());
		
		IAmTheOnlyOne.getInstance().toString();
	}
}
