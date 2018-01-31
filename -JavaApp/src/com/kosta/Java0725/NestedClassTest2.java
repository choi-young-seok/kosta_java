package com.kosta.Java0725;


class NestingClass2{//외부 클래스
	static int i = 11;
	void hello(){
		System.out.println("외부 클래스 안녕");
		
		NestedClass2 nestedClass2 = new NestedClass2();
		nestedClass2.print();
	}
	
	static class NestedClass2{//정적 중첩 클래스
		int j =22;
		void print(){
			System.out.println("내부 클래스 프린트");
			System.out.println("j = " +j);
			System.out.println("I = " +i);
//			hello();
		}
	}
	
}
public class NestedClassTest2 {//중첩클래스 테스트

	public static void main(String[] args) {
		NestingClass2 nestingClass2 = new NestingClass2();
//		nestingClass.hello();
		
		NestingClass2.NestedClass2 nestedClass2 = new NestingClass2.NestedClass2();
		nestedClass2.print();
		
		
	}
}
