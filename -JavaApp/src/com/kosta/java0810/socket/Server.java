package com.kosta.java0810.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	ServerSocket ss;

	public Server() throws IOException {
		ss = new ServerSocket(6000);
	}//생성자

	@Override
	public void run() {
		try {
			while (true) {
				Socket s = ss.accept();
				Service ser = new Service(s);
			}//while
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//run

	class Service extends Thread {
		OutputStream out;
		BufferedReader in;

		public Service(Socket s) {
			try {
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			start();
		}// 내부 클래스 생성자
		
		public void run(){
			try {
				String fromClient = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//내부 클래스 run
	}// 내부 클래스

}//class
