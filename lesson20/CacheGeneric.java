package com.bilgeadam.course04.lesson20;

public class CacheGeneric<T> {
//	public class CacheGeneric<T extends Number, K, V, S> {
	private T entry;
//	private K key;
//	private V value;
//	private S neBileyimBen;
	
	public void add (T entry) {
		this.entry = entry;
	}
	
	public T get() {
		return this.entry;
	}

}
