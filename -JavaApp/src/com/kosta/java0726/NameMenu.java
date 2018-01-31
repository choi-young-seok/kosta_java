package com.kosta.java0726;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NameMenu 
{
	String names[] = new String [6];
	int k=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String PrintMenu() throws IOException
	{
		System.out.println("< 이 름 메 뉴 >");
		System.out.println("1.추가 \n2.삭제 \n3.수정 \n4.검색 \n5.나가기");
		System.out.print("번호를 입력하세요 : ");
		String choice = br.readLine();
	
		
		return choice;
	}

	public String addName() throws IOException
	{
		System.out.print("추가할 이름을 적어주세요.\n 이름 : ");
		String newName = br.readLine();
		
		//names[k] =  br.readLine();
		for (int i = 0; i < names.length; i++) 
		{
			if(newName.equals(names[i])){
				System.out.println("이미 입력된 이름 입니다.");
				break;
			}
			else{
				names[k]=newName;
			}
		}
		k++;
		
		if(k>=5)
		{
			System.out.println("더이상 입력 할 수 없습니다.");
		}
		
		return names[k];
		
		
			/*else if(names[i]==null){
				names[i]=newName;
				k++;
			}
			else if(k>=5){
				System.out.print("더 이상 추가 할 수 없습니다.\n 한개의 이름을 먼저 삭제한 후 입력하세요!!");
			}
		}*/
		
		/*for(int i = 0; i < names.length; i++)
		{
			if(names[i] != null)System.out.println(names[i]);
		}
		System.out.println("\n----------\n");*/
	}
	
	public void delName() throws IOException
	{
		System.out.print("삭제이름 : ");
		String delName = br.readLine();
		for(int i = 0; i < names.length; i++) //삭제
		{
			if(delName.equals(names[i]))
			{
				if (i==(names.length-1))
				{
					names[i]=null;
					k=i;
				}
				else if(delName.equals(names[i]))
				{
					names[i]=names[i+1];
					names[i+1]=null;
				}
				else
				{
					System.out.println("존재 하지 않는 이름 입니다.");
				}
			}
			
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
	}
	
	public void editName() throws IOException
	{
		System.out.print("원래이름 :");
		String oldName = br.readLine();
		System.out.print("바꿀이름 :");
		String newName = br.readLine();

			for(int i = 0; i < names.length; i++)
			{
				
				if(!(oldName.equals(names[i])))
				{
					System.out.println("존재하지 않는 이름입니다.");
					break;
				}
				else if(oldName.equals(names[i]))
				{
						names[i]=newName;
				}
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


}
