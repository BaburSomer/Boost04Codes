package com.bilgeadam.course04.lesson33;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedTimeServer {

	public static void main(String[] args) {
		System.out.println("Sunucu çalıştı");
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port);) {  // sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz
			int clientCounter = 1;
			while (true) {
				Socket socketToClient = serverSocket.accept();
				TimeInfo timeInfo = new TimeInfo(socketToClient, clientCounter++);
				Thread timeInfoServerThread = new Thread(timeInfo, "Client - " + (clientCounter));
				timeInfoServerThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sunucu durdu");
	}
}
