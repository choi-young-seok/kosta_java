package com.kosta.java0808.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayInputOutputTest {
	public static void main(String[] args) throws Exception {
		//"a.txt"를 byte단위로 읽음
		FileInputStream fis = new FileInputStream("a.txt");
		
		//파일 읽기----------------------------------
		int i;
//		while((i=fis.read()) != -1){
//			System.out.print((char)i);
////			System.out.write(i);
////			System.out.flush();
//		}
//		System.out.println();
		System.out.println("=======================");
		
		//fis.read(byte b[]);
//		fis의 read()는 fis를 통해 읽은 a.txt의 코드(최대 바이트배열 크기 만큼)를 byte배열 b에 저장
//		리턴 값은 read()를 통해 읽은 바이트 수를 리턴 (b.length)
		byte b [] = new byte[5]; //fis.read()는 선언된 배열의 크기만큼씩 읽음
//		System.out.println(fis.read(b)); //4
//		System.out.println(fis.read(b)); //-1
//		System.out.println(fis.read(b)); //-1
		
//		while((i = fis.read(b)) != -1){
//			System.out.println(new String(b));
//		}
//
//		System.out.println("=======================");
//		for (int j = 0; j < b.length; j++) {
//			System.out.println("b["+j+"]번지 = " + b[j]);
//		}
//		
		System.out.println("=======================");
		
//		fis.read(byte[] b, int offset, int length) : offset : 상대위치
		//byte배열 b의  offset : 3번지 부터 시작해서 2개를 저장 -> 3,4번지 저장
		//배열 byte b 에는 0번지부터 1, 1번지에는 2 ... 9번지에는 10이 저장되어있으며,
		//fis.read(b,3,2)로 읽은 결과 0,1,2 번지는 비운후, 3번지부터 1을 읽기 시작하여 2까지 저장한다.
		fis.read(b, 3, 2);
		for (int j = 0; j < b.length; j++) {
			System.out.println("b["+j+"]번지 = " + b[j]);
		}
		
		System.out.println("=======================");
		//출력 객체 테스트----------------------------
		byte b2[] = {97,98,99,100};
		FileOutputStream fos = new FileOutputStream("b.txt");
		//만약 b.txt파일이 없다면 해당경로에 b.txt파일을 생성
		
//		fos.write(b2); //b2배열의 값을 읽어서 b.txt에 출력
//		fos.write(b2, int offset, int lenght);		
//		fos.write(b2,2,1); //읽기 시작할 배열의 번지수 (offset : 2), 부터 읽을 문자의 개수 (length : 1)
		
		fos.write(97);
		
		
	}
}
