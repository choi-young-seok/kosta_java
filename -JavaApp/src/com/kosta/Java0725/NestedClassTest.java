package com.kosta.Java0725;


class NestingClass{//�ܺ� Ŭ����
	int i = 11;
	void hello(){
		System.out.println("�ܺ� Ŭ���� �ȳ�");
		
		NestedClass nestedClass = new NestedClass();
		nestedClass.print();
	}
	
	class NestedClass{//���� Ŭ����
		int j =22;
		void print(){
			System.out.println("���� Ŭ���� ����Ʈ");
			System.out.println("j = " +j);
			System.out.println("I = " +i);
//			hello();
		}
	}
	
}
public class NestedClassTest {//��øŬ���� �׽�Ʈ

	public static void main(String[] args) {
		NestingClass nestingClass = new NestingClass();
//		nestingClass.hello();
		
		NestingClass.NestedClass nestedClass = new NestingClass().new NestedClass();
		nestedClass.print();
		
		
	}
}
