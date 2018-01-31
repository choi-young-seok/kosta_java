package com.kosta.calc.model;
//���� �� ������� ���� � ��?
//� �信���� ��� �� �� �ִ� Ŭ���� ��
public class Calculator {

	private int num1;
	private int num2;
	private String operator;
	private int result;
	
	public Calculator(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
		choice();
	}
	
	public void choice(){
		if(operator.equals("+")){
			plus();
		}
		else if(operator.equals("-")){
			minus();
		}
		else if(operator.equals("*")){
			multiple();
		}
		else {
			divide();
		}
	}
	
	public String getResult(){
		return "����� :" + num1 + operator + num2 + "=" + result;
	}
	
	public void plus(){
		result = num1+num2;	
	}
	public void minus(){
		result = num1-num2;
	}
	public void multiple(){
		result = num1*num2;
	}
	public void divide(){
		result = num1/num2;
	}
	
}
