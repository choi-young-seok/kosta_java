package com.kosta.java0727;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector v = new Vector(5,3);
		
/*		
		System.out.println("벡터의 방크기 : " + v.capacity());
		System.out.println("벡터의 요소(데이터)갯수 : " + v.size());*/
		
		String name = null;
		v.add(name);
		System.out.println(v.get(0));
	}
}
