package com.kosta.java0810.classio.Serialization;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String host = "naver.com";
			InetAddress ia = InetAddress.getByName(host);

			System.out.println("호스트 이름 : " + ia.getHostName());
			System.out.println("호스트 주소 : " + ia.getHostAddress());
			System.out.println("-===================================-");
			
			InetAddress addrs [] = InetAddress.getAllByName(host);
			
			for (int i = 0; i < addrs.length; i++) {
				System.out.println(addrs[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
