package com.kosta.Java0722;

abstract class Shape{
	abstract void draw();
	
	void hello()
	{
		System.out.println("130±â ¾È³ç");
	}
}

class Rectangle extends Shape{
	
	void draw()
	{
		System.out.println("³×¸ð³×¸ð");
	}
}//Rectangle

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("¼¼¸ð¼¼¸ð");
	}
}//Triangle

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("µÕ±ÛµÕ±Û");
		
	}
}//Circle

public class AbstractTest {

	public static void main(String args[])
	{
		Shape s ;
		s = new Rectangle();
		s.draw();
		s = new Triangle();
		s.draw();
		s = new Circle();
		s.draw();
		
	}
}