package com.kosta.java0801;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCloseTest extends Frame implements WindowListener{
	//������Ʈ ����

	public WindowCloseTest(String title) {
		super(title);
		
		//��ü ����
		
		//�Ӽ� �߰�
		
		//������ �޼ҵ�
		setSize(300,300);
		setVisible(true);
		
		//�̺�Ʈ ����
		
		//WindowEvent : �����찡 Ȱ��ȭ �Ǵ� ���� �� �߻��ϴ� �̺�Ʈ
		//windowClosing(WindowEvent)
		
		this.addWindowListener(this);
		
//		WindowListener�� interface�� ������ �߻�޼ҵ��� ������ 7���̴�
//		������ ����ڰ� ���� �ϳ��� �޼ҵ带 �����ϱ� ���� ����� �߻�޼ҵ� ��ü�� �����ؾ� �ϴ´����� �ִ�.
//		�̸� �ذ��ϱ� ���� 1���̻��� �߻�޼ҵ带 ������ �������̽��� ���ؼ��� adapter�� �����ϰ� �ִ�.
//		adapter�� interface�� ����� �߻�޼ҵ带 ������ ���� Ŭ�����̴�. public class �̴�.
		
	}//������
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// ���ø����̼� ����
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new WindowCloseTest("������â �̺�Ʈ");
	}//main
}
