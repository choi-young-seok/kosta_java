package com.kosta.java0726.Homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest {
   
   public static void main(String[] args) throws IOException {
	  //���α׷� ����, �ݺ��Ǵ� �޴����
	   
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
	    	  System.out.println(" [1 ~ 5] ���� �� ��ȣ�� �Է��ϼ���");
	      }
	      
	      else{
	    	  num = Integer.parseInt(choice);//Integer.parseInt("1");-->1
	      
		      System.out.println();
			  switch(num){
			     case 1: {
			    	     System.out.print("�̸�: ");			     
					     String name = in.readLine(); 
				         menu.addName(name);
			             } break;
				 
			     case 2: System.out.print("�����̸�: ");
			             String name = in.readLine();
					     menu.delName(name);
					     break;
					     
				 case 3: 
					     System.out.print("�����̸�(�����̸�): ");
					       String oldName = in.readLine();
					     System.out.print("�����̸�(���̸�): ");
					       String newName = in.readLine();					       
					     menu.editName(oldName, newName); 
					     
					     break;
				 case 4: menu.listName();	
				 		 break;
				 		 
				 case 5:
						b=false;
						System.out.println("=== �����մϴ�. ===");
						break;	
						
			  }//switch
		  System.out.println();
	      	}//else
	   }//while
   }//main
}//class
