package com.kosta.java0809.swing.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIo {
	
	FileInputStream fis;
	FileOutputStream fos;
	
	public FileIo() {
		 try {
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("b.txt");
			
			int i;
			byte b[] = new byte[1024];
			while((i = fis.read(b))!= -1){
				fos.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
