package com.kosta.java0808;

public class Mythread2 implements Runnable{
	//������ ��ü�� extends�� ���� class�� implements�� ���� interface�� �����Ѵ�.
	
	public Mythread2() {

	}

	//interface Runnable�� ����ϱ� ���� �ݵ�� �����ؾ� �ϴ� �߻�޼ҵ� run()
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("�ڹ� ������ rTarget : " + "["+i+"]");
//		t2 = new Thread()
		Thread t = Thread.currentThread();
		System.out.println(t.getName() +"("+i+")");

	}
		
	}
	

}
