package com.kosta.java0727.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class NameMenu3 {
   
	Vector<String> strings;
	String choice;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public NameMenu3() {
		strings = new Vector<>();
	}
	
	public void insert(String name){
		for (int i = 0; i < strings.size(); i++) 
		{
			if(name.equals(strings.get(i))){
				System.out.println("�ߺ��� �̸�");
			}
			else{
				System.out.println(name);
				strings.add(name);
			}
		}
	}
	
	public void update(String oldName, String newName){
		for (int i = 0; i < strings.size(); i++) 
		{
			if(!(strings.get(i).equals(oldName))){
				System.out.println("��ġ�ϴ� �̸� ����");
				break;
			}
			else
			{
				strings.set(i, newName);
			}
				
		}
	}
	
	public void delete(String name){
		for (int i = 0; i < strings.size(); i++) {
			if(!(name.equals(strings.get(i))))
			{
				System.out.println("��ġ�ϴ� �̸� ����");
				break;
			}
			else
			{
				strings.remove(i);
			}
		}
	}
	
	public void select(){
		for (int i = 0; i < strings.size(); i++) {
			System.out.println( i+":"+  strings.get(i));
		}
	}
	
	public String printMenu() throws IOException
	{
		  System.out.println("<�̸��޴�>");
	      System.out.println("1.�߰� 2.���� 3.���� 4.�˻� 5.������");
	      System.out.print("��ȣ==> ");
	      choice = br.readLine();
	      
	      return choice;
	}
	                                                                                                                                                                                                                                                                                    	
}//class





