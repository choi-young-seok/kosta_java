package com.kosta.java0726.Homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest {
   
   public static void main(String[] args) throws IOException {
	  //프로그램 제어, 반복되는 메뉴출력
	   
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   NameMenu menu = new NameMenu();
	   int num = 0;
	   String choice;
	   boolean b = true;
	   while(b)
	   {
		   
	      choice = menu.PrintMenu();
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
					     String name = in.readLine(); 
				         menu.addName(name);
			             } break;
				 
			     case 2: System.out.print("삭제이름: ");
			             String name = in.readLine();
					     menu.delName(name);
					     break;
					     
				 case 3: 
					     System.out.print("수정이름(기존이름): ");
					       String oldName = in.readLine();
					     System.out.print("변경이름(새이름): ");
					       String newName = in.readLine();					       
					     menu.editName(oldName, newName); 
					     
					     break;
				 case 4: menu.listName();	
				 		 break;
				 		 
				 case 5:
						b=false;
						System.out.println("=== 종료합니다. ===");
						break;	
						
			  }//switch
		  System.out.println();
	      	}//else
	   }//while
   }//main
}//class
