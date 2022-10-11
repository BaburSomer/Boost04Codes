package com.bilgeadam.course04.lesson23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {

	public static void main(String[] args) {
		File letterFile = new File(CommonData.MAIN_WORKING_DIRECTORY, "mektup1.txt");
		BufferedReader reader = null;
		if (letterFile.exists()) {
			try {
				FileReader fileReader = new FileReader(letterFile); // harf-harf okumak için bir Reader kullanırız
																	// bu okumayı da bir dosyadan yaptığımız için
																	// FileReader kullanıyoruz
				reader = new BufferedReader(fileReader); // okuma işlemini performanslı ve optimal
															// şekilde yapabilmek için

				while (true) {
					String line = reader.readLine(); // reader bir dosyadan satır satır okur
					if (line == null) {
						break;
					} // eğer dosyanın sonuna vardıysak son gelen bilgi "NULL"dır
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.err.println("Dosya bulunamadı");
			} catch (IOException e) {
				System.err.println("Okuma / yazma hatası");
			}
		} else {
			System.err.println("Aradığınız dosya bulunamadı");
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("bye...");
	}
}
