package com.kostar.j1101;

public class My {
	A obj;

	public My() {
		System.out.println("MyŬ���� �⺻������");
	}

	public My(A obj) {
		System.out.println("MyŬ���� �����ε� ������");
		System.out.println("�������̽� A��ü ����");
		this.obj = obj;
	}

	public void setObj(A obj) {
		this.obj = obj;
	}

	public void sayHello() {
		obj.hello();
	}

}
