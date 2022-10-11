package com.bilgeadam.course04.lesson33;

public class MultiThreadWidthExtendsThread extends Thread {

	public static void main(String[] args) {
		MultiThreadWidthExtendsThread thread = new MultiThreadWidthExtendsThread();
		thread.start();
	}

	public void run() {
		System.out.println("Thread çalışıyor " + Thread.currentThread().getName());
	}
}
