package com.kosta.java0809.swing.io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrowMoveTest extends JFrame implements ActionListener{
	JLabel la;
	JButton bt;
	int x=0, y=0;
	boolean flag = true;
	
	ThreadTimer threadTimer;
	
    public ArrowMoveTest() {

//    	threadTimer =new ThreadTimer();
		threadTimer = new ThreadTimer(this);
		ImageIcon icon = new ImageIcon("image/right.gif");
		la = new JLabel(icon);      
		la.setBounds(0, 0, 60, 60);
		bt = new JButton("������");
		bt.setBounds(0,400,80,60);
       
		setTitle("�����̴�ȭ��ǥ");
       
		setLayout(null);
		add(la);
       	add(bt);
       
       	setBounds(200,100,500,500);
       	setVisible(true);
       	setDefaultCloseOperation(EXIT_ON_CLOSE);
	       
       	bt.addActionListener(this);
	}//������


	@Override
	public void actionPerformed(ActionEvent e) {
		threadTimer.start();
	}//�ڵ鷯
	
	public static void main(String[] args) {
		new ArrowMoveTest();
	}//main
}//class