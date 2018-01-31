package com.kosta.java0726;

public class StringConvertTest {//문자열 변환 테스트
	
	public void convert1(){ //두개의 고정문자열을 +연산을 이용하여 합성
		String s1 = "우리나라";
		String s2 = "대한민국만세~!";
		s1 += s2; //+연산을 통한 재할당
		System.out.println(s1);
		
		//1.Sting class 객체생성
		//2. 문자열 변환을 위해 임시로 StringBuffer class 객체 생성
		//3. StringBuffer class의 append()를 실행
		//4. 변환된 결과가 StringBuffer에 담기고, String으로 변환
		//5. 임시로 생성된 StringBuffer class 객체를 소멸
		
	}
	
	public void convert2(){ //가변문자열을 이용한 문자열 합성이 고정문자열을 이용한 문자열 합성보다 훨씬 효과적
		StringBuffer buffer = new StringBuffer("우리나라");
		buffer.append("대한민국만세!!");
		System.out.println(buffer);
		
		//1. StringBuffer클래스 객체생성
		//2. append()메소드 실행. 
		
	}
	
	public static void main(String[] args) {
		
		StringConvertTest convertTest = new StringConvertTest();
		
		System.out.println("두개의 String 문자열과 + 연산자를 이용한 문자열 합성");
		convertTest.convert1();
		
		System.out.println("=========================");
		
		System.out.println("StringBuffer class의 append()메소드를 이용한 문자열 합성 ");
		convertTest.convert2();
	}

}
