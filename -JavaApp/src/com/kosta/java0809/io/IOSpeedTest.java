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
			//������ byte ������ i/o
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("b.txt");
			
			long startTime = System.currentTimeMillis();
			
//			int i;
//			//a.txt�� 1byte�� �о b.txt�� ����
//			while((i = fis.read())!= -1){
//				fos.write(i);
//			}
			
			//������ char ������ i/o
			fr = new FileReader("a.txt");
			
			fw = new FileWriter("b.txt");
			
//			int j;
//			while((j = fr.read())!= -1){
//				fw.write(j);
//			}
			
			//String�� ���ؼ� i/o�� �����ϴ� class�� img�� ���� i/o�� ���� �� �� ����.
			br = new BufferedReader(new FileReader("image/gong.jpg"));
			bw = new BufferedWriter(new FileWriter("image/you.jpg"));
			
			//������ ���� �ϱ� ���ؼ��� binary�� �����Ͽ�����
			
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
			System.out.printf("�ҿ� �ð� %d" , (endTime-startTime));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new IOSpeedTest();
	}

}
