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
		button = new JButton("����ư");
		jOptionPane = new JOptionPane();
		
		setLayout(new FlowLayout());
		add(button);
		
		//					//���̾�α� â�� �ߴ� ��ġ�� �Ǵ� ������Ʈ��,���� �ϰ��� �ϴ� �޼���
		//JOptionPane.showMessageDialog(Component parentComponent,Object message);

		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JOptionPane.showMessageDialog(button,"������ ����� ���ƿ�~!!");
//		jOptionPane.showInputDialog(parentComponent, message)
		
		String food = jOptionPane.showInputDialog(this, "�����ϴ� ������?");
		System.out.println("food : "+ food);
		jOptionPane.showInputDialog(this, "��굿 ū�� �޲ٹ� ���ƿ�");
		
	}
	public static void main(String[] args) {
		new DialogTest("Dialog Test");
	}
}
