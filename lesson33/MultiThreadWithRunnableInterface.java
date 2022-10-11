package com.bilgeadam.course04.lesson33;

public class MultiThreadWithRunnableInterface implements Runnable {

	public static void main(String[] args) {
		MultiThreadWithRunnableInterface multi = new MultiThreadWithRunnableInterface();
		Thread thread = new Thread(multi);
		thread.start();

	}

	@Override
	public void run() {
		System.out.println("Thread çalışıyor " + Thread.currentThread().getName());
	}
}
