package com.kosta.java0808;

public class MyThread1 extends Thread{

	//Thread class�� java.lang ��Ű�� ���� �ִ� class
	//������ Ư�� �޼ҵ�(run)�� �������̵�
	
//	public void threadA(){
//		for (int i = 1; i < 10; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("�ڹ� ������  A: " + i);
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
//			System.out.println("�ڹ� ������ B : " + "["+i+"]");
//		}
//	}
	
	@Override
	public void run() {
//		Thread.sleep(1000);
//		�ڽ� Ŭ������ �θ� Ŭ���� Thread�� Exception���� ����ؼ� throws�ؾ��ϴµ� �θ� Ŭ���� Thread�� 
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//			System.out.println("�ڹ� ������ t1: " + "("+i+")");
				System.out.println(getName()+ "("+i+")");
			}
//		threadA();
//		threadB();
	}
}
