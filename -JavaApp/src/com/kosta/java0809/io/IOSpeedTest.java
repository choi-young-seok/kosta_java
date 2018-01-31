package com.kosta.java0809.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOSpeedTest {
	FileInputStream fis;
	FileOutputStream fos;
	
	FileReader fr;
	FileWriter fw;
	
	BufferedReader br;
	BufferedWriter bw;
	
	public IOSpeedTest() {
		try {
			//파일을 byte 단위로 i/o
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("b.txt");
			
			long startTime = System.currentTimeMillis();
			
//			int i;
//			//a.txt를 1byte씩 읽어서 b.txt에 복사
//			while((i = fis.read())!= -1){
//				fos.write(i);
//			}
			
			//파일을 char 단위로 i/o
			fr = new FileReader("a.txt");
			
			fw = new FileWriter("b.txt");
			
//			int j;
//			while((j = fr.read())!= -1){
//				fw.write(j);
//			}
			
			//String에 대해서 i/o를 진행하는 class로 img에 대한 i/o는 진행 할 수 없다.
			br = new BufferedReader(new FileReader("image/gong.jpg"));
			bw = new BufferedWriter(new FileWriter("image/you.jpg"));
			
			//사진을 복사 하기 위해서는 binary로 복사하여야함
			
			String str;
			while((str = br.readLine()) != null){
				bw.write(str);
			}
			
			fis.close();
			fos.close();
		
			fr.close();
			fw.close();
			
			br.close();
			bw.close();
			

			long endTime = System.currentTimeMillis();
			System.out.printf("소요 시간 %d" , (endTime-startTime));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new IOSpeedTest();
	}

}
