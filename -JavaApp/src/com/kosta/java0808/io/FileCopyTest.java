package com.kosta.java0808.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("b.txt");
			
			byte b [] = new byte[512];
			int i; // fis.read가 a.txt를 한바이트씩 읽어서 i에 저장
			while((i = fis.read(b)) != -1){
				fos.write(b,0,i); //0번지부터 배열의 길이(i)까지 복사
				fos.close();
			}
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally {

		}
		

	}
}
