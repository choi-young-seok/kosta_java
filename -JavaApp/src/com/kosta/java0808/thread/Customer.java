package com.kosta.java0808.thread;

public class Customer extends Thread { //경쟁적인 성금자 클래스
	
	Account account;
	
	public Customer(Account account) { //외부에서 Account class를 파라미터로 받아 현재 class의 Account형 account참조변수에 할당
		this.account = account;
	}
	
	@Override
	public void run() {
		try {
			for(int i=1; i<201; i++){
			      Thread.sleep(50);//0.05초 간격 모금		  
				   
			      account.deposit(1000);
			      //방송자막
			      System.out.println("성금자 ["+ getName()+"]: "+ i+"회");
			      if(account.getTotal()>=500000) break;
			      //모금 목표금액: 50만원
			   }
		   } catch (InterruptedException e) {
			e.printStackTrace();
		  }	   
	}//run
}
