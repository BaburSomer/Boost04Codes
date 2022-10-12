package com.bilgeadam.course04.lesson35.singleton;

import com.bilgeadam.course04.lesson34.airport.model.airport.Airport;

public class SingletonClass {
	/*
	 * Bir singleton pattern sınıfı oluşturmak için İLK atılacak adım: instance adında 
	 * bir private static değişken tanımlamak
	 */
	private static SingletonClass instance; 
	
	/*
	 * DÖRDÜNCÜ adım: Tek bir örneğine ihtiyaç duyduğumuz bilgileri içeren değişkenleri tanımlıyoruz
	 */
	private String  name;
	private boolean correct;
	private Airport airport;
	
	/*
	 * İKİNCİ adım: Singleton olarak kullanılacak sınıfın default constructor'ını private olarak tanımlamak
	 * Bu şekilde Singleton olarak kullanılacak sınıftan herhangi bir örnek oluşturmak kendi sınıfı içinde mümkün olmayacak
	 */
	private SingletonClass() {
		super();
	}
	
	/*
	 * ÜÇÜNCÜ adım: Bir public static getInstance() yöntemi sağlamak. Bu yöntem lazy initialization kullanarak yeni bir 
	 * instance üretir ve istenilen yere teslim eder
	 */
	public static SingletonClass getInstance() {
		if (SingletonClass.instance == null) {
			SingletonClass.instance = new SingletonClass();
		}
		return SingletonClass.instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public Airport getAirport() {
		if (this.airport == null) {
			this.airport = new Airport("İstanbul");
		}
		return this.airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	
}
