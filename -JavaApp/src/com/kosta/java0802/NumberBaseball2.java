package com.kosta.java0802;

import java.util.Random;

import javax.swing.JFrame;

public class NumberBaseball2 extends JFrame {
	int ranNum[];
	Random random;
	int toIntArray[];
	int start, S, B;
	
	//�迭 �ʱ�ȭ �޼ҵ�
	public void initRanNum(){
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] =  random.nextInt(10);
		}
	}
	//�����߻� �޼ҵ�
	public void shakeRanNum(){
		int temp = 0;
		for (int i = 0; i < 10000; i++) {
			temp = ranNum[0];
			ranNum[0] = ranNum[random.nextInt(10)];
			ranNum[random.nextInt(10)] = temp;
		}
	}
	//TextField�κ��� �Է¹��� ��(String�ڷ���)�� int����ȯ �޼ҵ�
	public void toIntArray(String inputString){
		String inputStringNum[] = inputString.split("");
		for (int i = 0; i < inputStringNum.length; i++) {
			toIntArray[i] = Integer.parseInt(inputStringNum[i]);
		}
	}
	//�Է¹��� field�� ���� ��ȯ�� int�� �迭�� ������ ����� int�� �迭 �� �޼ҵ�
	public void toCheckNum(){
		for (int i = 0; i < toIntArray.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(toIntArray[i]==ranNum[j]){
					if(i==j){
						S++;
					}else{
						B++;
					}
				}
			}
		}
	}
	//(����cnt, ���ں�S,B)���� �ʱ�ȭ �޼ҵ�
	public void initNum(){
		start = 0;
		S = 0;
		B = 0;
	}	
	//��ȿ���˻� (�ΰ˻�if(equels("") + ���ڰ˻�:matches)
	public void regexp(){
		
	}
	public NumberBaseball2() {
		setTitle("���ھ߱� ����");
		
		ranNum = new int[10];
		toIntArray = new int[3];
		random = new Random();
		
	}//������
	
	public static void main(String[] args) {
		new NumberBaseball2();
	}
	
}