package com.kosta.java0808.thread;

public class TVContribution {
    public static void main(String[] args) {
       Account account = new Account();//5���� �Ѱ��� ����� ������
       
       //5���� ��������(��ٸ��� �ʴ�) ������
       
       /*Customer c1 = new Customer(account);       
       Customer c2 = new Customer(account);
       ...
       c1.start();
       c2.start();
       ...*/
       
       Customer customers[] = new Customer[5];
       for (int i = 0; i < customers.length; i++) {
		  customers[i] = new Customer(account);//�����尴ü����
		  customers[i].start();//������ run()����
	   }	
       
       try {
		for(int i=0; i<customers.length; i++){
			   //customers[i] : ������
			   customers[i].join(); 
			   //�����尡 �۾��� ����ĥ�� ���� main()�޼ҵ尡 ��ٸ���.
		   }
	   } catch (InterruptedException e) {
		    e.printStackTrace();
	   }
       System.out.println("�� ��ݾ�: "+ account.getTotal());
       
	}//main
}

