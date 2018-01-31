package com.kosta.java0729;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HiEventTest extends Frame implements ActionListener{

	Checkbox checkbox1, checkbox2, checkbox3;
	CheckboxGroup checkboxGroup;
	Panel panel1, panel2, panel3;
	Button button1, button2, button3;
	TextField field;
	BorderLayout borderLayout;
	GridLayout gridLayout;
	
	public HiEventTest(String title) {
		super(title);
		
		//객채 생성

		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		
		checkboxGroup = new CheckboxGroup();
		checkbox1 = new Checkbox("자바초급", true, checkboxGroup);
		checkbox2 = new Checkbox("자바중급", false, checkboxGroup);
		checkbox3 = new Checkbox("자바고급", false, checkboxGroup);
		
		field = new TextField(15);
		
		button1 = new Button("안녕");
		button2 = new Button("지우기");
		button3 = new Button("종료");
		
		borderLayout = new BorderLayout();
		gridLayout = new GridLayout(3, 0);
		
		//속성설정
		panel1.setBackground(Color.orange);
		panel2.setBackground(Color.pink);
		 
		setLayout(borderLayout);
		panel3.setLayout(gridLayout);
		
		add("North", panel1);
			panel1.add(field);
			
		add("Center", panel3);
//			panel3.add("Center", new Checkbox("자바초급", checkboxGroup, true));
			panel3.add("Center", checkbox1);
			panel3.add("Center", checkbox2);
			panel3.add("Center", checkbox3);
			
		add("South", panel2);
			panel2.add(button1);
			panel2.add(button2);
			panel2.add(button3);

		//마무리
		
		setVisible(true);
		setSize(500, 500);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		checkbox1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				field.setText(checkbox1.getLabel()+"안녕 !");
			}
		});
		
		checkbox2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				field.setText(checkbox2.getLabel()+"안녕 !");
			}
		});
		
		checkbox3.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				field.setText(checkbox3.getLabel()+"안녕 !");
			}
		});
	}
	
	public void actionPerformed(ActionEvent e){
		
		Object ob = e.getSource();
//
//		if(ob==button1){
//			Checkbox checkboxC=checkboxGroup.getSelectedCheckbox();
//			field.setText(checkboxC.getLabel()+"안녕 !");
//		}
//			
		if(ob == button2){
			field.setText("");
			field.setEditable(false);
		}
		else
			System.exit(0);
	}

	public static void main(String[] args) {
		new HiEventTest("안녕 이벤트");
	}
}
