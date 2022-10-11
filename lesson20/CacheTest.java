package com.bilgeadam.course04.lesson20;

public class CacheTest {

	public static void main(String[] args) {
		CacheString cacheString = new CacheString();
		CacheShirt cacheShirt = new CacheShirt();

		cacheString.add("Bir gün okula giderken ...");
		System.out.println(cacheString.get());
		
		cacheShirt.add(new Shirt("Mavi", "kırmızı"));
		System.out.println(cacheShirt.get());
		
		
		CacheGeneric<Shirt> shirts = new CacheGeneric<>();
		shirts.add(new Shirt("Mavi", "kırmızı"));
		System.out.println(shirts.get());

		CacheGeneric<Integer> integers = new CacheGeneric<>();
		integers.add(1);
		System.out.println(integers.get());


	}
}
