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
		System.out.println("< �� �� �� �� >");
		System.out.println("1.�߰� \n2.���� \n3.���� \n4.�˻� \n5.������");
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		String choice = br.readLine();
	
		
		return choice;
	}

	public String addName() throws IOException
	{
		System.out.print("�߰��� �̸��� �����ּ���.\n �̸� : ");
		String newName = br.readLine();
		
		//names[k] =  br.readLine();
		for (int i = 0; i < names.length; i++) 
		{
			if(newName.equals(names[i])){
				System.out.println("�̹� �Էµ� �̸� �Դϴ�.");
				break;
			}
			else{
				names[k]=newName;
			}
		}
		k++;
		
		if(k>=5)
		{
			System.out.println("���̻� �Է� �� �� �����ϴ�.");
		}
		
		return names[k];
		
		
			/*else if(names[i]==null){
				names[i]=newName;
				k++;
			}
			else if(k>=5){
				System.out.print("�� �̻� �߰� �� �� �����ϴ�.\n �Ѱ��� �̸��� ���� ������ �� �Է��ϼ���!!");
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
		System.out.print("�����̸� : ");
		String delName = br.readLine();
		for(int i = 0; i < names.length; i++) //����
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
					System.out.println("���� ���� �ʴ� �̸� �Դϴ�.");
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
		System.out.print("�����̸� :");
		String oldName = br.readLine();
		System.out.print("�ٲ��̸� :");
		String newName = br.readLine();

			for(int i = 0; i < names.length; i++)
			{
				
				if(!(oldName.equals(names[i])))
				{
					System.out.println("�������� �ʴ� �̸��Դϴ�.");
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
