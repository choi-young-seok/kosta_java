package com.kosta.java0808;

public class ThreadTest {
	
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	
	//쓰레드를 생성하는 방법 두가지
	//1.extends Thread
	//2.implements Runnable
	//단) Runnable은 쓰레드 객체가 아니므로 Thread class 내의 run 메소드를 사용하기 위해서는 
	//Thread class의 생성자인 Thread(Runnable 객체)를 이용한다.
	//또한)Runnable은 쓰레드 객체가 아니므로 Thread class 내의 run 메소드를 사용하기 위해서는 
	//Thread class의 cunnentThread메소드를 이용하여 객체를 생성한후 생성한 객체로 Thread class의 메소드를 호출한다.

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1(); //Thread객체 t1
		t1.start();
//		Thread class의 start메소드로 호출하게 되면 호출된 쓰레드가 각쓰레드내용을 순차적으로 수행하되 각각의 쓰레드 끼리는 순서없이 랜덤하게 수행
//		t1.run();
//		Thread class의 run메소드로 호출하게되면 메소드 호출과 마찬가지로 순차적으로 수행
		t1.setName("길동 쓰레드 :");
//		Thread의 이름을 지정
		
		
		Mythread2 rTarget = new Mythread2();
//		Thread 생성자 : Thread(Runnable target);
//			run메소드가 구현된 위치를 지정해서 스레드 객체 생성
		
		Thread t2 = new Thread(rTarget);//Runnable객체 rTarget
		
		
		//쓰레드의 우선순위 부여(1~10)
		//1 : 우선순위 낮음, 10 : 우선순위 높음
		//쓰레드 객체 .setPriority(Thread.MAX_PRIORITY);
		//MAX_PRIORITY : 10 ,MIN_PRIORITY : 1, NORM_PRIORITY : 5
		
//		t1.setPriority(Thread.MAX_PRIORITY); //t1.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(10);
		

//		Runnable객체는 interface로 정의 되어있으므로, Thread에 정의되어있는 start메소드가 없기 때문에 start메소드를 사용할수 없다
//		따라서 이러한 문제를 해결하기 위해 Thread class의 생성자에서 제공하는 생성자를 통해 Runnable객체를 생성한 후 
//		Thread 객체의 생성자 파라미터로 생성한 Runnable객체의 생성자를 파라미터로 제공하여 start메소드를 사용가능하게 한다
		
//		Thread t2 = new Thread(rTarget,);

//		Thread.currentThread().setName("주원 쓰레드 :");
		//Thread class 내의 현재 쓰레드 객체를 얻어오는 currentThread()를 이용하여 Runnable로 정의된 객체에 Thread class에 정의된 메소드를 사용
		t2.setName("주원 메소드 : ");
		t2.start();
		//m2는 쓰레드를 연결해주는 interface객체 이므로 Thread의 start()를 사용할수 없다.
		//Runnable interface내에 start()가 없기 때문
		
//		new Thread(new Mythread2()).start();
		

	}
}
