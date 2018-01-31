package com.kosta.java0808.thread;

public class Account {
	private int total; // 모금함

//	public void deposit(int account) { //모금기능
//		total += account; //외부에서 전달받은 금액을 모금함에 모금.
//	}
	
	public synchronized void deposit(int account) { //모금기능메소드 동기화
		total += account; //외부에서 전달받은 금액을 모금함에 모금.
	}
	
	//인가받은 사람에게 모금총액을 알려주기
	public int getTotal(){
		return total;
	}
}
