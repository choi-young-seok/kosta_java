package com.kosta.person.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputForm extends JFrame{
	public JButton button1,button2, button3;
	private JLabel label1, label2, label3;
	public JTextField field1, field2, field3;
	
	public InputForm(String title) {
		super(title);
		
		label1 = new JLabel("이름 : ");
		label1.setBounds(20, 30, 45, 45);
		label2 = new JLabel("나이 : ");
		label2.setBounds(20, 80, 45, 45);
		label3 = new JLabel("직업 : ");
		label3.setBounds(20, 130, 45, 45);
		
		button1 = new JButton("입력");
		button1.setBounds(20,200,65,40);
		button2 = new JButton("취소");
		button2.setBounds(105,200,65,40);
//		button3 = new JButton("수정");
//		button3.setBounds(20,200,65,40);
		
		field1 = new JTextField(10);
		field1.setBounds(70, 40, 80, 25);
		field2 = new JTextField(10);
		field2.setBounds(70, 90, 80, 25);
		field3 = new JTextField(10);
		field3.setBounds(70, 140, 80, 25);
		
		setLayout(null);
		
		add(label1);
		add(label2);
		add(label3);
		
		add(field1);
		add(field2);
		add(field3);
		
		add(button1);
		add(button2);
		
		setVisible(false);
		setBounds(300,200,200,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void initForm(){
		field1.setText(null);
		field2.setText(null);
		field3.setText(null);
		field1.requestFocus();//필드에 포커싱
	}
	
	public static void main(String[] args) {
		new InputForm("InputForm");
	}

}
