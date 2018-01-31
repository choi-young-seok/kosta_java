package com.kosta.java0810.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	
	public static void main(String[] args) {
		Socket s = null;
		try {
			 s = new Socket("192.168.0.107", 5000);
			
			System.out.println("서버연결 성공");
			
			OutputStream out = s.getOutputStream();//서버로 데이터 전송[byte 단위]
			InputStream is = s.getInputStream();//서버로부터 데이터 수신[byte 단위]
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			String message = "메세지 전송\n";
//			String message = "Exception in thread 'main' java.lang.Error: Unresolved compilation problem: \n";
			out.write(message.getBytes());
			
			String serverMsg = in.readLine();
			System.out.println("Server : " +serverMsg);
//			s.getOutputStream("서버안녕");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
