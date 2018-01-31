package com.kosta.java0808.io;

public class AsciiTest { //코드 숫자에 매핑되는 문자를 화면에 출력
	
	public static void main(String[] args) {
		for (int i = 32; i < 126; i++) {
			System.out.write(i);
			if(i%8==7){
				System.out.write('\n');
			}
			else{
				System.out.write('\t');
			}
		}
	}
}
