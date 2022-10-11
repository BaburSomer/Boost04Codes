package com.bilgeadam.course04.lesson33;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {
		System.out.println("Sunucu çalıştı");
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port);) {  // sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz
			Socket socketToClient = serverSocket.accept();
			System.out.println(socketToClient + " port'u üzerinden istemci ile iletişim kuruldu");
			
			OutputStream os = socketToClient.getOutputStream();
			PrintWriter sender = new PrintWriter(os, true);
			while (true) {
				sender.println(LocalDateTime.now());
				Thread.sleep(3000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sunucu durdu");
	}
}
