package com.bilgeadam.course04.lesson28.atm.controller.init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.bilgeadam.course04.lesson28.atm.model.BankCustomer;

public class DataRepository {
	public static final String DATA_FILE = "C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\Deneme Dosyaları\\customer.data";

	public static void save(List<BankCustomer> customers) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DataRepository.DATA_FILE))) {
			oos.writeObject(customers);
		} catch (FileNotFoundException e) {
			System.err.println("Dosya yaratırken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (IOException e) {
			System.err.println("Dosya yazarken hata oluştu: <<<" + e.getMessage() + ">>>");
		}
	}

	@SuppressWarnings("unchecked")
	public static List<BankCustomer> load() {
		LinkedList<BankCustomer> data = new LinkedList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DataRepository.DATA_FILE))) {
			data = (LinkedList<BankCustomer>)ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Dosya okurken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (IOException e) {
			System.err.println("Dosya okurken hata oluştu: <<<" + e.getMessage() + ">>>");
		} catch (ClassNotFoundException e) {
			System.err.println("Dosya okurken hata oluştu: <<<" + e.getMessage() + ">>>");
		}
		
		return data;
	}
}
