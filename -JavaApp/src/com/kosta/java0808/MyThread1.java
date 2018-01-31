package com.kosta.java0808;

public class MyThread1 extends Thread{

	//Thread class는 java.lang 패키지 내에 있는 class
	//쓰레드 특성 메소드(run)를 오버라이딩
	
//	public void threadA(){
//		for (int i = 1; i < 10; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("자바 스레드  A: " + i);
//		}
//	}
//	
//	public void threadB(){
//		for (int i = 1; i < 10; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("자바 스레드 B : " + "["+i+"]");
//		}
//	}
	
	@Override
	public void run() {
//		Thread.sleep(1000);
//		자식 클래스는 부모 클래스 Thread의 Exception보다 축소해서 throws해야하는데 부모 클래스 Thread가 
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//			System.out.println("자바 스레드 t1: " + "("+i+")");
				System.out.println(getName()+ "("+i+")");
			}
//		threadA();
//		threadB();
	}
}
