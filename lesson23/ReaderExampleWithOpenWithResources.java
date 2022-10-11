package com.bilgeadam.course04.lesson23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExampleWithOpenWithResources {

	public static void main(String[] args) {
		File letterFile = new File(CommonData.MAIN_WORKING_DIRECTORY, "mektup.txt");
		if (letterFile.exists()) {
			
			// TRY with Resources
			try (BufferedReader reader = new BufferedReader(new FileReader(letterFile))) {
//			try (FileReader fileReader = new FileReader(letterFile); BufferedReader reader = new BufferedReader(fileReader);) {
				while (true) {
					String line = reader.readLine(); 
					if (line == null) {
						break;
					} 
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
		System.out.println("bye...");
	}
}
