package com.bilgeadam.course04.lesson17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.bilgeadam.course04.lesson17.model.AnimalProductType;
import com.bilgeadam.course04.lesson17.model.BakeryProduct;
import com.bilgeadam.course04.lesson17.model.Cheese;
import com.bilgeadam.course04.lesson17.model.Customer;
import com.bilgeadam.course04.lesson17.model.Employee;
import com.bilgeadam.course04.lesson17.model.MilkProduct;
import com.bilgeadam.course04.lesson17.model.Perishable;
import com.bilgeadam.course04.lesson17.model.Person;
import com.bilgeadam.course04.lesson17.model.Product;
import com.bilgeadam.course04.lesson17.model.UnitType;

public class MMMMMBakkal {
	private Set<Person> persons; // her bir person'dan sadece bir adet olabilecek
	private Map<String, Customer> customersById;
	private Map<String, Customer> customersByFullName;
	private List<Product> products; // bir ürün istendiği kadar listeye eklenebilir
	private List<Perishable> perishibleProducts;
	
	public MMMMMBakkal() {
		this.persons = new HashSet<>();
		this.customersByFullName = new TreeMap<>(); // isme göre sıralı bir map oluşturacak;
		this.customersById = new LinkedHashMap<>(); // giriş sırasına göre sıralı
		this.products = new ArrayList<>();			// ürün listesi çok sık değişmeyen ama sürekli sorgulanan bir liste
		this.perishibleProducts = new LinkedList<>();	// bozulabilir ürün listesi sıklıkla yeni öğelerin eklendiği veya çıkartıldığı 
														// bir liste
	}

	public static void main(String[] args) {
		MMMMMBakkal bakkal = new MMMMMBakkal();
		bakkal.addCustomers();
		bakkal.addEmployees();
		bakkal.addProducts();
		
		bakkal.listCustomers();
		bakkal.listEmployees();
		Customer c = bakkal.findCustomerByFullName("Babür Somer");
		System.out.println(c);
		c = bakkal.findCustomerById("MÜŞ-0001");
		if (c != null) {
			System.out.println(c);
			c.setLastName("SOMER");
		}
		else {
			System.out.println("Müşteri bulunamadı");
		}
		
		System.out.println(bakkal.findCustomerByFullName("Babür Somer"));
	}

	private void addProducts() {
		MilkProduct mProd = new Cheese("Beyaz Peynir", UnitType.KG, 50, 5, LocalDate.of(2022, 9, 5), AnimalProductType.COW, false, false);
		this.products.add(mProd);
		this.perishibleProducts.add(mProd);
		
		Product prod = new BakeryProduct("Pasta", UnitType.PACKAGE, 120, 5, LocalDate.of(2022, 8, 23));
		this.products.add(prod);
//		this.perishibleProducts.add(prod);  OLMAZ çünkü bu liste sadece bozulabilir arayüzünü implemente eden ürünleri barındırabiliyor
	}

	private Customer findCustomerByFullName(String fullName) {
		Customer found = null;
		found = this.customersByFullName.get(fullName);
		return found;
	}

	private Customer findCustomerById(String id) {
		Customer found = null;
		found = this.customersById.get(id);
		return found;
	}
	
	private void listCustomers() {
		System.out.println("Müşteri Listesi");
		for (Person person : persons) {
			if (person instanceof Customer)
				System.out.println(person);
		}
	}

	private void listEmployees() {
		System.out.println("Çalışan Listesi");
		for (Person person : persons) {
			if (person instanceof Employee)
				System.out.println(person);
		}
	}
	
	private void addCustomers() {
		Customer c1 = new Customer("Babür", "Somer");
		this.persons.add(c1);
		this.customersById.put(c1.getId(), c1);
		this.customersByFullName.put(c1.getFullName(), c1);
		Customer c2 = new Customer("Ali", "Veli");
		this.persons.add(c2);
		this.customersById.put(c2.getId(), c2);
		this.customersByFullName.put(c2.getFullName(), c2);
	}
	private void addEmployees() {
		Employee empl = new Employee("Erşan", "Kuneri");
		this.persons.add(empl);
		empl = new Employee("Ayşe", "Fatma");
		this.persons.add(empl);
	}
}
