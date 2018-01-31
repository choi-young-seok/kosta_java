package com.kosta.calc.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class CalcView extends JFrame{
	//객체 선언
	public JTextField field1, field2;
	public JComboBox<String> box;
	public JButton button1;
	public JLabel jLabel;
	JList<String> li;
	
	public CalcView(String title) {
		super(title);
		li = new JList<>();
		
//		li.add
		field1 = new JTextField(4);
		field2 = new JTextField(4);
		box = new JComboBox<>();
			box.addItem("+");
			box.addItem("-");
			box.addItem("x");
			box.addItem("/");
		button1 = new JButton("계산");	
		jLabel = new JLabel("결과 : ");
		
		setLayout(new FlowLayout());
		
		add(field1);
		add(box);
		add(field2);
		add(button1);
		add(jLabel);
		
	
		setBounds(300,200,400,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}//생성자
}//클래스
