package com.kosta.java0808.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayInputOutputTest {
	public static void main(String[] args) throws Exception {
		//"a.txt"�� byte������ ����
		FileInputStream fis = new FileInputStream("a.txt");
		
		//���� �б�----------------------------------
		int i;
//		while((i=fis.read()) != -1){
//			System.out.print((char)i);
////			System.out.write(i);
////			System.out.flush();
//		}
//		System.out.println();
		System.out.println("=======================");
		
		//fis.read(byte b[]);
//		fis�� read()�� fis�� ���� ���� a.txt�� �ڵ�(�ִ� ����Ʈ�迭 ũ�� ��ŭ)�� byte�迭 b�� ����
//		���� ���� read()�� ���� ���� ����Ʈ ���� ���� (b.length)
		byte b [] = new byte[5]; //fis.read()�� ����� �迭�� ũ�⸸ŭ�� ����
//		System.out.println(fis.read(b)); //4
//		System.out.println(fis.read(b)); //-1
//		System.out.println(fis.read(b)); //-1
		
//		while((i = fis.read(b)) != -1){
//			System.out.println(new String(b));
//		}
//
//		System.out.println("=======================");
//		for (int j = 0; j < b.length; j++) {
//			System.out.println("b["+j+"]���� = " + b[j]);
//		}
//		
		System.out.println("=======================");
		
//		fis.read(byte[] b, int offset, int length) : offset : �����ġ
		//byte�迭 b��  offset : 3���� ���� �����ؼ� 2���� ���� -> 3,4���� ����
		//�迭 byte b ���� 0�������� 1, 1�������� 2 ... 9�������� 10�� ����Ǿ�������,
		//fis.read(b,3,2)�� ���� ��� 0,1,2 ������ �����, 3�������� 1�� �б� �����Ͽ� 2���� �����Ѵ�.
		fis.read(b, 3, 2);
		for (int j = 0; j < b.length; j++) {
			System.out.println("b["+j+"]���� = " + b[j]);
		}
		
		System.out.println("=======================");
		//��� ��ü �׽�Ʈ----------------------------
		byte b2[] = {97,98,99,100};
		FileOutputStream fos = new FileOutputStream("b.txt");
		//���� b.txt������ ���ٸ� �ش��ο� b.txt������ ����
		
//		fos.write(b2); //b2�迭�� ���� �о b.txt�� ���
//		fos.write(b2, int offset, int lenght);		
//		fos.write(b2,2,1); //�б� ������ �迭�� ������ (offset : 2), ���� ���� ������ ���� (length : 1)
		
		fos.write(97);
		
		
	}
}
