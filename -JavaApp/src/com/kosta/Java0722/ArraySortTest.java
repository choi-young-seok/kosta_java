package com.kosta.Java0722;

import java.util.Random;

public class ArraySortTest {
	int su[];
	Random random;
	
	//일차원 배열 객체 생성식 반드시 암기 !!
	//자료형 배열명[] = new 자료형[배열크기];
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
	public void inputArray(){//난수를 배열에 저장
		//random.nextInt(100+1); //bound: 5 --> 0~4까지의 범위
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
			System.out.println("==== 정렬 전 데이터 ====");
			arraySortTest.printArray();
			
			arraySortTest.sortArray();
			System.out.println("==== 정렬 후 데이터 ====");
			arraySortTest.printArray();
			
		/*	int su[]={23,34,11,8,102,33};
			Arrays.sort(su);
		    for (int i = 0; i < su.length; i++) {
			  System.out.print(su[i]);
			}
		    
		    System.out.println();
		    
		    String names[]={"홍길동","길라임","김주원","이순신","김유신"};
		    Arrays.sort(names);
		    for (int i = 0; i < names.length; i++) {
				System.out.print(names[i]);
			}*/
	}
}
