package com.kosta.java0801;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCloseTest extends Frame implements WindowListener{
	//컴포넌트 선언

	public WindowCloseTest(String title) {
		super(title);
		
		//객체 생성
		
		//속성 추가
		
		//마무리 메소드
		setSize(300,300);
		setVisible(true);
		
		//이벤트 연결
		
		//WindowEvent : 윈도우가 활성화 또는 닫힐 때 발생하는 이벤트
		//windowClosing(WindowEvent)
		
		this.addWindowListener(this);
		
//		WindowListener는 interface로 선언한 추상메소드의 개수는 7개이다
//		하지만 사용자가 이중 하나의 메소드를 구현하기 위해 선언된 추상메소드 전체를 구현해야 하는단점이 있다.
//		이를 해결하기 위해 1개이상의 추상메소드를 선언한 인터페이스에 대해서는 adapter를 제공하고 있다.
//		adapter는 interface에 선언된 추상메소드를 구현해 놓은 클래스이다. public class 이다.
		
	}//생성자
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 어플리케이션 종료
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
		new WindowCloseTest("윈도우창 이벤트");
	}//main
}
