package com.kosta.Java0725;

public class Test {
	public static void main(String[] args) {
		//�ְ����� 9�� ����
		//int su[] = {1,2,3,4,5}; �迭�� ���� �ٸ� �迭�� ���� �Ͻÿ�
		
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
		//�迭�� ���� ������ ���� �޸𸮸� �����ϱ� ������ (call by value)
		//�迭 �������� �ʱ�ȭ �ϸ�, ���� ����ִ� �ּҸ� �����ϱ� ������, su3�� ���� �����Ͽ��, su�� ������ �����
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
