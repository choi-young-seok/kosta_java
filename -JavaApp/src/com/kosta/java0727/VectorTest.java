package com.kosta.java0727;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector v = new Vector(5,3);
		
/*		
		System.out.println("������ ��ũ�� : " + v.capacity());
		System.out.println("������ ���(������)���� : " + v.size());*/
		
		String name = null;
		v.add(name);
		System.out.println(v.get(0));
	}
}
