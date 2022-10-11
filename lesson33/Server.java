package com.bilgeadam.course04.lesson33;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("Sunucu çalıştı");
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port);) {  // sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz
			Socket clientSocket = serverSocket.accept();
			System.out.println(clientSocket + " port'u üzerinden istemci ile iletişim kuruldu");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sunucu durdu");
	}

}
