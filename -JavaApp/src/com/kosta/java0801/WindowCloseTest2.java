package com.kosta.java0801;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseTest2 extends WindowAdapter{
	Frame frame;
	
	public WindowCloseTest2(String title) {
		frame = new Frame();
		frame.setTitle(title);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		 //this�� �̺�Ʈ �ڵ鷯�� ��ġ
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new WindowCloseTest2("������â �̺�Ʈ");
	}

}
