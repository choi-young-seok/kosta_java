package com.kosta.java0726;

class A{
	int su = 11;
}

class B extends A{
	int su = 22;
}

class C extends B{
	int su = 33;
}

public class InstanceofTest {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		if(a instanceof A){
			System.out.println("a는 A클래스 객체 O");
		}else {
			System.out.println("a는 A클래스 객체 X");
		}
	
	}
	
	
}
