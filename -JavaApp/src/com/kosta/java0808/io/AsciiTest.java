package com.kosta.java0808.io;

public class AsciiTest { //�ڵ� ���ڿ� ���εǴ� ���ڸ� ȭ�鿡 ���
	
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
