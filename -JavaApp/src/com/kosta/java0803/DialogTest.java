package com.kosta.java0803;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogTest extends JFrame{
	JButton button;
	JOptionPane jOptionPane;
	public DialogTest(String title) {
		super(title);
		button = new JButton("나버튼");
		jOptionPane = new JOptionPane();
		
		setLayout(new FlowLayout());
		add(button);
		
		//					//다이얼로그 창이 뜨는 위치가 되는 컴포넌트명,전달 하고자 하는 메세지
		//JOptionPane.showMessageDialog(Component parentComponent,Object message);

		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JOptionPane.showMessageDialog(button,"여러분 고생이 많아요~!!");
//		jOptionPane.showInputDialog(parentComponent, message)
		
		String food = jOptionPane.showInputDialog(this, "좋아하는 음식은?");
		System.out.println("food : "+ food);
		jOptionPane.showInputDialog(this, "계산동 큰손 쭈꾸미 좋아요");
		
	}
	public static void main(String[] args) {
		new DialogTest("Dialog Test");
	}
}
