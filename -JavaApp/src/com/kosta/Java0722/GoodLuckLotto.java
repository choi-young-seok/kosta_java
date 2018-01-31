package com.kosta.Java0722;

import java.util.Arrays;
import java.util.Random;

public class GoodLuckLotto {
	
	int su[][];
	Random random;
	
	public GoodLuckLotto() {
		su = new int[5][6];
		random = new Random();
	}
	
	public static void main(String[] args) {
		
		GoodLuckLotto goodLucksu = new GoodLuckLotto();
		goodLucksu.inputArray();
		goodLucksu.findOverlap();
		goodLucksu.sortArray();
		goodLucksu.printArray();
	}//main
	
	public void printArray(){
		System.out.println("★★금주 행운의 로또 번호★★");
		System.out.printf("\t\t  0,  1,  2,  3,  4,  5\n");
		System.out.println("\t\t------------------------");
		
		for (int i= 0 ; i< su.length ; i++)
		{
			System.out.print(+i+"번지 // "+(i+1)+"회  : [");
			for (int j = 0; j < su[i].length; j++) {
				System.out.printf("%2d",su[i][j]);
				if(j != (su[i].length-1))
				{
					System.out.print(", ");
				}
			}
			System.out.println("]");
			
		}
	}//printArray
	
	public void inputArray(){
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				su[i][j] = random.nextInt(45)+1;
			}
		}
	}//inputArray
	
/*	public boolean findOverlap(int i, int j)
	{
		su[i][j] = random.nextInt(45)+1;
		return true;
	}*/
	public void findOverlap(){
		for(int i = 0 ;  i< su.length ; i++){
			for (int j = 0; j < su[i].length; j++) {
				for (int k = j+1; k < su[i].length; k++) {
					if(su[i][j]==su[i][k])
					{
						su[j][k]=random.nextInt(45)+1;
						k--;
						break;
					}// if
				}// k for
			}// j for
		}//i for
	}//findOverlap
 
		/*do{ 
			su[1]= random.nextInt(45)+1;//0~44 + 1 : 1~45
		}while(su[1] == su[0]);
 
		do{ 
			su[2]= random.nextInt(45)+1;//0~44 + 1 : 1~45
		}while(su[2] == su[1] || su[2] == su[0]);
		 
		do{ 
			su[3]= random.nextInt(45)+1;//0~44 + 1 : 1~45
		}while(su[3] == su[2] || su[3] == su[1] || su[3] == su[0]);
		 
		do{ 
			su[4]= random.nextInt(45)+1;//0~44 + 1 : 1~45
		}while(su[4] == su[3] || su[4] == su[2] || su[4] == su[1] || su[4] == su[0]);
		 
		do{ 
			su[5]= random.nextInt(45)+1;//0~44 + 1 : 1~45
		}while(su[5] == su[4] || su[5] == su[3] || su[5] == su[2] || su[5] == su[1]  || su[5] == su[0]);
	 */
	
	public void sortArray(){
		//int temp = 0;
		for(int i = 0 ; i<su.length ; i++){
			Arrays.sort(su[i]);
		/*	for(int j = 0 ; j <su[i].length-1 ; j++){
				for (int k = j+1; k < su.length; k++) {
					if(su[j][k]  > su[j][k+1]){
						temp = su[j][k];
						su[j][k] = su[j][k+1];
						su[j][k+1] = temp;
					}//k for
				}//j for
			}//i for 
*/		}//main
	}//sortArray
}//class
