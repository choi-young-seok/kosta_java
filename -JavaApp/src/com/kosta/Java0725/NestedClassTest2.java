package com.kosta.Java0725;


class NestingClass2{//�ܺ� Ŭ����
	static int i = 11;
	void hello(){
		System.out.println("�ܺ� Ŭ���� �ȳ�");
		
		NestedClass2 nestedClass2 = new NestedClass2();
		nestedClass2.print();
	}
	
	static class NestedClass2{//���� ��ø Ŭ����
		int j =22;
		void print(){
			System.out.println("���� Ŭ���� ����Ʈ");
			System.out.println("j = " +j);
			System.out.println("I = " +i);
//			hello();
		}
	}
	
}
public class NestedClassTest2 {//��øŬ���� �׽�Ʈ

	public static void main(String[] args) {
		NestingClass2 nestingClass2 = new NestingClass2();
//		nestingClass.hello();
		
		NestingClass2.NestedClass2 nestedClass2 = new NestingClass2.NestedClass2();
		nestedClass2.print();
		
		
	}
}
