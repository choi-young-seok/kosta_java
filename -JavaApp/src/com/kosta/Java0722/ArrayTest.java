package com.kosta.Java0722;

public class ArrayTest {
	public static void main(String args[])
	{
		int su[]={11,22,33,44,55};
		
		System.out.println("전체 배열의 크기 : "+su.length);
		
		for(int i = 0 ; i<su.length; i++)
		{
			System.out.println(su[i]);
		}
		
		int su2[][] = {{1,2} , {3,4} , {4,5}};
		System.out.println("행의 크기 : " + su2.length);
		System.out.println("열의 크기 : " + su2[1].length);
	}

}
