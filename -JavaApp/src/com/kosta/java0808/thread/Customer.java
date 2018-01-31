package com.kosta.java0808.thread;

public class Customer extends Thread { //�������� ������ Ŭ����
	
	Account account;
	
	public Customer(Account account) { //�ܺο��� Account class�� �Ķ���ͷ� �޾� ���� class�� Account�� account���������� �Ҵ�
		this.account = account;
	}
	
	@Override
	public void run() {
		try {
			for(int i=1; i<201; i++){
			      Thread.sleep(50);//0.05�� ���� ���		  
				   
			      account.deposit(1000);
			      //����ڸ�
			      System.out.println("������ ["+ getName()+"]: "+ i+"ȸ");
			      if(account.getTotal()>=500000) break;
			      //��� ��ǥ�ݾ�: 50����
			   }
		   } catch (InterruptedException e) {
			e.printStackTrace();
		  }	   
	}//run
}
