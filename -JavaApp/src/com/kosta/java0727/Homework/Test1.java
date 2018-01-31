package com.kosta.java0727.Homework;

import java.util.Vector;

public class Test1 {

	Vector<String> strings;
	 
	public Test1() {
		strings =  new Vector<>();
	}
	
	public void insert(String name)
	{
		strings.add(name);
		System.out.println(name);
	}
	public void select(){
		for (int i = 0; i < strings.size(); i++) {
			System.out.println( i+":"+  strings.get(i));
		}
	}
}
