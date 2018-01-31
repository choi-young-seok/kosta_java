package com.kosta.java0801;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseTest3 extends Frame {
	//�̹� Frame�̶�� Ŭ������ ��ӹ޾ұ� ������, ������â�� �ݱ� ���� windowAdapter�� ��ӹ޾� �����Ҽ� ����.
	//���� ���� ����� interface�� �̿��Ͽ� ����� �߻�޼ҵ带 ��� �����ϰų�, Ȥ�� �͸��� ����Ŭ������ �̿��Ͽ� �����ϴ� ����� �ִ�.
	//<�͸��� ���� Ŭ������ �̿��Ͽ� �����ϴ� ���>

	public WindowCloseTest3(String title) {
		super(title);
		
		setVisible(true);
		setSize(300, 300);
		
		//<�͸��� ���� Ŭ������ �̿��Ͽ� �����ϴ� ���>
		addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e){
			System.exit(0);
			}});

		
	}//������
	
	
	
	public static void main(String[] args) {
		new WindowCloseTest3("����â �̺�Ʈ �׽�Ʈ3");
	}//main
}
