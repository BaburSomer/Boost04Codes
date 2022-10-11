package com.bilgeadam.course04.lesson33;

public class JavaProcess {

	public static void main(String[] args) {
		System.out.println("Programın çalıştığı thread - Name   : " + Thread.currentThread().getName());
		System.out.println("Programın çalıştığı thread - Id     : " + Thread.currentThread().getId());
		System.out.println("Programın çalıştığı thread - Öncelik: " + Thread.currentThread().getPriority());
		System.out.println("Programın çalıştığı thread - Durum  : " + Thread.currentThread().getState());
		System.out.println("Programın çalıştığı thread - ClassLo: " + Thread.currentThread().getContextClassLoader());
		System.out.println("Programın çalıştığı thread - Grup   : " + Thread.currentThread().getThreadGroup());
	}

}
