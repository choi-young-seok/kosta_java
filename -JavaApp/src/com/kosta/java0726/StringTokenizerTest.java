package com.kosta.java0726;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//��ū :  ������ ������ �Ǵ� ������
		//ex) , - / \ 
		
		String str = "010-3338-5525";
		String str2 = "";

		StringTokenizer stringTokenizer = new StringTokenizer(str, "");

/*		do { 
			if(stringTokenizer.hasMoreTokens()){
				System.out.println(stringTokenizer.nextToken());
			}
			else{
				System.out.println("�����մϴ�.");
			}
		}while(stringTokenizer.hasMoreTokens());*/
		
		while(stringTokenizer.hasMoreTokens())
		{
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
