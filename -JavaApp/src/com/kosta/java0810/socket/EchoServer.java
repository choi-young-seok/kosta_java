package com.kosta.java0810.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// 서버 소켓 객체 생성
		try {
			ServerSocket ss = new ServerSocket(5000);
			System.out.println("서버 동작 중");

			Socket s = ss.accept(); // client접속에 반응하는 메소드
			InetAddress ia = s.getInetAddress();
			System.out.println("접속한 주소 : " +ia.getHostAddress());
			
			OutputStream out = s.getOutputStream();
			InputStream is = s.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			
			String fromClient = in.readLine();
			System.out.println("client : " + fromClient);
			
			String message = "1111\n";
			out.write(message.getBytes());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
