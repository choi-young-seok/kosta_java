package com.kosta.java0727;

class MyException1 extends Exception{ //����� ���� ���� Ŭ����
	
	public MyException1(String msg) {
		super(msg);
	}
}

class MyException2 extends Exception{
	
	public MyException2(String msg) {
		super(msg);
	}
}

public class UserExceptionTest {

	public static void main(String[] args) {
		int su = 3;
		try {
			if(su%2 ==0)
			{
				throw new MyException1("����� ¦�� ����");
			}
			else
			{
				throw new MyException2("����� Ȧ�� ����");
			}
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException2 e) {
			e.printStackTrace();
		}
	}
}
