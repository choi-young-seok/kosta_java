package com.kosta.java0808.io;

public class ASCIIGetBytestEST {
	public static void main(String[] args) {
		String str = "Hi Java Stream!";
		
		byte b[] = str.getBytes();
//		for (int i = 0; i < b.length; i++) {
//			System.out.write(b[i]);
//			if(i%3==2){
//				System.out.println('\n'); //3개의 문자 출력 후 줄바꿈
//			}
//		}
		System.out.write(97);
		System.out.flush();
		System.out.close();
	}

}
