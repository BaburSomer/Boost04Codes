package com.bilgeadam.course04.lesson33;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		System.out.println("İstemci çalıştı");
		int port = 4711;
		String hostName = "localhost"; // 127.0.0.1
		
		try(Socket socketToServer = new Socket(hostName, port);) {
			System.out.println(socketToServer + " port'u üzerinden sunucu ile iletişim kuruldu");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("İstemci durdu");
	}

}
