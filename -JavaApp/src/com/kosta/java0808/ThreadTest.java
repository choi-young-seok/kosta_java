package com.kosta.java0808;

public class ThreadTest {
	
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	
	//�����带 �����ϴ� ��� �ΰ���
	//1.extends Thread
	//2.implements Runnable
	//��) Runnable�� ������ ��ü�� �ƴϹǷ� Thread class ���� run �޼ҵ带 ����ϱ� ���ؼ��� 
	//Thread class�� �������� Thread(Runnable ��ü)�� �̿��Ѵ�.
	//����)Runnable�� ������ ��ü�� �ƴϹǷ� Thread class ���� run �޼ҵ带 ����ϱ� ���ؼ��� 
	//Thread class�� cunnentThread�޼ҵ带 �̿��Ͽ� ��ü�� �������� ������ ��ü�� Thread class�� �޼ҵ带 ȣ���Ѵ�.

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1(); //Thread��ü t1
		t1.start();
//		Thread class�� start�޼ҵ�� ȣ���ϰ� �Ǹ� ȣ��� �����尡 �������峻���� ���������� �����ϵ� ������ ������ ������ �������� �����ϰ� ����
//		t1.run();
//		Thread class�� run�޼ҵ�� ȣ���ϰԵǸ� �޼ҵ� ȣ��� ���������� ���������� ����
		t1.setName("�浿 ������ :");
//		Thread�� �̸��� ����
		
		
		Mythread2 rTarget = new Mythread2();
//		Thread ������ : Thread(Runnable target);
//			run�޼ҵ尡 ������ ��ġ�� �����ؼ� ������ ��ü ����
		
		Thread t2 = new Thread(rTarget);//Runnable��ü rTarget
		
		
		//�������� �켱���� �ο�(1~10)
		//1 : �켱���� ����, 10 : �켱���� ����
		//������ ��ü .setPriority(Thread.MAX_PRIORITY);
		//MAX_PRIORITY : 10 ,MIN_PRIORITY : 1, NORM_PRIORITY : 5
		
//		t1.setPriority(Thread.MAX_PRIORITY); //t1.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(10);
		

//		Runnable��ü�� interface�� ���� �Ǿ������Ƿ�, Thread�� ���ǵǾ��ִ� start�޼ҵ尡 ���� ������ start�޼ҵ带 ����Ҽ� ����
//		���� �̷��� ������ �ذ��ϱ� ���� Thread class�� �����ڿ��� �����ϴ� �����ڸ� ���� Runnable��ü�� ������ �� 
//		Thread ��ü�� ������ �Ķ���ͷ� ������ Runnable��ü�� �����ڸ� �Ķ���ͷ� �����Ͽ� start�޼ҵ带 ��밡���ϰ� �Ѵ�
		
//		Thread t2 = new Thread(rTarget,);

//		Thread.currentThread().setName("�ֿ� ������ :");
		//Thread class ���� ���� ������ ��ü�� ������ currentThread()�� �̿��Ͽ� Runnable�� ���ǵ� ��ü�� Thread class�� ���ǵ� �޼ҵ带 ���
		t2.setName("�ֿ� �޼ҵ� : ");
		t2.start();
		//m2�� �����带 �������ִ� interface��ü �̹Ƿ� Thread�� start()�� ����Ҽ� ����.
		//Runnable interface���� start()�� ���� ����
		
//		new Thread(new Mythread2()).start();
		

	}
}
