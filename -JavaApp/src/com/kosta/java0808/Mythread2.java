package com.kosta.java0808;

public class Mythread2 implements Runnable{
	//스레드 객체는 extends를 위한 class와 implements를 위한 interface를 제공한다.
	
	public Mythread2() {

	}

	//interface Runnable을 사용하기 위해 반드시 구현해야 하는 추상메소드 run()
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("자바 스레드 rTarget : " + "["+i+"]");
//		t2 = new Thread()
		Thread t = Thread.currentThread();
		System.out.println(t.getName() +"("+i+")");

	}
		
	}
	

}
