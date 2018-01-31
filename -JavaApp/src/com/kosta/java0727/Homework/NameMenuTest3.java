package com.kosta.java0727.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest3 {
	
	public static void main(String[] args) throws IOException {
		
		NameMenu3 menu3 = new NameMenu3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		String choice;
		boolean b = true;
		while(b)
		{
		   
			choice = menu3.printMenu();
			if(!(choice.matches("[1-5]+")))
			{
				System.out.println(" [1 ~ 5] 범위 내 번호만 입력하세요");
		      }
		      
			else{
				num = Integer.parseInt(choice);//Integer.parseInt("1");-->1
	      
				System.out.println();
		      
				switch(num){
					case 1: {
						System.out.print("이름: ");			     
						String name = br.readLine(); 
						menu3.insert(name);
						} break;
				 
					case 2: System.out.print("삭제이름: ");
						String name = br.readLine();
						menu3.delete(name);
						break;
					     
					case 3: System.out.print("수정이름(기존이름): ");
					    String oldName = br.readLine();
					    System.out.print("변경이름(새이름): ");
					    String newName = br.readLine();					       
					    menu3.update(oldName, newName);				 
					    break;
					     
					case 4: menu3.select();
				 		break;
				 		 
					case 5:
						b=false;
						System.out.println("=== 종료합니다. ===");
						break;	
						
			  }//switch
		  System.out.println();
	      	}//else
	   }//while
		
		
	}

}
