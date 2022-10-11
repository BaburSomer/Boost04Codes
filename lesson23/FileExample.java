package com.bilgeadam.course04.lesson23;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File(CommonData.MAIN_WORKING_DIRECTORY);
		
		try {
			if (file.createNewFile())
				System.out.println("İstenilen dosya oluşturuldu");
			else
				System.out.println("İstenilen dosya oluşturulamadı");
			if (file.exists()) {
				System.out.println("Böyle bir dosya var");
				if (file.isDirectory()) {
					System.out.println(".... ve bu bir klasör");
					File newFile = new File(file, "My Third File.txt");
					if (newFile.createNewFile())
						System.out.println("İstenilen dosya oluşturuldu");
					else
						System.out.println("İstenilen dosya oluşturulamadı");
					
					String[] files = file.list();
					for (String fileName : files) {
						System.out.println(fileName);
					}
				}
				else {
					System.out.println(".... ve bu bir dosya");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
