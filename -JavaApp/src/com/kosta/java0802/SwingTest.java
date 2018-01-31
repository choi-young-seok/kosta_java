package com.kosta.java0802;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame{
	/*
	   <Swing�� Ư¡>
	   1. awt : ���������� c�� ���� �ü������ ����ϰ� �ִ� ���־� ������Ʈ���� ���.
	   
	   Swing : ���� �ڹپ��� ������� ������Ʈ���� ����.
	   		   (�ü���� ������� ���� ����� ������)
	   		   
	   2. ��Ű�� : 
	   		   AWT : java.awt.*;
	   		   Swing : javax.swing.*;
	   		   ->javax : x(eXtention)Ȯ��, x(eXqution)����
	   3. �Ϲ������� awt�� ������Ʈ �տ� �빮�� 'J'�� ���� Ŭ��������
	   		   ex) Button = JUutton
	   		   
	*/
	
	JButton button;
	
	public SwingTest(String title) {
		super(title);
		
		button = new JButton("<html><font size=10 face=�ü�ü color=red>����ư</font><br>" 
				+"<font size=10 face����ü color=blue>����ư</font></html>");
		
		setLayout(new FlowLayout());
		add(button);
		
		setBounds(300,200,300,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest("swing Test");
	}

}
