package com.kosta.java0808.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("b.txt");
			
			byte b [] = new byte[512];
			int i; // fis.read�� a.txt�� �ѹ���Ʈ�� �о i�� ����
			while((i = fis.read(b)) != -1){
				fos.write(b,0,i); //0�������� �迭�� ����(i)���� ����
				fos.close();
			}
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally {

		}
		

	}
}
