package com.bilgeadam.course04.lesson33;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeInfo implements Runnable {

	private Socket socketToClient;
	private int clientId;

	public TimeInfo(Socket socketToClient, int clientId) {
		this.socketToClient = socketToClient;
		this.clientId = clientId;
	}

	@Override
	public void run() {
		System.out.println(socketToClient + " port'u üzerinden istemci - " + this.clientId + " ile iletişim kuruldu");
		System.out.println("İstemci - " + this.clientId + "'nin calıştığı thread:  " + Thread.currentThread().getName()
				+ " in " + Thread.currentThread().getThreadGroup());

		try (PrintWriter sender = new PrintWriter(socketToClient.getOutputStream(), true);) {
			while (true) {
				sender.println(LocalDateTime.now());
				Thread.sleep(3000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
