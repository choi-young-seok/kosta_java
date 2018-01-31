package com.kosta.Java0722;

import java.util.Random;

public class LottoTest {

	int su[][];
	Random random;
	
	public LottoTest() {
		su = new int[5][6];
		random = new Random();
	}
	
	public void printArray(){
		System.out.println("�ڡڱ��� ����� �ζ� ��ȣ�ڡ�");
		
		for (int i= 0 ; i<su[i].length ; i++)
		{
			System.out.print(i+1+"ȸ  : ");
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[j]+",");
			}
			
			if(i != (su[i].length-1))
			{
				System.out.println("]");
			}
		}
	}//printArray
	
	public void inputArray(){//������ �迭�� ����
		//random.nextInt(100+1); //bound: 5 --> 0~4������ ����
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				su[i][j] = random.nextInt(45+1);	
			}
			
		}
	}
	
	public void sortArray(){
		int temp = 0;
		for(int i = 0 ; i< su.length-1 ; i++){
			for(int j = i+1 ; j <su.length ; j++){
				if(su[i][j] > su[i+1][j]){
					temp = su[i][j];
					su[i][j] = su[j][i];
					su[j][i] = temp;
				}
			}
		}
	}
	
	public void findOverlap(){
		for(int i = 0 ;  i< su.length-1 ; i++){
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySortTest arraySortTest = new ArraySortTest();
		arraySortTest.inputArray();
		System.out.println("==== ���� �� ������ ====");
		arraySortTest.printArray();
		
		arraySortTest.sortArray();
		System.out.println("==== ���� �� ������ ====");
		arraySortTest.printArray();
	}

}
