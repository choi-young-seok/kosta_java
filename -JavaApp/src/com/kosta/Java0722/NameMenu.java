package com.kosta.Java0722;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NameMenu 
{
	String names[] = new String [6];
	int k = 0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int PrintMenu() throws IOException
	{
		System.out.println("< 이 름 메 뉴 >");
		System.out.println("1.추가 \n2.삭제 \n3.수정 \n4.검색 \n5.나가기");
		System.out.print("번호를 입력하세요 : ");
		String choice = br.readLine();
		int choiceNum = Integer.parseInt(choice);
		
		return choiceNum;
	}

	public String addName() throws IOException
	{
		System.out.print("추가할 이름을 적어주세요.\n 이름 : ");
		names[k] =  br.readLine();
		k++;

		if(k>=5)
		{
			System.out.print("더 이상 추가 할 수 없습니다.");
			
		}

		System.out.println("----------\n\t");
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] != null)System.out.println(names[i]);
		}
		System.out.println("\n----------\n");

		return names[k];
	}
	
	public void delName() throws IOException
	{
		System.out.print("삭제이름 : ");
		String delName = br.readLine();
		for(int i = 0; i < names.length; i++) //삭제
		{
			if (i==4)
			{
				names[i]="";
				k=i;
			}
			else if(delName.equals(names[i]))
			{
				names[i]=names[i+1];
				names[i+1]="";
			}
			/*else
			{
				System.out.println("이름을 찾을수 없습니다.");
			}*/
		}
		/*
		for(int i=0; i<names.length; i++)
		{
			names[i]=names[i+1];
			names[i+1]="";

			if(names[i]==null)
			{
				k=1;
			}
		}
		/*for (int i = 1; i<names.length ;i++ )
		{
			if(i==5)
			{
				names[i]="";
				k--;
			}
			else if(i<5)
			{
				names[i]=names[i+1];
				names[i+1]="";
			}
		}*/
		System.out.println("----------\n\t");
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] != null)System.out.println(names[i]);
		}
		System.out.println("\n----------\n");

	}
	
	public void editName() throws IOException
	{
		System.out.print("원래이름 :");
		String oldName = br.readLine();
		System.out.print("바꿀이름 :");
		String newName = br.readLine();

		for(int i = 0; i < names.length; i++)
		{
			if(oldName.equals(names[i]))
					names[i]=newName;
		}

		System.out.println("----------\n\t");
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] != null)System.out.println(names[i]);
		}
		System.out.println("\n----------\n");
	}
	
	public void listName()
	{
		System.out.println("----------\n\t");
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] != null)System.out.println(names[i]);
		}
		System.out.println("\n----------\n");
	}

	public int inputNum() throws IOException
	{
		String inputMenuNum = br.readLine();
		int menuNum = Integer.parseInt(inputMenuNum);
		
		return menuNum;
	}
}
