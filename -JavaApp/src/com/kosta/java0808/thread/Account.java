package com.kosta.java0808.thread;

public class Account {
	private int total; // �����

//	public void deposit(int account) { //��ݱ��
//		total += account; //�ܺο��� ���޹��� �ݾ��� ����Կ� ���.
//	}
	
	public synchronized void deposit(int account) { //��ݱ�ɸ޼ҵ� ����ȭ
		total += account; //�ܺο��� ���޹��� �ݾ��� ����Կ� ���.
	}
	
	//�ΰ����� ������� ����Ѿ��� �˷��ֱ�
	public int getTotal(){
		return total;
	}
}
