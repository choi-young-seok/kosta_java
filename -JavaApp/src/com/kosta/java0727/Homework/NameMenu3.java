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
				System.out.println("중복된 이름");
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
				System.out.println("일치하는 이름 없음");
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
				System.out.println("일치하는 이름 없음");
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
		  System.out.println("<이름메뉴>");
	      System.out.println("1.추가 2.삭제 3.수정 4.검색 5.나가기");
	      System.out.print("번호==> ");
	      choice = br.readLine();
	      
	      return choice;
	}
	                                                                                                                                                                                                                                                                                    	
}//class





