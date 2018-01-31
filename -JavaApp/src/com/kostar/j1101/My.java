package com.kostar.j1101;

public class My {
	A obj;

	public My() {
		System.out.println("My클래스 기본생성자");
	}

	public My(A obj) {
		System.out.println("My클래스 오버로딩 생성자");
		System.out.println("인터페이스 A객체 생성");
		this.obj = obj;
	}

	public void setObj(A obj) {
		this.obj = obj;
	}

	public void sayHello() {
		obj.hello();
	}

}
