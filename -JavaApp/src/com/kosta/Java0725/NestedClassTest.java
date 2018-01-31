package com.kosta.Java0725;


class NestingClass{//외부 클래스
	int i = 11;
	void hello(){
		System.out.println("외부 클래스 안녕");
		
		NestedClass nestedClass = new NestedClass();
		nestedClass.print();
	}
	
	class NestedClass{//내부 클래스
		int j =22;
		void print(){
			System.out.println("내부 클래스 프린트");
			System.out.println("j = " +j);
			System.out.println("I = " +i);
//			hello();
		}
	}
	
}
public class NestedClassTest {//중첩클래스 테스트

	public static void main(String[] args) {
		NestingClass nestingClass = new NestingClass();
//		nestingClass.hello();
		
		NestingClass.NestedClass nestedClass = new NestingClass().new NestedClass();
		nestedClass.print();
		
		
	}
}
