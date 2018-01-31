package com.kosta.java0726;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//토큰 :  구분의 기준이 되는 데이터
		//ex) , - / \ 
		
		String str = "010-3338-5525";
		String str2 = "";

		StringTokenizer stringTokenizer = new StringTokenizer(str, "");

/*		do { 
			if(stringTokenizer.hasMoreTokens()){
				System.out.println(stringTokenizer.nextToken());
			}
			else{
				System.out.println("종료합니다.");
			}
		}while(stringTokenizer.hasMoreTokens());*/
		
		while(stringTokenizer.hasMoreTokens())
		{
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
