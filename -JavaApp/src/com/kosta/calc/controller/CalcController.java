package com.kosta.calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.kosta.calc.model.Calculator;
import com.kosta.calc.view.CalcView;

/*
	�ڡڡ�<��Ʈ�ѷ��� ����>
	1. ����� ��û�� �м�
	2. �並 ���� �Էµ� �����͸� ������
	3. �𵨰�ü������
	    - �޼ҵ�ȣ��
	    - ������� ������ ����
	4. �������̵�(������ �̵�)
	
	�߰�(�ɼ�): ��ȿ���˻�
*/
public class CalcController implements ActionListener{
	//�並 ���
	CalcView calcView;

	public CalcController() {
		//View��ü ���� 
		calcView = new CalcView("MVC model2 calculator Test");
		//View�� �̺�Ʈ ������ ���
		calcView.button1.addActionListener(this);
	}
	
	//View�� �̺�Ʈ �ڵ鷯
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calcView.button1){
			int num1 = Integer.parseInt(calcView.field1.getText());
			int num2 = Integer.parseInt(calcView.field2.getText());
			
			//Object Ÿ���� �ڷ����� ��ȯ�ϴ� ���
			//1.�ڽ� Ŭ���������� ���� ����ȯ
			//2.Object class�� toString�� �̿�
			String operator = (String)calcView.box.getSelectedItem();
//			String operator = calcView.box.getSelectedItem().toString();
			
			Calculator calculator = new Calculator(num1, num2, operator);
			String result = calculator.getResult();
			
			calcView.jLabel.setText(result);
		}
	}//actionPerformed
	public static void main(String[] args) {
		new CalcController();
	}

}
