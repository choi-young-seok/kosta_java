package com.kosta.java0727.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	
	
	public static void main(String[] args)throws IOException {
		Test1 test1 = new Test1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		test1.insert(name);
		test1.select();
	}
}
