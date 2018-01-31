package com.kosta.Java0722;

abstract class Shape{
	abstract void draw();
	
	void hello()
	{
		System.out.println("130�� �ȳ�");
	}
}

class Rectangle extends Shape{
	
	void draw()
	{
		System.out.println("�׸�׸�");
	}
}//Rectangle

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("���𼼸�");
	}
}//Triangle

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("�ձ۵ձ�");
		
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