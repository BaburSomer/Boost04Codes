package com.bilgeadam.course04.lesson23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataOutputExample {

	public static void main(String[] args) {

		List<Double> data = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(CommonData.MAIN_WORKING_DIRECTORY, "data.txt")))){
			while (true) {
				String line = reader.readLine();
				if (line == null) { break; }
				try {
					double value = Double.parseDouble(line);
					data.add(value);
				}
				catch (NumberFormatException e) {
					System.err.println("<<< " + line + " >>> doğru şekilde okunamadı. Bşr sonraki veri ile devam ediyorum.");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (DataOutputStream out = new DataOutputStream(			// byte'ları obje olarak yazmak için Data yöntemlerini 
																	// kullanmayı sağlıyoruz
										new BufferedOutputStream(	// performant bir şekilde yazmak için buffer kullanıyoruz
											new FileOutputStream(	// byte olarak yazmak için stream açıyoruz
												new File(CommonData.MAIN_WORKING_DIRECTORY, "data.dat"))))) {  // dosya objesi
			for (Double value : data) {
				out.writeDouble(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (DataInputStream in = new DataInputStream( //byte'ları obje olarak okumak için Data yöntemlerini kullanıyoruz
										new BufferedInputStream( // performant bir şekilde okumak için buffer kullanıyoruz
												new FileInputStream(// byte olarak okumak için stream açıyoruz
														new File(CommonData.MAIN_WORKING_DIRECTORY, "data.dat"))))) { // dosya objesi
			while (in.available() > 0)	{	// okunabilecek veri boyutunu temsil ediyor
				double value = in.readDouble();
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
