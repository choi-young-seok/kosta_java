package com.kosta.java0726.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenu {
   String names[]; //�迭: (�̸�)������ �����
   String choice;
   int k = 0;
   boolean b ;

   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   public NameMenu() {
	  names = new String[5];//�迭��ü����
	  //names[0]����~ names[4]����
   }
	
 //�޼ҵ�: �����͸� �߰�,�˻�,����,�������.
   public void addName(String name){
	   if(k>=5)
	   {
		   System.out.println("�� �̻� �Է��� �� �����ϴ� \n" 
                + "�� �� �̻��� �̸��� ���� ������ �� �Է��ϼ���!!");
	   }
	 for(int i=0; i<names.length; i++){//�˻�: ����ִ� ��ã�� ===> �氪��null
		 if(name.equals(names[i])){
			 System.out.println("�̹� �Էµ� �̸��Դϴ�!!");
			 break;
		 }
		 else if(names[i] == null){ //����� ã�Ҵٸ�
		   names[i] = name;
		   k++;
		   break;
		 }
      }	   
   }//�߰�
   
   public void delName(String name){
	 for(int i=0; i<names.length; i++){//������� �ϴ� �̸��� �迭���� ã��
		 //names[i] : �迭�� ����� ��,  name: ���� �̸�
		 //if(names[i].equals(name)){ //���ڿ� ���� ��:  ���ڿ�.equals(�񱳹��ڿ�)
	     //if(name.equals(names[i])){//�ܼ��Է��� null�Է��� ����. �ּ� ���ڿ� "" ��!!
		 if(!(CheckName(name)))
		  {
			  System.out.println("�������� �ʴ� �̸��Դϴ�!!");
			  break;
		  }
		 else if(names[i] != null  && names[i].equals(name)){ 
			 //NullPointerException�߻�����: null.�ʵ�� �Ǵ� null.�޼ҵ��()
			 // A||B  : A�� true��� B�� ������� ����.   
			 // A&&B  : A�� false��� B�� ������� ����
		   names[i]=null;//����ǥ��
	       k--; 
		   break;
	        
		 }
		 /*else
		 {
			 System.out.println("�������� �ʴ� �̸��Դϴ�!!");
			 break;
		 }*/
	 }
   }//����
   public void editName(String oldName,String  newName){//����
	  for(int i=0; i<names.length; i++){
		  if(!(CheckName(oldName)))
		  {
			  System.out.println("�������� �ʴ� �̸��Դϴ�!!");
			  break;
		  }
		  else if(names[i] != null &&names[i].equals(oldName) ){//������ �̸��� ã�Ҵٸ�
			  names[i]=newName;
			  break;
		  }
	  }
   }
   public void listName(){//��ü�����Ͱ˻�
	 System.out.println("[�̸����]");
	 for(int i=0; i<names.length; i++){//i=0~4
		if(names[i] != null)
        System.out.println(" "+names[i]);
	 }	   
   }//listName
   
   public String PrintMenu() throws IOException
   {
	  System.out.println("<�̸��޴�>");
      System.out.println("1.�߰� 2.���� 3.���� 4.�˻� 5.������");
      System.out.print("��ȣ==> ");
      choice = br.readLine();
      
      return choice;
   }
   
   public boolean CheckName(String name){
	   
	   boolean b = false;
	   
	   for (int i = 0; i < names.length; i++) {
		   if(names[i].equals(name)){
			   b = true;
			   break;
		   }
		   else{
			   b = false;
			   break;
		   }
	   }//for
	   return b;
   }//CheckName
	
}
