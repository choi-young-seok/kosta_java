package com.kosta.Java0722;

import java.util.Random;

public class ArraySortTest {
	int su[];
	Random random;
	
	//������ �迭 ��ü ������ �ݵ�� �ϱ� !!
	//�ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	//ex) String str[] = new String[5];
	
	public ArraySortTest() {
		su = new int[5];
		random = new Random();
	}
	
	public void printArray(){
		System.out.print("[");
		for (int i= 0 ; i<su.length ; i++)
		{
			System.out.print(su[i]);
			if(i != (su.length-1))
				System.out.print(", ");
		}
		System.out.println("]");

	}
	public void inputArray(){//������ �迭�� ����
		//random.nextInt(100+1); //bound: 5 --> 0~4������ ����
		for (int i = 0; i < su.length; i++) {
			su[i] = random.nextInt(100+1);
		}
	}
	
	public void sortArray(){
		int temp = 0;
		for(int i = 0 ; i< su.length-1 ; i++){
			for(int j = i+1 ; j <su.length ; j++){
				if(su[i]  > su[j]){
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String args[])
	{
		ArraySortTest arraySortTest = new ArraySortTest();
			arraySortTest.inputArray();
			System.out.println("==== ���� �� ������ ====");
			arraySortTest.printArray();
			
			arraySortTest.sortArray();
			System.out.println("==== ���� �� ������ ====");
			arraySortTest.printArray();
			
		/*	int su[]={23,34,11,8,102,33};
			Arrays.sort(su);
		    for (int i = 0; i < su.length; i++) {
			  System.out.print(su[i]);
			}
		    
		    System.out.println();
		    
		    String names[]={"ȫ�浿","�����","���ֿ�","�̼���","������"};
		    Arrays.sort(names);
		    for (int i = 0; i < names.length; i++) {
				System.out.print(names[i]);
			}*/
	}
}
