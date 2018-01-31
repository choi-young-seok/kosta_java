package com.kosta.java0801;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseTest3 extends Frame {
	//이미 Frame이라는 클래스를 상속받았기 때문에, 윈도우창을 닫기 위해 windowAdapter를 상속받아 구현할수 없다.
	//따라서 남은 방법은 interface를 이용하여 선언된 추상메소드를 모두 구현하거나, 혹은 익명의 내부클래스를 이용하여 구현하는 방법이 있다.
	//<익명의 내부 클래스를 이용하여 구현하는 방법>

	public WindowCloseTest3(String title) {
		super(title);
		
		setVisible(true);
		setSize(300, 300);
		
		//<익명의 내부 클래스를 이용하여 구현하는 방법>
		addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e){
			System.exit(0);
			}});

		
	}//생성자
	
	
	
	public static void main(String[] args) {
		new WindowCloseTest3("윈도창 이벤트 테스트3");
	}//main
}
