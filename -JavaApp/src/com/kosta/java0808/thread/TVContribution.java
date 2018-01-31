package com.kosta.java0808.thread;

public class TVContribution {
    public static void main(String[] args) {
       Account account = new Account();//5명이 한곳에 모금할 저금통
       
       //5명의 경쟁적인(기다리지 않는) 성금자
       
       /*Customer c1 = new Customer(account);       
       Customer c2 = new Customer(account);
       ...
       c1.start();
       c2.start();
       ...*/
       
       Customer customers[] = new Customer[5];
       for (int i = 0; i < customers.length; i++) {
		  customers[i] = new Customer(account);//스레드객체생성
		  customers[i].start();//스레드 run()실행
	   }	
       
       try {
		for(int i=0; i<customers.length; i++){
			   //customers[i] : 스레드
			   customers[i].join(); 
			   //스레드가 작업을 끝마칠때 까지 main()메소드가 기다리기.
		   }
	   } catch (InterruptedException e) {
		    e.printStackTrace();
	   }
       System.out.println("총 모금액: "+ account.getTotal());
       
	}//main
}

