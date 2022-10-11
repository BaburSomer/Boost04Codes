package com.bilgeadam.course04.lesson23.serialization;

// eğer elle serialize etmek istersek farklı bir interface kullanmamız gerekli: Externalizable

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.bilgeadam.course04.lesson23.CommonData;

public class SerializeDeserializeExample {
	private TreeMap<String, Person> persons;
	private File serializedFile;
	
	public SerializeDeserializeExample() {
		super();
		this.persons = new TreeMap<>();
		this.serializedFile = new File(CommonData.MAIN_WORKING_DIRECTORY + "\\persons.ser");
	}

	public static void main(String[] args) {
		SerializeDeserializeExample example = new SerializeDeserializeExample();
//		example.createInitialData();
//		example.serializePerson();
		example.deserializePerson();
		example.listData();
		example.addAdditionalData();
		example.listData();
		example.serializePerson();
		System.out.println("bye ...");
	}

	private void listData() {
		System.out.println("Kişi listesi");
		System.out.println("============");
		Set<Entry<String, Person>> entries = this.persons.entrySet();
		for (Entry<String, Person> entry : entries) {
			System.out.println(entry);
		}
		System.out.println();
	}

	private void addAdditionalData() {
		Person p = new Person("zzzzz", 1988, 1);
		p.addAddress(new Address("Türkiye", "İstanbul", 34056, "Bağdat Caddesi"));
		this.persons.put(p.getName(), p);
	}

	@SuppressWarnings("unchecked")
	private void deserializePerson() {
		FileInputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(this.serializedFile);
			ois = new ObjectInputStream(is);
			this.persons = (TreeMap<String, Person>)ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Dosya yaratırken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (IOException e) {
			System.err.println("Kişileri deserialize ederken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (ClassNotFoundException e) {
			System.err.println("Persons listesi yaratılırken hata oluştu: <<<" + e.getMessage() + ">>>");
		}
		finally {
			try {
				if (is != null) {
					is.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void serializePerson() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.serializedFile))) { 
			oos.writeObject(this.persons);
		} catch (FileNotFoundException e) {
			System.err.println("Dosya yaratırken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (IOException e1) {
			System.err.println("Kişileri serialize ederken hata oluştu: <<<" + e1.getMessage() + ">>>");
		}
	}

	private void createInitialData() {
		Address a1 = new Address("Türkiye", "Ankara", 06100, "Cinnah");
		Address a2 = new Address("Türkiye", "İstanbul", 34000, "Beyoğlu");
		Address a3 = new Address("Türkiye", "İzmir", 35000, "Kordon");
		Address a4 = new Address("Türkiye", "Ankara", 06100, "Çankaya");

		Person p1 = new Person("aaaaa", 2020, 2);
		p1.addAddress(a1);
		p1.addAddress(a4);
		this.persons.put(p1.getName(), p1);
		
		Person p2 = new Person("bbbbbb", 2001, 3);
		p2.addAddress(a1);
		p2.addAddress(a3);
		this.persons.put(p2.getName(), p2);

		Person p3 = new Person("bbccccbbbb", 1998, 4);
		p3.addAddress(a1);
		p3.addAddress(a2);
		p3.addAddress(a3);
		p3.addAddress(a4);
		this.persons.put(p3.getName(), p3);

	}
}
