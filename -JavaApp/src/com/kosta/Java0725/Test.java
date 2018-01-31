package com.kosta.Java0725;

public class Test {
	public static void main(String[] args) {
		//주간정리 9번 문제
		//int su[] = {1,2,3,4,5}; 배열의 값을 다른 배열에 복사 하시오
		
		/*int su[] = {1,2,3,4,5};
		int su2[] =  new int[su.length];
		
		
		
		for (int i = 0; i < su.length; i++) {
			su2 = su;
			System.out.println("su2["+i+"] = "+su2[i]);
		}
		su2[2]=33;
		System.out.println();
		
		for (int i = 0; i < su.length; i++) {
			System.out.println("su["+i+"] = "+su[i]);
		}
		//배열의 값이 같으면 같은 메모리를 참조하기 때문에 (call by value)
		//배열 변수끼리 초기화 하면, 값이 들어있는 주소를 참조하기 때문에, su3의 값을 변경하였어도, su의 값역시 변경됨
		*/
				//  0,1,2,3,4,5,6
		int su[] = {1,2,3,4,5,6,7};
		/*int temp = 0;
		for (int i = 0; i < su.length; i++) {
			for (int j = i+1; j < su.length-1; j++) {
				
				if(su[i] < su[j]){
					temp = su[i];
					su[i] = su[j];
					su[j]=temp;
				}
				System.out.println(su[i]);
					
			}
		}*/
		int temp;
		for (int i = 0, j=su.length-1; i < su.length/2; i++,j--) {
			temp = su[i];
			su[i]=su[j];
			su[j]=temp;
		}
		for (int j = 0; j < su.length; j++) {
			System.out.print(su[j]+" ");
		}
		
	}//main
}//class
